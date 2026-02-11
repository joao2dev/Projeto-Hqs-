package joao2dev.ProjetoHq.Controller;

import joao2dev.ProjetoHq.Revista.CharacterModel;
import joao2dev.ProjetoHq.Services.CharacterService;
import joao2dev.ProjetoHq.dto.CharacterRequestDTO;
import joao2dev.ProjetoHq.dto.CharacterResponseDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personagem")
public class CharacterController {
    private CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping("/listar")
    public List<CharacterResponseDTO> mostrarPersonagens() {
        return characterService.mostrarPersonagens();
    }

    @GetMapping("/lista/{id}")
    public CharacterResponseDTO mostrarPorId(@PathVariable Long id) {
        return characterService.mostrarPersonagemPorId(id);
    }

    @PostMapping("/adicionar")
    public CharacterResponseDTO adicionar(@RequestBody CharacterRequestDTO characterModel) {
        return characterService.adicionarPersonagem(characterModel);
    }

    @PutMapping("/editar/{id}")
    public CharacterResponseDTO editarPersonagem(
            @PathVariable Long id,
            @RequestBody CharacterRequestDTO characterModel
    ) {
        return characterService.editarById(id, characterModel);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarById(@PathVariable Long id) {
        characterService.deletarById(id);
    }
   @GetMapping("/buscar/{nome}")
    public List<CharacterResponseDTO> buscarPersonagem(@PathVariable String nome){
        return characterService.buscarPersonagem(nome);
    }
}
