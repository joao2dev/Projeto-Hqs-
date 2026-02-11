package joao2dev.ProjetoHq.Repositorys;

import joao2dev.ProjetoHq.Revista.CharacterModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CharacterRepository extends JpaRepository<CharacterModel, Long> {
    List<CharacterModel> findByNomeIgnoreCase(String nome);


}
