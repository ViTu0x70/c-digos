
package aula03_poo_guanabara;
 
public class Aula03_poo_guanabara {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo= "BIC";
        c1.cor = "verde";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = true;
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
    
}
