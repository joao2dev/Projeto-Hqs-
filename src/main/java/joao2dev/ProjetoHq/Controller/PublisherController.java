package joao2dev.ProjetoHq.Controller;


import joao2dev.ProjetoHq.Revista.PublisherModel;
import joao2dev.ProjetoHq.Services.PublisherService;
import joao2dev.ProjetoHq.dto.PublisherRequestDTO;
import joao2dev.ProjetoHq.dto.PublisherResponseDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/editora")
public class PublisherController {
    private PublisherService publisherService;

    public PublisherController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @GetMapping("/listar")
    public List<PublisherResponseDTO> mostrarEditoras(){
        return publisherService.mostrarEditoras();
    }
    @GetMapping("/lista/{id}")
    public PublisherResponseDTO mostrarPorId(@PathVariable Long id){
        return publisherService.mostrarEditoraPorId(id);
    }
    @PostMapping("/adicionar")
    public PublisherResponseDTO adicionar(@RequestBody PublisherRequestDTO publisherModel){
        return publisherService.adicionarEditora(publisherModel);
    }
    @PutMapping("/editar/{id}")
        public PublisherResponseDTO editarEditora(@PathVariable Long id, @RequestBody PublisherRequestDTO publisherModel){
            return publisherService.editarById(id,publisherModel);
        }

    @DeleteMapping("/deletar/{id}")
        public void deletarById(@PathVariable Long id){
         publisherService.deletarById(id);
    }
    @GetMapping("/buscar/{nome}")
    public List<PublisherResponseDTO> buscarEditora(@PathVariable String nome){
        return publisherService.buscarEditora(nome);
    }

}
