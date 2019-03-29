package SpringNeo.repositories;

import SpringNeo.models.port;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Collection;

public interface portRepo extends Neo4jRepository<port,Long> {

    port findByPortNumber(int portNumber);

    Collection<port> findAll();
}
