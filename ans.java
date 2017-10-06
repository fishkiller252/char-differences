import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        ArrayList<String> first = new ArrayList<String>();
        ArrayList<String> second= new ArrayList<String>();
        String []ss=new String[n];
        String []tt=new String[m];

         String s= sc.next();
         String t= sc.next();


        ss=s.split("",-1);
        tt=t.split("",-1);

        for(String x:ss){
            first.add(x);

        }
        for(String y:tt){
            second.add(y);

        }

        Collections.sort(first);
        Collections.sort(second);

        for(String z:first){
            second.remove(z);
        }

        System.out.println(second.size());
    }
}
