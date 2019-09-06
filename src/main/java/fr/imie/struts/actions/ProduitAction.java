package fr.imie.struts.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import fr.imie.struts.classes.Client;
import fr.imie.struts.classes.Produit;
import fr.imie.struts.models.ClientModel;
import fr.imie.struts.models.ProduitModel;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

public class ProduitAction extends ActionSupport implements Preparable, ModelDriven {

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public List<Produit> getProduitList() {
        return produitList;
    }

    public void setProduitList(List<Produit> produitList) {
        this.produitList = produitList;
    }

    public int getUsedId() {
        return usedId;
    }

    public void setUsedId(int usedId) {
        this.usedId = usedId;
    }

    private Produit produit;
    private List<Produit> produitList;
    private static int usedId;




    public String lister(){
        produitList= ProduitModel.getListeProduit();
        return SUCCESS;
    }

    public String ajouter(){
        ProduitModel.ajouter(this.produit);
        return SUCCESS;
    }

    public String editer(){

        usedId = Integer.parseInt(ServletActionContext.getRequest().getParameter("usedId"));
        return SUCCESS;
    }

    public String modifier(){
        produit.setId(usedId);
        ProduitModel.modifier(produit);

        return SUCCESS;
    }

    public String supprimer(){
        ProduitModel.supprimer(usedId);
        return SUCCESS;
    }

    public Object getModel() {
        return null;
    }

    public void prepare() throws Exception {
        if(usedId==0){
            produit = new Produit();
        }else{
            produit = ProduitModel.getProduit(usedId);
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
