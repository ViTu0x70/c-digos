/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07_poo_guanabara;

public class lutador {
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;
    //métodos públicos
    public void aprensentar(){
        System.out.println("-----------------------------------");
        System.out.println("chegou a hora. apresentamos o lutador "+ this.getNome());
        System.out.println("diretamente de "+ this.getNacionalidade());
        System.out.println("com "+ this.getIdade()+" anos e "+ this.altura);
        System.out.println("pesando "+ this.getPeso() + "kg");
        System.out.println(this.getVitorias()+" vitorias");
        System.out.println(this.getDerrotas()+" derrotas");
        System.out.println(this.getEmpates()+" empates");
        System.out.println("-----------------------------------");
        System.out.println("");
}
    public void status(){
        System.out.println("-----------------------------------");
         System.out.println(this.getNome()+" e um peso "+ this.getCategoria());
         System.out.println("ganhou "+ this.getVitorias()+" vezes");
         System.out.println("perdeu " +this.getDerrotas()+" vezes");
         System.out.println("empatou "+this.getEmpates()+" vezes");
         System.out.println("-----------------------------------");
    }
    public void ganharluta(){
        this.setVitorias(this.vitorias +1);
    }
    public void perderluta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarluta(){
        this.setEmpates(this.getEmpates()+1);
    }
    //métodos especiais

    public lutador(String no, String na, int id, float alt, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = alt;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso<52.2){
            this.categoria = "invalido";
        }else if(this.peso <=70.3){
            this.categoria = "leve";
        }else if(this.peso <=83.9){
            this.categoria ="medio";
        }else if(this.peso<=120.2){
            this.categoria = "pesado";
        }else{
            this.categoria= "invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
}
