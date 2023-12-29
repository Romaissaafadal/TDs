package TD2;

public class EX1 {
    public static void main(String[] args) {
        Point P1=new Point('B',3);
        P1.affich();
        P1.translate(2);
        P1.affich();



    }
}
class Point {
    char nom;
    double abscisse ;
    public Point(char n, double abs){
        nom=n;
        abscisse=abs;
    }
    public void affich(){
        System.out.println("le point  "+nom+" d'abscisse "+abscisse);
    }
    public void translate(double dx ){
        abscisse+=dx;
    }
}
