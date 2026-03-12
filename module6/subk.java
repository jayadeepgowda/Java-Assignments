import java.util.*;
class subk{
    public static void main(String args[]){
        int a[]={1,2,3,1,1,1,1};
        int k=3;
        HashMap<Integer,Integer> m=new HashMap<>();
        int s=0,ab=0;
        for(int i=0;i<a.length;i++){
            s+=a[i];
            if(s==k)
                ab=i+1;
            if(m.containsKey(s-k))
                ab=Math.max(ab,i-m.get(s-k));
            if(!m.containsKey(s))
                m.put(s,i);
        }
        System.out.println(ab);
    }
}