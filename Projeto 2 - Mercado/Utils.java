package helper;

import java.text.*;
import java.util.Locale;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/***
 * Conjunto de funções que vamos usar para ajudar no programa.
 */
public class Utils {
    /**
     * Formata a data para o padrão normal.
     */
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy");

    /**
     * Converte os símbolos e a moeda.
     */
    static NumberFormat nf = new DecimalFormat("R$ #,##0.00", new DecimalFormatSymbols(new Locale("pt","BR")));

    /**
     * Converte a data para String no formato especificado anteriormente.
     * @param data
     * @return
     */
    public static String dateParaString(Date data){
        return Utils.sdf.format(data);
    }

    /**
     * Converte Double para String
     * @param valor
     * @return
     */
    public static String doubleParaString(Double valor){
        return Utils.nf.format(valor);
    }

    /**
     * Converte String para Double
     * @param valor
     * @return
     */
    public static Double stringParaDouble (String valor){
        try{
            return (Double)Utils.nf.parse(valor);
        }catch (ParseException e){
            return null;
        }
    }

    /**
     * Dá uma pausa no programa para que o usuário consiga ler as informações.
     * @param segundos
     */
    public static void pausar(int segundos){
        try{
            TimeUnit.SECONDS.sleep(segundos);
        }catch(InterruptedException e){
            System.out.println("Erro ao pausar por " + segundos + " segundos.");
        }
    }
}
