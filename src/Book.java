public class Book {
    private String bookTitle;
    private String author;
    private String description;
    private double price;
    private String isInStock;

    public Book() {

    }

    public Book(String bookTitle, String author, String description, double price, String isInStock) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIsInStock() {
        return isInStock;
    }

    public void setIsInStock(String isInStock) {
        this.isInStock = isInStock;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", isInStock='" + isInStock + '\'' +
                '}';
    }



    public String getDisplayText(){
        return ("The author of the book: " + author+ "\n" +
                "The title of the book: " + bookTitle + "\n"
                + "The description of the book: " + description);
    }
}
