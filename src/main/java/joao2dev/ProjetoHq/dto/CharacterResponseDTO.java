package joao2dev.ProjetoHq.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CharacterResponseDTO {
    private Long id;
    private String nome;
    private String descricao;
}
