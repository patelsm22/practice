import java.lang.reflect.Array;
import java.util.*;

public class mediumProblems {

    //two sum numbers. Given the array and target, find two number that matches the target

    public int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        int[] output  = new int [2];

        for(int i =0; i<array.length; i++){
                int diff = targetSum - array[i];
                for(int j=0; j<array.length; j++){
                    if(array[j]==diff && array[j] != array[i]){
                        output[0]=array[i];
                        output[1]=array[j];
                        return output;
                    }

                }
        }

        return new int[0];
    }

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        ArrayList<Integer[]> output = new ArrayList<Integer[]>();

        for(int i=0; i< array.length-2;i++){
            int curr = i;
            int lpointer=i+1;
            int rpointer=array.length-1;
            while(lpointer<rpointer) {
                int currentSum = array[curr] + array[lpointer] + array[rpointer];

                if (currentSum == targetSum) {
                    Integer[] newTriplet = {array[curr], array[lpointer],array[rpointer]};
                    output.add(newTriplet);
                    lpointer++;
                    rpointer--;
                } else if (currentSum < targetSum) {
                    lpointer++;
                } else if (currentSum > targetSum) {
                    rpointer--;
                }
            }

        }

        return output;
    }

    //O(n) time where n is the total number of elements in the array
    public static List<Integer> spiralTraverse(int[][] array) {
        if(array.length == 0) return new ArrayList<Integer>();

        ArrayList<Integer> result = new ArrayList<Integer>();
        int startRow = 0;
        int endRow = array.length-1;
        int startCol = 0;
        int endCol= array[0].length-1;

        while(startRow<=endRow && startCol <=endCol){
            for(int col=startCol;col<=endCol;col++){
                result.add(array[startRow][col]);
            }
            for(int row=startRow+1;row<=endRow;row++){
                result.add(array[row][endCol]);
            }
            for(int col=endCol-1;col>=startCol;col--){
                if(startRow==endRow) break;
                result.add(array[endRow][col]);
            }
            for(int row=endRow-1;row>startRow; row--){
                if(startCol==endCol) break;
                result.add(array[row][startCol]);
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        return result;
    }

    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        // Write your code here.
        ArrayList<Integer[]> output = new ArrayList<Integer[]>();

        for(int i=0; i< array.length-2;i++){
            int curr = i;
            int lpointer=i+1;
            int rpointer=array.length-1;
            while(lpointer<rpointer) {
                int currentSum = array[curr] + array[lpointer] + array[rpointer];

                if (currentSum == targetSum) {
                    Integer[] newTriplet = {array[curr], array[lpointer],array[rpointer]};
                    output.add(newTriplet);
                    lpointer++;
                    rpointer--;
                } else if (currentSum < targetSum) {
                    lpointer++;
                } else if (currentSum > targetSum) {
                    rpointer--;
                }
            }

        }

        return output;
    }

    public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        HashMap<String,Integer> resultTally = new HashMap<String,Integer>();
        int homeTeam = 1;
        int awayTeam = 0;

        for(int i=0;i<results.size();i++){
            if(results.get(i)==homeTeam){


            }
        }




        return "";
    }

    public static int[] smallestDiff(int[] arrayOne, int[] arrayTwo){
        int[] output = new int[2];
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int idOne = 0;
        int idTwo = 0;
        int minVal = Integer.MAX_VALUE;
        int current=Integer.MAX_VALUE;

        while(idOne < arrayOne.length && idTwo <arrayTwo.length){
            int firstNum=arrayOne[idOne];
            int secondNum=arrayOne[idTwo];

            if(firstNum<secondNum) {
                current = secondNum - firstNum;
                idOne++;
            } else if(secondNum < firstNum){
                current = firstNum - secondNum;
                idTwo++;
            }         else {
                return new int[]{firstNum,secondNum};
            }

            if(minVal>current){

                minVal=current;
                output = new int[] {firstNum,secondNum};
            }
            }
        return output;
        }

        static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> depthFirstSearch(List<String> array) {
            // Write your code here.
            array.add(this.name);
            for(int i=0;i<children.size();i++){
                children.get(i).depthFirstSearch(array);
            }
            return array;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }

    public int[][] enhancedLoops(int[][] intervals){

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();

        for(int[] x:intervals){
            for(int i:x){
                System.out.print(i);
            } System.out.println();          


        }
        return merged.toArray(new int[merged.size()][]);



    }



}

