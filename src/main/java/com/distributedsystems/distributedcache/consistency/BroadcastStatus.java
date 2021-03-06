package com.distributedsystems.distributedcache.consistency;

public class BroadcastStatus {

    private boolean isCompleted;
    private String value; //TODO: need this for broadcast read value, is there any other way?

    public boolean isCompleted() {
        return isCompleted;
    }


    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public synchronized void setCompletedAndNotify(boolean completed) {
        isCompleted = completed;
        this.notify();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
