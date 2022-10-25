public class CinemaTicket
{   
    static String cinemaName = "Era";
    String filmTitle;
    int row;
    int seat;
    double price;
    

    public void displayTicket(){
        System.out.println("Cinema Name:" + cinemaName);
        System.out.println("Film Title:" + filmTitle);
        System.out.println("Your row is:" + row + " and your seat is:" + seat);
        System.out.println("Total price of the ticket is:" + price + "zł");
        
        
        
    }    
    public static void main(String[] args){
        CinemaTicket t1 = new CinemaTicket("Cars", 2, 25);
        CinemaTicket t2 = new CinemaTicket("Cars 2", 5, 46);
        t1.displayTicket();
        t2.displayTicket();
        
        
        
        
        
        
        //CinemaTicket t1 = new CinemaTicket();
        //CinemaTicket t2 = new CinemaTicket();
        //t1.filmTitle = "Cars";
        //t1.row = 5;
        //t1.seat = 23;
      //  t1.price = 100;
       // t1.displayTicket();
       // t2.filmTitle = "Cars 2";
        //t2.row = 9;
       // t2.seat = 42;
       // t2.price = 132.5;
      //  t2.displayTicket();
    }
    
    
    public CinemaTicket(String filmTitle, int row, int seat){
        if(row>0 && row<=2){
            this.price = 10.00;
        }else{
            this.price = 25.00;
        }
        this.filmTitle = filmTitle;
        this.row = row;
        this.seat = seat;
    }    
    
    
    
        
        
        
    

    
    



}    