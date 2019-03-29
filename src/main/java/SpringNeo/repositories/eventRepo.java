package SpringNeo.repositories;

import SpringNeo.models.event;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Collection;

public interface eventRepo extends Neo4jRepository<event,Long> {

    event findByEventId(String eventId);
    Collection<event> findAll();

}
