package SpringNeo.relationship;

import SpringNeo.models.direction;
import SpringNeo.models.event;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import org.springframework.web.bind.annotation.GetMapping;

@RelationshipEntity(type = "HAS_DIRECTION")
public class HasDirection {

    @GraphId private Long directionId;

    @StartNode
    private  event e;
    @EndNode
    private direction d;

    public HasDirection(event e, direction d) {
        this.e = e;
        this.d = d;
    }

    public HasDirection() {
    }
}
