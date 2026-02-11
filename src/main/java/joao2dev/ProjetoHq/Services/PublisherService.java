package joao2dev.ProjetoHq.Services;

import joao2dev.ProjetoHq.Repositorys.PublisherRepository;
import joao2dev.ProjetoHq.Revista.CharacterModel;
import joao2dev.ProjetoHq.Revista.ComicModel;
import joao2dev.ProjetoHq.Revista.PublisherModel;
import joao2dev.ProjetoHq.dto.PublisherRequestDTO;
import joao2dev.ProjetoHq.dto.PublisherResponseDTO;
import joao2dev.ProjetoHq.mapstruct.PublisherMapper;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor

public class PublisherService {
    private final PublisherRepository publisherRepository;
    private PublisherMapper mapper;


    public List<PublisherResponseDTO> mostrarEditoras(){
        return mapper.paraListaEditoras(publisherRepository.findAll());
    }
    public PublisherResponseDTO mostrarEditoraPorId(Long id){
        PublisherModel editora = publisherRepository.findById(id)
                .orElse(null);
        return mapper.paraPublisherResponse(editora);
    }
    public PublisherResponseDTO adicionarEditora(PublisherRequestDTO publisherModel){
        PublisherModel editora = publisherRepository.save(mapper.paraPublisherModel(publisherModel));
        validar(editora);
         return mapper.paraPublisherResponse(editora);

    }

    public void deletarById(Long id){
        publisherRepository.deleteById(id);
    }
    public PublisherResponseDTO editarById(Long id, PublisherRequestDTO publisherModel){
        Optional<PublisherModel> editora = publisherRepository.findById(id);
        if (editora.isPresent()){
            publisherModel.setId(id);
            return mapper.paraPublisherResponse(publisherRepository.save(mapper.paraPublisherModel(publisherModel)));
        }return null;
    }
   public List<PublisherResponseDTO> buscarEditora(String nome){
        return mapper.paraListaEditoras(publisherRepository.findByNomeIgnoreCase(nome));
    }

    void validar(PublisherModel editora){
        if (editora.getNome() == null){
            throw new RuntimeException("Nome da editora obrigatorio.");
        }
    }
}
