package joao2dev.ProjetoHq.mapstruct;

import joao2dev.ProjetoHq.Revista.AutorModel;
import joao2dev.ProjetoHq.dto.AutorRequestDTO;
import joao2dev.ProjetoHq.dto.AutorResponseDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AutorMapper {

    AutorModel paraAutorModel(AutorRequestDTO dto);
    AutorResponseDTO paraAutorResponseDTO(AutorModel model);
    List<AutorResponseDTO> paraListarAutorResponse(List<AutorModel> list);
    AutorModel paraBuscarId(Long id);
}
