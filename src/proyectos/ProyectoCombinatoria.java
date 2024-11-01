package proyectos;

import java.util.Scanner;

public class ProyectoCombinatoria {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        long n,r,x,y,z,permutacion_repeticion,variacion_sinrepeticion,n_elevado,n_r,combinacion_sinrepeticion,n_r1,n1,combinacion_conrepeticion;
        boolean seRepite,orden;

        do {
            long factorial_n=1,factorial_x=1,factorial_y=1,factorial_z=1,factorial_nr=1,factorial_r=1,factorial_nr1=1,factorial_n1=1;
            
            System.out.print("\nDiga la poblacion: ");
            n=sc.nextLong();
            System.out.print("Diga la muestra: ");
            r=sc.nextLong();

            if(n <= 0 || r <= 0) break;

            System.out.println("Si hay orden diga 'true', caso de no haber diga 'false': ");
            orden=sc.nextBoolean();

            if(orden){
                if(r==n){
                    System.out.print("Si hay repeticion diga 'true', caso de no haber diga 'false': ");
                    seRepite=sc.nextBoolean();
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
                else if(n!=r){
                    System.out.println("Si hay repeticion diga 'true', caso de no haber diga 'false': ");
                    seRepite=sc.nextBoolean();
                    if(seRepite) {
                        n_elevado=(long)(Math.pow(n, r));     
                        System.out.println("La variacion con repeticion es: "+n_elevado);   
                    }
                    else{
                        for(int i=1;i<=n;i++){
                            factorial_n*=i;
                        }
                        n_r=n-r;
                        for(int i=1;i<=n_r;i++){
                            factorial_nr*=i;
                        }
                        variacion_sinrepeticion=factorial_n/factorial_nr;
                        System.out.println("La variacion sin repeticion es: "+variacion_sinrepeticion);
                    }
                }
            }
            else{
                System.out.println("Si hay repeticion diga 'true', caso de no haber diga 'false': ");
                seRepite=sc.nextBoolean();
                if(seRepite){
                    n_r1=n+r-1;
                    for(int i=1;i<=n_r1;i++){
                        factorial_nr1*=i;
                    }for(int i=1;i<=r;i++){
                        factorial_r*=i;
                    }
                    n1=n-1;
                    for(int i=1;i<=n1;i++){
                        factorial_n1*=i;
                    }
                    combinacion_conrepeticion=factorial_nr1/(factorial_r*factorial_n1);
                    System.out.println("La combinacion con repeticion es: "+combinacion_conrepeticion);
                }
                else{
                    for(int i=1;i<=n;i++){
                        factorial_n*=i;
                    }
                    for(int i=1;i<=r;i++){
                        factorial_r*=i;
                    }
                    n_r=n-r;
                    for(int i=1;i<=n_r;i++){
                        factorial_nr*=i;
                    }
                    combinacion_sinrepeticion=factorial_n/(factorial_r*factorial_nr);
                    System.out.println("La combinacion sin repeticion es: "+combinacion_sinrepeticion);      
                }
            }   
        } while (n>0||r>0);
        sc.close();
    }
}
