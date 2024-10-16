import java.util.Arrays;

public class MetodoOrdenamientoBusqueda {
    

    public Persona[] burbuja(Persona[] personas) {
        Persona[] arreglo = Arrays.copyOf(personas, personas.length);
        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j].getEdad() > arreglo[j + 1].getEdad()) {
                    Persona temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        return arreglo;
    }

    public int busquedaBinaria(Persona[] personas, int edadABuscar) {
        int bajo = 0;
        int alto = personas.length - 1;

        while (bajo <= alto) {
            int centro = bajo + (alto - bajo) / 2;
            int valorCentro = personas[centro].getEdad();

            // IMPRIMIR ESTADO ACTUAL
            printPasos(personas, bajo, alto, centro, valorCentro);

            if (valorCentro == edadABuscar) {
                // PERSONA ENCONTRADA
                System.out.print("\nLa persona con la edad de " + edadABuscar + " años es " + personas[centro].getPersona());
                return centro;
            }

            if (valorCentro < edadABuscar) {
                System.out.println("--> DERECHA");
                bajo = centro + 1;
            } else {
                System.out.println("--> IZQUIERDA");
                alto = centro - 1;
            }
        }

        return -1;
    }

    private void printPasos(Persona[] personas, int bajo, int alto, int centro, int valorCentro) {
        System.out.print("\n");
        for (int i = bajo; i <= alto; i++) {
            System.out.print(personas[i].getEdad() + " | ");
        }
        System.out.println();
        System.out.println("bajo= " + bajo + "   alto= " + alto + "   centro= " + centro + "   valorCentro= " + valorCentro);
    }
}
