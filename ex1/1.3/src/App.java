///NguyenNhatMinhE21CN4/// 

import java.util.Scanner;

class App {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        String s = sc.nextLine();
        int[] arr = creatArray(s);
        displayArray(arr);
        
        int[] revArr = reverseArray(arr);
        displayReverseArray(revArr);
    }

    //Creat array from string
    private static int[] creatArray(String s){
        int[] arr = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            arr[i] = s.charAt(i) - '0';
        }
        return arr;
    }

    //Display array
    private static void displayArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Reverse array
    private static int[] reverseArray(int[] arr){
        int[] revArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            revArr[i] = arr[arr.length - 1 - i];
        }
        return revArr;
    }

    //Display reverse array
    private static void displayReverseArray(int[] revArr){
        for(int i = 0; i < revArr.length; i++){
            System.out.print(revArr[i] + " ");
        }
        System.out.println();
    }

}
