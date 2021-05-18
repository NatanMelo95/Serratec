package main.java.br.com.nmanutencoes.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
    public static String formatarDataPadraoDataEHora(Date data){
        var formatador = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        return formatador.format(data);
    }

    public static String formatarDataPadraoData(Date data){
        var formatador = new SimpleDateFormat("dd/MM/yyyy");
        return formatador.format(data);
    }

    public static String formatarDataPadraoHora(Date data){
        var formatador = new SimpleDateFormat("hh:mm:ss");
        return formatador.format(data);
    }
    public static Date formatarStringPadraoData(String data) throws ParseException {
        var formatador = new SimpleDateFormat("dd/MM/yyyy");
        return formatador.parse(data);
    }
}
