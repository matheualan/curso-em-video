package poo.java.heranca;

public class PessoaProjeto {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        PessoaAluno pessoaAluno = new PessoaAluno();
        Professor professor = new Professor();
        PessoaFuncionario pessoaFuncionario = new PessoaFuncionario();

        pessoa.setNome("Gustavo");
        pessoa.setSexo("Masculino");

        pessoaAluno.setNome("Matheus");
        pessoaAluno.setIdade(26);
        pessoaAluno.setCurso("Java POO");

        professor.setNome("Guanabara");
        professor.setSalario(6000.00f);

        pessoaFuncionario.setNome("Kennya");
        pessoaFuncionario.setSexo("Femenino");
        pessoaFuncionario.setSetor("Biblioteca");

        System.out.println(pessoa.toString());
        System.out.println(pessoaAluno.toString());
        System.out.println(professor.toString());
        System.out.println(pessoaFuncionario.toString());

    }
}
