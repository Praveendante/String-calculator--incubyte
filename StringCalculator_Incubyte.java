package exceptionsuser;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator_Incubyte {
    public static int counter=0;
    public static void main(String[] args) {

        String pd="//(1,%%^2,&&&*()10}/1//-9";
        System.out.println(add(pd));
        //counter can be tested by uncommenting below
      /*  add(pd);
        System.out.println(counter); */

    }


    public static String add(String p){
        counter++;
        StringBuilder string1 = new StringBuilder(p);
        for(int i=0;i<p.length();i++){
            if(p.charAt(i)!='0' && p.charAt(i)!='1' && p.charAt(i)!='2'  && p.charAt(i)!='3' && p.charAt(i)!='4' && p.charAt(i)!='5' && p.charAt(i)!='6' && p.charAt(i)!='7' && p.charAt(i)!='8' && p.charAt(i)!='9' && p.charAt(i)!='-'){
                string1.setCharAt(i,',');
            }
        }
        String m=string1.toString();
        String op=m.replaceAll(","," ");
        String[] poo=op.split(" ");
        ArrayList<String> pa=new ArrayList<>();
        ArrayList<String> t= new ArrayList<>();
        for(int i=0;i<poo.length;i++){
            pa.add(poo[i]);
        }
        pa.forEach(w->{
            if(!w.equals("") && Integer.parseInt(w)<1000){
                t.add(w);
            }
        });
        //negative cases
        //ArrayStoreException e=new ArrayStoreException();
        List<Integer> negatives=new ArrayList<>();
        t.forEach(w->{
            if(Integer.parseInt(w)<0){
                negatives.add(Integer.parseInt(w));
            }
        });
        int a=0;
        String s="";
        //try {
        if(negatives.size()>0){

            //   StringBuilder negativs = new StringBuilder();
            ArrayList<Integer> negi=new ArrayList<>();
            negatives.forEach(n -> {
                   /* if(negatives.size()>1){
                    negativs.append(n);
                    negativs.append(",");}
                    else {
                        negativs.append(n);
                    }*/
                negi.add(n);
            });
            //   negativs.toString();
            //  throw new ArrayStoreException("Negative is Not Allowed! given negative numbers are " + negativs.toString());
            s="Negative is Not Allowed! given negative numbers are " + negi;
        }
        else{

            a= t.stream().mapToInt(Integer::parseInt).sum();
            //return a;
            s=""+a;
        }
        return s;
    }
}
