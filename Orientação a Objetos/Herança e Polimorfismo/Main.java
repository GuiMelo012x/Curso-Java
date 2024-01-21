package herança_e_polimorfismo;
public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Iára",27,"Iara.terra@geradornv.com.br");

        System.out.println(p1.getNome() + " " + p1.getIdade() + " " + p1.getEmail());

        Aluno a1 = new Aluno("Abner ",10,"625.261.486-69", "abner.cocelo@geradornv.com.br");
        System.out.println(a1.getNome() + a1.getIdade() + " " + a1.getRa() + " " + a1.getEmail());
            // O nome e idade vem de PESSOA, e o RA vem de Aluno.

        Professor prof1 = new Professor("Jasmim ",45, "40.604.343-7","Jasmim.bandeira@geradornv.com.br");
        System.out.println(prof1.getNome() + " " + prof1.getIdade() + " " + prof1.getMatricula() + " " + prof1.getEmail());

        System.out.println(prof1.toString());
        System.out.println(prof1);
        System.out.println(a1);
        System.out.println(p1 + " - Método toString (Pessoa)");

        System.out.println();

        System.out.println(a1.getNome());
        System.out.println(prof1.getNome());
    }
}
