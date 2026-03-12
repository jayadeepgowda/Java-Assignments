class occ{
    static int f(int a[],int x){
        int l=0,r=a.length-1,ab=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]==x){ab=m;r=m-1;}
            else if(a[m]<x)l=m+1;
            else r=m-1;
        }
        return ab;
    }
    static int la(int a[],int x){
        int l=0,r=a.length-1,ab=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]==x){ab=m;l=m+1;}
            else if(a[m]<x)l=m+1;
            else r=m-1;
        }
        return ab;
    }
    public static void main(String args[]){
        int a[]={1,2,2,2,3,4};
        System.out.println(f(a,2));
        System.out.println(la(a,2));
    }
}