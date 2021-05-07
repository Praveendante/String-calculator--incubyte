package exceptionsuser;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator_Incubyte {
    public static void main(String[] args) {
//all

     /*   List<List<Integer>> listanswer = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        allLocations.forEach(S -> {
            Integer min = 1000;
            //x^2+y^2
            int p = S.get(0) * S.get(0);
            int m = S.get(1) * S.get(1);
            int pm = p + m;
            Integer l;
            Integer pl = pm / 2;
            do {
                l = pl;
                pl = (l + (pm / l)) / 2;
            }
            while ((l - pl) != 0);
            Integer sqrt = pl;
            if (sqrt < min) {
                min = sqrt;
                list1.add(min);
            }
        });
        Integer min = 1000;
        //int min=1000;

        //list have all sqrt
        // list1.forEach(S->);
        //for(int i=0;i<list1.size();i++){
        //  if(list1.get(i)<min){
        //       min=list1.get(i);
        // }
        Object[] ob = list1.toArray();
        Object[] p = list1.toArray();
        //Object[] p=Arrays.sort(ob);
        List<Integer> index = new ArrayList<>();
//for(int i=0;i<numRestaurants;i++){
        for (int j = 0; j < numRestaurants - 1; j++) {
            for (int k = 0; k < p.length - 1; k++) {
                if (ob[j] == p[k]) {
                    index.add(j);
                }

            }
        }

        for (int i = 0; i < allLocations.size() - 1; i++) {
            if (index.get(i) == i)
                listanswer.add(allLocations.get(i));
        }

        return listanswer;*/
        //  }

        String pd="//(1,%%^2,&&&*()10}/1//-9";

        //String iresult=add(pd);
        // if(ad)
        System.out.println(add(pd));


    }


    public static String add(String p){
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
