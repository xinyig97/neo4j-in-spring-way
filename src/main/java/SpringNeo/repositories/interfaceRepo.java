package SpringNeo.repositories;

import SpringNeo.models.network_interface;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Collection;

public interface interfaceRepo extends Neo4jRepository<network_interface,Long> {

    network_interface findByInterfaceName(String name);

    Collection<network_interface> findAll();
}
