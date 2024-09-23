package aula_16_04_01_poo1;

import java.util.Scanner;

public class Aula_16_04_01_POO1 {

    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        
        Pessoa X = new Pessoa("Felipe", "11111111111", 18);
        Professor P = new Professor("Alex", "010010019289", 29, 26.34);
        Aluno A = new Aluno("Maria", "123456", "12093409434",24);
        Tecnico T = new Tecnico("Marcia", "23445667876", 30, 26.34);
        
        System.out.println(X.getNome());
        System.out.println(P.getIdade());
        
        
        P.Falar();
        A.Falar();
        T.Falar();
        X.Falar();
        
        System.out.println("Salario de "+T.getNome()+": "+ T.getSalario());
        System.out.println("Salario de "+P.getNome()+": "+ P.getSalario());
    }
    
}
