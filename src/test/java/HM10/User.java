package HM10;

public class User {
    public User(String name, String email, String mobile, String subjects) {
        this.name = name;
        this.Email = email;
        this.Mobile = mobile;
        this.Subjects = subjects;
    }

    String name ;
    String Email ;
    String Mobile ;
    String Subjects ;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return Email;
    }

    public String getMobile() {
        return Mobile;
    }

    public String getSubjects() {
        return Subjects;
    }



    public User() {
        this.name = "Nikita";
        this.Email = "nikita@gmail.com";
        this.Mobile = "0987654321";
        this.Subjects = "Cryogenic technology";
    }
}
