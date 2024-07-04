import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Interface para Especie
interface SerIntergalactico {

    String getPlanetaOrigem();
    int getNivelPericulosidadeBase();
    String getNome();
    String getEspecie();


    default String classificarPericulosidade() {
        int nivel = getNivelPericulosidadeBase();
        if (nivel >= 0 && nivel <= 10) {
            return "Não perigo";
        } else if (nivel >= 11 && nivel <= 30) {
            return "Perigosinho";
        } else if (nivel >= 31 && nivel <= 50) {
            return "Meio perigoso";
        } else if (nivel >= 51 && nivel <= 90) {
            return "Perigoso";
        } else {
            return "CORRE! É PERIGOSO";
        }
    }
}
