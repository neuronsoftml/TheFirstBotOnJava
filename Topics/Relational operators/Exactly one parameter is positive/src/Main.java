import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        boolean result = false;
        int number = 0;

        for(int i = 0; i < 3; i++){
            int x = scanner.nextInt();

            if(x > 0){
                if(number == 0){
                    result = true;
                    number = x;
                }else{
                    result = false;
                }
            }else{
                continue;
            }
        }
        System.out.print(result);
    }
}