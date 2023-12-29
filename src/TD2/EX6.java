package TD2;

public class EX6 {
    public static void main  (String[] args ){
        Banque B =new Banque(1,2000,"BJ3245");
        B.retirer(500);
        System.out.println(B);



    }
}


class Banque {
    int ncompte ;
    double solde ;
    String cin ;
    public Banque(int n, double s, String c){
        this.ncompte=n;
        this.solde=s ;
        this.cin=c ;
    }
    public void deposer (double s){
        this.solde+=s ;
    }
    public boolean retirer(double somme){
        if((solde - somme)>= 0) {
            solde -= somme;
            return  true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Banque{" +
                "NCompte=" + ncompte +
                ", solde=" + solde +
                ", cin='" + cin + '\'' +
                '}';
    }
}

