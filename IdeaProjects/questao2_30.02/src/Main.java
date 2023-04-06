import com.google.gson.Gson;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        String json = String.join(" ",
                    Files.readAllLines(
                            Paths.get("./config.json"),
                            StandardCharsets.UTF_8)
        );

        Config[] config = new Gson().fromJson(json, Config[].class);

        double maiorValor = 0;
        double menorValor;
        double somaValores = 0;
        int numeroDeDias = 0; //numero de dias com valor de faturamento diferente de zero
        double mediaMensal;
        int numeroDeDiasMaiorQueMedia = 0;

        for (Config value : config) {
            if (value.getValor() > maiorValor) {
                maiorValor = value.getValor();
            }

            if (value.getValor() != 0) {
                numeroDeDias++;
            }

            somaValores = somaValores + value.getValor();
        }

        mediaMensal = somaValores/numeroDeDias;
        menorValor = maiorValor;

        for (Config value : config) {
            if (value.getValor() < menorValor) {
                menorValor = value.getValor();
            } if (value.getValor() > mediaMensal) {
                numeroDeDiasMaiorQueMedia++;
            }
        }

        System.out.println("Menor valor de faturamento do mes: " + menorValor);
        System.out.println("Maior valor de faturamento do mes: " + maiorValor);
        System.out.println("Numero de dias em que o valor de faturamento diario foi maior superior a media mensal: "+ numeroDeDiasMaiorQueMedia);
    }
}
