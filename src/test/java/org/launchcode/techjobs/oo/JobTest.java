package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void test() {
        assertTrue(true);
    }
    @Test
    public void testSettingJobId() {
       Job job1 = new Job();
       Job job2 = new Job();
       assertNotEquals(job1.getId(),job2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(job1.getName(), "Product tester");
        assertTrue(job1.getName() instanceof String);
        assertEquals(job1.getEmployer().getValue(), "ACME");
        assertTrue(job1.getEmployer() instanceof Employer);
        assertEquals(job1.getLocation().getValue(), "Desert");
        assertTrue(job1.getLocation() instanceof Location);
        assertEquals(job1.getPositionType().getValue(), "Quality control");
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertEquals(job1.getCoreCompetency().getValue(), "Persistence");
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
    }
    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(job1, job2);


    }
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job1.toString().startsWith(System.lineSeparator()));
        assertTrue(job1.toString().endsWith(System.lineSeparator()));
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expected = System.lineSeparator() + "ID:" + job1.getId() + System.lineSeparator() + "Name:" + job1.getName()
                + System.lineSeparator() + "Employer:" + job1.getEmployer() + System.lineSeparator() + "Location:" + job1.getLocation() +
                System.lineSeparator() + "Position Type:" + job1.getPositionType() + System.lineSeparator() + "Core Competency:" + job1.getCoreCompetency()
                + System.lineSeparator();
        assertEquals(job1.toString(), expected);
    }
}
