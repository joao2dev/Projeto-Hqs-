package joao2dev.ProjetoHq.Repositorys;

import joao2dev.ProjetoHq.Revista.PublisherModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PublisherRepository extends JpaRepository<PublisherModel, Long> {
    List<PublisherModel> findByNomeIgnoreCase(String nome);
}
