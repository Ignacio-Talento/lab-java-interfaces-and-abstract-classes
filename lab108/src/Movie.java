public class Movie extends Video{
    public double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String getInfo() {
        return "Movie: " + title +
                "\nDuration: " + duration + " minutes" +
                "\nRating: " + rating;
    }
}
