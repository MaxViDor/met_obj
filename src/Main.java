public class Main {
    public static void main(String[] args) {

        Author bunin = new Author("Иван", "Бунин");
        Book lapty = new Book("'Лапти'", bunin, 1985);

        Author dostoevsky = new Author("Федор", "Достоевский");
        Book crimeAndPunishment = new Book("'Преступление и наказание'", dostoevsky, 1874);

        lapty.setPublicationYear(1836);

        System.out.println("Книгу " + lapty.getTytle()
                + " написал " + lapty.getAuthor().getNameAuthor() + " " + lapty.getAuthor().getSurnameAuthor()
                + " в " + lapty.getPublicationYear() + " году.");
        System.out.println("Книгу " + crimeAndPunishment.getTytle()
                + " написал " + crimeAndPunishment.getAuthor().getNameAuthor() + " " + crimeAndPunishment.getAuthor().getSurnameAuthor()
                + " в " + crimeAndPunishment.getPublicationYear() + " году");

        System.out.println(bunin);
        System.out.println(dostoevsky);

        System.out.println(lapty);
        System.out.println(crimeAndPunishment);
    }
}
