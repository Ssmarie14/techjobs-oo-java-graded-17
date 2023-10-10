package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    public String toString(){
        String dataNotAvailable = "Data not available";
        String aEmployer = this.employer.toString();
        if (aEmployer == null || aEmployer == ""){
            aEmployer = dataNotAvailable;
        }
        String aLocation = this.location.toString();
        if (aLocation == null || aLocation == ""){
            aLocation = dataNotAvailable;
        }
        String aPositionType = this.positionType.toString();
        if(aPositionType == null || aPositionType == ""){
            aPositionType = dataNotAvailable;
        }
        String aCoreCompetency = this.coreCompetency.toString();
        if (aCoreCompetency == null || aCoreCompetency == ""){
            aCoreCompetency = dataNotAvailable;
        }
//        String aName = name;
//        if (aName == null || aName == ""){
//            aName = dataNotAvailable;
//        }
        return System.lineSeparator() + "ID: " + this.id + System.lineSeparator() + "Name: " + this.name + System.lineSeparator()
                + "Employer: " + aEmployer + System.lineSeparator() + "Location: " + aLocation + System.lineSeparator() + "Position Type: " + aPositionType +
                System.lineSeparator() + "Core Competency: " + aCoreCompetency + System.lineSeparator();

    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
