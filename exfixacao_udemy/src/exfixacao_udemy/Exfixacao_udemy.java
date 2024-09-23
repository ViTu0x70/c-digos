
package exfixacao_udemy;

import java.util.Locale;


public class Exfixacao_udemy {

    public static void main(String[] args) {
        String product1 = "computer";
        String product2 = "office desk";
        
        int age = 30;
        int code = 5290;
        char gender = 'f';
        
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        
        
        System.out.println("products");
        System.out.println(product1 + "seu preco e $" + price1);
        System.out.println(product2 + "seu preco e $" + price2);
         
        System.out.println("record"+ age + " anos de idade " + "codigo " + code + " e " + gender);
        System.out.println("medidas com oito casas decimais" + measure);
        System.out.printf("Arredondado (tres casas decimais): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("Ponto decimal dos EUA: %.3f%n", measure);
    }
    
}
