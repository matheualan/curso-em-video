package poo.java.projeto;

public class ProjetoMain {
    public static void main(String[] args) {
        Video[] video = new Video[3];
        video[0] = new Video("Java Básico");
        video[1] = new Video("POO Java");
        video[2] = new Video("Java Avançado");

        Telespectador[] telespec = new Telespectador[2];
        telespec[0] = new Telespectador("Matheus", "Masculino", 26, "omfggzz");
        telespec[1] = new Telespectador("Eloyza", "Femenino", 25, "elyza18");

        /*
        System.out.println(telespc[0].toString());
        System.out.println(video[0].toString());
        System.out.println(video[1].toString());
        System.out.println(video[2].toString());
        */

        Visualizacao visu[] = new Visualizacao[5];
        visu[0] = new Visualizacao(telespec[0], video[0]);

        visu[1] = new Visualizacao(telespec[0], video[1]);

        visu[2] = new Visualizacao(telespec[1], video[0]);

        visu[0].avaliar(60.0f);
        visu[1].avaliar(10);

        System.out.println(visu[0].toString());
        System.out.println();
        System.out.println(visu[1].toString());
        System.out.println();
        System.out.println(visu[2].toString());
    }
}
