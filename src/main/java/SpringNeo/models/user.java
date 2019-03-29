package SpringNeo.models;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

import java.util.UUID;

@NodeEntity
public class user {

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    @GraphId
    private Long id;

    @Property private String userId;

    public String getUserId() {
        return userId;
    }

    public user() {
    }

}
