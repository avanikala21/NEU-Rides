package edu.neu.info5100.model.Personas;

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getOrganisation() {
        return Organisation;
    }

    public void setOrganisation(String organisation) {
        Organisation = organisation;
    }

    public String getEnterprise() {
        return Enterprise;
    }

    public void setEnterprise(String enterprise) {
        Enterprise = enterprise;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private String age;
    private String username;
    private String password;
    private String gender;
    private String role;


    private String Organisation;
    private String Enterprise;
    private boolean verified;
    private int id;
    public Person(String name, String age, String username, String password, String gender, String role, String organisation, String enterprise, boolean verified, int id) {
        this.name = name;
        this.age = age;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.role = role;
        Organisation = organisation;
        Enterprise = enterprise;
        this.verified = verified;
        this.id = id;
    }

}
