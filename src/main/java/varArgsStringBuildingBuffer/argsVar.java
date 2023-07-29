package varArgsStringBuildingBuffer;

public class argsVar {
    /*
    Notes about var args:
    1)If you want to create integers that work with any amount of integers, remember to use varArgs
    2)VarArgs is a data structure that uses array behind the scenes.
    -Question: can I use more than 1 varArgs in a method?
    No: varArgs cannot be filled up, unlimited. For this reason if there was more than 1 then you would never reach the
    second parameter. If you type unreachable code then Java will give you an error.

   -Question2: can I use another parameter after varArgs in a method?
   No: for the same reason as above.

   -Question3: can I use another parameter before varargs?
   Yes, you can because it will execute that code before getting into the varArgs and will work.
   for example if you were to execute addInt1 and addThreeInt before the var args as the last method
   those two methods could execute before varArgs method (last method in the example below).

   - note varArgs should be the last method to execute every time.

   ... represents varArgs and the 'v' can be any variable.

   varArgs is declared by:
   int ...v or int... v   => there are no other uses
     */

    public static void main(String[] args) {
        int nums1 = addIntegersDynamic(5, 4);
        System.out.println(nums1);

    }
    // create method that adds two integers
    //public static int addInt1(int a, int b);
    // create method that adds three integers
    //public static int addThreeInt(int a, int b, int c);
    // create method that adds four integers
    //public static int addFourInt(int a, int b, int c, int d);

    // create a method that can handle any number of integers
    public static int addIntegersDynamic(int... v){ // in the background varArgs works with arrays [5,4]
        int sum = 0;

        for (int w : v){
            sum = sum + w;
        }
        return sum;
    }




}
