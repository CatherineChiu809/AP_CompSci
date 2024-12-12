package pkg;

public class Movie{
    String movie;
    double rating;
    int numrating;
    int revenue;
    
    public Movie(){
        movie = "Avengers";
        rating = 8.0;
        numrating = 33;
        revenue = 623357910;
        
    }
    public Movie(String movie, double rating, int numrating, int revenue){
        this.movie = movie;
        this.rating = rating;
        this.numrating = numrating;
        this.revenue = revenue;
    }
    
    public void movieToString(){
        System.out.println("Movie: "+movie);
        System.out.println("Rating: "+rating);
        System.out.println("Number of ratings: "+numrating);
        System.out.println("Revenue: "+revenue);
        System.out.println();
    }
    public String getMovieName(){
        return movie;
    }
    public int getRevenue(){
        return revenue;
    }
    public double getRating(){
        return rating;
    }
    public void addRating(double newrating){
        rating = rating * numrating;
        rating = rating + newrating;
        numrating = numrating +1;
        rating = rating/numrating;
    }
    public boolean compareRatings(Movie movie){
        if(rating>movie.getRating()){
            return true;
        }
        else{
            return false;
        }
    }
    
    public String revenueToString(){
        double r = revenue;
        String rr;
        int i = 1;
        int c=0;
        while(r>0){
            r=r/i;
            c++;
        }
        r=revenue;
        while(r>0){
            r=r-(Math.pow(10,(c-1)));
            
            // r=r-(r/1000);
            
            // System.out.print(","+r);
            
        }
        return rr;
    }
    public void pirateMovie(){
        
    }
}
