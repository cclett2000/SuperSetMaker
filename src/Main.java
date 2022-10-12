import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<int[]> data = dataHandler();
        System.out.println(Arrays.deepToString(data.toArray()));
    }

    // file handler/superset method
    public static ArrayList<int[]> dataHandler() throws FileNotFoundException {
        int tempVar = 0;
        String[] tempArrSTR;
        int[] tempArrINT;

        ArrayList<int[]> tempList = new ArrayList<>();
        File file = new File("sample.txt");
        Scanner fileReader = new Scanner(file);

        while(fileReader.hasNextLine()){
            tempArrSTR = fileReader.nextLine().split(" ");
            tempArrINT = new int[tempArrSTR.length];

            // convert string to int and store in arr
            int i = 0;
            for (String element : tempArrSTR){
                System.out.print(element + " ");
                tempArrINT[i] = Integer.parseInt(element);
                i++;
            }
            System.out.println("\n" + tempArrINT + "\n");

            tempList.add(tempArrINT);
        }

        return tempList;
    }
}
