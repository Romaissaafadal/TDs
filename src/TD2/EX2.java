package TD2;

public class EX2 {
    public static void main(String[] args ){
        Point1 P1=new Point1();
        P1.setNom('A');
        P1.setX(4);
        P1.setY(5);
        P1.Norme();

        System.out.println(P1);



    }
}


 class Point1 {
    private double x,y;
    private char nom ;
    public Point1(){}
    public Point1(char n, double x, double y){
        this.nom=n;
        this.x=x;
        this.y=y;
    }
    public double getX(){
        return  x;
    }
    public double getY(){
        return y;
    }
    public char getNom(){
        return nom;
    }
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
    public void setNom(char n){
        this.nom=n;
    }
    public double Norme(){
        return Math.sqrt(Math.pow(this.getY(),2)+Math.pow(this.getX(),2));
    }
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", nom=" + nom +
                ", norme=" + this.Norme() +
                '}';
    }
}

