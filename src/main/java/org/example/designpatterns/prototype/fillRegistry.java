package org.example.designpatterns.prototype;


public class fillRegistry {
    StudentRegistry sample;
    fillRegistry(StudentRegistry sample){
        this.sample=sample;
      
        // start creating the sample objects
        // 1.
        Student Aug23BeginnerEvening = new Student();
        Aug23BeginnerEvening.setBatch("Aug23BeginnerEvening");
        Aug23BeginnerEvening.setAvgBatchPsp(80.5d);
        //2.
        IntelligentStudent Jan23AdvancedMorning = new IntelligentStudent();
        Jan23AdvancedMorning.setBatchName("Jan23AdvancedMorning");
        Jan23AdvancedMorning.setAvgPSP(95.5d);
        //Jan23AdvancedMorning.setEligibleInterview(ELIGIBLEINTERVIEWLEVEL.DSA); // i created an enum for my own use, this can be neglected

        //3.
        Student Feb24BeginnerEvening= Aug23BeginnerEvening.clone();
        Feb24BeginnerEvening.setBatch("Feb24BeginnerEvening");

        //now filling registry
        sample.register("Aug23BeginnerEvening",Aug23BeginnerEvening);
        sample.register("Jan23AdvancedMorning",Jan23AdvancedMorning);
        sample.register("Feb24BeginnerEvening",Feb24BeginnerEvening);
    }
}
