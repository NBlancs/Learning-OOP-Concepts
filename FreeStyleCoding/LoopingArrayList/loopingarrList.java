import java.util.ArrayList;

public class loopingarrList{
    public static void main(String[]args){

        ArrayList myList = new ArrayList();

        myList.add("this");
        myList.add("time");
        myList.add("will");
        myList.add("never");
        myList.add("end");

        System.out.println(myList);
        System.out.println(myList.get(2));

    }
}