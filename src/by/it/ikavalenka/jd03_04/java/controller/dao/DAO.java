package by.it.ikavalenka.jd03_04.java.controller.dao;

public class DAO {

    private static DAO instance;

    public UniversalDAO<Role> role;
    public UniversalDAO<User> user;
    public UniversalDAO<Ad> ad;

    private DAO() {
    }

    public static DAO getInstance(){
        if (instance==null){
            synchronized (DAO.class){
                if(instance==null){
                    instance=new DAO();
                    instance.user=new UniversalDAO<>(new User(),"users");
                    instance.role=new UniversalDAO<>(new Role(),"roles");
                    instance.ad=new UniversalDAO<>(new Ad(),"ads");
                }
            }
        }
    return instance;
    }
}
