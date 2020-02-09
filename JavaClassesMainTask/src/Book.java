

public class Book {
    //id, Название, Автор (ы), Издательство, Год издания, Количество страниц, Цена, Тип переплета.

    //Переменная подсчитывающая количество созданных классов.
    public static int counter;

    ObjMassOfBooksAndMethods objMassOfBooksAndMethods = new ObjMassOfBooksAndMethods();

    public int id ;
    public String nameBok;
    public String author;
    public String PublishingHouse;
    public int yearOfPublishing;
    public int nNumberOfPages;
    public int price;
    public String typeOfBinding;

    public Book(String nameBok, String author, String publishingHouse, int yearOfPublishing, int nNumberOfPages, int price, String typeOfBinding)
    {
        this.id = objMassOfBooksAndMethods.CreateId();
        this.nameBok = nameBok;
        this.author = author;
        this.PublishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.nNumberOfPages = nNumberOfPages;
        this.price = price;
        this.typeOfBinding = typeOfBinding;
        counter++;
    }

    public Book(String nameBok, String author, String publishingHouse, int yearOfPublishing, int nNumberOfPages, int price)
    {
        this.id = objMassOfBooksAndMethods.CreateId();
        this.nameBok = nameBok;
        this.author = author;
        this.PublishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.nNumberOfPages = nNumberOfPages;
        this.price = price;
        this.typeOfBinding = objMassOfBooksAndMethods.createTypeOfBlinding();
        counter++;
    }

    public Book(String author)
    {
        this.id = objMassOfBooksAndMethods.CreateId();
        this.nameBok = "Неизвестная книга " + author + "(a)";
        this.author = author;
        this.PublishingHouse = "Информация отсутсвует";
        this.yearOfPublishing = 0;
        this.nNumberOfPages = 0;
        this.price = 0;
        this.typeOfBinding = objMassOfBooksAndMethods.createTypeOfBlinding();
        counter++;
    }

    public Book()
    {
    this.id = objMassOfBooksAndMethods.CreateId();
    this.nameBok = "Неизветная книга";
    this.author = "Неизветный автор";
    this.PublishingHouse = "Неизветный издательский дом";
    this.yearOfPublishing = 0;
    this.nNumberOfPages = 0;
    this.price = 0;
    this.typeOfBinding = objMassOfBooksAndMethods.createTypeOfBlinding();
    counter++;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", nameBok='" + nameBok + '\'' +
                ", author='" + author + '\'' +
                ", PublishingHouse='" + PublishingHouse + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", nNumberOfPages=" + nNumberOfPages +
                ", price=" + price +
                ", typeOfBinding='" + typeOfBinding + '\'' + "}" ;
    }

    public Book(int id)
    {
        counter++;
    }

    public static int getNumberOfInstance()
    {
        return counter;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNameBok()
    {
        return nameBok;
    }

    public void setNameBok(String nameBok) {
        this.nameBok = nameBok;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return PublishingHouse;
    }

    public void setPublishingHouse(String publishingHouse)
    {
        PublishingHouse = publishingHouse;
    }

    public int getYearOfPublishing()
    {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing)
    {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getnNumberOfPages()
    {
        return nNumberOfPages;
    }

    public void setnNumberOfPages(int nNumberOfPages)
    {
        this.nNumberOfPages = nNumberOfPages;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public String getTypeOfBinding()
    {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding)
    {
        this.typeOfBinding = typeOfBinding;
    }
}
