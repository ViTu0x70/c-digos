package aula_16_04_01_poo1;

public class Tecnico extends Pessoa{
    protected double Salario;

    public Tecnico(String Nome, String CPF, int Idade, double Hora_aula) {
        super(Nome, CPF, Idade);
        CalcularSalario(Hora_aula);
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
    
    @Override
    public void Falar(){
        System.out.println("Jogo sem bola!");
    }
    
    protected void CalcularSalario(double Hora_Aula){
        this.Salario = 44*4*Hora_Aula;
    }
    
}
