package JavaArray;

public class SumOfCharactersArray {
    public static void main(String[] args) {
        String cities[] = new String[5];

        cities[0] = "Miami";
        cities[1] = "New York";
        cities[2] = "Massachusetts";
        cities[3] = "California";
        cities[4] = "Montana";

        int numOfCharInFirst = cities[0].length();
        int numOfCharInLast = cities[cities.length-1].length();
        System.out.println(numOfCharInFirst + numOfCharInLast); //12

    }
}
