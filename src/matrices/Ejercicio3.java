/*
Desarrollar un programa que dada una matriz 3*4 con números 
aleatorios, imprimir de la matriz sólo lo siguiente:
- La primera fila
- La segunda columna
- La tercera fila
*/
package matrices;
public class Ejercicio3 {
public static void main(String[] args) {
   int matriz [][] = new int [3][4];
    int auxiliarUno=0;
    int auxiliarDos=0;
for (int i = 0; i<3;i++){
    for (int j = 0; j<4;j++){
        matriz [i][j] = (int)Math.ceil(Math.random()*50);
        if(auxiliarUno<matriz [i][j]){
            auxiliarUno = matriz [i][j];
          }
           
        }
    }
for (int i = 0; i<3;i++){
    for (int j = 0; j<4;j++){
        System.out.print(matriz [i][j] + " ");
    }System.out.println("");
} 
System.out.println("Primera columna: ");
for (int i = 0; i<3;i++){
    for (int j = 0; j<1;j++){
        System.out.println(matriz [i][j] + " ");
    }
}
    System.out.println("Primera fila");
for (int i = 0; i<1;i++){
    for (int j = 0; j<4;j++){
        System.out.print(matriz [i][j] + " ");
    }System.out.println("");
}
    System.out.println("Segunda fila");
for (int i = 1; i<2;i++){
    for (int j = 0; j<4;j++){
        System.out.print(matriz [i][j] + " ");
    }System.out.println("");
}    
}
}