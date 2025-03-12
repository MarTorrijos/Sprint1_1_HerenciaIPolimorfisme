package nivell_3_exercici_1;

public class FootballArticle extends Article {

    private String competition;
    private String club;
    private String footballPlayer;

    public FootballArticle(String title, String text, Editor editor, String competition, String club, String footballPlayer) {
        super(title, text, editor);
        this.competition = competition;
        this.club = club;
        this.footballPlayer = footballPlayer;
        this.price = priceTotal();
        this.score = scoreTotal();
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getFootballPlayer() {
        return footballPlayer;
    }

    public void setFootballPlayer(String footballPlayer) {
        this.footballPlayer = footballPlayer;
    }

    @Override
    public int scoreTotal() {
        int score = 5;
        if (competition.equalsIgnoreCase("Champions league")) {
            score += 3;
        }
        if (competition.equalsIgnoreCase("La liga")) {
            score += 2;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            score += 1;
        }
        if (footballPlayer.equalsIgnoreCase("Fernando Torres") || footballPlayer.equalsIgnoreCase("Benzema")) {
            score += 1;
        }
        return score;
    }

    @Override
    public int priceTotal() {
        int price = 300;
        if (competition.equalsIgnoreCase("Champions league") || competition.equalsIgnoreCase("La liga")) {
            price += 100;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            price += 100;
        }
        if (footballPlayer.equalsIgnoreCase("Fernando Torres") || footballPlayer.equalsIgnoreCase("Benzema")) {
            price += 50;
        }
        return price;
    }

}
