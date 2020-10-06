package q2;

import java.util.Scanner;

public class ContaBanco {

    private String nome;
    private int idade, numConta, op;
    private int tipoC;
    private float saldo, saque, dep;
    private boolean validar = false;
    Scanner tec = new Scanner(System.in);
    
    //Métodos Especiais
     public ContaBanco() {
        menu();
    }

    public float getDep() {
        return dep;
    }

    public void setDep(float dep) {
        this.dep = dep;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getTipoC() {
        return tipoC;
    }

    public void setTipoC(int tipoC) {
        this.tipoC = tipoC;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaque() {
        return saque;
    }

    public void setSaque(float saque) {
        this.saque = saque;
    }

   //Métodos
    
    public boolean menu(){
        while (true) {
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Consultar Saldo");
            System.out.println("5 - Consultar Dados");
            System.out.println("6 - Sair");
            this.op = tec.nextInt();
            switch (op){
                case 1:
                    cadastro();
                    this.validar = true;
                    break;
                case 2:
                    if (validar) {
                        System.out.println("Informe o valor do saque");
                        this.setSaque(tec.nextFloat());
                        if (this.getSaque() > this.getSaldo()) {
                            System.out.println("Saldo Insuficiente");
                        } else {
                            this.setSaldo(this.getSaldo() - this.getSaque());
                            System.out.println("Foi retirado R$" + this.getSaque());
                            System.out.printf("\n");
                        }
                    }else {
                        System.out.println("Cadastre-se Primeiro!!!");
                        break;
                    }
                    
                    break;
                case 3:
                    if (validar) {
                        System.out.println("Qual o valor do depósito");
                        this.setDep(tec.nextFloat());
                        this.setSaldo(getSaldo() + this.getDep());
                        System.out.println("Foi depositado R$" + this.getDep());
                        break;
                    } else {
                        System.out.println("Cadastre-se Primeiro!!!");
                        break;
                    }

                case 4:
                    if (validar) {
                       System.out.printf("Saldo atual: R$ %.2f\n",this.getSaldo());
                       System.out.printf("\n");
                       break; 
                    } else {
                        System.out.println("Cadastre-se Primeiro!!!");
                        break;   
                    }
                    
                case 5:
                    if (validar) {
                        status();
                        break; 
                    }else{
                        System.out.println("Cadastre-se Primeiro!!!");
                        break;
                    }
                    
                case 6:
                    System.out.println("Finalizando");
                    return false;
                default:
                    System.out.println("Informe a opção correta!");
            }
        }
    }
    public void cadastro(){
        System.out.println("Informe seu Nome");
        this.setNome(tec.next());
        System.out.println("Informe sua idade");
        this.setIdade(tec.nextInt());
        System.out.println("Informe o Número da Conta");
        this.setNumConta(tec.nextInt());
        System.out.println("Informe o tipo da conta");
        System.out.println("1 - Corrente");
        System.out.println("2 - Poupança");
        System.out.printf("\n");
        this.setTipoC(tec.nextInt());
        if (this.getTipoC() == 1) {
            this.setSaldo(100);

        }else{
            this.setSaldo(50);
        }
        System.out.println("Cadastro Finalizado");
    }
    public void status(){
        String tipot;
        System.out.println("Nome: " + this.getNome());
        System.out.println("Número da Conta: " + this.getNumConta());
        if (this.getTipoC() == 1) {
            tipot = "Conta Corrente";
        } else {
            tipot = "Conta Poupança";
        }
        System.out.println("Tipo da conta: " + tipot);
        System.out.printf("\n");
    }
}