public class pr7 {
// Input:
// n = 5
// s = [20, 40, 29, 10, 98]
// x = [10, 98, 40, 20, 29]

// Output:
// 7
public static void main(String[] args){
    int[] nums={6,3,5,2,7};
    int[] s={20,40,29,10,98};
    int[] x={10,98,40,20,29};
    int count=0;
    int c2=0;

    for(int i=0;i<s.length;i++){
        for(int j=0;j<x.length;j++){
            if(x[j]==s[i]){
                s[i]=j;
            }
        }
    }
    for (int k=0;k<s.length;k++){
        for(int k2=k+1;k2<s.length;k2++){
            if(s[k]>s[k2]){
                c2++;
            }
        }
    }
    System.out.println("Here Iversion");
    for(int i:s){
        System.out.print(i);
    }
    for(int i=0;i<=nums.length;i++){
        for (int j=i+1;j<nums.length;j++){
            if(nums[i]>nums[j]){
                count++;
            }
        }
    }
    // System.out.println(count);
    System.out.println("\n"+c2);


}
}
