import java.util.Scanner;
public class reto3 {
    public static void main(String[] args) {
        Scanner lect=new Scanner (System.in);
        String [][] matriz;
        matriz=new String[4][4];
    
        for (int fila=0;fila<4;fila++) {
            for (int columna=0;columna<4;columna++) {
                System.out.println("Digite el nombre y precio del producto en la posición: "+fila+columna);
                matriz[fila][columna]=lect.nextLine();
                
            }
        } 

        System.out.println("");
        for (int fila=0;fila<4;fila++) {
            for (int columna=0;columna<4;columna++) {
            System.out.print(fila);
            System.out.print(columna+" ");
            System.out.print(matriz[fila][columna]+"\t");
            System.out.print(" ");
            }
            System.out.println("|");
        }
    lect.close(); 
    }
}

