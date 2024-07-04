import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Alienigena extends Especie {
    private int id;
    private LocalDateTime dataHoraEntrada;
    private boolean emQuarentena;

    public Alienigena(String nome, String planetaOrigem, int nivelPericulosidadeBase, String especie, int id, LocalDateTime dataHoraEntrada) {
        super(nome, planetaOrigem, nivelPericulosidadeBase, especie);
        this.id = id;
        this.dataHoraEntrada = dataHoraEntrada;
        this.emQuarentena = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public void setDataHoraEntrada(LocalDateTime dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
    }

    public boolean isEmQuarentena() {
        return emQuarentena;
    }

    public void setEmQuarentena(boolean emQuarentena) {
        this.emQuarentena = emQuarentena;
    }

    @Override
    public String toString() {
        return "Alienigena{" +
                "id=" + id +
                ", nome='" + getNome() + '\'' +
                ", dataHoraEntrada=" + dataHoraEntrada +
                ", planetaOrigem='" + getPlanetaOrigem() + '\'' +
                ", nivelPericulosidadeBase=" + getNivelPericulosidadeBase() +
                ", especie='" + getEspecie() + '\'' +
                ", emQuarentena=" + emQuarentena +
                '}';
    }
}