// main cinema
// public class main {
//     public static void main(String[] args) {
//         Cinema cinema = new Cinema("Cinema XYZ", 2);

//         User user1 = new User("user1@example.com", "password123");
//         User user2 = new User("user2@example.com", "abc123");
//         cinema.registerUser(user1);
//         cinema.registerUser(user2);

//         cinema.displayListStudio();
//     }
// }

//main ticket
public class main {
    public static void main (String[] args) {
        Movie movie = new Movie("Avengers: Endgame", StudioType.PREMIERE);
        Ticket ticket = new Ticket(movie, 1);

        System.out.println("Movie: " + ticket.getMovie().getTitle());
        System.out.println("Studio Number: " + ticket.getStudioNumber());
        System.out.println("Price: Rp " + ticket.getPrice());
    }
}