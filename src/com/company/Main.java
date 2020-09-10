package com.company;

public class Main {

    public static void main(String[] args) {
	    //ShapeTester new_shape = new ShapeTester();
	    //new_shape.outputInfo();
        /*Ball ball = new Ball();
        System.out.println(ball);
        ball.pumpUp();
        System.out.println(ball);*/
        /*Book book = new Book();
        System.out.println(book);
        Book book1 = new Book(152, "Us");
        book1.turnPage(72);
        book1.checkCurrent();
        System.out.println(book1);*/
        DogOrphanage orphanage = new DogOrphanage();
        orphanage.addDogs(3);
        System.out.println(orphanage);
    }
}
