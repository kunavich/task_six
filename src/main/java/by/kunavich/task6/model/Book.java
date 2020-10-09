package by.kunavich.task6.model;

public class Book {
    private String name;
    private String autor;
    private String publicher;
    private int length;

    public Book()
    {

    }
    public Book(String name ,String autor ,String publicher, int length)
    {
        this.name= name;
        this.autor= autor;
        this.publicher= publicher;
        this.length= length;
    }

    public String getName() {
        return name;
    }

    public String getAutor() {
        return autor;
    }

    public int getLength() {
        return length;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublicher() {
        return publicher;
    }

    public void setPublicher(String publicher) {
        this.publicher = publicher;
    }
}
