import java.util.*;
class tw{
    public static void main(String args[]){
        int a[]={2,7,11,15};
        int t=9;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<a.length;i++){
            int x=t-a[i];
            if(m.containsKey(x)){
                System.out.println(m.get(x)+" "+i);
                return;
            }
            m.put(a[i],i);
        }
    }
}