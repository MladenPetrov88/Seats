import java.util.Scanner;

public class Seats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ticketsCount = Integer.parseInt(scanner.nextLine());

        for (int ticket = 0; ticket < ticketsCount; ticket++) {
            String ticketNumber = scanner.nextLine();
            int ticketNumberLen = ticketNumber.length();

            String seat = "";
            if (ticketNumberLen == 4) {
                char firstChar = ticketNumber.charAt(0);
                if (firstChar >= 'A' && firstChar <= 'Z') {
                    seat += firstChar;
                } else {
                    seat += ticketNumber.charAt(3);
                }
                seat += ticketNumber.charAt(1);
                seat += ticketNumber.charAt(2);
            } else if (ticketNumberLen == 6 || ticketNumberLen == 5) {
                seat += ticketNumber.charAt(0);
                seat += (int) ticketNumber.charAt(1);
            }

            System.out.println("Seat decoded: " + seat);
        }
    }
}
