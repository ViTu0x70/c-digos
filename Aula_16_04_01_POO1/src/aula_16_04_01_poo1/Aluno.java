package aula_16_04_01_poo1;

public class Aluno extends Pessoa{
    private String Matricula;
    private double Nota;

    public Aluno(String Nome, String Matricula, String CPF, int Idade) {
        super(Nome, CPF, Idade);
        this.Matricula = Matricula;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public double getNota() {
        return Nota;
    }

    public void setNota(double Nota) {
        this.Nota = Nota;
    }
    
    @Override
    public void Falar(){
        System.out.println("Quero PONTO!");
    }
    
}
