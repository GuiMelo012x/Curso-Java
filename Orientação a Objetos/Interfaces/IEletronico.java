package Interface;
/*
Uma interface deve conter:
   Constantes;
   Métodos Abstratos
*/

public interface IEletronico {

    public String MARCA = "Geek"; // Desta forma, todos os elementos que herdarem desta classe terão a mesma marca,"Geek".

    public void ligar();
    public void desligar();

}
