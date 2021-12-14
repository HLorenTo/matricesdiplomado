package matrices;
public class Matrices {
public static void main(String[] args) {
// igual de los vectores pero de una forma bidimensional
//FORMA1
int matrizNumerosUno [][] = new int [4][5];
//FORMA2
int [][]matrizNumerosDos  = new int [4][5];
//FORMA3
int[][] matrizNumerosTres  = new int [4][5];
//FORMA4
int matrizNumerosCuatro [][];
//FORMA5
int matrizNumerosCinco [][] = {};
//FORMA6
int matrizNumerosSeis [][] = {{1,2},{3,4}};
//FORMA7
int matrizNumerosSiete [][] = new int [][]{{1,2},{3,4}};

//EJERCICIO1 GUIA
System.out.println("EJERCICIO1 GUIA");
int numeros [][] = new int [2][2]; 
numeros [0][0] = 1;
numeros [0][1] = 2;
numeros [1][0] = 6; 
numeros [1][1] = 7;    
    
//SE DEBE UTILIZAR DOS CICLOS UNO PAARA RECORRER FILAS Y EL OTRO COLUMNAS


int edades[][] = {{19,18,16},{15,14,17},{11,14,7,6}};
for (int i = 0 ; i< 3 ; i++)
{
    for (int j = 0; j<3; j++)
    {
        System.out.print(edades[i][j] + " ");
    }
    System.out.println(" ");
}

/*
- Desarrollar un programa que dada una matriz de 5*4, almacene
números aleatorios entre 0 y 100 en todas sus posiciones. Luego
mostrar la matriz en forma de tabla.
*/
    System.out.println("EJERCICIO2 GUIA");
int matriz [][] =new int [5][4];
int suma =0;
int resta = 0;
int multiplicacion = 1;
double division;
double raiz;
for (int i = 0; i < 5; i++)
{
    for (int j = 0; j <4; j++)
    {
        matriz [i][j] = (int)Math.ceil(Math.random()*100);
    }
}for (int i = 0; i < 5; i++)
{
    for (int j = 0; j <4; j++)
    {
         suma = suma +matriz [i][j];
        resta = resta -matriz [i][j];
        multiplicacion = multiplicacion *matriz [i][j];
        System.out.print(matriz [i][j] + " ");
    }
    System.out.println();
}
division = multiplicacion/suma;
raiz = Math.sqrt(suma);
        System.out.println("La suma de la matriz es de "+suma);
        System.out.println("La resta de la matriz es de "+resta);
        System.out.println("La multiplicacion de la matriz es de "+multiplicacion);
        System.out.println("La division de la multiplicaicon y la suma de la matriz es de "+division);
        System.out.println("La raiz cuadrada de la suma de todos los vectores es de "+raiz);
}
}