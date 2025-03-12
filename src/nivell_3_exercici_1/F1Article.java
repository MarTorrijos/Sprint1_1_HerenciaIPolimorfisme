package nivell_3_exercici_1;

public class F1Article extends Article {

    private String team;

    public F1Article(String title, String text, Editor editor, String team) {
        super(title, text,  editor);
        this.team = team;
        this.price = priceTotal();
        this.score = scoreTotal();
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public int scoreTotal() {
        int score = 4;
        if (team.equalsIgnoreCase("Ferrari") || team.equalsIgnoreCase("Mercedes")) {
            score += 2;
        }
        return score;
    }

    @Override
    public int priceTotal() {
        int price = 100;
        if (team.equalsIgnoreCase("Ferrari") || team.equalsIgnoreCase("Mercedes")) {
            price += 50;
        }
        return price;
    }

}
