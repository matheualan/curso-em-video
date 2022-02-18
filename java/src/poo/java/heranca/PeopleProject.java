package poo.java.heranca;

public class PeopleProject {
    public static void main(String[] args) {

        PeopleVisit pv = new PeopleVisit();
        pv.setNome("Matheus");
        pv.setIdade(26);
        pv.setSexo("Masculino");
        System.out.println(pv.toString() + "\n");

        PeopleAluno pa = new PeopleAluno();
        pa.setNome("Alan");
        pa.setIdade(15);
        pa.setSexo("Masculino");
        pa.setMatricula(1423579);
        pa.setCurso("Orientacao a Objeto Java");
        System.out.println(pa.toString());
        pa.pagarMensal();

        PeopleBolsista pb = new PeopleBolsista();
        pb.setNome("Moacy");
        pb.setBolsa(12.5f);
        pb.setSexo("Masculino");
        pb.pagarMensal();

        System.out.println("\nBuchaniassssssss\n");
        People pessoa = new PeopleAluno();
        System.out.println(pessoa.toString());

        PeopleAluno alunaiton = new Pessoa();

    }
}
