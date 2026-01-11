package Controle;
public class main_controle {
    public static void main(String[] args){
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.abrirMenu();
        c.maisVolume();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
}
}