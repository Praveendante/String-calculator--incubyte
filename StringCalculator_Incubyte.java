package exceptionsuser;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator_Incubyte {
    public static int counter=0;
    public static void main(String[] args) {

      //  String pd="//(1,%%^2,&&&*()10}/1//-9";
        Scanner s= new Scanner(System.in);
        String pd=s.nextLine();
        System.out.println(add(pd));
        //counter can be tested by uncommenting below
      /*  add(pd);
        System.out.println(counter); */

    }


    public static String add(String p){
        //counter++;
       GetCalledCount();
        int a=0;
        String s="";
        ArrayList<String> t= new ArrayList<>();
        List<Integer> negatives=new ArrayList<>();
        StringBuilder string1 = new StringBuilder(p);
        for(int i=0;i<p.length();i++){
            if(p.charAt(i)!='0' && p.charAt(i)!='1' && p.charAt(i)!='2'  && p.charAt(i)!='3' && p.charAt(i)!='4' && p.charAt(i)!='5' && p.charAt(i)!='6' && p.charAt(i)!='7' && p.charAt(i)!='8' && p.charAt(i)!='9' && p.charAt(i)!='-'){
                string1.setCharAt(i,' ');
            }
        }
        String[] poo=string1.toString().split(" ");

        for(int i=0;i<poo.length;i++){
            if(!poo[i].equals("") && !poo[i].equals("-") && Integer.parseInt(poo[i])<1000 && Integer.parseInt(poo[i])>0){
                t.add(poo[i]);
            }
            else if(!poo[i].equals("")  && !poo[i].equals("-") && Integer.parseInt(poo[i])<0 ){
                negatives.add(Integer.parseInt(poo[i]));
            }
        }
        if(negatives.size()>0){
            s="Negative is Not Allowed! given negative numbers are " + negatives;
        }
        else{

            a= t.stream().mapToInt(Integer::parseInt).sum();
            s=""+a;
        }
        return s;
    }
    public static int GetCalledCount(){
        return counter++;
    }
}
