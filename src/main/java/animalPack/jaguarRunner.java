package animalPack;

public class jaguarRunner {
    public static void main(String[] args) {
        cat myCat = new cat();
        System.out.println(myCat.initial); // A <== Cat class does not have "initial" but parent Mammal has this.

        System.out.println(myCat.age); // 14 <== Cat class has "age" variable, that is why the object does
        // not use the variable from the parent

        // when you create an object, you can select data type of the object from the class itself or from any parent
        Object cat0 = new cat();

        // when you create an object, you can select a variable in inheritance, focus on the "data type of the object,
        // the variable will be looked for starting from the class used in "data type of the object"

        animal cat1 = new cat();
        System.out.println("Parent is Animal: " + cat1.age);// 4

        mammal cat2 = new cat();
        System.out.println("Parent is Mammal: " + cat2.age);// 6


        cat cat3 = new cat();
        System.out.println("Parent is Cat: " + cat3.age);// 14

        // When you call a method in inheritance, focus on the constructor
        // Start to look for the method from the class used in its constructor
        // for example:
//        animal mammal1 = new mammal();
//        mammal1.age(); // the important part is the mammal() => which is the constructor in this
        // note that if you are in the animal class (parent) and you are trying to use a method from a child class you will get an error.


    }

}
