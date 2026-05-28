/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Sergio Olmedo
 */
public class Maquina {
    private String nombre;
    private String tipo;
    private String fechaUltimoMantenimiento;
    private int frecuenciaDia;
    private String estado;

    public Maquina(String nombre, String tipo, String fechaUltimoMantenimiento, int frecuenciaDia, String estado) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaUltimoMantenimiento = fechaUltimoMantenimiento;
        this.frecuenciaDia = frecuenciaDia;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaUltimoMantenimiento() {
        return fechaUltimoMantenimiento;
    }

    public void setFechaUltimoMantenimiento(String fechaUltimoMantenimiento) {
        this.fechaUltimoMantenimiento = fechaUltimoMantenimiento;
    }

    public int getFrecuenciaDia() {
        return frecuenciaDia;
    }

    public void setFrecuenciaDia(int frecuenciaDia) {
        this.frecuenciaDia = frecuenciaDia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
