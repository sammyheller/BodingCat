/**
 * Created by h205p5 on 2/6/19.
 */
public class Runner {

//sleepIn #1
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday||vacation){
            return true;
        }
        return false;
    }

//diff21 #1.5
    public int diff21(int n) {
        int sammy = n - 21;
        if(sammy<0){
            sammy = sammy * -1;
        }
        if(n>21){
            int carly = sammy * 2;
            return carly;
        }
        return sammy;
    }


//stringTimes #2
    public String stringTimes(String str, int n) {
        String sammy = "";
        for(int i=0; i<n; i++){
            sammy = sammy += str;
        }
        return sammy;
    }



//helloName #3
    public String helloName(String name) {
        return "Hello " + name + "!";
    }



//firstLast6 #4
    public boolean firstLast6(int[] nums) {
        if(nums[0] == 6 || nums[nums.length - 1] == 6){
            return true;
        }
        return false;
    }

//cigarParty #5
    public boolean cigarParty(int cigars, boolean isWeekend){
        if((isWeekend && cigars>=40) || (!isWeekend && cigars >=40 && cigars<=60)){
            return true;
        }
        return false;
    }


//luckySum #6
    public int luckySum(int a, int b, int c) {
        if(a == 13){
            return 0;
        }
        if(b==13){
            return a;
        }
        if(c==13){
            return a+b;
        }
        return a + b + c;

    }


//doubleChar #7
    public String doubleChar(String str) {
        String sammy = "";
        for(int i=0; i<str.length(); i++){
            sammy = sammy + str.substring(i,i+1) + str.substring(i,i+1);
        }
        return sammy;
    }

//equalIsNot #8
public boolean equalIsNot(String str) {

    if(str.length() == 0) {
        return true;
    }

    int is = 0;
    int not = 0;
    for(int i=0; i<str.length() - 2; i++){
        if(str.substring(i,i+2).equals("is")) {
            is++;
        }
        if(str.substring (i,i+3).equals("not")){
            not++;
        }
    }


    if(str.substring(str.length()-2).equals("is")) {
        is++;
    }

    if(not == is){
        return true;
    }
    return false;
}




// BIG DIFF ARRAY-2 #9
public int bigDiff(int[] nums) {
    int min = nums[0];
    int max = nums[0];
    for(int i=0; i<nums.length; i++){
        min = Math.min(min,nums[i]);
        max = Math.max(max,nums[i]);
    }
    return (max - min);
}


//mxSpan #10
public int maxSpan(int[] nums) {
    if (nums.length > 0) {
        int Sammy = 1;
        for (int i = 0; i < nums.length; i++)
            for (int j = nums.length - 1; j > i; j--)
                if (nums[j] == nums[i]) {
                    int count = (j - i) + 1;
                    if (count > Sammy){
                        Sammy = count;
                    }
                    break;
                }
        return Sammy;
    }
    return 0;
}







}