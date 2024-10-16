import java.util.Arrays;

public class MetodoOrdenamientoBusqueda {
    

    public int[] burbuja(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                //INTERCAMBIO DE VALORES DEPENDIENDO DE LA CONDICION
                if ((arreglo[j] > arreglo[j + 1])) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
                //IMPRESION DE LAS POSICIONES, VALORES A COMPARAR EN CADA ITERACION DEL ARREGLO
                
                System.out.println(Arrays.toString(arreglo));     
            }
        }
        return arreglo;
    }

    public int busquedaBinaria(int[] arreglo, int value){

        int inicio = 0;
        int fin = arreglo.length -1;
        

        while (inicio <= fin) {
            
            int medio = inicio + (fin - inicio) /2;
            
            if(arreglo[medio] == value){
                //ELEMENTO ENCONTRADO
                return value;
            }

            if(arreglo[medio] < value){
                inicio = medio+1;//BUSCAR EN LA MITAD DE LA DERECHA
            }else{
                fin = medio-1;//BUSCAR EN LA MITAD DE LA IZQUIERDA
            }
        }

        return -1;
    }
}
