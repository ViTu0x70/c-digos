/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05_poo_guanabara;

/**
 *
 * @author VITOR
 */
public class ContaBanco {
    //atributos
    public int numconta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //metodos personalisados
    public void estadoatual(){
        System.out.println("-----------------------------");
        System.out.println("conta: "+ this.getNumconta());
        System.out.println("tipo: "+ this.tipo);
        System.out.println("dono: "+this.getDono());
        System.out.println("saldo: "+ this.getSaldo());
        System.out.println("Status: "+ this.getStatus());
    }
    
    public void abrirconta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if ("cc".equals(t)) {
            this.setSaldo(50);
        } else if("cp".equals(t)){
            this.setSaldo(150);
        }
        System.out.println("conta aberta com sucesso");
    }
    public void fecharconta(){
        if (this.getSaldo()>0) {
            System.out.println("conta nao pode ser fechada pois ainda tem dinheiro");
        } else if(this.getSaldo()<0) {
            System.out.println("conta nao pode ser fechada pois ainda tem débito");
        }else{
            this.setStatus(false);
            System.out.println("conta fechada");
        }
    }
    public void depositar(float v){
        if(this.getStatus()){
            //this.saldo = this.saldp+v
            this.setSaldo(this.getSaldo() + v );
            System.out.println("deposito realizado na conta de "+ this.getDono());
        }else{
            System.out.println("impossível depositar em uma conta fechada");
        }
    }
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo()>=v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("saque realizado na conta de " + this.getDono());
            }else{
                System.out.println("saldo insuficiente");
            }
        }else{
            System.out.println("impossivel sacar de uma conta fechada");  
        }   
    }
    public void pagarmensal(){
        int v= 0;
        if (this.getTipo()== "cc") {
            v =12;
        } else if(this.getTipo()=="cp"){
            v= 20;
        }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo()-v);
            System.out.println("mensalidade paga por "+ this.getDono());
        }else{
            System.out.println("impossível pagar uma conta fechada");
        }
    }
    //metodos especiais

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumconta() {
        return numconta;
    }

    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
