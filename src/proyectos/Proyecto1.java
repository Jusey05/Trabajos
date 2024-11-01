package proyectos;

import java.util.Scanner;

public class Proyecto1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        long n,r,x,y,z,permutacion_repeticion;
        boolean seRepite;

        do{
            long factorial_n=1,factorial_x=1,factorial_y=1,factorial_z=1;

            System.out.print("\nDiga la poblacion: ");
            n=sc.nextLong();
            System.out.print("Diga la muestra: ");
            r=sc.nextLong();
            if(n <= 0 || r <= 0) break;
            if(n!=r) {
                System.out.print("No se puede realizar la permutación."); break;
            }
            System.out.print("Si hay repeticion diga 'true', caso de no haber diga 'false': ");
            seRepite=sc.nextBoolean();

            if(n == r) {
                if(seRepite){
                    System.out.print("Diga el valor de x: ");
                    x=sc.nextLong();
                    System.out.print("Diga el valor de y: ");
                    y=sc.nextLong();
                    System.out.print("Diga el valor de z: ");
                    z=sc.nextLong();
                    if(x<=0||y<=0||z<=0){
                        System.out.println("Los valores deben ser positivos"); break;
                    }
                    for(int i=1;i<=n;i++){
                        factorial_n*=i;
                    }
                    for(int i=1;i<=x;i++){
                        factorial_x*=i;
                    }
                    for(int i=1;i<=y;i++){
                        factorial_y*=i;
                    }
                    for(int i=1;i<=z;i++){
                        factorial_z*=i;
                    }
                    permutacion_repeticion=factorial_n/(factorial_x*factorial_y*factorial_z);
                    System.out.print("La permutacion con repeticion es: "+permutacion_repeticion);   
                }
                else{
                    for(int i=1;i<=n;i++){
                        factorial_n*=i;   
                    }
                    System.out.print("La permutacion sin repeticion es: "+factorial_n);
                }     
            }
        }
        while(n>0||r>0);
        sc.close();
    }
}
