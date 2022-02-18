package poo.java.encapsulamento;

public class ContaTest {

    public static void main(String[] args) {

        Conta pessoa1 = new Conta();
        pessoa1.setNumConta(1995);
        pessoa1.setDono("Matheus");
        pessoa1.abrirConta("CP");

        Conta pessoa2 = new Conta();
        pessoa2.setNumConta(1502);
        pessoa2.setDono("Alan");
        pessoa2.abrirConta("CC");

        pessoa1.depositar(150);
        pessoa2.depositar(1500);
        pessoa2.sacar(5009);

        pessoa1.statusConta();
        pessoa2.statusConta();
    }
}
