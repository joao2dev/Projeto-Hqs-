package joao2dev.ProjetoHq.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class CharacterRequestDTO {
    private Long id;
    private String nome;
    private String descricao;
}
