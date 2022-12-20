package ru.mirea.task2;

public class Book {
    private String author;
    private String name;
    private int editionYear;
    private int pageCount;
    private String coverType;

    public int getEditionYear() {
        return editionYear;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public void setEditionYear(int editionYear) {
        this.editionYear = editionYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
