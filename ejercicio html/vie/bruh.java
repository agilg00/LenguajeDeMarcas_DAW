import java.util.Scanner;

public class ClaseEj1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float notaExamen1;
        float notaExamen2;

        float media = 0;
        int notaRecu;

        System.out.println("Introduce la nota del primer control:");
        notaExamen1 = sc.nextInt();

        System.out.println("Introduce la nota del segundo control:");
        notaExamen2 = sc.nextInt();

        media = ((notaExamen1+notaExamen2)/2);
        System.out.println("Nota del primer control:"+notaExamen1);
        System.out.println("Nota del segundo control:"+notaExamen2);
        System.out.println("Tu nota de programacion es de "+media);

        if (media >=7){
            System.out.println("sobresaliente");
        } else if (media >=5 && media <7){
            System.out.println("suficiente");
        } else {
            System.out.println("suspenso");
        }
        if (media <5) {
            System.out.println("Cual ha sido el resultado de la recuperación?");
            notaRecu = sc.nextInt();
            if (notaRecu == 5){
                System.out.println("Apto");
            } else {
                System.out.println("No apto");
            }
        }


    }
}