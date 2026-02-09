package joao2dev.ProjetoHq.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComicResponseDTO {



        private String tituloHq;
        private int anoDeLancamentoHq;
        private int edicaoHq;
        private String generoHq;
        private String sinopseHq;
        private String registroDeCriacaoHq;

        // usuário digita livre
        private String nomeEditora;

        // pode vir assim: "Stan Lee, Jack Kirby"
        private String autores;

        // pode vir assim: "Homem-Aranha, Venom"
        private String personagens;

        private String imgUrl;


}
