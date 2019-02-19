package ejercicio3;


import java.util.Scanner;
public class Ejercicio3{

    public static void main(String[] args) {
        int num=0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese el el numero hasta donde desea conocer, recuerde que se debe ser positivo:");
        num = reader.nextInt();
        Isperfect(num);
        NoDeficiente(num); 
    }
    

    private static void Isperfect(int num) {
        int cont=0;
        float prom;
        int E[]= new int[num];
        for(int i=1; i<=num;i++){ //esto son la lista de numeros 
            int divi=0;
            for(int j=1; j<i; j++){  //los numeros divisibles
                    if(i % j == 0){ 
                    divi=divi+j;
                    }
               
            }
           if(i == divi){
              E[cont]=i;
              cont++;
            }
        }
        System.out.println("Numeros eficientes:");
            for(int y=0; y<cont; y++){
            System.out.println(E[y]);
            }
        prom=(num*cont)/100;
        System.out.println("Numeros Eficientes encontrados:" +cont+ "("+prom+"%)");
    }


    private static void NoDeficiente(int num){
        int [] ND = new int [num];
        int cont=0, divi;
        float prom=0;
        for(int i=1; i<=num ;i++){ //esto son la lista de numeros 
             divi=0;
            for(int j=1; j<i-1; j++){  //los numeros divisibles
                    if(i % j == 0){ 
                     divi=divi+j;
                }
            }
           if(divi>i){
              ND[cont]=i;
              cont++;
            }
        }
        System.out.println("Numeros que no son ni deficientes ni eficientes: ");
            for(int y=0; y<cont; y++){
            System.out.println(ND[y]);
            }
        prom=(num*cont)/100;
        System.out.println("Numeros ni deficientes ni eficientes encontrados:" +cont+ "("+prom+"%)");
    }
}
