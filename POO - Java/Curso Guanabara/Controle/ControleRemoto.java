package Controle;

import java.lang.reflect.Method;
 //video minuto 17:00
public class ControleRemoto implements Controle {

    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public ControleRemoto(){
        this.volume = 50;
        this.tocando = false;
        this.ligado = false;
    }

    public int getVolume(){
        return this.volume;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    public boolean getLigado(){
        return this.ligado;
    }
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    public boolean getTocando(){
        return this.tocando;
    }
    public void setTocando(boolean tocando){
        this.tocando = tocando;
    }
        @Override
    public void ligar() {
        this.setLigado(true);

    }

    @Override
    public void desligar() {
        this.setLigado(false);
        
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " +  this.getLigado());
        System.out.println("Está tocando? " +  this.getTocando());
        System.out.println("Volume: " +  this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10){
            System.out.println("-");
        }
        System.out.println();
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fcehando menu...");        
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            if (this.getLigado()){
                this.setVolume(this.getVolume()+5);
            }
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            if (this.getLigado()){
                this.setVolume(this.getVolume()-5);
            }
        }
        
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
         
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
        
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.gettocando())){
            this.settocando(true);
        }   
    }

    @Override
    public void pause() {
        if(this.getLigado() && !(this.gettocando())){
            this.settocando(false);
        }   
    }

}