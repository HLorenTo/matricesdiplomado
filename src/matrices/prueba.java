package matrices;
public class prueba {
public static void main(String[] args) {
int matriz [][] =new int [5][4];
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
     System.out.print(matriz [i][j] + " ");
 }
    System.out.println();
}
}
}