package model;

public class Paciente {
    private String first_name;
    private String last_name;
    private String national_id;
    private String phone;
    private String address;

    public Paciente(String first_name, String last_name, String national_id, String phone, String address) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.national_id = national_id;
        this.phone = phone;
        this.address = address;
    }

    public String getFirstName() {
        return first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public String getNationalId() {
        return national_id;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}
