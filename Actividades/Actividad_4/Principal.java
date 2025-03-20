package Actividades.Actividad_4;

public class Principal {
    public static void main(String[] args) {
        Bolsa<Chocolatina> bolsaCho = new Bolsa<Chocolatina>(); //Se crea el contenedor Bolsa y su tipo de dato como parametro
        Chocolatina c = new Chocolatina("milka");
        Chocolatina c1 = new Chocolatina("milka");//Se crean los objetos a guardad
        Chocolatina c2 = new Chocolatina("ferrero");
        bolsaCho.add(c);
        bolsaCho.add(c1);//Agregacion
        bolsaCho.add(c2);
        for (Chocolatina chocolatina : bolsaCho) { //Iteracion de la clase Bolsa
            System.out.println(chocolatina.getMarca());
        }
    }
}