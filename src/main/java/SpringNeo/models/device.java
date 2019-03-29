package SpringNeo.models;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

import javax.validation.constraints.NotNull;

@NodeEntity
public class device {

    @GraphId
    private Long id;

    @Property
    private String deviceName = "";

    @Property
    private int deviceId;


    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public Long getId() {
        return id;
    }

    public device() {
    }
}
