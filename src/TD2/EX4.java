package TD2;

public class EX4 {
    public static void main(String[] args ){
        Temp t =new Temp(20,30,30);
        System.out.println(t);
        t.ajouterheure(2);
        System.out.println(t);
        t.ajouterminute(50);
        System.out.println(t);
        t.ajouterseconde(50);
        System.out.println(t);


    }
}
     class Temp {
    private int heure ,minute ,seconde ;
    public Temp(){}
    public Temp(int h){
        this();
        this.heure=h;
    }
    public Temp(int h, int m){
        this(h);
        this.minute=m;
    }
    public Temp(int h, int m, int s){
        this(h,m);
        this.seconde=s;
    }
    public Temp(Temp t){

        this(t.getHeure(),t.getMinute(),t.getSeconde());
    }
    public int getHeure(){
        return heure;
    }
    public void setHeure(int h){

        this.heure=h;
    }
    public int getMinute(){
        return minute;
    }
    public void setMinute(int m){
        this.minute=m;
    }
    public int getSeconde(){
        return seconde;
    }
    public void setSeconde(int s){
        this.seconde=s ;

    }
    public void ajouterheure(int hx){

        this.setHeure(this.getHeure()+hx);
    }
    public void ajouterminute(int mx){
        mx+=this.getMinute();
        ajouterheure(mx/60);
        this.setMinute(mx%60);

    }
    public void ajouterseconde(int sx){
        sx+=this.getSeconde();
        ajouterminute(sx/60);
        this.setSeconde(sx%60);
    }
    @Override
    public String toString(){
        return "temps={ "+heure+" , "+minute+" , "+seconde+"}";
    }




}

