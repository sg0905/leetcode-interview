public class removeDuplicates
{
    public int solution(int nums[]){
        int len = nums.length;
        int flag = 1;
        int count = 1;
        for(int i = 1 ; i < len ; i++){
            if(nums[i-1] == nums[i]){
                if(flag == 1){
                    count++;
                    flag++;
                    nums[count] = nums[i];
                }
                else {
                    continue;
                }            
            }
            else {
                nums[count] = nums[i];
                flag = 1;
                count ++;
            }
        
        }
        return count;

    }
    public static void main(String args[]){
        int ar[] = {0,0,1,1,1,1,2,3,3};
        removeDuplicates ad = new removeDuplicates();
        // ad.solution(ar);
        System.out.println(ad.solution(ar));
    }
}