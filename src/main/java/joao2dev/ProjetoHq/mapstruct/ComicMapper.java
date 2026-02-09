package joao2dev.ProjetoHq.mapstruct;

import joao2dev.ProjetoHq.Revista.ComicModel;
import joao2dev.ProjetoHq.dto.ComicRequestDTO;
import joao2dev.ProjetoHq.dto.ComicResponseDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ComicMapper {

    ComicModel paraComicModel(ComicRequestDTO dto);

    ComicResponseDTO paraComicResponseDTO(ComicModel model);

    List<ComicResponseDTO> paraListaComicResponse(List<ComicModel> list);
}
