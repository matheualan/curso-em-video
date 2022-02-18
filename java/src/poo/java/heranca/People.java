package poo.java.heranca;

public abstract class People { //Classe criada como Abstract não pode instanciar Objetos.
    protected String nome, sexo; //Protected da acesso a classe mãe e as sucessoras da Mãe para mexer diretamente no atributo.
    protected int idade;

    public void fazerAniv() {
        this.idade ++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return  "Dados: {" +
                "nome = '" + nome + '\'' +
                ", sexo = '" + sexo + '\'' +
                ", idade = " + idade +
                '}';
    }
}
