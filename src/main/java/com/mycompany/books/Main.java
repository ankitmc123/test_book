/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.books;

/**
 *
 * @author ankit
 */
public class Main {
    public static void main(String args[]){
        library l=new library();
        Books b1=new Books("1","my","ankit",2024);
        Books b2=new Books("2","my2","ankit",2029);
        Books b3=new Books("3","my3","ankit",2000);
        Books b4=new Books("4","my4","chirag",2010);
        Books b5=new Books("4","my4","chirag",2010);
        try{
            l.addBook(b1);
            l.addBook(b2);
            l.addBook(b3);
            l.addBook(b4);
            l.addBook(b5);
        }
        catch(Exception e){
            System.out.println(e);
            
        }  
        System.out.println("we try to insert null book");
        try{
            l.addBook(null);
        }
        catch (Exception e){
            System.out.println(e);
        
        }
        


        l.showAvailableBooks();
        System.out.println("after borrow isbn 1,2 book ");
        try{
        l.borrowBook(b1.getIsbn());
        l.borrowBook(b2.getIsbn());// here even though borrowBook()method 
                                   //returns Books obj but we will not store that hence it will be discartd
                                   //it is same with primitive data types or String like objects..
        }
        catch(Exception e){
            System.out.println(e);   
        
        }
        
        System.out.println("again try to borrow book b1");
        try{
            l.borrowBook(b1.getIsbn());
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
        
        
        l.showAvailableBooks();
        System.out.println("after returning isbn 1 book and book 5 which is not avilable ");
        try{
        l.returnBook(b1.getIsbn());
        l.returnBook("5");
        }
        catch(Exception e){
         System.out.println(e);  
        }
        
        System.out.println("again try to return 1st book");
        try{
            
        l.returnBook(b1.getIsbn());  
        
        }
        catch(Exception e){
            System.out.println(e);
        
        }
        
        l.showAvailableBooks();
        System.out.println("showall books ");
        l.showAllBooks();
        System.out.println("show not avilable book");
        l.showNotAvailableBooks();
        System.out.println("search for book 2 is it avilable or not ");
        try{
            l.searchavilableBook("2");
        
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("search for book 1 is it avilable or not ");
        try{
            l.searchavilableBook("1");
            System.out.println("book is avilable");
        
        }
        catch (Exception e){
            System.out.println(e);
        }
        
        
        
        
        
    }
    
}
