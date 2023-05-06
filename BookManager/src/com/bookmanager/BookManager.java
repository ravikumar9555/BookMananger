package com.bookmanager;

import java.util.List;
import java.util.Scanner;

import com.bookmanager.controller.impl.BookControllerImpl;



public class BookManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookControllerImpl controller =  new BookControllerImpl();
		Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("------------Book Manager----------- :");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Get Book");
            System.out.println("4. Get All Bookks");
            System.out.println("5. Update Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.println("Enter book details : ");
                    System.out.println("Enter book Id : ");
                    
                    
                    long bookID=scanner.nextLong();
                    scanner.nextLine();
                    System.out.print("Enter BookName : ");
                    String bookName = scanner.nextLine();
//                    scanner.nextLine();
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                   
                  
                    BookEntities task = new BookEntities(bookID,bookName,title);
                    controller.addBook(task);
                    System.out.println("Book added successfully.");
                    break;
                case 2:
                    System.out.print("Enter book index to remove : ");
                    int index = scanner.nextInt();
                   controller.removeBook(index);
                    System.out.println("Book removed successfully.");
                    break;
                case 3:
                    System.out.print("Enter Book index: ");
                    index = scanner.nextInt();
                   BookEntities getTask =controller.getBook(index);
                    System.out.println(getTask);
                    break;
                case 4:
                    List<BookEntities> allBooks = controller.getAllBook();
//                    for (int i = 0; i < allTasks.size(); i++) {
//                        System.out.println(i + ": " + allTasks.get(i));
//                    }
                    System.out.println("All Book :" + allBooks);
                    break;
                case 5:
                    System.out.print("Enter Book index to update: ");
                    index = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter BookName : ");
                    String BookName1 = scanner.nextLine();
                    System.out.print("Enter updated Book title: ");
                    title = scanner.nextLine();
                   controller.updateBook(index, BookName1, title);
                    System.out.println("Book updated successfully.");
                    break;
                case 6:
                    System.out.println("...Exiting Book Manager...");
                    break;
                default:
                    System.out.println("Invalid choice. Try Again!!!");
            }
        } while (choice != 6);
        
        scanner.close();
    

	}

	}


