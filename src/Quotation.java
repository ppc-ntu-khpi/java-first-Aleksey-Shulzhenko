public class Quotation {
    String quote = "What you do speaks so loudly that I cannot hear what you say.";
    String author = "Ralph Waldo Emerson"; // ім'я автора цитати

    public void display() {
        System.out.println(quote);
        System.out.println("– " + author); // додати ім'я автора до виводу
    }
}
