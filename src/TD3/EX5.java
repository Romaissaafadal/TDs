package TD3;
import javax.management.monitor.StringMonitorMBean;

public class EX5 {
    public static void main(String[] args) {

    }
}


     class Vehicule {
        private int nbPassager;
        public Vehicule(int nbPassager){
            this.nbPassager=nbPassager;
        }
        public int getNbPassager(){
            return nbPassager;
        }
        public void setNbPassager(int nbPassager){
            this.nbPassager=nbPassager;
        }

        public String toString(){
            return "le nombre de passager est "+getNbPassager();
        }
    }
    class Moto extends Vehicule{
        private int nbRoues=2;
        public Moto(int nbPassager,int nbRoues ){
            super(nbPassager);
           this.nbRoues=nbRoues;
        }
        public int getNbRoues() {
            return nbRoues ;
        }
        public void setNbRoues(int nbRoues) {this.nbRoues = nbRoues;}
        // le programme n'a pas pu  compiler car nous avons besoin d'utliser le constructeur de la classe vehicule
    }
    class Avion extends Vehicule{
        private int nbMoteur;
        public  Avion(int nbPassager){
            super(nbPassager);
        }
        public  Avion(int nbPassager, int nbMoteur){
            this(nbPassager);
            this.nbMoteur=nbMoteur;
        }
        public int getNbMoteur() {
            return nbMoteur;
        }

        public void setNbMoteur(int nbMoteur) {
            this.nbMoteur = nbMoteur;
        }


    }
    class Triporteur extends Moto{
        public Triporteur(int nbPassager, int nbRoues) {
            super(nbPassager, nbRoues);

        }

}


