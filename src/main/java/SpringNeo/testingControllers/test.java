package SpringNeo.testingControllers;

import SpringNeo.models.*;
import SpringNeo.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@EntityScan

public class test {

    @Autowired
    deviceRepo deviceRepo;
    @Autowired
    directionRepo directionRepo;
    @Autowired
    eventRepo eventRepo;
    @Autowired
    hostnameRepo hostnameRepo;
    @Autowired
    interfaceRepo interfaceRepo;
    @Autowired
    ipRepo ipRepo;
    @Autowired
    portRepo portRepo;
    @Autowired
    protoRepo protoRepo;
    @Autowired
    userRepo userRepo;
    @Autowired
    zoneRepo zoneRepo;

    @GetMapping("/user")
    public Collection<user> getAllU(){
        return userRepo.findAll();
    }
/*
    @GetMapping("/device")
    public Collection<device> getAllD(){
        return neo4jDriver.findAllDevices();
    }
*/
    @GetMapping("/direction")
    public Collection<direction> getAllDir(){
        return directionRepo.findAll();
    }

    @PostMapping("/dir/{fk}")
    public direction addDir(@PathVariable("fk")String name){
        direction temp = new direction();
        temp.setDirection(name);
        directionRepo.save(temp);
        return temp;
    }

    @GetMapping("/hostname")
    public Collection<hostname> getAllHm(){
        return hostnameRepo.findAll();
    }

    @PostMapping("/hm/{fk}")
    public hostname addHm(@PathVariable("fk")String name){
        hostname temp = new hostname();
        temp.setHostName(name);
        hostnameRepo.save(temp);
        return temp;
    }

    @GetMapping("/event")
    public Collection<event> getAllEv(){
        return eventRepo.findAll();
    }

   /* @PostMapping("/ev/{fk}")
    public event addEv(@PathVariable("fk")String name){
        event temp = new event();
        temp.setEventId(name);
        eventRepo.save(temp);
        return temp;
    }
    */
    @GetMapping("/one/event/{i}")
    public event findE(@PathVariable("i")String e){
        return eventRepo.findByEventId(e);
    }

    @PostMapping("/user/{fk}")
    public user addU(@PathVariable("fk")String name){
        user temp = new user();
        temp.setUserId(name);
        userRepo.save(temp);
        return temp;
    }
    @PostMapping("/device/{fk}")
    public device addD(@PathVariable("fk")String name){
        device temp = new device();
        temp.setDeviceId(Integer.parseInt(name));
        deviceRepo.save(temp);
        return temp;
    }

    @GetMapping("/user/{userId}")
    public user getUser(@PathVariable("userId") String user){
        return userRepo.findByUserId(user);
    }

    @PostMapping("wh")
    public event buildE(){
        event e = new event();
        e.setEventId("helo");
        eventRepo.save(e);
        return e;
    }

    @PostMapping("/add/connection/{eventId}/{deviceId}/{deviceName}/{direction}/{hostname}/{label}/{inter}/{ip}/{port}/{proto}/{user}/{zoneId}/{zoneName}")
    public String aha(@PathVariable("eventId") String eventId, @PathVariable("deviceId") String deviceId, @PathVariable("direction")String direction, @PathVariable("hostname")String hostname, @PathVariable("deviceName")String devicename, @PathVariable("label")String label, @PathVariable("inter")String netinter, @PathVariable("ip")String ip, @PathVariable("port")String port, @PathVariable("proto")String proto, @PathVariable("user") String user, @PathVariable("zoneId")String zoneId, @PathVariable("zoneName")String zonename){

        device d = new device();
        d.setDeviceId(Integer.parseInt(deviceId));
        d.setDeviceName(devicename);

        direction dir = new direction();
        dir.setDirection(direction);

        hostname hm = new hostname();
        hm.setHostName(hostname);

        ip i = new ip();
        i.setIp(ip);

        port p = new port();
        p.setPortNumber(Integer.parseInt(port));

        proto pr = new proto();
        pr.setProto(proto);

        user u = new user();
        u.setUserId(user);

        zone z = new zone();
        z.setZoneId(Integer.parseInt(zoneId));
        z.setZoneName(zonename);

        network_interface n = new network_interface();
        n.setInterfaceName(netinter);

        if(eventId == null){
            return "WRING";
        }
        event curE = eventRepo.findByEventId(eventId);
        if(curE == null){
            curE = new event();
            curE.setEventId(eventId);
        }
        curE.setHasZoneSet(z,label);
        curE.setHasUserSet(u,label);
        curE.setHasProtoSet(pr);
        curE.setHasPortSet(p,label);
        curE.setHasInterfaceSet(n,label);
        curE.setHasIPSet(i,label);
        curE.setHostnameSet(hm,label);
        curE.setHasDirection(dir);
        curE.setDeviceSet(d);

        zoneRepo.save(z);
        userRepo.save(u);
        protoRepo.save(pr);
        portRepo.save(p);
        interfaceRepo.save(n);
        ipRepo.save(i);
        hostnameRepo.save(hm);
        directionRepo.save(dir);
        deviceRepo.save(d);
        eventRepo.save(curE);

        return "A HA";
    }


}
