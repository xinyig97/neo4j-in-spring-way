package SpringNeo.relationship;

import SpringNeo.models.event;
import SpringNeo.models.user;
import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type = "HAS_USER")
public class HasUser {

    @GraphId private Long hasUserId;

    @Property private String label;

    @StartNode private event event;
    @EndNode private user user;

    public HasUser(String label, event event, user user) {
        this.label = label;
        this.event = event;
        this.user = user;
    }

    public HasUser() {
    }

    public HasUser(event event, user user) {
        this.event = event;
        this.user = user;
    }
}
