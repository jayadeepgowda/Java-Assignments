class bin{
    static int it(int a[],int x){
        int l=0,r=a.length-1;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]==x)return m;
            if(a[m]<x)l=m+1;
            else r=m-1;
        }
        return -1;
    }
    static int rec(int a[],int l,int r,int x){
        if(l>r)return -1;
        int m=(l+r)/2;
        if(a[m]==x)return m;
        if(a[m]<x)return rec(a,m+1,r,x);
        return rec(a,l,m-1,x);
    }
    public static void main(String args[]){
        int a[]={1,3,5,7,9,11};
        System.out.println(it(a,7));
        System.out.println(rec(a,0,a.length-1,7));
    }
}