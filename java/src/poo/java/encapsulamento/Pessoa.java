package poo.java.encapsulamento;

public class Pessoa {

    private String nome, sexo;
    private int idade;

    public void fazerAniv() {
        this.setIdade(getIdade()+1);
    }

    public Pessoa(String nome, String sexo, int idade) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
