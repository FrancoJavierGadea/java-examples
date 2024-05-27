package main;

public class Alumno {
    
    private String name;
    private String id;
    private int age;

    public Alumno(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    //MARK: Getters and Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
