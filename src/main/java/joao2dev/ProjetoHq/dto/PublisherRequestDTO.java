package joao2dev.ProjetoHq.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PublisherRequestDTO {
    private Long id;
    private String nome;
    private String descricao;
}
