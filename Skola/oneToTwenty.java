// Nils E Lindfors TE15 
// 2017-03-30
// 10:31
public class oneToTwenty {
    public static void problemOne(){
        int sum = 0;
        for (int i = 0; i <1000; i++){
            if ((i % 5 == 0)||(i % 3 == 0)) {
                sum+= i;
            }
        }
        System.out.println(sum);
    }

    public static void problemTwo(){
        int f1 = 1;
        int f2 = 1;
        int sum = 0;
        for(int i = 0; i < 4000000; i+= 0) {
            i = f1 + f2;
            if (i %2 == 0) {
                sum+= i;
            }
            f1 = f2;
            f2 = i;
        }
        System.out.println(sum);
    }

    public static void problemThree(){
        long bignumb = 600851475143;

    }


    public static void main(String[] args) {

    }
}
