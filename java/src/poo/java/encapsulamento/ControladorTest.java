package poo.java.encapsulamento;

public class ControladorTest { //controle remoto
    public static void main(String[] args) {

        ControladorRemoto controle = new ControladorRemoto();
        //controle.ligar();
        controle.maisVolume();
        controle.play();
        controle.abrirMenu();
        controle.fecharMenu();
    }
}