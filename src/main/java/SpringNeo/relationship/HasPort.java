package SpringNeo.relationship;

import SpringNeo.models.event;
import SpringNeo.models.port;
import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type = "HAS_PORT")
public class HasPort {

    @GraphId
    private Long hasPortId;

    @Property
    private String label;

    @StartNode
    private event event;
    @EndNode
    private port port;

    public HasPort(String label, event event, port port) {
        this.label = label;
        this.event = event;
        this.port = port;
    }

    public HasPort() {
    }

}
