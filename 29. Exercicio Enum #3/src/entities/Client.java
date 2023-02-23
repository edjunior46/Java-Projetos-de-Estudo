package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

    SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM/yyyy");

    private String name;
    private String email;
    private Date birthDate;

    public Client() {

    }
    
    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String toString() {
        return "Nome: " + getName() + "\n" +
        "Email: " + getEmail() + "\n" +
        "Data de Nasc.: " + dFormat.format(getBirthDate());
    }

}
