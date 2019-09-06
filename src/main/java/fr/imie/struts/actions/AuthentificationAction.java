package fr.imie.struts.actions;

import com.opensymphony.xwork2.ActionSupport;
import fr.imie.struts.classes.Client;
import fr.imie.struts.models.ClientModel;

public class AuthentificationAction  extends ActionSupport {

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

    private String login;
    private String pswd;

    public AuthentificationAction(){

    }

    public String connexion(){
        Client c = ClientModel.isClient(this.login,this.pswd);

        if (c!=null){
            if(c.isAdmin()){
                return "admin";
            }else {
                return "client";
            }
        }else {
            return INPUT;
        }
    }
}
