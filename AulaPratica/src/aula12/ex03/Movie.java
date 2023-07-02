package aula12.ex03;


public class Movie {
    private String title;
    private float score;
    private String genre;
    private String rating;
    private int runtime;

    public Movie(String title, float score, String genre, String rating, int runtime){

        this.title = title;
        this.score = score;
        this.genre = genre;
        this.rating = rating;
        this.runtime = runtime;
    }

    public String getTitle(){
        return this.title;
    }

    public float getScore(){
        return this.score;
    }

    public String getGenre(){
        return this.genre;
    }

    public String getRating(){
        return this.rating;
    }

    public int getRuntime(){
        return this.runtime;
    }

    @Override
    public String toString(){
        return "Title: " + this.title + "\nScore: " + this.score + "\nGenre: " + this.genre + "\nRating: " + this.rating + "\nRuntime: " + this.runtime + "\n";
    }

}
