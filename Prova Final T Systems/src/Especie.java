import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Especie implements SerIntergalactico {
    // Atributos da classe
    private String nome;
    private String planetaOrigem;
    private int nivelPericulosidadeBase;
    private String especie; // Novo atributo

    // Construtor da classe
    public Especie(String nome, String planetaOrigem, int nivelPericulosidadeBase, String especie) {
        this.nome = nome;
        this.planetaOrigem = planetaOrigem;
        this.nivelPericulosidadeBase = nivelPericulosidadeBase;
        this.especie = especie;
    }

    // Implementação dos métodos da interface
    @Override
    public String getPlanetaOrigem() {
        return planetaOrigem;
    }

    @Override
    public int getNivelPericulosidadeBase() {
        return nivelPericulosidadeBase;
    }

    @Override
    public String getNome() {
        return nome;
    }

    // Getter do novo atributo
    public String getEspecie() {
        return especie;
    }

    @Override
    public String toString() {
        return "Especie{" +
                "nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", planetaOrigem='" + planetaOrigem + '\'' +
                ", nivelPericulosidadeBase=" + nivelPericulosidadeBase +
                '}';
    }
}
