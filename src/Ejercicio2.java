package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 { 
  
   
    static void HexToBin(char hexdec[]) 
    { 
        int i = 0; 
  
        while (hexdec[i] != '\u0000') { 
  
            switch (hexdec[i]) { 
            case '0': 
                System.out.print("0000"); 
                break; 
            case '1': 
                System.out.print(" 0001 "); 
                break; 
            case '2': 
                System.out.print(" 0010 "); 
                break; 
            case '3': 
                System.out.print(" 0011 "); 
                break; 
            case '4': 
                System.out.print(" 0100 "); 
                break; 
            case '5': 
                System.out.print(" 0101 "); 
                break; 
            case '6': 
                System.out.print(" 0110 "); 
                break; 
            case '7': 
                System.out.print(" 0111 "); 
                break; 
            case '8': 
                System.out.print(" 1000 "); 
                break; 
            case '9': 
                System.out.print(" 1001 "); 
                break; 
            case 'A': 
            case 'a': 
                System.out.print(" 1010 "); 
                break; 
            case 'B': 
            case 'b': 
                System.out.print(" 1011 "); 
                break; 
            case 'C': 
            case 'c': 
                System.out.print(" 1100 "); 
                break; 
            case 'D': 
            case 'd': 
                System.out.print(" 1101 "); 
                break; 
            case 'E': 
            case 'e': 
                System.out.print(" 1110 "); 
                break; 
            case 'F': 
            case 'f': 
                System.out.print(" 1111 "); 
                break; 
            default: 
                System.out.print("\n el digito hexadecimal es invalido" + hexdec[i]); 
            } 
            i++; 
        } 
    } 
public static void main(String args[])
    { 
        
        System.out.println("ingrese la cadena hexadecimal :\n");
         String cadena ="" ;
         
        Scanner entrada = new Scanner (System.in); 

        cadena = entrada.nextLine (); 
        
        char hexdec[] = new char[100] ; 
            hexdec = cadena.toCharArray() ; 
  
        
        System.out.print("\n el binario equivalente es  :\n "  ); 
        try{ 
            HexToBin(hexdec); 
        } 
        catch (ArrayIndexOutOfBoundsException e){ 
            System.out.print(""); 
        } 
  
    } 
     
}
