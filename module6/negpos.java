public class negpos {
    public static void main(String args[]){
        int a[]={-1,3,-2,4,-5,6};
        int l=0,r=a.length-1;
        while(l<=r){
            if(a[l]<0)
                l++;
            else if(a[r]>0)
                r--;
            else{
                int t=a[l];
                a[l]=a[r];
                a[r]=t;
            }
        }
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}
