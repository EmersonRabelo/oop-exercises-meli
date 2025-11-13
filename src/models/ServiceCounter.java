package models;

import java.time.ZonedDateTime;

public class ServiceCounter {
    private Long id;

    private String storeName;

    private ZonedDateTime serviceStartTime;

    private ZonedDateTime serviceEndTime;

    private Clerk clerk;

    public ZonedDateTime getServiceStartTime() {
        return serviceStartTime;
    }

    public void setServiceStartTime(ZonedDateTime serviceStartTime) {
        this.serviceStartTime = serviceStartTime;
    }

    public ZonedDateTime getServiceEndTime() {
        return serviceEndTime;
    }

    public void setServiceEndTime(ZonedDateTime serviceEndTime) {
        this.serviceEndTime = serviceEndTime;
    }

    public Clerk getClerk() {
        return clerk;
    }

    public void setClerk(Clerk clerk) {
        this.clerk = clerk;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
}
