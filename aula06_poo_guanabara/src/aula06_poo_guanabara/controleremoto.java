
package aula06_poo_guanabara;


public class controleremoto implements Controlador{
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //métodos especiais
    public controleremoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    //métodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirmenu() {
        System.out.println("-----menu-----");
        System.out.println("esta ligado? "+ this.getLigado());
        System.out.println("esta tocando? "+ this.getTocando());
        System.out.print("volume: "+ this.getVolume());
        for(int i = 0; i <= this.getVolume();i+=10){
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharmenu() {
        System.out.println("fechando menu...");
    }

    @Override
    public void maisvolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume()+5);
        }else{
            System.out.println("impossivel aumentar o volume");
        }
    }

    @Override
    public void menosvolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume()-5);
        }else{
            System.out.println("impossivel diminuir o volume");
        }
    }

    @Override
    public void ligarmudo() {
        if(this.getLigado()&& this.getVolume()>0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarmudo() {
        if(this.getLigado()&& this.getVolume()==0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }else{
            System.out.println("nao consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }else{
            System.out.println("nao consegui pausar");
    }
   
    }
}