public class Main {
    public static void main(String[] args) {
        //ЗАДАЧА 1
        System.out.println("ЗАДАЧА 1");
        for (int i = 1; i<11;i++){
            System.out.println(i);
        }
        //ЗАДАЧА 2
        System.out.println("ЗАДАЧА 2");
        for (int i = 10; i>0;i--){
            System.out.println(i);
        }
        //ЗАДАЧА 3
        System.out.println("ЗАДАЧА 3");
        for (int i = 0; i<18;i+=2){
            System.out.println(i);
        }
        //ЗАДАЧА 4
        System.out.println("ЗАДАЧА 4");
        for (int i = 10; i>-11;i--){
            System.out.println(i);
        }
        //ЗАДАЧА 5
        System.out.println("ЗАДАЧА 5");
        for (int i = 1904; i<=2096;i+=4){
            System.out.println(i + " год является високосным");
        }
        //ЗАДАЧА 6
        System.out.println("ЗАДАЧА 6");
        for (int i = 7; i<=98;i+=7){
            System.out.println(i);
        }
        //ЗАДАЧА 7
        System.out.println("ЗАДАЧА 7");
        for (int i = 1; i<=512;i*=2){
            System.out.println(i);
        }
        //ЗАДАЧА 8
        System.out.println("ЗАДАЧА 8");
        int vklad = 29000;
        int summaNakopleniy = 0;
        for (int i = 1; i<=12;i++){
            summaNakopleniy += vklad;
            System.out.println("Месяц "+i+", сумма накоплений равна "+summaNakopleniy+" рублей");
        }
        //ЗАДАЧА 9
        System.out.println("ЗАДАЧА 9");
        summaNakopleniy = 0;
        for (int i = 1; i<=12;i++){
            summaNakopleniy *= 1.12;
            summaNakopleniy += vklad;
            System.out.println("Месяц "+i+", сумма накоплений равна "+summaNakopleniy+" рублей");
        }
        //ЗАДАЧА 10
        System.out.println("ЗАДАЧА 10");
        for (int i = 1;i<=10;i++){
            System.out.println("2*"+i+"="+i*2);
        }
    }
}