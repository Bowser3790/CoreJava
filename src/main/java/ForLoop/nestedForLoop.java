package ForLoop;

public class nestedForLoop {
    // Week: 1
    // day 1
    // day 2
    // day 3
    //Week: 2
    // Day 1
    // Day 2
    // Day 3 ...
    public static void main(String[] args) {
        for (int i = 1; i<5; i++){
            System.out.println("Week: " + i);
            for (int k = 1; k<8; k++){
                System.out.println("day: " + k);
            }
        }
    }
}
// notes: nested loops are time-consuming and if they are not necessary then do not prefer to do them
// If a code is time consuming it means that it has "time-complexity"
// there is a way to calculate the value of time complexity:
// if you have 2 loops, the time complexity is the square of 2==>4
// if you have 3 loops, the time complexity is the square of 3==>27
// and so on .. do not type code with more than 1 nested loop.
