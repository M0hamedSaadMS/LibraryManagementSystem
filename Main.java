import java.util.*;
public class Main {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int choice;
        String again = "yes";
        Library library = new Library();
        Book b1 = new Book("Harry potter","Mohamed",250,"Fantasy",false);
        Book b2 = new Book("Assassins Creed","Ezio",256,"Action",false);
        Book b3 = new Book("Stranger Things","Alfred",343,"Sci-Fi",false);
        library.books.add(b1);
        library.books.add(b2);
        library.books.add(b3);
        int bookId;
        String borrowOrReturn;
        Member member = new Member();
        String memberName;
        int memberId;

        while (again.equals("yes")){
            System.out.println("======Welcome to the library=======");
            System.out.println("1)Add Book.");
            System.out.println("2)Search For Book");
            System.out.println("3)Borrow Book or Return Book");
            System.out.println("4)Show Books.");
            System.out.println("5)Make MemberShip.");
            System.out.println("6)Show Members.");
            System.out.println("7)Exit.");
            System.out.print("Choice : ");
            choice = input.nextInt();
            if (choice==1){
                Book book = new Book();
                System.out.print("Enter The Book Name : ");
                book.setName(input.next());
                System.out.print("Enter The Book Id : ");
                book.setId(input.nextInt());
                System.out.print("Enter The Book Author : ");
                book.setAuthor(input.next());
                System.out.print("Enter The Book Type : ");
                book.setType(input.next());
                System.out.print("Enter Book State (true/false) : ");
                book.setBorrowed(input.nextBoolean());
                library.books.add(book);
                System.out.println("Book Added.");
            }
            else if (choice == 2){
                System.out.print("Enter The Book Id : ");
                bookId=input.nextInt();
                boolean found=false;
                for (Book b : library.books){
                    if (b.getId()==bookId){
                        b.displayInfo();
                        found=true;
                        break;
                    }
                }
                if (!found){
                    System.out.println("Book Not Found!");
                }
            }
            else if (choice == 3 ){
                System.out.print("Borrow Or Return : ");
                borrowOrReturn=input.next().toLowerCase();
                System.out.print("Enter Book Id : ");
                bookId=input.nextInt();
                for (Book b : library.books){
                    if (b.getId()==bookId){
                        if (borrowOrReturn.equals("borrow")){
                            if (b.isBorrowed()){
                                System.out.println("Sorry The Book Is Borrowed");
                            }else{
                                b.setBorrowed(true);
                                System.out.println("Enjoy Your Book.");
                            }
                        }
                        else if (borrowOrReturn.equals("return")){
                            b.setBorrowed(false);
                            System.out.println("Book Returned.");
                        }
                        break;
                    }
                }
            }
            else if (choice == 4){
                for(Book b : library.books){
                    b.displayInfo();
                }
            }
            else if (choice == 5){
                System.out.print("Enter your name : ");
                memberName=input.next();
                member.setMemberName(memberName);
                System.out.println("Member Created.");
                library.members.add(member);
            }else if (choice == 6) {
                for (Member m : Library.members) {
                    member.displayInfo();
                }
            }
            else if (choice == 7){
                System.out.println("GoodBye!");
                break;
            }
            System.out.print("Want another choice (yes/no) : ");
            again=input.next().toLowerCase();
        }
    }
}