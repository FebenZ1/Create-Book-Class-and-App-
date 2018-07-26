public class BookApp {
    public static void main(String[] args) {

        Book bookA = new Book("In to the Day", "Some Author", "A great book.", 12.50, "yes");
        print(bookA.getDisplayText());
    }

    private static void print(String s) {
        System.out.println(s);
    }

}
