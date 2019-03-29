package SpringNeo.repositories;


import SpringNeo.models.proto;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Collection;

public interface protoRepo extends Neo4jRepository<proto,Long> {

    proto findByProto(String p);

    Collection<proto> findAll();
}
