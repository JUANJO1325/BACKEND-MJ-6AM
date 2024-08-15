package JavaNotes;

public class Variable {

    public static void main(String[] args) {


        byte moveLeft;

        moveLeft = 127;

        short moveLeft2;

        moveLeft2 = (short) moveLeft;
        System.out.println(moveLeft2);

        moveLeft2 = 130;

        int num1 =19;

        String num2 = "23";

        //parseo variable

        int newNun2 = Integer.parseInt(num2);

        float promedio = (num1 + newNun2)/2;
        System.out.println(promedio);


    }

}

