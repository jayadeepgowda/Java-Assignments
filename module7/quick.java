class quick{
    static int p(int a[],int l,int r){
        int x=a[r];
        int i=l-1;
        for(int j=l;j<r;j++){
            if(a[j]<x){
                i++;
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
        int t=a[i+1];
        a[i+1]=a[r];
        a[r]=t;
        return i+1;
    }
    static void s(int a[],int l,int r){
        if(l<r){
            int m=p(a,l,r);
            s(a,l,m-1);
            s(a,m+1,r);
        }
    }
    public static void main(String args[]){
        int a[]={5,3,8,4,2};
        s(a,0,a.length-1);
        for(int i=0;i<a.length;i++)System.out.print(a[i]+" ");
    }
}