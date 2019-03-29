package SpringNeo.models;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

@NodeEntity
public class port {

    @GraphId private Long portId;

    @Property private int portNumber;

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }

    public Long getPortId() {

        return portId;
    }

    public int getPortNumber() {
        return portNumber;
    }

    public port() {
    }
}
