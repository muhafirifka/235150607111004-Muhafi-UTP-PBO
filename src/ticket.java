class Ticket {
    private Movie movie;
    private int studioNumber;
    private int price;

    public Ticket(Movie movie, int studioNumber) {
        this.movie = movie;
        this.studioNumber = studioNumber;
        this.price = getTicketPrice();
    }

    public int getTicketPrice() {
        if (movie.getStudioType() == StudioType.PREMIERE) {
            return 120000;
        } else {
            return 100000;
        }
    }

    public Movie getMovie() {
        return movie;
    }

    public int getStudioNumber() {
        return studioNumber;
    }

    public int getPrice() {
        return price;
    }
}

enum StudioType {
    PREMIERE,
    REGULAR
}

class Movie {
    private String title;
    private StudioType studioType;

    public Movie(String title, StudioType studioType) {
        this.title = title;
        this.studioType = studioType;
    }

    public String getTitle() {
        return title;
    }

    public StudioType getStudioType() {
        return studioType;
    }
}

