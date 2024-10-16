import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner s = new Scanner(System.in);

        int cant;
        System.out.print("Ingrese la cantidad de personas: ");
        cant = s.nextInt();

        Persona[] personas = new Persona[cant];


        for(int i = 0; i < cant; i++){
            System.out.print("\nNombre de la persona: ");
            String nom = s.next();

            System.out.print("Edad de la persona: ");
            int ed = s.nextInt();

            personas[i] = new Persona(nom, ed);
        }

        for(Persona persona : personas){
            System.out.println(persona);
        }
        
        

    

        s.close();

    }
}
