package poo.java.encapsulamento;

public class ProjetoLivro {
    public static void main(String[] args) {

        Pessoa[] people = new Pessoa[2];
        Livro[] Liv = new Livro[3];

        people[0] = new Pessoa("Matheus", "M", 26);
        people[1] = new Pessoa("Alan", "M", 15);

        Liv[0] = new Livro("Java Basico", "Jose Silva", 300, people[0]);
        Liv[1] = new Livro("Java POO", "Cariolando Nogueira", 500, people[1]);
        Liv[2] = new Livro("Java avancado", "Cibelly Schutz", 250, people[0]);

        Liv[0].abrir();
        Liv[0].folhear(55);
        Liv[0].avancarPag();
        System.out.println(Liv[0].detalhes());

        Liv[1].abrir();
        Liv[1].folhear(150);
        System.out.println(Liv[1].detalhes());
    }
}
