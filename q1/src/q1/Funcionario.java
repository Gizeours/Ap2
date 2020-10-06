
package q1;

import java.util.Scanner;

public class Funcionario {
    
    //Atributos
    private String nome, sobrenome;
    private float salMensal;
    private int grat;
    private int op;
    Scanner tec = new Scanner(System.in);
    
    // Métodos especiais
    public Funcionario (){
        menu();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalMensal() {
        return salMensal;
    }

    public void setSalMensal(float salMensal) {
        this.salMensal = salMensal;
    }

    public int getGrat() {
        return grat;
    }

    public void setGrat(int grat) {
        this.grat = grat;
    }
                
    //Métodos

    public boolean menu(){
        while (true) {     
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Mostrar Dados");
            System.out.println("3 - Sair do Programa");
            this.op = tec.nextInt();
            switch (op){
                case 1:
                    System.out.println("Informe seu Nome");
                    this.setNome(tec.next());
                    System.out.println("Informe seu Sobrenome");
                    this.setSobrenome(tec.next());
                    System.out.println("Informe seu Salário Mensal");
                    this.setSalMensal(tec.nextFloat());
                    System.out.println("Informe o valor da sua Gratificação");
                    this.setGrat(tec.nextInt());
                    System.out.println("Obrigado!");
                    break;
                case 2:
                    status();
                    break;
                case 3:
                    System.out.println("Finalizando");
                    return false;
                default:
                    System.out.println("Informe a opção correta");
                
            }
        }
    }
    public void status(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Sobrenome: " + this.getSobrenome());
        System.out.println("Salário Mensal: " + this.getSalMensal());
        System.out.println("Gratificação: " + (((this.getGrat() / this.getSalMensal())*100)) + "% ou R$" + this.getGrat());
        System.out.printf("Salário com gratificação: R$%.2f \n",this.getSalMensal() + this.getGrat());
    }
    
    
}
