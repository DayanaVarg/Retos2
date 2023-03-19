import java.util.Scanner;
public class reto2 {
    public static void main(String[] args) {
        Scanner lect=new Scanner(System.in);
        int c, p, posi=0;
        float men, may;
        String ganador="";
        

        System.out.println("Digite la cantidad de competidores que participarán");
        c=lect.nextInt();

        float[]tiempo=new float[c];
        String[]nombre=new String[c];

        for (p=0;p<c;p++) {
            System.out.println("Digite el nombre del participante número "+p);
            nombre[p]=lect.next();
            System.out.println("Digite el tiempo (en segundos) del participante número "+p);
            tiempo[p]=lect.nextFloat();
        }

        for (p=0;p<nombre.length && p<tiempo.length;p++) {
            System.out.println("Nombre del participante #"+p+": "+nombre[p]+" - "+" Tiempo: "+tiempo[p]+" segundos");
        }

        men=tiempo[0];
        may=tiempo[0];
        for (p=0;p<nombre.length && p<tiempo.length;p++) {
            if (may>tiempo[p]){
                may = tiempo[p];
                ganador=nombre[p];
                posi= p;
            }else if(men<tiempo[p]){
                men=tiempo[p];
            }
        }

        System.out.println("El ganador es el jugador #"+posi+"\n"+ganador+"\nSu tiempo fue: "+may+" segundos." );
        lect.close();
    } 
}