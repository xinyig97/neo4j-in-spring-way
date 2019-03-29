package SpringNeo.relationship;

import SpringNeo.models.event;
import SpringNeo.models.network_interface;
import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type = "HAS_INTERFACE")
public class HasInterface {

    @GraphId private Long interfaceId;

    @Property private String label;

    @StartNode private SpringNeo.models.event event;
    @EndNode private network_interface network_interface;

    public HasInterface(String label, event event, network_interface network_interface) {
        this.label = label;
        this.event = event;
        this.network_interface = network_interface;
    }

    public HasInterface() {
    }


}
