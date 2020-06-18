package arrylist;

import java.util.ArrayList;
import java.util.HashMap;


public class textcollection {

    public static void main(String[] args) {
        ArrayList heros = new ArrayList();

        // 初始化5个对象
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero" + i));
        }
        System.out.println(heros.get(1));


        for (int i = 0; i < heros.size(); i++) {

            if("hero1".equals(((Hero)heros.get(i)).name)){
                System.out.println(true);
                break;
            }else {
                System.out.println(false);
            }
        }
