package proyectos;

import java.util.Scanner;

public class Proyecto3 {

    public static int[] calcularDistancia(int a, int b){

        if (a < 0 || b < 0 || a == b) {
            return new int[0];
        }

        var tamanno = a - b;
        
        var tamannoPositivo = tamanno > 0 ? tamanno : tamanno * -1;

        return new int[tamannoPositivo];

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a, b;

        try {
            
            a = sc.nextInt();

            b = sc.nextInt();

            var resultado = calcularDistancia(a, b);

            if(resultado.length == 0){
                sc.close();
                throw new Exception("Error");
            }

            for (int i : resultado) {
                System.out.print(i + " ");
                
            }

        } catch (Exception e) {
            System.out.println("Entre el tipo de datos correcto\n" + e.getMessage());
        }

        sc.close();
    }

}
