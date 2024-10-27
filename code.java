import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] noms = new String[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez trois noms");
        for( int i = 0; i <=2;i++ ) {

            noms[i] = sc.nextLine();

        }
        System.out.println("-----------------------------------------------------------------");

        for( int e = 0; e <=2;e++ ){

            System.out.println(noms[e]);
        }

    }
}