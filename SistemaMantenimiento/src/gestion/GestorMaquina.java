/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;
import java.util.ArrayList;
import modelo.Maquina;

/**
 *
 * @author Sergio Olmedo
 */
public class GestorMaquina {
   private ArrayList<Maquina> listaMaquinas;

   public GestorMaquina() {

        listaMaquinas = new ArrayList<>();

    }

    public void agregarMaquina(Maquina maquina) {

        listaMaquinas.add(maquina);

    }

    public void eliminarMaquina(int indice) {

        listaMaquinas.remove(indice);

    }

    public ArrayList<Maquina> getListaMaquinas() {

        return listaMaquinas;

    }
 
}
