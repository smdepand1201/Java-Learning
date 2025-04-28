public class Main {
    public static void main(String[] args) {
        Bollywood b = new Bollywood();
        b.name = "DDLJ";
        b.genre = "Romance";
        b.rating = 5;
        b.actor = "Shahrukh Khan";

        Rythmbasedgame rbg = new Rythmbasedgame();
        rbg.name = "Beat Saber";
        rbg.purchases = 10000;
        rbg.rating = 4;
        rbg.developer = "Some Dev";

        Film f = new Film();
        f.name = "DDLJ";
        f.rating = 4;

        Rythmbasedgame xyz = new Rythmbasedgame();
        xyz.name = "Tap dance";
        xyz.purchases = 123;
        xyz.rating = 1;
        xyz.developer = "more desperate Dev";

        b.Filmcompare(f);
        rbg.Gamecompare(xyz);
    }
}
