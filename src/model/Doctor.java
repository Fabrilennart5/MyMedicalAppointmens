public class Doctor {
    // definimos los atributos
    int id;
    String name;
    String speciality;

    //  creamos el constructor
    public Doctor(int id, String name, String speciality) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;
    }

    // creamos un metodo de la clase
    public void showName(){
        System.out.println(this.name);
    }
}
