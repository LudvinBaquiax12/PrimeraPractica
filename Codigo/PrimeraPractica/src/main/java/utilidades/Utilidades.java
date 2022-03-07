/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
 *
 * @author baquiax
 */
public class Utilidades {

    public static String[] leerArchivoEntrada() {

        return null;
    }

    public static boolean repetidos(int arr[]) {
        int aux[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            aux[arr[i] - 1]++;
            if (aux[arr[i] - 1] == 2) {
                return false;
            }
        }
        return true;
    }
}
