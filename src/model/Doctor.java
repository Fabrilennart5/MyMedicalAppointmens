public class Doctor {
    // definimos los atributos
    static int id;
    private String first_name;
    private String last_name;
    private String speciality;

    //  creamos el constructor
    public Doctor(int id, String first_name, String last_name, String speciality) {
        id++;
        this.first_name = first_name;
        this.last_name = last_name;
        this.speciality = speciality;
    }

    // creamos un metodo de la clase
    public void showName(){
        System.out.println(this.first_name);
    }
}
