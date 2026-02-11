package joao2dev.ProjetoHq.mapstruct;

import joao2dev.ProjetoHq.Revista.PublisherModel;
import joao2dev.ProjetoHq.dto.PublisherRequestDTO;
import joao2dev.ProjetoHq.dto.PublisherResponseDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PublisherMapper {
    PublisherModel paraPublisherModel(PublisherRequestDTO dto);
    PublisherResponseDTO paraPublisherResponse(PublisherModel model);
    List<PublisherResponseDTO> paraListaEditoras(List<PublisherModel> list);
}
