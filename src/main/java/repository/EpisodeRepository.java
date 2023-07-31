package repository;

import org.springframework.data.repository.CrudRepository;
import model.Episode;
import org.springframework.stereotype.Repository;

@Repository
public interface EpisodeRepository extends CrudRepository<Episode,Long>{
}
