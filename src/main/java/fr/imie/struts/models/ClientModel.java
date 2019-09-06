package fr.imie.struts.models;

import fr.imie.struts.classes.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientModel {

    private static List<Client> listeClients;
    private static int id=0;

    public static List<Client> getListeClients() {
        return listeClients;
    }

    public static void setListeClients(List<Client> listeClients) {
        ClientModel.listeClients = listeClients;
    }

    static {
        listeClients=new ArrayList<Client>();
        listeClients.add(new Client(id++, "root","root",true));
        listeClients.add(new Client(id++, "user","user",false));
        listeClients.add(new Client(id++, "titi","titi",false));
        listeClients.add(new Client(id++, "machin","machin",false));
    }

    public ClientModel(){

    }

    public static void ajouter(Client client){
        client.setId(id++);
        listeClients.add(client);
    }

    public  static void supprimer(int idClient){
        for(int i=0; i<listeClients.size();i++){
            Client c=listeClients.get(i);
            if(c.getId()==idClient){
                listeClients.remove(c);
            }
        }
    }
    public  static void modifier(Client client){
        int idClient = client.getId();
        for(int i=0; i<listeClients.size();i++){
            Client c=listeClients.get(i);
            if(c.getId()==idClient){
                c.setLogin(client.getLogin());
                c.setPswd(client.getPswd());
                c.setAdmin(client.isAdmin());
                break;
            }
        }
    }

    public static Client getClient(int idClient){
        for(int i=0; i<listeClients.size();i++){
            Client c=listeClients.get(i);
            if(c.getId()==idClient){
                return c;
            }
        }
        return null;
    }

    public static Client isClient(String login, String pswd){
        for(int i=0; i<listeClients.size();i++){
            Client c=listeClients.get(i);
            if(c.getLogin().equals(login) && c.getPswd().equals(pswd)){


                return c;
            }
        }
        return null;
    }
}
