/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.books;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ankit
 */
public class libraryTest {
    
    public libraryTest() {
    }

    @Test
    public void alreadyadded() {
        library l=new library();
        Books b1=new Books("1","nice","prabhu",2021);
        Books b2=new Books("1","nice","prabhu",2021);
        
        assertThrows(Exception.class,()->{
            l.addBook(b1);
            l.addBook(b2);
        });
        
    }
    @Test
    public void add() throws Exception {
        library l=new library();
        Books b1=new Books("1","nice","prabhu",2021);
        assertEquals(b1,l.addBook(b1));

        
    }
    @Test
    public void addnull() throws Exception {
        library l=new library();
        Books b1=null;
        assertThrows(Exception.class,()->{
            l.addBook(b1);
            
        });

        
    }
    @Test
    public void BorrowBook() throws Exception {
        library l=new library();
        Books b1=new Books("1","nice","prabhu",2021);
        l.addBook(b1);
        assertEquals(b1,l.borrowBook(b1.getIsbn()));

        
    }
    @Test
    public void BorrowalreadyboorowedBook(){
        library l=new library();
        Books b1=new Books("1","nice","prabhu",2021);

        assertThrows(Exception.class,()->{
            l.addBook(b1);
            l.borrowBook(b1.getIsbn());
            l.borrowBook(b1.getIsbn());
        
        });

        
    }
    @Test
    public void BorrownotavailableBook(){
        library l=new library();
        Books b1=new Books("1","nice","prabhu",2021);

        assertThrows(Exception.class,()->{
            l.addBook(b1);
            l.borrowBook("2");
        });   
    }
    @Test
    public void returnbook()throws Exception{
        library l=new library();
        Books b1=new Books("1","nice","prabhu",2021);
        l.addBook(b1);
        l.borrowBook(b1.getIsbn());
        assertEquals(b1,l.returnBook(b1.getIsbn()));   
    }
    @Test
    public void returnalreadyreturnedbook(){
        library l=new library();
        Books b1=new Books("1","nice","prabhu",2021);
        assertThrows(Exception.class,()->{
            l.addBook(b1);
            l.borrowBook(b1.getIsbn());
            l.returnBook(b1.getIsbn());
            l.returnBook(b1.getIsbn());
        });   
    }
    @Test
    public void returnbookwhichisneverBorrowed(){
        library l=new library();
        Books b1=new Books("1","nice","prabhu",2021);
        assertThrows(Exception.class,()->{
            l.addBook(b1);
            l.returnBook(b1.getIsbn());
        });   
    }
    @Test
    public void returnbookwhichisnotinlist(){ 
        library l=new library();
        Books b1=new Books("1","nice","prabhu",2021);
        Books b2=new Books("2","nice2","prabhu",2022);
        assertThrows(Exception.class,()->{
            l.addBook(b1);
            l.returnBook(b2.getIsbn());
        });   
    }
    @Test
    public void searchBookWhichIsNotInList(){ 
        library l=new library();
        Books b1=new Books("1","nice","prabhu",2021);
        Books b2=new Books("2","nice2","prabhu",2022);
        assertThrows(Exception.class,()->{
            l.addBook(b1);
            l.addBook(b2);
            l.searchavilableBook("3");
        });   
    }
    @Test
    public void searchBookWhichIsNotAvilable(){ 
        library l=new library();
        Books b1=new Books("1","nice","prabhu",2021);
        Books b2=new Books("2","nice2","prabhu",2022);
        assertThrows(Exception.class,()->{
            l.addBook(b1);
            l.addBook(b2);
            l.borrowBook(b1.getIsbn());
            l.searchavilableBook(b1.getIsbn());
        });   
    }
    @Test
    public void searchBookWhichIsAvilable()throws Exception{ 
        library l=new library();
        Books b1=new Books("1","nice","prabhu",2021);
        Books b2=new Books("2","nice2","prabhu",2022);
        l.addBook(b1);
        l.addBook(b2);
        assertEquals(b1,l.searchavilableBook(b1.getIsbn()));   
    }
}
