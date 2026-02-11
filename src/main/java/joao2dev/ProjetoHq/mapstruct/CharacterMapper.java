package joao2dev.ProjetoHq.mapstruct;

import joao2dev.ProjetoHq.Revista.CharacterModel;
import joao2dev.ProjetoHq.dto.CharacterRequestDTO;
import joao2dev.ProjetoHq.dto.CharacterResponseDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CharacterMapper {
    CharacterModel paraCharcterModel(CharacterRequestDTO dto);
    CharacterResponseDTO paraCharacterResponse(CharacterModel model);
    List<CharacterResponseDTO> paralistarCharacters(List<CharacterModel> list);
}
