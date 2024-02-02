package model;

import java.util.Random;

public class Calcular {
    private int dificuldade;
    private int v1;
    private int v2;
    private int operacao;
    private int resultado;

    /**
     * Utilizado para definir a dificuldade. De acordo com a dificuldade, aumenta o valor aleatório gerado pelo
     * randomificador.
     * @param dificuldade
     */
    public Calcular(int dificuldade) {
        this.dificuldade = dificuldade;

        Random randomizer = new Random();
        this.operacao = randomizer.nextInt(3); // 0 - soma | 1 - subt | 2 - mult.

        if(dificuldade == 1){
            this.v1 = randomizer.nextInt(10); // gera um valor aleatório entre 0 a 9.
            this.v2 = randomizer.nextInt(10);
        }
        else if(dificuldade == 2){
            this.v1 = randomizer.nextInt(100); // gera um valor aleatório entre 0 a 99.
            this.v2 = randomizer.nextInt(100);
        }
        else if(dificuldade == 3){
            this.v1 = randomizer.nextInt(1000); // gera um valor aleatório entre 0 a 999.
            this.v2 = randomizer.nextInt(1000);
        }
        else if(dificuldade == 4){
            this.v1 = randomizer.nextInt(10000); // gera um valor aleatório entre 0 a 9999.
            this.v2 = randomizer.nextInt(10000);
        }else {
            this.v1 = randomizer.nextInt(10000); // gera um valor aleatório entre 0 a 99999.
            this.v2 = randomizer.nextInt(10000);
        }
    }



    public boolean somar(int resposta){
        this.resultado = this.getV1() + this.getV2();
        boolean certo = false;
        if(resposta == this.getResultado()){
            System.out.println("Resposta correta!");
            certo = true;
        }else{
            System.out.println("Resposta errada!");
        }
        System.out.println(this.getV1() + " + " + this.getV2() + " = " + this.getResultado());
        return certo;
    }

    public boolean subtrair(int resposta){
        this.resultado = this.getV1() - this.getV2();
        boolean certo = false;
        if(resposta == this.getResultado()){
            System.out.println("Resposta correta!");
            certo = true;
        }else{
            System.out.println("Resposta errada!");
        }
        System.out.println(this.getV1() + " - " + this.getV2() + " = " + this.getResultado());
        return certo;
    }

    public boolean multiplicar(int resposta){
        this.resultado = this.getV1() * this.getV2();
        boolean certo = false;
        if(resposta == this.getResultado()){
            System.out.println("Resposta correta!");
            certo = true;
        }else{
            System.out.println("Resposta errada!");
        }
        System.out.println(this.getV1() + " * " + this.getV2() + " = " + this.getResultado());
        return certo;
    }




    @Override
    public String toString() {
        String op;
        if(this.getOperacao() == 0){
            op = "Somar";
        }else if(this.getOperacao() == 1){
            op = "Subtração";
        }else if(this.getOperacao() == 2){
            op = "Multiplicar";
        }else{
            op = "Operação desconhecida";
        }
        return "Valor 1: " + this.getV1() +
                "\nValor 2: " + this.getV2() +
                "\nDificuldade: " + this.getDificuldade() +
                "\nOperação: " + op;
    }


    public int getDificuldade() {
        return dificuldade;
    }

    public int getV1() {
        return v1;
    }


    public int getV2() {
        return v2;
    }

    public int getOperacao() {
        return operacao;
    }

    public int getResultado() {
        return resultado;
    }

}
