package SpringNeo.models;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

@NodeEntity
public class direction {

    @GraphId private Long directiondbId;

    @Property private String direction;

    public String getDirection() {
        return direction;
    }

    public Long getDirectiondbId() {
        return directiondbId;
    }

    public direction() {
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

}
