package Actividades.Actividad_4;

import java.util.ArrayList;
import java.util.Iterator;

public class Bolsa<T> implements Iterable<T> { //permite que los objetos de esta clase Bolsa sean iterables por un for
    private ArrayList<T> lista = new ArrayList<T>();
    private int tope;

    public Bolsa(){}//Constructor por defecto
    public Bolsa(int tope) {
        super();//llamado al constructor de la clase padre
        this.tope = tope;
    }

    public void add(T objeto) { //Se agrega un objeto al arrayList
        if (lista.size() >= tope) {
            lista.add(objeto);
        } else {
            throw new RuntimeException("no caben mas");
        }
    }

    public Iterator<T> iterator() {//Devuelve la lista de objetos
        return lista.iterator();
    }
}