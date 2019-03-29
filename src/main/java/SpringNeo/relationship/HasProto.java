package SpringNeo.relationship;


import SpringNeo.models.event;
import SpringNeo.models.proto;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity(type = "HAS_PROTO")
public class HasProto {

    @GraphId private Long protodbId;

    @StartNode private event e;
    @EndNode private proto p;

    public HasProto(event e, proto p) {
        this.e = e;
        this.p = p;
    }

    public HasProto() {
    }
}

