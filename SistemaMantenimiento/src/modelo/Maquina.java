/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Sergio Olmedo
 */
public class Maquina implements Serializable{
    private String nombre;
    private String tipo;
    private String fechaUltimoMantenimiento;
    private int frecuenciaDia;
    private String estado;

    public Maquina(String nombre, String tipo, String fechaUltimoMantenimiento, int frecuenciaDia, EstadoMaquina estado) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaUltimoMantenimiento = fechaUltimoMantenimiento;
        this.frecuenciaDia = frecuenciaDia;
        this.estado = estado.name();
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
    
    public EstadoMaquina calcularEstado(String fechaReferencia) {
    try {
        // Usamos un solo formateador
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Convertimos los Strings a fechas reales
        // IMPORTANTE: Si this.fechaUltimoMantenimiento NO tiene formato dd/MM/yyyy, aquí dará error.
        LocalDate inicio = LocalDate.parse(this.fechaUltimoMantenimiento, dtf);
        LocalDate hoy = LocalDate.parse(fechaReferencia, dtf);

        // Calculamos los días que pasaron
        long diasPasados = ChronoUnit.DAYS.between(inicio, hoy);

        if (diasPasados >= frecuenciaDia) {
            return EstadoMaquina.VENCIDO;
        } else if (diasPasados >= (frecuenciaDia - 7)) {
            return EstadoMaquina.PROXIMO_MANTENIMIENTO;
        } else {
            return EstadoMaquina.AL_DIA;
        }
    } catch (Exception e) {
        // Si hay un error de formato en alguna máquina vieja, devolvemos AL_DIA 
        // para que el programa no se detenga por culpa de un dato mal cargado.
        System.err.println("Error procesando fecha en la máquina: " + this.nombre);
        return EstadoMaquina.AL_DIA; 
    }
}

    @Override
    public String toString() {
        return "Maquina{" + "nombre=" + nombre + ", tipo=" + tipo + ", fechaUltimoMantenimiento=" + fechaUltimoMantenimiento + ", frecuenciaDia=" + frecuenciaDia + ", estado=" + estado + '}';
    }
    
    
    
}
