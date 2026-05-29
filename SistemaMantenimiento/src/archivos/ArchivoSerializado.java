/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivos;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import modelo.Maquina;

/**
 *
 * @author Sergio Olmedo
 */
public class ArchivoSerializado {
    public static void guardar(ArrayList<Maquina> lista) {

        try {

            ObjectOutputStream oos =
                    new ObjectOutputStream(
                            new FileOutputStream("maquinas.dat")
                    );

            oos.writeObject(lista);

            oos.close();

        } catch (IOException e) {

            System.out.println("Error al serializar");

        }

    }
}
