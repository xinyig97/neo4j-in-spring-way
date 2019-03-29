package SpringNeo.relationship;

import SpringNeo.models.event;
import SpringNeo.models.ip;
import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type = "HAS_IP")
public class HasIP {

    @GraphId private Long hasIpId;

    @Property private String label;

    @StartNode private event event;
    @EndNode private ip ip;

    public HasIP() {
    }

    public HasIP(String label, event event, ip ip) {
        this.label = label;
        this.event = event;
        this.ip = ip;
    }

}
