package TD3;

public class EX4 {
    public static void main(String[] args) {
        Batiment batiment1 = new Batiment("123 Rue de la Ville,casablanca");
        System.out.println(batiment1);

        Maison maison1 = new Maison("456 Avenue du Quartier,casablanca", 3);
        System.out.println(maison1);

        Immeuble immeuble1 = new Immeuble("789 Boulevard de la Cité,casablanca", 10);
        System.out.println(immeuble1);


    }
}
     class Batiment {
        private   String adress;
        public Batiment(){}
        public Batiment(String adress){
            this.adress=adress;
        }
        public String getAdress() {
            return adress;
        }
        public void setAdress(String adress) {
            this.adress = adress;
        }
        @Override
        public String toString() {
            return "le batiment est d'adresse  "+getAdress();
        }
        //main

    }

    class Maison extends Batiment {
        private int nbchambre;
        public Maison(){
            super();
            this.nbchambre=0;
        }
        public Maison(String adress,int nbchambre){
            super(adress);
            this.nbchambre=nbchambre;
        }

        public int getNbchambre() {
            return nbchambre;
        }
        public void setNbchambre(int nbchambre) {
            this.nbchambre = nbchambre;
        }

        @Override
        public String toString() {
            return "l'adresse de maison  :"+getAdress()+" ,nombre de chambre :"+nbchambre+" chambres";
        }
    }

    class Immeuble extends Batiment {
        private int nbappart;
        public Immeuble(){
            super();
            this.nbappart=0;
        }
        public Immeuble(String adress,int nbappart){
            super(adress);
            this.nbappart=nbappart;
        }
        public int getNbappart() {
            return nbappart;
        }
        public void setNbappart(int nbappart) {
            this.nbappart = nbappart;
        }

        @Override
        public String toString() {
            return "l'adresse d'immeuble :"+getAdress()+",nombre d'appartement :"+nbappart;
 }

    }

