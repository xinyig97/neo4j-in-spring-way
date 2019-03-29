package SpringNeo.models;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

@NodeEntity
public class hostname {

    @GraphId private Long hostnameId;

    @Property
    private String hostName;

    public hostname() {
    }

    public Long getHostnameId() {
        return hostnameId;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getHostName() {
        return hostName;
    }
}
