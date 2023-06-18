import java.util.ArrayList;
import java.util.Iterator;

public class Valores {

    private ArrayList<Integer> miLista;

    public Valores() {
        miLista = new ArrayList<>();
    }

    public void ingresarValores() {
        int tamanio = (int) Math.round(Math.random() * 10 + 10);
        for (int i = 0; i <= tamanio; i++) {
            miLista.add((int) Math.round(Math.random() * 100));
        }
    }

    public void imprimirLista() {
        for (Integer valor : miLista) {
            System.out.print(valor + ", ");
        }
    }

    public void sumarLista() {
        int suma = miLista.stream().mapToInt(Integer::intValue).sum();
        System.out.println("\nLa suma de todos los elementos de la lista es: " + suma);
    }

    public void sumarListaConIterator() {
        int suma = 0;
        Iterator<Integer> miIterator = miLista.iterator();
        while (miIterator.hasNext()) {
            int valor = miIterator.next();
            suma += valor;
        }
        System.out.println("La suma de todos los elementos de la lista con Iterator es: " + suma);
    }

    public void mediaDeLaLista() {
        int suma = miLista.stream().mapToInt(Integer::valueOf).sum();
        System.out.println("La media de los valores de la lista es: " + (float) suma / miLista.size());
    }

    public void valorMaximoConIterator() {
        int max = 0;
        Iterator<Integer> miIterator = miLista.iterator();
        while (miIterator.hasNext()) {
            int valor = miIterator.next();
            if (valor > max) {
                max = valor;
            }
        }
        System.out.println("El valor máximo de la lista usando un Iterator es: " + max);
    }

    public void valorMaximoConArray() {
        Integer miListaArray[] = new Integer[miLista.size()];
        miLista.toArray(miListaArray);
        int max = 0;
        for (int i = 0; i < miListaArray.length; i++) {
            if (miListaArray[i] > max) {
                max = miListaArray[i];
            }
        }
        System.out.println("El valor máximo de la lista usando un Array es: " + max);
    }

    public void valorMinimoConIterator() {
        Iterator<Integer> miIterator = miLista.iterator();
        int min = miIterator.next();
        while (miIterator.hasNext()) {
            int valor = miIterator.next();
            if (valor < min) {
                min = valor;
            }
        }
        System.out.println("El valor mínimo de la lista usando un Iterator es: " + min);
    }

    public void valorMinimoConArray() {
        Integer miListaArray[] = new Integer[miLista.size()];
        miLista.toArray(miListaArray);
        int min = miListaArray[0];
        for (int i = 0; i < miListaArray.length; i++) {
            if (miListaArray[i] < min) {
                min = miListaArray[i];
            }
        }
        System.out.println("El valor mínimo de la lista usando un Array es: " + min);
    }
}
