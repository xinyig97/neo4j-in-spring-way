package SpringNeo.relationship;


import SpringNeo.models.event;
import SpringNeo.models.zone;
import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type = "IN_ZONE")
public class HasZone {

    @GraphId private Long zonedbId;

    @Property String label;
    @StartNode private event e;
    @EndNode private zone z;

    public HasZone(String label, event e, zone z) {
        this.label = label;
        this.e = e;
        this.z = z;
    }

    public HasZone() {
    }
}
