public class Film {
    String genre;
    int rating;
    String name;
    String songName;

    public void Filmcompare(Film other){
        if (this.name.equals(other.name)){
        System.out.println("True for this " + this.name + " with " + this.rating + " and " + other.name + " with " + other.rating);
        }
    }
}