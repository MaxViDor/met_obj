public class Author {
    private String nameAuthor;
    private String surnameAuthor;

    public Author(String nameAuthor, String surnameAuthor){
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }
    public String getNameAuthor(){
        return this.nameAuthor;
    }
    public String getSurnameAuthor(){
        return this.surnameAuthor;
    }
}