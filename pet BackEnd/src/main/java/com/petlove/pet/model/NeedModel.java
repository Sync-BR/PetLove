package com.petlove.pet.model;

public class NeedModel {
    private int urine;
    private int faecs;


    public NeedModel() {
       urine =  0;
       faecs =  0;
    }

    public NeedModel(int urine, int faecs) {
        this.urine = urine;
        this.faecs = faecs;
    }

    @Override
    public String toString() {
        return "NeedModel{" +
                "urine=" + urine +
                ", faecs=" + faecs +
                '}';
    }

    public int getUrine() {
        return urine;
    }

    public void setUrine(int urine) {
        this.urine = urine;
    }

    public int getFaecs() {
        return faecs;
    }

    public void setFaecs(int faecs) {
        this.faecs = faecs;
    }
}
