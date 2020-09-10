package com.company;

public class Book {
    private int pages = 200;
    private int current_page = 1;
    private String name = "Alice in Wonderland";

    public Book() {
        super();
    }

    public Book(int new_pages, String new_name) {
        this.pages = new_pages;
        this.name = new_name;
    }

    public void turnPage(char dir)
    {
        switch (dir)
        {
            case '-': if (current_page >1) current_page--;
            case '+': if (current_page<pages) current_page++;
        }
    }

    public void turnPage(int page)
    {
        if (page > 0 && page < pages) current_page = page;
    }

    public void checkCurrent()
    {
        System.out.println("Current page is page number " + current_page);
    }

    @Override
    public String toString() {
        return "Book's name is " + name + ", it has " + pages + " pages.";
    }
}
