package poo.java.heranca;

public class PessoaAluno extends Pessoa {

    private int matric;
    private String curso;

    public void cancelMatric() {
        System.out.println("Matricula sera cancelada.");
    }

    public int getMatric() {
        return matric;
    }
    public void setMatric(int matric) {
        this.matric = matric;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
