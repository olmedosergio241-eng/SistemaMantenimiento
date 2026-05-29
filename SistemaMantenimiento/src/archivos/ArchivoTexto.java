/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import modelo.Maquina;

/**
 *
 * @author Sergio Olmedo
 */
public class ArchivoTexto {
    public static void guardarMaquina(Maquina maquina) {

        try {

            BufferedWriter bw =
                    new BufferedWriter(
                            new FileWriter("maquinas.txt", true)
                    );

            bw.write(
                    maquina.getNombre() + "," +
                    maquina.getTipo() + "," +
                    maquina.getFechaUltimoMantenimiento() + "," +
                    maquina.getFrecuenciaDia() + "," +
                    maquina.getEstado()
            );

            bw.newLine();

            bw.close();

        } catch (IOException e) {

            System.out.println("Error al guardar en TXT");

        }

    }
}
