package com.example.ejercicio_ch8;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Ejercicio_ch8 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Ejercicio_ch8.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        Persona mipersona = new Persona();
        mipersona.setEdad(46);
        mipersona.setNombre("Fernando");
        mipersona.setTelefono("655 444 333");

        System.out.println("Ficha de la persona:");
        System.out.println("Nombre: "+ mipersona.getNombre());
        System.out.println("Edad: "+ mipersona.getEdad());
        System.out.println("Teléfono: "+ mipersona.getTelefono());


    }
    public static class Persona {
        private int edad;
        private String nombre;
        private String telefono;

        public void setEdad(int edad) {
            this.edad = edad;
        }
        public int getEdad() {
            return edad;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getNombre() {
            return nombre;
        }
        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
        public String getTelefono(){
            return telefono;
        }
    }
}
