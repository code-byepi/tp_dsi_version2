package com.ppai.ppai_version_2.entities;
public class Region {
    //Agregar atributos
    private String nombre;
    private String descripcion;
    private Provincia provincia;

    public Region(String nombre, String descripcion, Provincia provincia) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.provincia = provincia;
    }

    public Region(String string, Pais pais1) {
        //TODO Auto-generated constructor stub
    }

    public String getNombre() {
        return this.nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    public Provincia getProvincia() {
        return this.provincia;
    }

}
