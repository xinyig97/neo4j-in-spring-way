package SpringNeo.repositories;

import SpringNeo.models.ip;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Collection;

public interface ipRepo extends Neo4jRepository<ip,Long> {

    ip findByIp(String ip);

    Collection<ip> findAll();

}
