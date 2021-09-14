import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner serie = new Scanner (System.in);
        int N1=0, N2=1, s, ciclo;
        System.out.println("Teclee el número de ciclos que desea iterar");
        ciclo = serie.nextInt();
        System.out.println("-----------------------------------");
        for (int x=0; x<ciclo; x++) {
            System.out.println(N1);
            s= N1+N2;
            N1=N2;
            N2=s;
        }

    }
}
