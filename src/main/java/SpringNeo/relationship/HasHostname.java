package SpringNeo.relationship;

import SpringNeo.models.event;
import SpringNeo.models.hostname;
import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type = "HAS_HOSTNAME")
public class HasHostname {

    @GraphId private Long hasHostnameId;

    @Property private String label;

    public HasHostname() {
    }

    public HasHostname(String label, event event, hostname hostname) {
        this.label = label;
        this.event = event;
        this.hostname = hostname;
    }

    @StartNode private event event;
    @EndNode private hostname hostname;
}
