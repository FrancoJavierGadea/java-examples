package main.biblioteca;

public class Socio {
    
    public enum CATEGORIA {
        DOCENTE,
        ALUMNO
    }

    private String name;
    private String age;
    private String dni;
    private CATEGORIA categoria;

    public Socio() {}

    public Socio(String name, String age, String dni, CATEGORIA categoria) {
        this.name = name;
        this.age = age;
        this.dni = dni;
        this.categoria = categoria;
    }


    //MARK: Getter and Setter
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return this.age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public CATEGORIA getCategoria() {
        return this.categoria;
    }

    public void setCategoria(CATEGORIA categoria) {
        this.categoria = categoria;
    }


}
