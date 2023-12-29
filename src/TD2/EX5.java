package TD2;

public class EX5 {
    public static void main (String[] args ){
        Rectangle R=new Rectangle(20,30);
        System.out.println(R);



    }
}


 class Rectangle {
    private  double longueur ,largeur ;
    Rectangle(){}
    Rectangle(double lon, double lar){
        this.longueur=lon;
        this.largeur=lar;
    }
    Rectangle(Rectangle R){
        this(R.getLongueur(),R.getLargeur());

    }
    public double getLongueur(){
        return longueur;
    }
    public void setLongueur(double l){
        if(l>0)
            this.longueur=l;
        else this.longueur=0;
    }
    public double getLargeur(){
        return largeur;
    }
    public void setLargeur(double la){
        if(la>0)
            this.largeur=la;
        else this.largeur=0;
    }
    public double perimetre(){
        return 2*(longueur+largeur);
    }
    public double aire(){
        return longueur*largeur;
    }
    public boolean iscarre(){
        return largeur==longueur;
    }
    @Override
    public String toString(){
        return "Rectangle{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                ", perimetre=" + perimetre() +
                ", aire=" + aire() +
                ", isCarre=" + (iscarre() ? "Oui" : "Non") +
                '}';
    }
}
