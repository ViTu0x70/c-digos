
package aula03_poo_guanabara;

public class Caneta {
   public String modelo;
   public String cor;
   private float ponta;
   protected int carga;
   private boolean tampada;
   
   
   public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("esta tampada ? "+ this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
    
    }
    
   public void rabiscar() {
        if (this.tampada == true){
            System.out.println("erro!nao posso rabiscar");
        }else{
            System.out.println("estou rabiscando");
        }
    }
   public void tampar(){
        this.tampada = true;
        
    }
   public void destampar(){
        this.tampada = false;
        
    }
}
