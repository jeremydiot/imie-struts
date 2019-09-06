package fr.imie.struts.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import fr.imie.struts.classes.Client;
import fr.imie.struts.models.ClientModel;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

public class ClientAction extends ActionSupport implements Preparable, ModelDriven {


    private Client client;
    private List<Client> clientList;
    private static int usedId;



    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    public int getUsedId() {
        return usedId;
    }

    public void setUsedId(int usedId) {
        this.usedId = usedId;
    }


    public String lister(){
        clientList=ClientModel.getListeClients();
        return SUCCESS;
    }

    public String ajouter(){
        ClientModel.ajouter(this.client);
        return SUCCESS;
    }

    public String editer(){

        usedId = Integer.parseInt(ServletActionContext.getRequest().getParameter("usedId"));

        return SUCCESS;
    }

    public String modifier(){
        client.setId(usedId);
        ClientModel.modifier(client);
        return SUCCESS;
    }

    public String supprimer(){
        ClientModel.supprimer(usedId);
        return SUCCESS;
    }

    public Object getModel() {
        return null;
    }

    public void prepare() throws Exception {
        if(usedId==0){
            client = new Client();
        }else{
            client = ClientModel.getClient(usedId);
        }
    }

    public String execute(){

        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();

        if(session.getAttribute("client")==null){
            System.out.println("pas de client dans la session");
        }else{
            System.out.println("Un client dans la session");
        }

        ServletContext context = ServletActionContext.getServletContext();
        System.out.println("Un attribut dans le contexte de l'application: "+context);

        return SUCCESS;
    }
}
