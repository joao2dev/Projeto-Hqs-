package joao2dev.ProjetoHq;

import jakarta.persistence.*;

@Entity
@Table(name = "Db_Comics")
public class ComicModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idHQ;
    String tituloHq;
    int anoDeLancamentoHq;
    int edicaoHq;
    String generoHq;
    String sinopseHq;
    String registroDeCriacaoHq;

    public ComicModel() {
    }

    public ComicModel(String títuloHq, int anoDeLancamentoHq, int ediçãoHq, String gêneroHq, String sinopseHq, String registroDeCriacaoHq) {
        this.tituloHq = títuloHq;
        this.anoDeLancamentoHq = anoDeLancamentoHq;
        this.edicaoHq = ediçãoHq;
        this.generoHq = gêneroHq;
        this.sinopseHq = sinopseHq;
        this.registroDeCriacaoHq = registroDeCriacaoHq;
    }

    public long getIdHQ() {
        return idHQ;
    }

    public void setIdHQ(long idHQ) {
        this.idHQ = idHQ;
    }

    public String getTituloHq() {
        return tituloHq;
    }

    public void setTituloHq(String tituloHq) {
        this.tituloHq = tituloHq;
    }

    public int getAnoDeLancamentoHq() {
        return anoDeLancamentoHq;
    }

    public void setAnoDeLancamentoHq(int anoDeLancamentoHq) {
        this.anoDeLancamentoHq = anoDeLancamentoHq;
    }

    public int getEdicaoHq() {
        return edicaoHq;
    }

    public void setEdicaoHq(int edicaoHq) {
        this.edicaoHq = edicaoHq;
    }

    public String getGeneroHq() {
        return generoHq;
    }

    public void setGeneroHq(String generoHq) {
        this.generoHq = generoHq;
    }

    public String getSinopseHq() {
        return sinopseHq;
    }

    public void setSinopseHq(String sinopseHq) {
        this.sinopseHq = sinopseHq;
    }

    public String getRegistroDeCriacaoHq() {
        return registroDeCriacaoHq;
    }

    public void setRegistroDeCriacaoHq(String registroDeCriacaoHq) {
        this.registroDeCriacaoHq = registroDeCriacaoHq;
    }
}
