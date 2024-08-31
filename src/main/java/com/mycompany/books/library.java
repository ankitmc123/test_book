/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.books;
import java.util.*;

/**
 *
 * @author ankit
 */
public class library {
    private HashMap<String,Books>h_book;
    
    library(){
        this.h_book=new HashMap<>();
    }
    public Books addBook(Books book) throws Exception{
        if(book==null){
            throw new Exception("enter valid book info");
        }
        if(h_book.containsKey(book.getIsbn())){
            throw new Exception("Book is already added");
        
        }
        h_book.put(book.getIsbn(), book);
        return book;
    }
    public Books borrowBook(String isbn)throws Exception{
        if(h_book.containsKey(isbn)){
            if(!h_book.get(isbn).getIsAvailable()){
                throw new Exception("book is already borrowed");
            }
            Books b=h_book.get(isbn);
            b.setIsAvailable(false);
            return b;
        }
        else{
            throw new Exception("Book doesn't exist");
        
        }
    }
    public Books returnBook(String isbn)throws Exception{
        if(h_book.containsKey(isbn)){
            if(h_book.get(isbn).getIsAvailable()){
                throw new Exception("Book is already returned");
            }
            
            Books b=h_book.get(isbn);
            b.setIsAvailable(true);
            return b;
        }
        else{
            throw new Exception("Book doesn't exist");
        
        }
    
    }
    public Books searchavilableBook(String isbn)throws Exception{
        if(h_book.containsKey(isbn)){
            Books b=h_book.get(isbn);
            if(b.getIsAvailable()){
                return b;
            }
            else{
                throw new Exception("book is not avilable");
            }
        
        
        }
        else{
            throw new Exception("book is not in the list");
        
        
        }
        
    
    
    }
    public void showAvailableBooks(){
        for(Map.Entry e:h_book.entrySet()){
            Books b=(Books)e.getValue();
            if(b.getIsAvailable()==true){
                System.out.println("name:"+b.getTitle()+" ,Isbn:"+b.getIsbn()+" ,author:"+b.getAuthor()+" ,publication_year"+b.getPublication_year());
                
            }
            
        }
    
    
    }
    
    public void showNotAvailableBooks(){
        for(Map.Entry e:h_book.entrySet()){
            Books b=(Books)e.getValue();
            if(b.getIsAvailable()==false
                    ){
                System.out.println("name:"+b.getTitle()+" ,Isbn:"+b.getIsbn()+" ,author:"+b.getAuthor()+" ,publication_year"+b.getPublication_year());
                
            }
            
        }
    
    
    }
    public void showAllBooks(){
        for(Map.Entry e:h_book.entrySet()){
            Books b=(Books)e.getValue();
            String available="";
            if(b.getIsAvailable()){
                available="yes";
            }
            else{
                available="no";
            }
                System.out.println("name:"+b.getTitle()+" ,Isbn:"+b.getIsbn()+" ,author:"+b.getAuthor()+
                        " ,publication_year"+b.getPublication_year()+" Available:"+available);
         
        }
    
    
    }
    
}
