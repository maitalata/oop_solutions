import java.util.Scanner;

public class JaggedIntArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[][] jaggedArray = new int[10][];

        for(int i = 0; i < jaggedArray.length; i++){
            int arrayLength;
            System.out.print("Enter Array Length: ");
            arrayLength = input.nextInt();
            jaggedArray[i] = new int[arrayLength];
            for(int j = 0; j < jaggedArray[i].length; j++){
                int arrayElement;
                System.out.print("Enter Array Element: ");
                arrayElement = input.nextInt();
                jaggedArray[i][j] = arrayElement;
            }
        }

        for(int i = 0; i < jaggedArray.length; i++){
            if((i + 1) % 2 == 0) {
                int sum = 0;
                boolean isPrime = true;

                for (int j = 0; j < jaggedArray[i].length; j++) {
                    System.out.print(jaggedArray[i][j]+" ");
                    sum += jaggedArray[i][j];

                    for (int k = 2; k <= sum / 2; ++k) {
                        if (sum % k == 0) {
                            isPrime = false;
                            break;
                        }
                    }

                    if(isPrime){
                        System.out.println(sum+"P");
                    }else{
                        System.out.println(sum+"NP");
                    }
                }
            }else{
                int product = 1;

                for (int j = 0; j < jaggedArray[i].length; j++) {
                    System.out.print(jaggedArray[i][j]+", ");
                    product *= jaggedArray[i][j];


                    if(product % 2 == 0){
                        System.out.println(product+"P");
                    }else{
                        System.out.println(product+"NP");
                    }
                }
            }
        }

    }
}
