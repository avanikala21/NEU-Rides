package edu.neu.info5100.session;

public class Session {
    
    private String Username;
    private String Role = "";
    private int id;
    
     public Session(){
        
    }
    
    public void SetSession(String username, String role, int id){
        this.Username = username;
        this.Role = role;  
        this.id = id;
        System.out.println(this.Username + " Logged in");

    }
    
     public String GetUsername(){
        return this.Username;
    }
        public int GetId(){
        return this.id;
    }
      public String GetRole(){
        return this.Role;
    }
    
    public void DeleteSession(){
        this.Username = "";
        this.Role = "";
        this.id = -1;
        System.out.println("User Logged out");
    }
    
}
