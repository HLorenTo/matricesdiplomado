/*
Desarrollar un programa que dada una matriz de números enteros 
entre 0 – 50 de 5*3, hallar el número mayor almacenado:
- Puedes utilizar variables auxiliares. 
*/
package matrices;
public class Ejercicio2 {
public static void main(String[] args) {
    int matriz [][] = new int [5][3];
    int auxiliarUno=0;
    int auxiliarDos=0;
for (int i = 0; i<5;i++){
    for (int j = 0; j<3;j++){
        matriz [i][j] = (int)Math.ceil(Math.random()*50);
        if(auxiliarUno<matriz [i][j]){
            auxiliarUno = matriz [i][j];
          }
           
        }
    }
for (int i = 0; i<5;i++){
    for (int j = 0; j<3;j++){
        System.out.print(matriz [i][j] + " ");
    }System.out.println("");
}
    System.out.println("");
    System.out.println("El numero mayor "+auxiliarUno);
}    
}
