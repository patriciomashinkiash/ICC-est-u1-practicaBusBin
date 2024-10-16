public class Persona {
    
    private String persona;
    private int edad;

    public Persona(String persona, int edad) {
        this.persona = persona;
        this.edad = edad;
    }
    public String getPersona() {
        return persona;
    }
    public void setPersona(String persona) {
        this.persona = persona;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "\tPersona  [Nombre: " + persona + "\t Edad= " + edad + "]";
    }

    
    
}
