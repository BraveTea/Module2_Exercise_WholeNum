public class Programme {

    public static void main(String[] args){
        int num1 = 10;
        WholeNum num2 = new WholeNum(10);

        System.out.println("num1: " + num1);
        System.out.println("num2 " + num2.value);
        System.out.println("-------------------");

        addTen(num1);
        addTen(num2);

        System.out.println("num1: " + num1);
        System.out.println("num2 " + num2.value);

    }

    public static void addTen(int num){
        num += 10;
    }

    public static void addTen(WholeNum num){
        num.value += 10;
    }
}
