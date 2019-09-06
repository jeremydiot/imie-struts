package fr.imie.struts.classes;

public class Client {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    private int id;
    private String login;
    private String pswd;
    private boolean admin;




    public Client() {

    }

    public Client(int id, String login, String pswd, Boolean admin){
        this.id = id;
        this.login = login;
        this.pswd = pswd;
        this.admin = admin;
    }
}
