
// import java.util.ArrayList;
// import java.util.List;

// class Cinema {
//     private String name;
//     private List<User> listUsers;
//     private List
//     Studio > listStudio;
//     private int studioCapacity;

//     public Cinema(String name, int studioCapacity) {
//         this.name = name;
//         this.listUsers = new ArrayList<>();
//         this.listStudio = new ArrayList<>();
//         this.studioCapacity = studioCapacity;
//         init();
//     }

//     public boolean registerUser(User user) {
//         if (!listUsers.contains(user)) {
//             listUsers.add(user);
//             return true;
//         } else {
//             return false;
//         }
//     }

//     public User authenticateUser(String email, String password) {
//         for (User user : listUsers) {
//             if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
//                 return user;
//             }
//         }
//         return null;
//     }

//     public void displayListStudio() {
//         for (int i = 0; i < listStudio.size(); i++) {
//             Studio studio = listStudio.get(i);
//             System.out.println("Studio " + (i+1) + ": " + studio.getStudioType() + " - " + studio.getMovieTitle());
//         }
//     }

//     public void displayStudioDetail(int studioNumber) {
//         if (studioNumber > 0 && studioNumber <= listStudio.size()) {
//             Studio studio = listStudio.get(studioNumber - 1);
//             studio.getStudioInfo();
//         } else {
//             System.out.println("Invalid studio number");
//         }
//     }

//     public boolean addStudioWithMovies(Studio studio) {
//         if (listStudio.size() < studioCapacity) {
//             listStudio.add(studio);
//             return true;
//         } else {
//             return false;
//         }
//     }

//     public boolean bookTicket(int studioNumber, User user) {
//         if (studioNumber > 0 && studioNumber <= listStudio.size()) {
//             Studio studio = listStudio.get(studioNumber - 1);
//             if (studio.bookTicket(user)) {
//                 return true;
//             }
//         }2
//         return false;
//     }

//     private void init() {
//         Studio studio1 = new Studio("Studio 1", "Movie A", 50);
//         Studio studio2 = new Studio("Studio 2", "Movie B", 40);
//         listStudio.add(studio1);
//         listStudio.add(studio2);
//     }
// }

// class User {
//     private String email;
//     private String password;

//     public User(String email, String password) {
//         this.email = email;
//         this.password = password;
//     }

//     public String getEmail() {
//         return email;
//     }

//     public String getPassword() {
//         return password;
//     }
// }

// class Studio {
//     private String studioType;
//     private String movieTitle;
//     private int capacity;
//     private List<User> ticketHolders;

//     public Studio(String studioType, String movieTitle, int capacity) {
//         this.studioType = studioType;
//         this.movieTitle = movieTitle;
//         this.capacity = capacity;
//         this.ticketHolders = new ArrayList<>();
//     }

//     public void getStudioInfo() {
//         System.out.println("Studio Type: " + studioType);
//         System.out.println("Movie Title: " + movieTitle);
//         System.out.println("Capacity: " + capacity);
//         System.out.println("Ticket Holders: " + ticketHolders.size());
//     }

//     public boolean bookTicket(User user) {
//         if (ticketHolders.size() < capacity) {
//             ticketHolders.add(user);
//             return true;
//         }
//         return false;
//     }

//     public String getStudioType() {
//         return studioType;
//     }

//     public String getMovieTitle() {
//         return movieTitle;
//     }
// }

public class cinema{
    public static void main(String[] args) {
        System.out.println("UTP A Cinema");
        System.out.println("1. Login");
        System.out.println("3. Exit");
        System.out.println("Pick your choice : ");
    }
}

