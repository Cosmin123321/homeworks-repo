package library;

public class Book {
    private String title;
    private String author;
    private Member member;
    private int tCounter;
    private int price;
    private int moneyAmount;

    public Book(String title,
                String author,
                Member member,
                int price) {
        this.title = title;
        this.author = author;
        this.member = member;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Member getMember() {
        return member;
    }

    public int gettCounter() {
        return tCounter;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public int getPrice() {
        return price;
    }

    public void returnBook (int booksAmount) {
        if (booksAmount <= 0) {
            System.out.println("No more books left.");
            return;
        }
    }

    public void rentBook (int booksAmount) {
        if (booksAmount <= 0 && moneyAmount < price) {
            System.out.println("Transaction failed.");
            return;
        } else {
            System.out.println("Transaction successful.");
        }

        moneyAmount -= price;
        tCounter++;
    }

    public void printBook(){
        System.out.println("----------");
        System.out.println("Book Title: " + getTitle());
        System.out.println("Member Type: " + member.getName());
        System.out.println("Price: " + getPrice());
        System.out.println("----------");
    }

}
