import java.io.*;
import java.util.*;

public class airlinePartners
{
        public void run() throws Exception {

        Scanner file = new Scanner(new File("students_partners.dat"));
        TreeMap<String,ArrayList<String>> m = new TreeMap<String,ArrayList<String>>();

        int times = file.nextInt();
        file.nextLine();
        for(int x=0; x<times; x++){
            String s = file.nextLine();
            m.put(s, new ArrayList<String>());
        }
        times = file.nextInt();
        file.nextLine();
        for(int y = 0; y<times; y++){
            String[] s2 = file.nextLine().split(" ");
            m.get(s2[0]).add(s2[1]);
            m.get(s2[1]).add(s2[0]);
        }
        times = file.nextInt();
        file.nextLine();
        for(int w=0; w<times; w++){
            ArrayList<String> c = new ArrayList<String>();
            String[] s3 = file.nextLine().split(" ");
            String start = s3[0];
            String end = s3[1];
            if(partnered(start, end, m, c)){
                System.out.println("PARTNERS");
            }
            else{
                System.out.println("No miles for you");
            }
        }
    }

    public boolean partnered(String start, String end, Map<String, ArrayList<String>> m, ArrayList<String> s){
        if(start.equals(end)){
            return true;
        }
        if(m.get(start).contains(end) || m.get(end).contains(start)){
            return true;
        }
        for(String t : m.get(start)){
            if(!s.contains(t)){
                s.add(t);
                if(partnered(t, end, m, s)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        new airlinePartners().run();
    }
}