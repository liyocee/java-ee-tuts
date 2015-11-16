package com.races;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CarRacesApplication implements CommandLineRunner{
    private static List<Race> races = new ArrayList<Race>();

    public static void main(String[] args) {
        SpringApplication.run(CarRacesApplication.class, args);
    }

    @Override
    public void run(String... arg0) throws Exception{
        races.add(new Race("2015 Marathon", "100", "BEI", "Beijing"));
        races.add(new Race("KCB Marathon", "200", "Nairobi", "Nairobi"));
    }

    @RequestMapping("/")
    public List<Race> getRaces() {
        return races;
    }
}


class Race {
    private String name;
    private String id;
    private String state;
    private String city;

    public Race(String name, String id, String state, String city){
        super();
        this.name = name;
        this.id = id;
        this.state = state;
        this.city = city;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return this.state;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return this.city;
    }

}
