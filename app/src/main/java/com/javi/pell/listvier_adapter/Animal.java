package com.javi.pell.listvier_adapter;

/**
 * Created by javier on 25/1/18.
 */

public class Animal
{
    String nombre;
    int drawableImagenID;

    public Animal(){}

    public Animal(String nombre, int drawableImagenID) {
        this.nombre = nombre;
        this.drawableImagenID = drawableImagenID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDrawableImagenID() {
        return drawableImagenID;
    }

    public void setDrawableImagenID(int drawableImagenID) {
        this.drawableImagenID = drawableImagenID;
    }
}
