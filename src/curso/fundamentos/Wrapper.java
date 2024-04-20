package curso.fundamentos;

public class Wrapper {
    public static void main(String[] args) {

        // -- WRAPPER --
        //conversão de tipo primitivo para classe
        //byte
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000; //int
        Long l = 10000L;


        System.out.println(b.byteValue());
        System.out.println(s.toString());

        Float f = 123.0F;
        System.out.println();

        Double d = 1234.4214;
        System.out.println(d);


        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);

        Character c = '#';
        System.out.println(c.toString());
    }
}
