public class Game {
    int purchases;
    int rating;
    String name;
    String songName;

  public void Gamecompare( Game other){
    if(this.name.equals(other.name)){
        System.out.println("True for game" + this.name + other.name);
    }
}

}