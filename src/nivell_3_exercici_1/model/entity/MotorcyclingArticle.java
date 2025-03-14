package nivell_3_exercici_1.model.entity;

public class MotorcyclingArticle extends Article {

    private String motorcyclingTeam;

    public MotorcyclingArticle(String title, String text, Editor editor, String motorcyclingTeam) {
        super(title, text, editor);
        this.motorcyclingTeam = motorcyclingTeam;
        this.price = priceTotal();
        this.score = scoreTotal();
    }

    public String getMotorcyclingTeam() {
        return motorcyclingTeam;
    }

    public void setMotorcyclingTeam(String motorcyclingTeam) {
        this.motorcyclingTeam = motorcyclingTeam;
    }

    @Override
    public int scoreTotal() {
        int score = 3;
        if (motorcyclingTeam.equalsIgnoreCase("Honda") || motorcyclingTeam.equalsIgnoreCase("Yamaha")) {
            score += 3;
        }
        return score;
    }

    @Override
    public int priceTotal() {
        int price = 100;
        if (motorcyclingTeam.equalsIgnoreCase("Honda") || motorcyclingTeam.equalsIgnoreCase("Yamaha")) {
            price += 50;
        }
        return price;
    }

}
