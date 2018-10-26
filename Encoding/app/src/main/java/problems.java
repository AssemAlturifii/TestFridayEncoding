import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class problems {
    public static void main(String[] args) {
        String one="Errors in strategy cannot be correct through tactical maneuvers";
        f(one);

        g("hello there! apple");


    }
    //when string “acp” is encoded, the return value is string “zxk”.
    public static void f(String word){

        String two = "";

        char[]charss=word.toLowerCase().toCharArray();
        

        for(int i=0;i<word.length();i++){
            if(charss[i]>96&&charss[i]<123) {

                two += ((char) (122 - ((int) word.charAt(i) - 97)));
            }
            else if(charss[i]>64&&charss[i]<91){
                two += ((char) (92 - ((int) word.charAt(i) - 65)));
            }

        }
        System.out.println(two);

    }


    //Suppose you are given the String “Hello there! Apple!"
    // a:1,
    //        b:0,
    //        c:0,
    //        d:0,
    //        e:4,
    //        f:0,
    //        g:0,
    //        h:2,
    //        i:0,
    public static void g(String word){
        Map<Character,Integer> map=new LinkedHashMap<>();

        for(int i=97;i<123;i++){
            map.put((char)i,0);
        }


        char[] a=word.toCharArray();

        for(Character b:a){

            map.put(b,0);
        }
        for(Character b:a){
            map.put(b,map.get(b).intValue()+1);
        }
        System.out.println(map);



    }

    }


