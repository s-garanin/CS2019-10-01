package by.it.garanin.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        {
            String[] ArrayList = new String[5];
            ArrayList[0] = "123";
            ArrayList[1] = "321";
            ArrayList[2] = "456";
            ArrayList[3] = "654";
            ArrayList[4] = "789";
            int n = ArrayList.length;
            System.out.println(n);
            for (int i=0 ; i <=4; i++){
                String str = ArrayList[i];
                System.out.println(str);

        }
        }

    }
}