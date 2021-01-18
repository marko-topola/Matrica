
package matrica;

import java.util.Scanner;


public class Matrica {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("Broj redova: ");
        
        int broj_redova = input.nextInt();
        
        System.out.println("Broj kolona: ");
        
        int broj_kolona = input.nextInt();
        
        int [][] matrica = new int [broj_redova] [broj_kolona];
        
        if (broj_redova == broj_kolona) {
            for (int i = 0; i < matrica.length; i++){
                for (int j = 0; j < matrica[0].length; j++){
                    if (i == j) {
                        matrica[i][j] = 1;
                        
                    }
                    
                    else if (i == matrica.length - 1 - j){
                        matrica[i][j] = 1;               
                        }
                    System.out.print(matrica[i][j] + " ");
                    if (j == matrica.length - 1) {
                           System.out.println();
                    }
                    
                
            }
            
            
            
        }
                
        
       }
    }    
}
