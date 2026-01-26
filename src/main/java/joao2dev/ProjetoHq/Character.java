package joao2dev.ProjetoHq;

import jakarta.persistence.*;

@Entity
@Table(name = "db_Characters")
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idPersonagem;
    String nomePersonagem;
    String universoDoPersonagem;
    String poderesDoPersonagem;

    public Character() {
    }

    public Character(String nomePersonagem, String universoDoPersonagem, String poderesDoPersonagem) {
        this.nomePersonagem = nomePersonagem;
        this.universoDoPersonagem = universoDoPersonagem;
        this.poderesDoPersonagem = poderesDoPersonagem;
    }

    public long getIdPersonagem() {
        return idPersonagem;
    }

    public void setIdPersonagem(long idPersonagem) {
        this.idPersonagem = idPersonagem;
    }

    public String getNomePersonagem() {
        return nomePersonagem;
    }

    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    public String getUniversoDoPersonagem() {
        return universoDoPersonagem;
    }

    public void setUniversoDoPersonagem(String universoDoPersonagem) {
        this.universoDoPersonagem = universoDoPersonagem;
    }

    public String getPoderesDoPersonagem() {
        return poderesDoPersonagem;
    }

    public void setPoderesDoPersonagem(String poderesDoPersonagem) {
        this.poderesDoPersonagem = poderesDoPersonagem;
    }
}
