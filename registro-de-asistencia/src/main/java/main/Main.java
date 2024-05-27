package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        //Horario normal de clase
        LocalDateTime h1 = LocalDateTime.of(
            LocalDate.now().plusDays(7),
            LocalTime.of(22, 0)
        );

        //Hora actual menos 15 minutos para probar la asistencia
        LocalDateTime h2 = LocalDateTime.now().minusMinutes(15);
        
        Clase clase = new Clase(
            "Paradigmas de programacion", 
            h2, 
            90, 
            new String[]{"Java", "POO", "Polimorfismo"}
        );

        Alumno alumno = new Alumno("Frano Javier Alvarez", "49888", 24);

        clase.putAsistencia(alumno);
        

        System.out.println(clase);
        System.out.println("------------");
        System.out.println(clase.getAsistencias());
    }
}