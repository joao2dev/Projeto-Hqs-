package joao2dev.ProjetoHq.Services;

import joao2dev.ProjetoHq.Repositorys.CharacterRepository;
import joao2dev.ProjetoHq.Revista.CharacterModel;
import joao2dev.ProjetoHq.dto.CharacterRequestDTO;
import joao2dev.ProjetoHq.dto.CharacterResponseDTO;
import joao2dev.ProjetoHq.mapstruct.CharacterMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CharacterService {
    private final CharacterRepository characterRepository;
    private CharacterMapper mapper;


    public List<CharacterResponseDTO> mostrarPersonagens() {
        return mapper.paralistarCharacters(characterRepository.findAll());
    }

    public CharacterResponseDTO mostrarPersonagemPorId(Long id) {
        CharacterModel personagem = characterRepository.findById(id)
         .orElse(null);
        return mapper.paraCharacterResponse(personagem);
    }

    public CharacterResponseDTO adicionarPersonagem(CharacterRequestDTO characterModel) {
        CharacterModel personagem = characterRepository.save(mapper.paraCharcterModel(characterModel));
        validar(personagem);
        return mapper.paraCharacterResponse(personagem);
    }

    public void deletarById(Long id) {
        characterRepository.deleteById(id);
    }

    public CharacterResponseDTO editarById(Long id, CharacterRequestDTO characterModel) {
        Optional<CharacterModel> personagem = characterRepository.findById(id);

        if (personagem.isPresent()) {
            characterModel.setId(id);
            return mapper.paraCharacterResponse(characterRepository.save(mapper.paraCharcterModel(characterModel)));
        }
        return null;
    }
    public List<CharacterResponseDTO> buscarPersonagem(String nome){
        return mapper.paralistarCharacters(characterRepository.findByNomeIgnoreCase(nome));
    }

    void validar(CharacterModel model){
        if (model.getNome() == null){
            throw new RuntimeException("Nome do Personagem obrigatorio");
        }
    }
}
