package poo.java.encapsulamento;

public class Conta {

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public void statusConta() {
        System.out.println("=============================");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(String tip) {
        this.setTipo(tip);
        this.setStatus(true);
        if (tip.equals("CC")) {
            this.setSaldo(50);
        } else if (tip.equals("CP")) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta!!! Seja bem vindo(a) ao MathBank!");

    }
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com saldo positivo, impossível fechar.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito, por favor regularize para poder fechar!");
        } else {
            this.setStatus(false);
            System.out.println("Conta Finalizada!");
        }
    }
    public void depositar(double v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossivel depositar em uma conta fechada.");
        }
    }
    public void sacar(double v) {
        if (this.getStatus() && this.getSaldo() >= v) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Saque realizado na conta de " + this.getDono());
        } else if (this.getSaldo() < v) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            System.out.println("Impossivel realizar saque de uma conta fechada.");
        }
    }
    public void pagarMensal() {
        int v = 0;
        if (this.getTipo().equals("CC")) {
            v = 12;
        } else if (this.getTipo().equals("CP")) {
            v = 20;
        }
        if (this.getStatus() && this.getSaldo() >= v) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        }
    }

    public void ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double real) {
        this.saldo = real;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}
