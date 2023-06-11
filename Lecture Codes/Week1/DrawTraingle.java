
public class DrawTraingle{
    public static int x ;
    public static int y ;
    public static int z ;
    public DrawTraingle(int a){
        z = a;
    }
    public void drawTraingle(){
        for (x=1;x<z+1;x++){

                for(y=0;y<x;y++){
                    System.out.print("*");
                }

            System.out.println("\n");
        }
    }
}