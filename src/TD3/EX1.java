package TD3;

public class EX1 {
    public static void main (String[] args ){
        Point p=new Point(2,4);
        PointA a =new PointA(3,6);
        a.affich();
    }
}
 class Point {
    private int x,y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void deplace (int dx,int dy){
        x+=dx;
        y+=dy;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
 class PointA extends Point{
    public PointA(int x,int y){
        super(x,y);
    }
    public void affich(){
        System.out.println("les coordonnées sont "+getX()+","+getY());
    }
}
