package fr.imie.struts.classes;

public class Produit {

    private String label;
    private String price;
    private int id;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public Produit(){

    }

    public Produit(int id, String label, String price){
        this.id = id;
        this.label = label;
        this.price = price;
    }
}
