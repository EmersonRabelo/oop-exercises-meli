package models;

import java.util.Random;

// Atendente
public class Clerk {
    private Long id;
    private String name;
    private String registration;

    public Long getId() {
        return id;
    }

    private void setId() {
        Random random = new Random();
        this.id = random.nextLong();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isBlank()) throw new RuntimeException("Name is blank.");
        this.name = name;
    }

    public String getRegistration() {
        return registration;
    }

    private void setRegistration() {
        Random random = new Random();
        this.registration = String.format("BR%d", random.nextInt(9000) + 1000); // +1000 garante 4 digitos
    }

    public Clerk(String name) {
        this.setName(name);
        this.setId();
        this.setRegistration();
    }
}
