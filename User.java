public class User {
    private String email;
    private String fullname;
    private String pw;

    public User(String email, String fullname, String pw){
        this.email = email;
        this.fullname = fullname;
        this.pw = pw;
    }

    public String getEmail() {
        return email;
    }
    
    public String getFullname() {
        return fullname;
    }

    public String getPw() {
        return pw;
    }

}
