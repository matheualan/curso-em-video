package poo.java.encapsulamento;

public class Lutador implements LutadorInterface {

    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;

    public Lutador(String nom, String nac, int ida, int vit, int der, int emp, float alt, float pes) {
        this.setNome(nom); this.setNacionalidade(nac);
        this.setIdade(ida); this.setVitorias(vit); this.setDerrotas(der); this.setEmpates(emp);
        this.setAltura(alt); this.setPeso(pes);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if (this.getPeso() < 52.2) {
            this.categoria = "Peso Invalido";
        } else if (this.getPeso() <= 70.3) {
            this.categoria = "Peso Leve";
        } else if (this.getPeso() <= 83.9) {
            this.categoria = "Peso Medio";
        } else if (this.getPeso() <= 120.2){
            this.categoria = "Peso Pesado";
        } else {
            this.categoria = "Peso Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }

    @Override
    public void apresentar() {
        //System.out.println("----------------------------------");
        System.out.println("Apresentado o Lutador " + this.getNome() + ",");
        System.out.println("Lutando na Categoria " + this.getCategoria() + ",");
        System.out.println("Historico de lutas: ");
        System.out.println(this.getVitorias() + " vitorias.");
        System.out.println(this.getDerrotas() + " derrotas.");
        System.out.println(this.getEmpates() + " empates.");
    }

    @Override
    public void status() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("Categoria: " + this.getCategoria());
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
}