package sobrecarga_e_sobrescrita;
public class Pessoa {
    private String nome;
    private int idade;
    private String email;

    public Pessoa(){ // Overloading
    } 
  
    public Pessoa(String nome, int idade,String  email) { // Overloading (2 construtores)
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }
    public void mensagem(){
        System.out.println("Bom dia");
    }

//    public void mensagem(){ --> Não pode existir, pois já existe um método "mensagem" que não recebe parâmetros.
//        System.out.println("Boa tarde");
//    }

    public void mensagem(String msg){ // Overloading
        System.out.println(msg);
    }

//    public void mensagem(String mensagem){ // --> Não pode existir, pois já existe um método "mensagem" que recebe parâmetros.
//        System.out.println(mensagem);
//    }

    public void mensagem(String msg, int i){ // Overloading --> Pode, pois adiciona o "int i"
        System.out.println(msg + i) ;
    }

    @Override
    public String toString() { //Override
        return "nome = " + nome + ", idade = " + idade + ", email = " + email;
    }
} 


