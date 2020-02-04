public class Runner {

    public static void main(String[] args) {
        System.out.print(makes10(10, 15));

    }

    //warm up 1
    public static boolean makes10(int a, int b) {
        if (a == 10 || a + b == 10) {
            return true;
        } else {
            return false;
        }
    }
//warm up 2

    public static boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    //logic 1
    public static int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        } else if (a == b || b == c || c == a) {
            return 10;
        } else
            return 0;

    }

    //logic 2
    public static int noTeenSum(int a, int b, int c) {
        a = fixTeen(a);
        b = fixTeen(b);
        c = fixTeen(c);
        return a + b + c;
    }

    public static int fixTeen(int n) {
        if (n <= 19 && n >= 17) {
            return 0;
        } else if (n >= 13 && n <= 14) {
            return 0;
        } else {
            return n;

        }
    }

//string 1

    public static String firstTwo(String str) {

        if (str.length() <= 2) {
            return str;
        }
        return str.substring(0, 2);

    }

    //string 2
    public static String repeatEnd(String str, int n) {
        String sub = str.substring(str.length() - n);
        String answer = "";
        for (int i = 0; i < n; i++) {
            answer += sub;
        }
        return answer;
    }

    //string 3
    public static int countTriple(String str) {
        int n=0;
        for(int i=0; i < str.length()-2; i++){
            if(str.substring(i,i+1).equals(str.substring(i+1, i+2))
                    && str.substring(i+2, i+3).equals(str.substring(i,i+1))){
                n = n+= 1;
            }
        }
        return n;
    }


    //array 1
    public static int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }


    //array 2
    public static boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }

    //array 3
    public static int maxSpan(int[] nums) {
        int max=0;

        for(int i=0;i< nums.length;i++){
            int length = nums.length-1;
            while(nums[i] != nums[length]){
                length -=1;
            }
            int span =length - i +1;
            if(span > max){
                max = span;
            }
        }
        return max;
    }
}


