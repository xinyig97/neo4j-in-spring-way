package SpringNeo.repositories;

import SpringNeo.models.user;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Collection;

public interface userRepo extends Neo4jRepository<user,Long> {

    user findByUserId(String uId);

    Collection<user> findAll();
}
