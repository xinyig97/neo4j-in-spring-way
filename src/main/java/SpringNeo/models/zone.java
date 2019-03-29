package SpringNeo.models;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

@NodeEntity
public class zone {

    @GraphId private Long zonedbId;

    @Property private String zoneName;

    @Property private int zoneId;

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public void setZoneId(int zoneId) {
        this.zoneId = zoneId;
    }

    public Long getZonedbId() {
        return zonedbId;
    }

    public String getZoneName() {
        return zoneName;
    }

    public int getZoneId() {
        return zoneId;
    }

    public zone() {
    }
}
