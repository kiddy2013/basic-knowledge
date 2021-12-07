package basic.knowledge.base.core.basetype;


import java.nio.charset.StandardCharsets;

/**
 * @author jack
 */
public class MainEnter {

    public static void main(String[] args) {
        var asda="test严";
        System.out.println(asda.codePointAt(0));
        System.out.println(asda.codePointAt(asda.length()-1));
        var aaa= asda.getBytes(StandardCharsets.UTF_8);
        int[] intarray={20006};
        var bbb=new String(intarray,0,1);
        System.out.println(bbb);
        for (byte b:aaa){
            System.out.println(b);
        }

    }

}
