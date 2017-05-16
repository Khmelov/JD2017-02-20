package by.it.smirnov.project.java.controller;

import by.it.smirnov.project.java.DAO.DAO;
import by.it.smirnov.project.java.bean.User;
import by.it.smirnov.project.java.bean.UserRole;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

/**
 * Created by aleksey.smirnov on 06.05.2017.
 */
public class FormUtils {

    static String getString(HttpServletRequest request, String parameter, String pattern) throws ParseException {
        String value=request.getParameter(parameter);
        if ((value!=null) && ((pattern.length() == 0) || (value.matches(pattern)))){
            return value;
        }
        else {
            throw new ParseException("Incorrect String:"+parameter,-1);
        }
    }

    static int getInt(HttpServletRequest request, String parameter) throws ParseException {
        String value=request.getParameter(parameter);
        try {
            return Integer.parseInt(value);
        } catch (Exception e) {
            throw new ParseException("Incorrect Int:"+parameter,-1);
        }
    }

    static int getIntDef(HttpServletRequest request, String parameter, int defValue){
        try {
            return getInt(request, parameter);
        } catch (Exception e) {
            return defValue;
        }
    }

    static double getDouble(HttpServletRequest request, String parameter) throws ParseException {
        String value=request.getParameter(parameter);
        try {
            return Double.parseDouble(value);
        } catch (Exception e) {
            throw new ParseException("Incorrect Double:"+parameter,-1);
        }
    }

    static Date getDate(HttpServletRequest request, String parameter) throws ParseException {
        String value=request.getParameter(parameter);
        try {
            return Date.valueOf(value);
        } catch (Exception e) {
            throw new ParseException("Incorrect Date:"+parameter,-1);
        }
    }

    static boolean isPost(HttpServletRequest request){
        return request.getMethod().toUpperCase().equals("POST");
    }

    private static final int SessionMaxAgeSec = 30;

    static HttpSession getSession(HttpServletRequest request, String login, String password) throws SQLException {
        DAO dao=DAO.getInstance();
        String where=String.format(" WHERE Login='%s' AND Password='%s'",
                login, password);
        HttpSession session=null;
        List<User> list=dao.getUser().getAll(where);
        if (list.size()==1){
            session=request.getSession();
            session.setMaxInactiveInterval(SessionMaxAgeSec);
            User user=list.get(0);
            session.setAttribute("currentuser",user);

            session.removeAttribute("admin");
            String whereRole=String.format(" WHERE iduser=%d",user.getId());
            List<UserRole> listRoles=dao.getUserRole().getAll(whereRole);
            for (UserRole listRole:listRoles) {
                if (listRole.getIdrole() == 1) {
                    session.setAttribute("admin",1);
                }
            }
        }
        return session;
    }

    static User getSessionUser(HttpServletRequest request){
        HttpSession session=request.getSession(false);
        if (session != null) {
            Object ob=session.getAttribute("currentuser");
            if (ob!=null && ob instanceof User){
                return (User)ob;
            }
        }
        return null;
    }

}
