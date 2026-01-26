package joao2dev.ProjetoHq;

import jakarta.persistence.*;

@Entity
@Table(name = "Db_Publishers")
public class PublisherModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idEditora;
    String nomeDaEditora;
    String PaísDaEditora;

    public PublisherModel() {
    }

    public long getIdEditora() {
        return idEditora;
    }

    public void setIdEditora(long idEditora) {
        this.idEditora = idEditora;
    }

    public String getNomeDaEditora() {
        return nomeDaEditora;
    }

    public void setNomeDaEditora(String nomeDaEditora) {
        this.nomeDaEditora = nomeDaEditora;
    }

    public String getPaísDaEditora() {
        return PaísDaEditora;
    }

    public void setPaísDaEditora(String paísDaEditora) {
        PaísDaEditora = paísDaEditora;
    }
}
