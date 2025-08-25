package calcoliHelper;

public class CalcoliHelper {

    /*
     * - somma di due numeri interi;
     * - somma di due numeri double;
     * - differenza di due numeri interi;
     * - differenza di due numeri double;
     * - moltiplicazione di due numeri interi;
     * - moltiplicazione di due numeri double;
     * - valore assoluto di un numero intero;
     * - valore assoluto di un numero double;
     * - minimo tra due numeri interi;
     * - minimo tra due numeri double;
     * - massimo tra due numeri interi;
     * - massimo tra due numeri double;
     */
    public static int somma(int a, int b){
        return a + b;
    }
    public static double somma(double a, double b){
        return a + b;
    }

    public static int differenza(int a, int b){
        return a - b;
    }
    public static double differenza(double a, double b){
        return a-b;
    }

    public static long moltiplicazione(int a, int b){
        return a * b;
    }
    public static double moltiplicazione(double a, double b){
        return a * b;
    }
    public static int valoreAssoluto(int a){
        if(a < 0){
            return -a;
        }else {
            return a;
        }
        //return math.abs(a); -> valore assoluto
    }
    public static double valoreAssoluto(double a){
         if(a < 0){
            return -a;
        }else {
            return a;
        
    }
}

    public static int massimo(int a, int b){
        if(a>b){
            return a;
        }else if(a<b){
            return b;
        }else{
            System.out.println("I due numeri sono uguali");
            return a;
        }
    }
    public static int minimo(int a, int b){
        if(a>b){
            return b;
        }else if(a<b){
            return a;
        }else {
            System.out.println("I due numeri sono uguali");
            return a;
        }
    }
    public static double minimo(double a, double b){
        if(a>b){
            return b;
        }else if(a<b){
            return a;
        }else{
            System.out.println("I due numeri sono uguali");
            return a;
        }
    }
    public static double massimo(double a, double b){
        if(a>b){
            return a;
        }else if(a<b){
            return b;
        }else{
            System.out.println("I due nueri sono uguali");
            return a;
        }
    }

    //fare anche divisione
    public static double divisione(int a, int b){
        if(b == 0){
            System.out.println("Impossibile dividere per 0");
            return 0;
        }
        return a/b;
    }
    public static double divisione(double a, double b){
        if(b == 0){
            System.out.println("Impossibile dividere per 0");
            return 0;
        }
        return a/b;
    }
}