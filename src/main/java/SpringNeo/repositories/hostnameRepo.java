package SpringNeo.repositories;

import SpringNeo.models.hostname;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Collection;

public interface hostnameRepo extends Neo4jRepository<hostname,Long> {

    hostname findByHostName(String name);

    Collection<hostname> findAll();



}
