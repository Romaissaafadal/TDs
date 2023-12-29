package TD3;

public class EX7 {
    public static void main (String[] args ) {
        Patron patron = new Patron("fadal", "romaissaa", 10000);
        System.out.println(patron);
        TravailleurComission homme=new TravailleurComission("ttt","ali",7000,100);
        System.out.println(homme);
        TravailleurHoraire femme=new TravailleurHoraire("eee","sara",30);
        System.out.println(femme);
    }

}
abstract class Employé{
    private String nom ;
    private String prenom;
    public Employé(){}
    public Employé(String nom,String prenom){
        this.nom=nom;
        this.prenom=prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String toString(){
        return "l'emplyé "+nom+" "+prenom;
    }
    public abstract double gains();
}
class Patron extends Employé{
    private double salaire;
    public Patron(){}
    public Patron(String nom,String prenom,double salaire){
        super(nom,prenom);
        this.salaire=salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public double gains(){
        return this.salaire ;
    }
    @Override
    public String toString(){
        return "le patron "+getNom()+" "+getPrenom()+" ,salaire :"+this.gains();
    }
}
class TravailleurComission extends Employé{
    private double salaire ;
    private double commision ;
    private int qte=20;
    public TravailleurComission(){}
    public TravailleurComission(String nom,String prenom,double salaire ,double comission){
        super(nom,prenom);
        this.salaire=salaire;
        this.commision=comission;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public double getCommision() {
        return commision;
    }

    public void setCommision(double commision) {
        this.commision = commision;
    }


    @Override
    public double gains(){
        return salaire+(commision*qte) ;
    }
    @Override
    public String toString(){
        return "le travailleur par comission  "+getNom()+" "+getPrenom()+" ,salaire : "+this.gains();
    }
}
class TravailleurHoraire extends Employé{
    private double  retribution ;
    private double  heures=30 ;
    public TravailleurHoraire(){}
    public TravailleurHoraire(String nom ,String prenom,double retribution){
        super(nom,prenom);
        this.retribution=retribution;
    }

    public double getHeures() {
        return heures;
    }

    public void setHeures(double heures) {
        this.heures = heures;
    }

    public double getRetribution() {
        return retribution;
    }

    public void setRetribution(double retribution) {
        this.retribution = retribution;
    }


    @Override
    public double gains(){
        return retribution*heures;
    }
    @Override
    public String toString (){
        return "Travailleur horaire "+getNom()+" "+getPrenom()+" saliare : "+this.gains();
    }
}
