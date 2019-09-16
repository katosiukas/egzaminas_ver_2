package bandymas.antras;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Nario_sakaRepository extends CrudRepository<Nario_saka, Integer> {
	
	List<Nario_saka> findByNarionr(Integer narionr);
	
}