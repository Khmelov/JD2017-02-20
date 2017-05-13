package by.it.sorokoee.project.java.controller;

import by.it.sorokoee.project.java.beans.User;
import by.it.sorokoee.project.java.daouniv.DAO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.List;

public class CmdLogin extends Action {
    @Override
    public Action execute(HttpServletRequest request) {
        if (!Form.isPost(request)){
            return null;
        }
        else
        {
            User user=new User();
            user.setId(0);
            try {
                user.setLogin(Form.getString(request,"login",Pattern.LOGIN));
                user.setPassword(Form.getString(request,"password",Pattern.PASSWORD));
                DAO dao=DAO.getInstance();
                String where=String.format(" WHERE login='%s' AND password='%s'",
                        user.getLogin(),user.getPassword());
                List<User> list=dao.user.getAll(where);
                if (list.size()==1){
                    HttpSession session=request.getSession();
                    user=list.get(0);
                    session.setAttribute("user",user);
                    return Actions.PROFILE.command;
                } else {
                    request.setAttribute(Messages.MSG_MESSAGE,"Нет такого пользователя");
                    return null;
                }
            } catch (Exception e) {
                request.setAttribute(Messages.MSG_ERROR,e.toString());
                e.printStackTrace();
            }
            return null;
        }
    }
}
