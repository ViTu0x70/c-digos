/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author VITOR
 */
public class conta {
   private int number;
   private String titular;
   private double balanco;

    public conta(int number, String titular) {
     
        this.number = number;
        this.titular = titular;
    }

    public conta(int number, String titular, double depositoinicial) {
        this.number = number;
        this.titular = titular;
        deposito(depositoinicial);
    }

    public int getNumber() {
        return number;
    }
    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getBalanco() {
        return balanco;
    }

  public void deposito(double quantidade){
      balanco += quantidade;
  }
   public void sacar (double quantidade){
       balanco -= quantidade + 5.0;
   }
   public String toString(){
       return "conta " + number + ", titular: " + titular + ",balanco: R$ " + String.format("%.2f", balanco);
   }
}
