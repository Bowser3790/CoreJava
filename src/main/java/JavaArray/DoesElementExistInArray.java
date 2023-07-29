package JavaArray;

import java.util.Arrays;

public class DoesElementExistInArray {
    public static void main(String[] args) {
        // Type code to check if a specific element exists in the array or not

        char ch[] = new char[5];

        ch[0]='A';
        ch[1]='X';
        ch[2]='G';
        ch[3]='C';
        ch[4]='D';

        int counter = 0;

        for(char w : ch){
            if (w == 'X'){
                counter++;
                break;
            }
        }
        if (counter>=1){
            System.out.println("Character Exists");
        }else{
            System.out.println("Character does not exist");
        }

        // Use binarySearch() method, tells you if the element exists or not in the array
        // to use binarySearch() method, you have to sort() first.
        Arrays.sort(ch);

        // when searching indexes such as binarySearch() you need to use int as data type.
        // binarySearch() method gives you the index of the existing element after sorting.
        // if the output is a negative index then the element does not exist.
        int indx1 = Arrays.binarySearch(ch,'C'); // 1
        System.out.println(indx1);

        int indx2 = Arrays.binarySearch(ch,'X'); // 4
        System.out.println(indx2);


    }
}
