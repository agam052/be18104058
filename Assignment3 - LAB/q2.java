import java.util.*;

interface Filter {
    boolean accept(String x);
}

class Filter1 implements Filter {
    public boolean accept(String obj) {
        return (obj.length( ) < 4);
    }
}
class Filter2 implements Filter {
    public boolean accept(String obj) {
        return (obj.endsWith("s"));
    }
}
class Filter3 implements Filter {
    public boolean accept(String obj) {
        StringBuilder s=new StringBuilder(obj);  
        s.reverse();  
        String rev=s.toString();  
        if(obj.equals(rev)){  
           return true;  
        }else{  
           return false;  
        } 
    }
}

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>( );
        list.add("Agam");
        list.add("EeE");
        list.add("courageous");
        list.add("naman");
        list.add("java");
        list.add("codes");

        Filter1 f = new ShortFilter( );
        Filter2 f1 = new ShortFilter1( );
        Filter3 f2 = new ShortFilter2( );

        ArrayList<String> results = collectAll(list, f);
        System.out.println(results);
        ArrayList<String> results1 = collectAll(list, f1);
        System.out.println(results1);
        ArrayList<String> results2= collectAll(list, f2);
        System.out.println(results2);
    }
    
    
 
    public static ArrayList<String> collectAll(
            ArrayList<String> objects, Filter f) {
                ArrayList<String> filtered = new ArrayList<String>( );
                for(String obj : objects) {
                    if (f.accept(obj)) {
                            filtered.add(obj);
                    }
                }
                return filtered;
    }    
}