import java.io.*;
import java.util.*;
/**
 *
 * @author user
 */
public class ceshi {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException,IOException{
        // TODO code application logic here
        File f=new File("D://matlab//R2016a//bin//_E.txt");
        File f1=new File("D://matlab//R2016a//bin//D.txt");
        BufferedReader b=new BufferedReader(new FileReader(f));
        BufferedWriter b1=new BufferedWriter(new FileWriter(f1));
        List temp=new ArrayList();
        String data=null;
        while((data=b.readLine())!=null)
        {
            temp.add(data);
        }
        for(int i=temp.size()-1;i>=0;i--)
        {
            String str=(String)temp.get(i);
            b1.write(str);
//            b1.write('/n');
        }
        b.close();
        b1.close();
    }
    
}