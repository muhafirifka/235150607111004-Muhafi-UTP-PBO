public class studio {
    
    private String movie;
    private String type;
    private String seats;

    public studio(String movie,String type,String seats) {
        this.movie = movie;
        this.type = type;
        this.seats = seats;
    }

    public void pesan(String Booked){
        System.out.println(movie + "mengecek apakah tempat duduk baris ke row dan kolom ke col sudah di isi atau belum");

    }

    public void informasi(String StudioInfo){
        System.out.println(movie +"tersedia atau tidak");
    }

    public void reserve(String pesan){
        System.out.println(movie + "melakukan reservasi duduk bari ke row dan kolom col");
    }

    public void tempatduduk(String Seats){

    }

}

