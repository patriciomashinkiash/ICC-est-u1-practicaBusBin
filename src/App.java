import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner s = new Scanner(System.in);

        int cant;
        System.out.print("Ingrese la cantidad de personas: ");
        cant = s.nextInt();

        Persona[] personas = new Persona[cant];
        MetodoOrdenamientoBusqueda mOB = new MetodoOrdenamientoBusqueda();


        for(int i = 0; i < cant; i++){
            System.out.print("\nNombre de la persona: ");
            String nom = s.next();

            System.out.print("Edad de la persona: ");
            int ed = s.nextInt();

            personas[i] = new Persona(nom, ed);
        }

        System.out.println("LISTADO DE PERSONAS INGRESADAS");
        for(Persona persona : personas){
            System.out.println(persona);
        }

        personas = mOB.burbuja(personas);

        System.out.print("\nIngrese la edad a buscar: ");
        int edadABuscar = s.nextInt();

        int resultado = mOB.busquedaBinaria(personas, edadABuscar);

        if (resultado == -1) {
            System.out.println("La persona con la edad de" + edadABuscar + " años no fue encontrada");
        }
        
        s.close();

    }
}
