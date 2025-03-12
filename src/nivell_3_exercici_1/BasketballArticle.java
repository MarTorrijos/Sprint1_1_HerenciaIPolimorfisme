package nivell_3_exercici_1;

public class BasketballArticle extends Article {

    private String competition;
    private String club;

    public BasketballArticle(String title, String text, Editor editor, String competition, String club) {
        super(title, text, editor);
        this.competition = competition;
        this.club = club;
        this.price = priceTotal();
        this.score = scoreTotal();
    }

    public String getCompetition() {
        return competition;
    }

    public String getClub() {
        return club;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public int scoreTotal() {
        int score = 4;
        if (competition.equalsIgnoreCase("Euroleague")) {
            score += 3;
        }
        if (competition.equalsIgnoreCase("ACB")) {
            score += 2;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            score += 1;
        }
        return score;
    }

    @Override
    public int priceTotal() {
        int price = 250;
        if (competition.equalsIgnoreCase("Euroleague")) {
            price += 75;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            price += 75;
        }
        return price;
    }

}
