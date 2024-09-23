package aula_16_04_01_poo1;

public class Professor extends Tecnico{
   private String Disciplina;

    public Professor(String Nome, String CPF, int Idade, double Hora_Aula) {
        super(Nome, CPF, Idade, Hora_Aula);
    }

    public String getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(String Disciplina) {
        this.Disciplina = Disciplina;
    }
    
   @Override
    public void Falar(){
        System.out.println("Quero AUMENTO!");
    }
 
   @Override
    protected void CalcularSalario(double Hora_Aula){
        this.Salario = 30*5.25*Hora_Aula;
    }
}
