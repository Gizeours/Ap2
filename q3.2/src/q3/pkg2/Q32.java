package q3.pkg2;

import java.util.Scanner;

public class Q32 {
    
    public static void main(String[] args) {
        String [][] carac = new String [3][2];
        
        Scanner tec = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if (j != 0){
                    System.out.println("Informe o sexo da " + (i+1) + "ª pessoa");
                    carac[i][j] = tec.next(); 
                } else {
                    System.out.println("Informe o nome a " + (i+1) + "ª pessoa");
                    carac[i][j] = tec.next(); 
                }
                    
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.printf("\n");
            for (int j = 0; j < 2; j++) {
                System.out.printf("%s",carac[i][j]);
                if (j != 1) {
                    System.out.printf(" é do sexo ");
                }
                
            }
        }
        System.out.printf("\n");
        
    }
}
