package SpringNeo.repositories;

import SpringNeo.models.device;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface deviceRepo extends Neo4jRepository<device,Long> {

    device findByDeviceId(int deviceId);

    Collection<device> findAll();

}
