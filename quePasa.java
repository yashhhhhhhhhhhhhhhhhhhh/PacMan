import java.io.*;
import java.util.*;

public class quePasa
{
        public void run() throws Exception {

        Scanner file = new Scanner(new File("students_que.dat"));

        int times = file.nextInt();
        file.nextLine();

        TreeMap<String,String> m = new TreeMap<String,String>();

        for(int asdf = 0; asdf<times; asdf++){
            m.put(file.next(), file.next());
            file.nextLine();
        }

        while(file.hasNext()){
            String[] s = file.nextLine().split(" ");
            for(int x = 0; x<s.length; x++){
                System.out.print(m.get(s[x]) + " ");
            }
            System.out.println();
        }

//        for(String item : m.keySet()){
//            System.out.println(m.get(item));
//        }
    }

    public static void main(String[] args) throws Exception {
        new quePasa().run();
    }
}