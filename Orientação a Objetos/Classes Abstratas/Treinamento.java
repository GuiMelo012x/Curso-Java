package classes_abstratas;

public abstract class Treinamento {
    // Programa em que o time possa gerenciar seu treinamento
    public final void treinoDiario(){
        preparoFisico();
        jogoTreino();
        treinoTatico();
    } // Como ele é final, este método vai se manter desta forma para sempre.
    public abstract void preparoFisico();
    public abstract void jogoTreino();
    public final void treinoTatico(){
        System.out.println("Treino Tático em Execução");
    }
}
