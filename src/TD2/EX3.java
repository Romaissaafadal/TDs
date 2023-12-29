package TD2;

public class EX3 {
    public static void main(String[] args) {
        Livre l1 = new Livre();
        Livre l2 = new Livre("jk");
        Livre l3 = new Livre("bts", "jk");
        Livre l4 = new Livre("bts", "jk", 2025);
        Livre l5 = new Livre("bts", "jk", 2025, 1997);
        Livre l6 = new Livre(l5);


        System.out.println(l5);

    }
}


 class Livre {
    private String titre ;
    private String auteur ;
    private double prix ;
    private int annee ;
    public Livre(){}
    public Livre(String titre ){
        this.titre=titre ;
    }
    public Livre(String titre, String auteur){
        this.titre=titre;
        this.auteur=auteur ;
    }
    public Livre(String titre, String auteur , double prix ){
        this.titre=titre;
        this.auteur=auteur ;
        this.prix=prix ;
    }
    public Livre(String titre, String auteur , double prix, int annee ) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.annee = annee;
    }
    public Livre(Livre l){
        this(l.getTitre(),l.getAuteur(),l.getPrix(),l.getAnnee());
    }
    public String getTitre(){
        return titre;
    }
    public void setTitre(String titre){
        this.titre=titre ;
    }
    public String getAuteur(){
        return auteur;
    }
    public void setAuteur(String auteur){
        this.auteur=auteur ;
    }
    public double getPrix(){
        return prix ;
    }
    public void setPrix(double prix ){
        this.prix=prix ;
    }
    public int getAnnee(){
        return annee;
    }
    public void setAnnee(int annee){
        this.annee=annee;
    }
    @Override
    public String toString(){
        return "livre "+this.titre+" ecrit par "+this.auteur +" de prix "+this.prix+" annee "+this.annee;
    }


}

