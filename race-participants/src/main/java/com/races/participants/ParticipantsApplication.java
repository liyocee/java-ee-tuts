package com.races.participants;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@RestController
public class ParticipantsApplication implements CommandLineRunner{
    private static List<Participant> participants = new ArrayList<Participant>();

    public static void main(String[] args) {
        SpringApplication.run(ParticipantsApplication.class, args);
    }

    @Override
    public void run(String... arg0) throws Exception{
        participants.add(
            new Participant(
                "Isaac", "Kangalua", "Makueni", "L", Arrays.asList("100", "200"))
        );
        participants.add(
            new Participant(
                "Marika", "Brian", "Kiambu", "S", Arrays.asList("200"))
        );
    }

    @RequestMapping("/")
    public List<Participant> getParticipants() {
        return participants;
    }

    @RequestMapping("/races/{id}")
    public List<Participant> getParticipants(@PathVariable String id){
        //create a stream
        // Stream <Participant>participantsStream = participants.stream();
        // filter the stream, by passing in a lambda
        // participantsStream.filter(p -> p.getRaces().contains(id));
        // collect filtered items
        // return participantsStream.collect(Collectors.toList());
        return participants.stream().filter(p -> p.getRaces().contains(id)).collect(Collectors.toList());
    }
}

class Participant {
    private String firstName;
    private String lastName;
    private String homeState;
    private String shirtSize;
    private List<String> races;

    public Participant(String firstName, String lastName, String homeState, String shirtSize, List<String> races){
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeState = homeState;
        this.shirtSize = shirtSize;
        this.races = races;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }

    public void setLastName (String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setHomeState(String homeState){
        this.homeState = homeState;
    }

    public String getHomeState(){
        return this.homeState;
    }

    public void setShirtSize(String shirtSize){
        this.shirtSize = shirtSize;
    }

    public String getShirtSize(){
        return this.shirtSize;
    }

    public void setRaces (List<String> races){
        this.races = races;
    }

    public List<String> getRaces(){
        return this.races;
    }
}
