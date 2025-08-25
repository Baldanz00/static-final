package calcoliHelper;

public class UsaCalcoliHeper {


    public static void main(String[] args) {
        int somma = CalcoliHelper.somma(5, 10);
        double prodotto = CalcoliHelper.moltiplicazione(5.5, 10.10);

        System.out.println("Somma " + somma + " prodotto " + prodotto);

        double divisione = CalcoliHelper.divisione(1, 3);
        System.out.println("Divisione " + divisione);

        
    }
}
