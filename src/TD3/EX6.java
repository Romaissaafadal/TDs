package TD3;

public class EX6 {
    public class TestFigure {
        public static void main(String[] args) {
            // Test de la classe Disque
            Disque disque1 = new Disque(new Point(2, 3), 5.0, "Mon Disque");
            System.out.println(disque1);
            System.out.println("Périmètre du disque : " + disque1.getPerimeter());
            System.out.println("Aire du disque : " + disque1.getAire());

            // Test de la classe Rectangle
            Rectangle rectangle1 = new Rectangle(4.0, 6.0, "Mon Rectangle");
            System.out.println(rectangle1);
            System.out.println("Périmètre du rectangle : " + rectangle1.getPerimeter());
            System.out.println("Aire du rectangle : " + rectangle1.getAire());
        }
    }
}
abstract class Figure {
    String nom;
    public abstract double getPerimeter();
    public abstract double getAire();
    public String toString(){
        return "la figure :"+nom ;
    }
}
class Disque extends Figure{
    private Point centre ;
    private double rayon ;
    public Disque (){}
    public Disque(Point centre,double rayon ){
        this.centre=centre;
        this.rayon=rayon;
    }
    public Disque(Point centre,double rayon ,String nom) {
        this(centre, rayon);
        this.nom = nom;
    }

    public double getRayon() {
        return rayon;
    }

    public Point getCentre() {
        return centre;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    @Override
    public double getPerimeter(){
        return 2*Math.PI*rayon;
    }
    @Override
    public double getAire(){
        return rayon*rayon*Math.PI;
    }
    }
    class Rectangle extends Figure{
    private double longueur ;
    private double largeur ;
    public Rectangle(){}
        public Rectangle(double longueur,double largeur){
        this.longueur=longueur;
        this.largeur=largeur;
        }
        public Rectangle(double longueur,double largeur,String nom){
        this(longueur,largeur);
        this.nom=nom;
        }

        public double getLargeur() {
            return largeur;
        }

        public double getLongueur() {
            return longueur;
        }

        public void setLargeur(double largeur) {
            this.largeur = largeur;
        }

        public void setLongueur(double longueur) {
            this.longueur = longueur;
        }

        @Override
        public double getPerimeter(){
            return 2*(longueur+largeur);
        }
        @Override
        public double getAire(){
            return longueur*largeur;
        }

    }

