package SpringNeo.repositories;

import SpringNeo.models.zone;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Collection;

public interface zoneRepo extends Neo4jRepository<zone,Long> {

    zone findByZoneId(int id);

    Collection<zone> findAll();
}
