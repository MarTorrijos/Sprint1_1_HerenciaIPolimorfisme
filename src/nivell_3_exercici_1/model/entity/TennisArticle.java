package nivell_3_exercici_1.model.entity;

public class TennisArticle extends Article {

    private String competition;
    private String player;

    public TennisArticle(String title, String text, Editor editor, String competition, String player) {
        super(title, text, editor);
        this.competition = competition;
        this.player = player;
        this.price = priceTotal();
        this.score = scoreTotal();
    }

    // Getters
    public String getCompetition() {
        return competition;
    }

    public String getTennisPlayers() {
        return player;
    }

    // Setters
    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public void setTennisPlayers(String tennisPlayers) {
        this.player = player;
    }

    @Override
    public int scoreTotal() {
        int score = 4;
        if (player.equalsIgnoreCase("Federer") || player.equalsIgnoreCase("Nadal")
                || player.equalsIgnoreCase("Djokovic")) {
            score += 3;
        }
        return score;
    }

    @Override
    public int priceTotal() {
        int price = 100;
        if (player.equalsIgnoreCase("Federer") || player.equalsIgnoreCase("Nadal")
                || player.equalsIgnoreCase("Djokovic")) {
            price += 100;
        }
        return price;
    }

}
