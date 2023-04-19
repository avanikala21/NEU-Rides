package edu.neu.info5100.model.Objects;

public class CustomerRequest {
    private int id;
    private String name;



    private String subject;
    private String issue;
    private String response;
    private String email;

    public CustomerRequest(int id, String name, String subject, String issue, String response, String email) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.issue = issue;
        this.response = response;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
