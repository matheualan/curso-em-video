package poo.java.heranca;

/*

* Herança para diferença pois aluno tem metodos e atrbutos proprios e apenas herda alguns de Pessoa.
* Onde Pessoa é uma generalização de Aluno, e Aluno uma especialidade de Pessoa.
* Palavra FINAL usada em Classes faz com que a Classe não possa ter filhos. EX.: public final class PeopleAluno  extends People
  Quando usada em métodos faz com que o método não possa ser sobreposto.    EX.: public final void pagarMensal()

*/

public class PeopleAluno  extends People {
    private int matricula;
    private String curso;

    public PeopleAluno() {

    }
    public PeopleAluno(int matricula, String curso) {
        this.matricula = matricula;
        this.curso = curso;
    }

    public void pagarMensal() {
        System.out.println("Pagando mensalidade do aluno " + this.nome);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Matricula: " + getMatricula() + " / Curso: " + getCurso();
    }
}
