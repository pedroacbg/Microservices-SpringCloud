package com.pedroacbg.microservices.limitsservice.bean;

public class Limits {

    private Integer minimum;
    private Integer maximum;

    public Limits(){

    }

    public Limits(Integer minimum, Integer maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public Integer getMinimun() {
        return minimum;
    }

    public void setMinimun(Integer minimun) {
        this.minimum = minimun;
    }

    public Integer getMaximun() {
        return maximum;
    }

    public void setMaximun(Integer maximun) {
        this.maximum = maximun;
    }

}
