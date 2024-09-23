package aula_16_04_01_poo1;


public class Pessoa {
    private String Nome;
    private String CPF;
    private int Idade;
    private String Email;
    private char Sexo;

    public Pessoa(String Nome, String CPF, int Idade) {
        this.Nome = Nome;
        this.CPF = CPF;
        this.Idade = Idade;
    }

    public String getNome() {
        return Nome;
    }

    public void AlterarNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }
    
    public void Falar(){
        System.out.println("Eu sou uma pessoa!");
    }
    
}
