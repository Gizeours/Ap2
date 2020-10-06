package q3;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
       int [] idade = new int [5];
       int [] fds = new int [1];
        String [] nomes = new String [5];
        int idadeM = 0;
        String nomeM = "";
        Scanner tec = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.printf("Informe o nome da %dª pessoa\n",i+1);
            nomes[i] = tec.next();
            System.out.println("Informe a idade de " + nomes[i]);
            idade[i] = tec.nextInt();
        }
        
        for (int i = 0; i < idade.length; i++) {
            if (idade[i] > idadeM) {
                idadeM = idade[i];
                nomeM = nomes[i];
            }
        }
        System.out.println("A pessoa mais velha é " + nomeM + " com " + idadeM + " anos");
    }
}

