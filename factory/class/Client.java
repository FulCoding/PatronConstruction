public class Client {
    public static void main(String[] args) {
        FabriqueProduit fabriqueproduit= new FabriqueProduit();
        Produit produit=null;

        //affiche un produit de type A
        produit= fabriqueproduit.createProduit(fabriqueproduit.typeA);
        produit.methodeproduit();

        //affiche un produit de type B

        produit= fabriqueproduit.createProduit(fabriqueproduit.typeB);
        produit.methodeproduit();

        //affiche un produit de type C

        produit= fabriqueproduit.createProduit(fabriqueproduit.typeC);
        produit.methodeproduit();

        //produit inexistant
        String d="D";
        produit= fabriqueproduit.createProduit(d);
        produit.methodeproduit();
    }
}
