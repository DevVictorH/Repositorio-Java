package curso.collections;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("unchecked")
public class ColeçãoBagunçada {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("teste");
        conjunto.add(2);

        System.out.println(conjunto.size());

        conjunto.remove("teste");

        System.out.println(conjunto.contains(2));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        conjunto.addAll(nums); // uniao entre dois conjuntos
        conjunto.retainAll(nums);
        System.out.println(conjunto);


    }
}
