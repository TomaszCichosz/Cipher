import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println((new EncipheredMessage(scanner.nextLine())).decipher());
    }
}