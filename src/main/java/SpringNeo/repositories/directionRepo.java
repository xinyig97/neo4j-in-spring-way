package SpringNeo.repositories;

import SpringNeo.models.direction;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Collection;

public interface directionRepo extends Neo4jRepository<direction,Long> {

    direction findByDirection(String direction);

    Collection<direction> findAll();
}
