package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leonid.barsucovschi
 */
public class Test1 {

    public static void main(String[] args) {

        /* Две основные причины возникновения Generics - это TypeSafe & Reusable Code
        * TypeSafe - это то что позволяет создавать определенные списки тех типов которые вы укажете, а не все подряд типы
        * и на уровне компиляции позволяет находить ошибки которые вы допускаете *
        * Reusable Code - Generics позволяют нам не создавать похожие классы похожие методы похожий
        * код, а использовать Generics чтобы одно и тоже не писать*/

        List<String> list = new ArrayList<>();  // Raw type - сырой тип потому что мы не указали с каким типом работаем

/*        list.add(34);
        list.add("Hello");
        list.add(90);
        list.add(new StringBuilder());
        list.add(new Car());*/
        list.add("privet");
        list.add("poka");
        list.add("kjlsjfljflsfj");
      //  list.add(new Car());

        for (Object o : list){
            System.out.println(o + " length " + ((String)o).length());
        }
    }
}

class Car {}
