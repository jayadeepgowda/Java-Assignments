class evenind{
    public static void main(String args[]){
        int a[]={3,6,12,1,5,8};
        int e=0,o=1;
        while(e<a.length && o<a.length){
            if(a[e]%2==0)
                e+=2;
            else if(a[o]%2==1)
                o+=2;
            else{
                int t=a[e];
                a[e]=a[o];
                a[o]=t;
            }
        }
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}