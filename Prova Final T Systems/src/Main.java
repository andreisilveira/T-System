import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Questão 01

        String str1 = "jkghkçjfsgjkh";
        String str2 = "khghkçjfsgjkh";

        StringComparator comparator = new StringComparator();
        boolean result = comparator.compareStrings(str1, str2);

        if (result) {
            System.out.println("Os dois últimos caracteres de \"" + str1 + "\" são iguais aos dois primeiros de \"" + str2 + "\".");
        } else {
            System.out.println("Os dois últimos caracteres de \"" + str1 + "\" não são iguais aos dois primeiros de \"" + str2 + "\".");
        }


        // Questão 02
        Alienigena alien1 = new Alienigena("Elon", "Marte", 80, "Espécie A", 1, LocalDateTime.of(2000, 6, 15, 10, 30));
        Alienigena alien2 = new Alienigena("Jobs", "Apple", 40, "Espécie A", 2, LocalDateTime.of(2000, 8, 20, 14, 45));
        Alienigena alien3 = new Alienigena("VeioHavan", "Brusque", 7, "Espécie B", 3, LocalDateTime.now().minusMonths(3));

        RelatorioAlienigenas relatorio = new RelatorioAlienigenas();
        relatorio.adicionarAlienigena(alien1);
        relatorio.adicionarAlienigena(alien2);
        relatorio.adicionarAlienigena(alien3);

        relatorio.gerarRelatorioCompleto();

        relatorio.gerarRankingPericulosidade();

        relatorio.gerarRelatorioQuarentena();

        relatorio.pesquisarPorEspecie("Especie B");

        relatorio.gerarRelatorioUltimosSeisMeses();
    }
}
