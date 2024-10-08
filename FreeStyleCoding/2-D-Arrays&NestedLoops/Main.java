
public class Main {
    public static void main (String[]args){


        int [][] tableArr = new int[5][5];


        for (int x = 0; x<5; x++){
            for(int y = 0; y<5;y++){
                tableArr[x][y] = x*y;

            }
        }
        
        for (int x = 0; x <5; x++){
            for(int y =0; y<5; y++){
                System.out.print(" " + tableArr[x][y]);
                System.out.println();
            }
        }

    }
}
