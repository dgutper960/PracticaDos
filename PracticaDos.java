public class PracticaDos {
    public static void main(String[] args) {
        //Creamos una variable para el máximo de nuestros núm aleatorios, que será iniciada en 100
        int MAX = 100;
        //Creamos la variable donde se almacenará un núm aleatorio
        final int randomNumber = (int) (Math.random() * MAX);//Con la libreria Math.random, se genera un número aleatorio
        //esta última es para el numero de divisores del randomNumber, la iniciamos a 0
        int numDIvisores = 0;

        /**
         * Usaremos el bucle for:
         * - En el estado inicial ponemos que i=1
         * - En la condición que se debe cumplir, ponemos i <= randomNumber/2 (2 es el mínimo divisor)
         * - En el incremento le ponemos uno cada vez (i++) */
        for (int i = 1; i <= randomNumber/2; i++){
            if (randomNumber % i == 0) {
                numDIvisores++; //una vez se cumpla la condición esta variable aumentará en 1
            }
        }
        if (numDIvisores > 2) { //Si el núm de divisores es mayor a dos no es primo
            System.out.println("El número " + randomNumber + " no es primo");
        } else { // si la condicion de arriba no se cumple es que el núm es primo
            System.out.println("El número " + randomNumber + "  es primo");
        }
    }
}