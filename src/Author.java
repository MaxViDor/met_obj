import java.util.Objects;

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

    @Override
    public String toString(){
        return "Имя - "
                + this.nameAuthor
                + " Фамилия - "
                + this.surnameAuthor;
    }
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if(o == null){
            return false;
        }

        if(this.getClass() != o.getClass()){
            return false;
        }

        Author author = (Author) o;
        return nameAuthor.equals(author.getNameAuthor()) && surnameAuthor.equals(author.getSurnameAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, surnameAuthor);
    }
}