public class totalmean {
    public static void main(String[] args) {

        int []mean = {5,10,15};
        double getmean = 1;


        for (int i = 0; i < mean.length; i++){
            getmean += mean[i] / mean.length;
        }

        System.out.println(getmean);
    }
}
