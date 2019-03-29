package SpringNeo.relationship;

import SpringNeo.models.device;
import SpringNeo.models.event;
import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type = "HAS_DEVICE")
public class HasDevice {

    @GraphId private Long hasDeviceId;
    @StartNode private event event;
    @EndNode private device device;

    public HasDevice(event event, device device) {
        this.event = event;
        this.device = device;
    }

    public HasDevice(String deviceName, int deviceId) {
    }

}
