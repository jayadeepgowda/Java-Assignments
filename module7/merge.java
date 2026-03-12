class merge{
    static void m(int a[],int l,int m,int r){
        int n1=m-l+1,n2=r-m;
        int b[]=new int[n1];
        int c[]=new int[n2];
        for(int i=0;i<n1;i++)
            b[i]=a[l+i];
        for(int j=0;j<n2;j++)
            c[j]=a[m+1+j];
        int i=0,j=0,k=l;
        while(i<n1&&j<n2){
            if(b[i]<=c[j])
                a[k++]=b[i++];
            else 
                a[k++]=c[j++];
        }
        while(i<n1)
            a[k++]=b[i++];
        while(j<n2)
            a[k++]=c[j++];
    }
    static void s(int a[],int l,int r){
        if(l<r){
            int m=(l+r)/2;
            s(a,l,m);
            s(a,m+1,r);
            m(a,l,m,r);
        }
    }
    public static void main(String args[]){
        int a[]={5,3,8,4,2};
        s(a,0,a.length-1);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}