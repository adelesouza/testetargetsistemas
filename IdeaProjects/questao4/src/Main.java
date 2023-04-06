import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String texto = "teste";

        ArrayList<String> listaTextoSeparado = new ArrayList<>(List.of(texto.split("")));
        ArrayList<String> listaTextoInvertido = new ArrayList<>();
        StringBuilder construtorTextoInvertido = new StringBuilder("");

        int i;
        for (i = (listaTextoSeparado.size())-1; i >= 0; i--) { listaTextoInvertido.add(listaTextoSeparado.get(i)); }
        for (i = 0; i < listaTextoInvertido.size(); i++) { construtorTextoInvertido.append(listaTextoInvertido.get(i));}

        String textoInvertido = construtorTextoInvertido.toString();

        System.out.println(textoInvertido);
    }
}
