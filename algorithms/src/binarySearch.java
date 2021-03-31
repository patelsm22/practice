public class binarySearch {

    public static void main(String[] args) {
        int [] list = {1,2,8,9,100,500,590,610};
        System.out.println(binarySearch(list,510));
    }

    public static int binarySearch(int []a,int x){
        int p=0;
        int r=a.length -1;
        while(p<=r){
            int mid=(p+r)/2;
            if(x<a[mid]){
                r=mid-1;
            }
            else if(x>a[mid]) {
                p=mid+1;
            }
            else {
                return mid;
            }

        }
        return -1;
    }

    public static int recursive(int []a, int p, int r, int x){
        if(p>r){
            return -1;
        }
        else {
            int mid=(p+r)/2;
            if(a[mid]==x){
                return mid;
            }
            else if(a[mid]>x){
                return recursive(a,p,mid-1,x);
            }
            else{
                return recursive(a,mid+1,r,x);
            }
        }
    }


    }