package TD3;

public class EX2 {

}
class Point1 {
    private int x, y;
    public Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void affCoord() {
        System.out.println("Coordonnees : " + x + " " + y);
    }

}
class PointNom extends Point1{
    private char nom;
    public PointNom(int x,int y,char nom){
        super(x,y);
        this.nom=nom;
    }
    public void setPointNom(int x, int y, char nom) {
        setX(x);
        setY(y);
        this.nom = nom;
    }
    public void setNom(char nom) {

        this.nom = nom;
    }
    public void AffcoordNom(){
        System.out.println("les coordonnées du point "+nom+":(");
    }
}
