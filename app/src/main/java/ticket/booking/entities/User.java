package ticket.booking.entities;

import java.util.List;

public class User {
    private String name;
    private String password;
    private String hashPassword;
    private List<Ticket> ticketsBooked;
    private String userId;

    public String User(String name, String password, String userId, String hashPassword, List<Ticket> ticketsBooked) {
        this.name = name;
        this.hashPassword= hashPassword;
        this.ticketsBooked = ticketsBooked;

        this.password = password;
        this.userId = userId;

        public User() {}

        public String getName() {
            return name;
        }

        public String getPassword() {
            return password;
        }
        public String getHashPassword() {
            return hashPassword;
        }
        public String getUserId() {
            return userId;
        }
        public List<Ticket> getTicketsBooked() {
            return ticketsBooked;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setPassword(String password) {
            this.password = password;
        }
        public void setHashPassword(String hashPassword) {
            this.hashPassword = hashPassword;
        }
        public void setUserId(String userId){
            this.userId = userId;
        }
        public void setTicketsBooked(List<Ticket> ticketsBooked) {
            this.ticketsBooked = ticketsBooked;
        }
        public void printTckets(){
            for ( int i =0; i < ticketsBooked.size(); i++) {
                System.out.println("Ticket " + (i + 1) + ": " + ticketsBooked.get(i).getTicketInfo());
            }
        }
        public void setUserId(String userId) {
            this.userId = userId;
        }
    }
}
