public class prob9 {
    public static void main(String[] args) {
        int amount =500;
        int noteHundred = amount / 100;
        amount -= noteHundred * 100;

        int noteFifty = amount / 50;
        amount -= amount * 50;

        int noteTen = amount / 10;

        System.out.println(noteHundred + "  Notes of Hundred");
        System.out.println(noteFifty + "  Notes of Fifty");
        System.out.println(noteTen + "  Notes of Ten");
    }

}