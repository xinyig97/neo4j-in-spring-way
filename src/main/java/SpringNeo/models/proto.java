package SpringNeo.models;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

@NodeEntity
public class proto {

    @GraphId private Long protoId;

    @Property private String proto;

    public void setProto(String proto) {
        this.proto = proto;
    }

    public Long getProtoId() {
        return protoId;
    }

    public String getProto() {
        return proto;
    }

    public proto() {
    }
}
