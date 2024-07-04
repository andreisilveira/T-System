import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class RelatorioAlienigenas {
    private List<Alienigena> alienigenas;

    public RelatorioAlienigenas() {
        this.alienigenas = new ArrayList<>();
    }

   public void adicionarAlienigena(Alienigena alienigena) {
        alienigenas.add(alienigena);
    }

  public void gerarRelatorioCompleto() {
        System.out.println("===== Relatório Completo de Alienígenas =====");
        for (Alienigena alienigena : alienigenas) {
            System.out.println("Nome: " + alienigena.getNome());
            System.out.println("Espécie: " + alienigena.getClass().getSimpleName());
            System.out.println("Planeta de origem: " + alienigena.getPlanetaOrigem());
            System.out.println("Nível de periculosidade: " + alienigena.getNivelPericulosidadeBase() + " - " + alienigena.classificarPericulosidade());
            System.out.println("Status de quarentena: " + (alienigena.isEmQuarentena() ? "Em quarentena" : "Não em quarentena"));
            System.out.println("-----------------------------------");
        }
    }

    public void gerarRankingPericulosidade() {
        System.out.println("===== Ranking de Periculosidade dos Alienígenas =====");

        Collections.sort(alienigenas, Comparator.comparingInt(Alienigena::getNivelPericulosidadeBase).reversed());

        int posicao = 1;
        for (Alienigena alienigena : alienigenas) {
            System.out.println(posicao + ". " + alienigena.getNome() + " - Nível de periculosidade: " + alienigena.getNivelPericulosidadeBase());
            posicao++;
            System.out.println("-----------------------------------");
        }
    }

    public void gerarRelatorioQuarentena() {
        System.out.println("===== Alienígenas em Quarentena =====");
        for (Alienigena alienigena : alienigenas) {
                if (alienigena.getNivelPericulosidadeBase() > 51) {
                System.out.println("Nome: " + alienigena.getNome());
                System.out.println("-----------------------------------");
            }
        }
    }

    public void pesquisarPorEspecie(String especie) {
        System.out.println("===== Alienígenas da espécie: " + especie + " =====");
        for (Alienigena alienigena : alienigenas) {
            if (alienigena.getEspecie().equalsIgnoreCase(especie)) {
                System.out.println("Nome: " + alienigena.getNome());
                System.out.println("Espécie: " + alienigena.getEspecie());
                System.out.println("Nível de periculosidade: " + alienigena.getNivelPericulosidadeBase());

                System.out.println("-----------------------------------");
            }
        }
    }

    public void gerarRelatorioUltimosSeisMeses() {
        System.out.println("===== Alienígenas que Entraram nos Últimos 6 Meses =====");
        LocalDateTime seisMesesAtras = LocalDateTime.now().minus(6, ChronoUnit.MONTHS);
        for (Alienigena alienigena : alienigenas) {
            if (alienigena.getDataHoraEntrada().isBefore(seisMesesAtras)) {
                System.out.println("Nome: " + alienigena.getNome());
                System.out.println("-----------------------------------");
            }
        }
    }


}
