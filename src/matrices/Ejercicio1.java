/*
Desarrollar un programa que por medio de tres (3) matrices de N*M 
(Determinar el tamaño, igual para las 3 matrices):
- Almacenar números pares aleatorios entre 0 y 100 en la primera 
matriz.
- Almacenar números impares aleatorios entre 0 y 50 en la segunda 
matriz.
- Almacenar la suma de los valores de ambas matrices en la tercera 
matriz. 
*/
package matrices;
public class Ejercicio1 {
public static void main(String[] args) {
int filas = 4;
int columnas = 3;
int aux= 0;
int matrizUno [][] = new int [filas][columnas];
int matrizDos [][] = new int [filas][columnas];
int matrizTres [][] = new int [filas][columnas];
for(int i=0; i < filas; i++){
    for(int j=0; j < columnas; j++){
        aux = (int)(Math.random()*100);
        if (aux%2 == 0){
            matrizUno[i][j] = aux;
        }else {
            j--;
        }
    }
}
for (int i=0; i < filas; i++){
    for(int j=0; j < columnas; j++){
        aux = (int)(Math.random()*50);
        if (aux%2 != 0){
            matrizDos[i][j] = aux;
        }else {
            j--;
        }
    }
}
for (int i=0; i < filas; i++){
    for(int j=0; j < columnas; j++){
        matrizTres[i][j] = matrizDos[i][j] +matrizUno [i][j];
    }
}   
    System.out.println("Matriz uno: ");
    System.out.println();
for (int i = 0;i < filas ; i++){
    for(int j =0; j<  columnas; j++){
        System.out.print(matrizUno [i][j]+ " ");
    }
    System.out.println();    
}    
   // System.out.println();
    System.out.println("Matriz dos: ");
   // System.out.println();
    for (int i = 0;i < filas ; i++)
    {
        for(int j =0; j<  columnas; j++)
        {
            System.out.print(matrizDos [i][j]+ " ");
        }
        System.out.println();
    }
    //System.out.println();
    System.out.println("Suma: ");
    //System.out.println();
    for (int i = 0;i < filas ; i++)
    {
        for(int j =0; j<  columnas; j++)
        {
            System.out.print(matrizTres [i][j]+ " ");
        }
        System.out.println();
    }
}
}