package SpringNeo.models;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

@NodeEntity
public class ip {

    @GraphId private Long ipId;

    @Property private String ip;

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Long getIpId() {
        return ipId;
    }

    public String getIp() {
        return ip;
    }

    public ip() {
    }
}
