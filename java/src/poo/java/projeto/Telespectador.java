package poo.java.projeto;

public class Telespectador extends Pessoa {
    private String login;
    private int totAssistido;

    public Telespectador(String nome, String sexo, int idade, String login) {
        super(nome, sexo, idade);
        this.login = login;
        this.totAssistido = 0;
    }

    public void viuMaisUm() {
        this.totAssistido ++;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Telespectador [" + super.toString() + " Login: " + login + " / Total assistido: " + totAssistido + "]";
    }
}
