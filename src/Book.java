public class Book {
    private String tytle;
    private Author author;
    private int publicationYear;

    public Book(String tytle, Author author, int publicationYear){
        this.tytle = tytle;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    public String getTytle(){
        return this.tytle;
    }
    public Author getAuthor(){
        return this.author;
    }
    public int getPublicationYear(){
        return this.publicationYear;
    }
    public void setPublicationYear(int newPublicationYear){
        publicationYear = newPublicationYear;
    }

    public String toString() {
        return "Книгу под названием "
                + this.tytle
                + " написал "
                + author.toString()
                + " в "
                + this.publicationYear
                + " году.";
    }
}
