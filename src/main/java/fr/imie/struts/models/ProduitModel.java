package fr.imie.struts.models;

import fr.imie.struts.classes.Client;
import fr.imie.struts.classes.Produit;

import java.util.ArrayList;
import java.util.List;

public class ProduitModel {

    public static List<Produit> getListeProduit() {
        return listeProduit;
    }

    private static List<Produit> listeProduit;
    private static int id=0;

    public static List<Produit> listeProduit() {
        return listeProduit;
    }

    public static void setListeProduit(List<Produit> listeProduit) {
        ProduitModel.listeProduit = listeProduit;
    }

    static {
        listeProduit=new ArrayList<Produit>();
        listeProduit.add(new Produit(id++, "ordinateur","150"));
        listeProduit.add(new Produit(id++, "table","20"));
        listeProduit.add(new Produit(id++, "voiture","10000"));
        listeProduit.add(new Produit(id++, "telephone","400"));
    }

    public ProduitModel(){

    }

    public static void ajouter(Produit produit){
        produit.setId(id++);
        listeProduit.add(produit);
    }

    public  static void supprimer(int idProduit){
        for(int i=0; i<listeProduit.size();i++){
            Produit p=listeProduit.get(i);
            if(p.getId()==idProduit){
                listeProduit.remove(p);
            }
        }
    }
    public  static void modifier(Produit produit){
        int idClient = produit.getId();
        for(int i=0; i<listeProduit.size();i++){
            Produit p=listeProduit.get(i);
            if(p.getId()==idClient){
                p.setLabel(produit.getLabel());
                p.setPrice(produit.getPrice());
                break;
            }
        }
    }

    public static Produit getProduit(int idProduit){
        for(int i=0; i<listeProduit.size();i++){
            Produit p=listeProduit.get(i);
            if(p.getId()==idProduit){
                return p;
            }
        }
        return null;
    }
}
