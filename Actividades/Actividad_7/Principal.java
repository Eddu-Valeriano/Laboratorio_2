package Actividades.Actividad_7;

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

        Bolsa<Golosina> bolsaGol=new Bolsa<Golosina>();//Se crea nuestro contenedor de Golosinas
        Golosina g0=new Golosina("Bobalo", 5);
        Golosina g1=new Golosina("Chestress", 60);//Se crea un objetos de la clase Golosina
        Golosina g2=new Golosina("Doritos", 50);
        Golosina g3=new Golosina("Cereales", 100);

        bolsaGol.add(g0);
        bolsaGol.add(g1);//Se agregan
        bolsaGol.add(g2);
        bolsaGol.add(g3);

        for(Golosina gol:bolsaGol){//Se recorre y se muestra por pantalla su nombre y peso con sus getters
            System.out.println(gol.getNombre()+" "+gol.getPeso());
        }
    }
}