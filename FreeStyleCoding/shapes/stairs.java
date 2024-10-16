public class stairs {
    public static void main(String[] args) {
        
        //*
        //**
        //***
        //****
        //*****


        int size = 5;

        
        for (int i = 1; i <= size; i++){
            for (int j = 1; j <= size - i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\n\n");

        for (int i = 1; i <= size; i++){
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("\n\n\n");


        for (int i = 1; i <= size; i++){

            for(int j = 1; j <= size - i; j++ ){
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
