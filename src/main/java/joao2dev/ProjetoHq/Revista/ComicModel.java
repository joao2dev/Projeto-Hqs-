package joao2dev.ProjetoHq.Revista;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "comic")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComicModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo_hq", nullable = false)
    private String tituloHq;

    @Column(name = "ano_de_lancamento_hq")
    private int anoDeLancamentoHq;

    @Column(name = "edicao_hq")
    private int edicaoHq;

    @Column(name = "genero_hq")
    private String generoHq;

    @Column(name = "sinopse_hq", columnDefinition = "TEXT")
    private String sinopseHq;

    @Column(name = "registro_de_criacao_hq")
    private String registroDeCriacaoHq;

    // 🔥 AGORA É STRING
    @Column(name = "nome_editora")
    private String nomeEditora;

    // 🔥 LISTA SIMPLES EM TEXTO
    @Column(columnDefinition = "TEXT")
    private String autores;

    @Column(columnDefinition = "TEXT")
    private String personagens;

    @Column(name = "img_url")
    private String imgUrl;
}
