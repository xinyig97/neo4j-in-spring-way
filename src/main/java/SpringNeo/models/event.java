package SpringNeo.models;

import SpringNeo.relationship.*;
import org.neo4j.ogm.annotation.*;

import java.util.*;
import java.util.ArrayList;

@NodeEntity
public class event {

    @GraphId
    private Long eventdbId;

    @Property
    private String eventId;

    @Labels
    private List<String> labels = new ArrayList<>();

    @Relationship(type = "HAS_DEVICE", direction = Relationship.OUTGOING)
    private Set<HasDevice> deviceSet = new HashSet<>();
    @Relationship(type = "HAS_DIRECTION", direction = Relationship.OUTGOING)
    private Set<HasDirection> hasDirection = new HashSet<>();
    @Relationship(type = "HAS_HOSTNAME", direction = Relationship.OUTGOING)
    private Set<HasHostname> hostnameSet = new HashSet<>();
    @Relationship(type = "HAS_INTERFACE", direction = Relationship.OUTGOING)
    private Set<HasInterface> hasInterfaceSet = new HashSet<>();
    @Relationship(type = "HAS_IP", direction = Relationship.OUTGOING)
    private Set<HasIP> hasIPSet = new HashSet<>();
    @Relationship(type = "HAS_PORT", direction = Relationship.OUTGOING)
    private  Set<HasPort> hasPortSet = new HashSet<>();
    @Relationship(type = "HAS_PROTO", direction = Relationship.OUTGOING)
    private Set<HasProto> hasProto = new HashSet<>();
    @Relationship(type = "HAS_ACTIVE_USER", direction = Relationship.OUTGOING)
    private Set<HasUser> hasUserSet = new HashSet<>();
    @Relationship(type = "IN_ZONE", direction = Relationship.OUTGOING)
    private Set<HasZone> hasZoneSet = new HashSet<>();


    public void setEventId(String eventId) {
        this.eventId = eventId;
    }
    public event() {
    }

    public Long getEventdbId() {
        return eventdbId;
    }

    public String getEventId() {
        return eventId;
    }

    public List<String> getLabels() {
        return labels;
    }

    public Set<HasDevice> getDeviceSet() {
        return deviceSet;
    }

    public Set<HasDirection> getHasDirection() {
        return hasDirection;
    }

    public Set<HasHostname> getHostnameSet() {
        return hostnameSet;
    }

    public Set<HasInterface> getHasInterfaceSet() {
        return hasInterfaceSet;
    }

    public Set<HasIP> getHasIPSet() {
        return hasIPSet;
    }

    public Set<HasPort> getHasPortSet() {
        return hasPortSet;
    }

    public Set<HasProto> getHasProto() {
        return hasProto;
    }

    public Set<HasUser> getHasUserSet() {
        return hasUserSet;
    }

    public Set<HasZone> getHasZoneSet() {
        return hasZoneSet;
    }

    public void setDeviceSet(device d) {
        HasDevice hasDevice = new HasDevice(this,d);
        if(!deviceSet.contains(hasDevice)) {
            this.deviceSet.add(hasDevice);
        }
    }

    public void setHasDirection(direction d) {
        HasDirection hasDirection = new HasDirection(this,d);
        this.hasDirection.add(hasDirection);
    }

    public void setHostnameSet(hostname h, String label) {
        HasHostname hasHostname = new HasHostname(label,this,h);
        if(!hostnameSet.contains(hasHostname)){
            this.hostnameSet.add(hasHostname);
        }
    }

    public void setHasInterfaceSet(network_interface n, String label) {
        HasInterface hasInterface = new HasInterface(label,this,n);
        if(!hasInterfaceSet.contains(hasInterface)){
            this.hasInterfaceSet.add(hasInterface);
        }
    }

    public void setHasIPSet(ip i, String label) {
        HasIP hasIP = new HasIP(label,this,i);
        if(!hasIPSet.contains(hasIP)){
            this.hasIPSet.add(hasIP);
        }
    }

    public void setHasPortSet(port p, String label) {
        HasPort hasPort = new HasPort(label,this,p);
        if(!hasPortSet.contains(hasPort)){
            this.hasPortSet.add(hasPort);
        }
    }

    public void setHasProtoSet(proto p) {
        HasProto hasProto = new HasProto(this,p);
        this.hasProto.add(hasProto);
    }

    public void setHasUserSet(user u, String label) {
        HasUser hasUser = new HasUser();
        if(label == null){
            hasUser = new HasUser(this,u);
        }else{
            hasUser = new HasUser(label,this,u);
        }
        if(!hasUserSet.contains(hasUser)){
            this.hasUserSet.add(hasUser);
        }
    }

    public void setHasZoneSet(zone z, String label) {
        HasZone hasZone = new HasZone(label,this,z);
        if(!hasZoneSet.contains(hasZone)){
            this.hasZoneSet.add(hasZone);
        }
    }

}
