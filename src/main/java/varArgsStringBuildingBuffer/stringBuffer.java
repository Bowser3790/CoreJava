package varArgsStringBuildingBuffer;

public class stringBuffer {
    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer();
        sb1.append("Woow!");

        int sb2 = sb1.length();
        System.out.println(sb2);
        int sb3 = sb1.capacity();
        System.out.println(sb3);

    }
}
