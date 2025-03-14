package nivell_3_exercici_1.model.service;

import nivell_3_exercici_1.model.entity.*;
import java.util.ArrayList;

public class ArticleMethods {

    public static ArrayList<Article> articles = new ArrayList<>();

    public static String showArticles() {
        StringBuilder articlesList = new StringBuilder();
        int articleNumber = 1;

        for (Article article : articles) {
            articlesList.append(articleNumber).append(" - ").append(article.getTitle()).append("\n");
            articleNumber++;
        }
        return articlesList.toString();
    }

    public static String showEditorArticles(int editorId) {
        StringBuilder articlesList = new StringBuilder();
        int count = 1;
        for (Article article : articles) {
            if (article.getEditor().getDNI().equals(EditorMethods.editors.get(editorId).getDNI())) {
                articlesList.append(count).append(". ").append(article.getTitle()).append("\n");
                count++;
            }
        }
        return articlesList.toString();
    }

    public static String getArticleScore(String title) {
        String score = "";
        for (Article article : articles) {
            if (title.equalsIgnoreCase(article.getTitle())) {
                score = "The article has a score of: " + article.getScore();
                break;
            }
        }
        return score;
    }

    public static String getArticlePrice(String title) {
        String price = "";
        for (Article article : articles) {
            if (title.equalsIgnoreCase(article.getTitle())) {
                price = "The article has a price of: " + article.getPrice();
                break;
            }
        }
        return price;
    }

    public static String createFootballArticle(String title, String text, Editor editor, String competition, String club, String player) {
        Article footballArticle = new FootballArticle(title, text, editor, competition, club, player);
        articles.add(footballArticle);
        return "Article titled: \"" + title + "\" created. It has a score of " + footballArticle.getScore()
                + " and a price of " + footballArticle.getPrice();
    }

    public static String createBasketballArticle(String title, String text, Editor editor, String competition, String club) {
        Article basketballArticle = new BasketballArticle(title, text, editor, competition, club);
        articles.add(basketballArticle);
        return "Article titled: \"" + title + "\" created. It has a score of " + basketballArticle.getScore()
                + " and a price of: " + basketballArticle.getPrice();
    }

    public static String createTennisArticle(String title, String text, Editor editor, String competition, String player) {
        Article tennisArticle = new TennisArticle(title, text, editor, competition, player);
        articles.add(tennisArticle);
        return "Article titled: \"" + title + "\" created. It has a score of " + tennisArticle.getScore()
                + " and a price of: " + tennisArticle.getPrice();
    }

    public static String createF1Article(String title, String text, Editor editor, String team) {
        Article f1Article = new F1Article(title, text, editor, team);
        articles.add(f1Article);
        return "Article titled: \"" + title + "\" created. It has a score of " + f1Article.getScore()
                + " and a price of: " + f1Article.getPrice();
    }

    public static String createMotorcyclingArticle(String title, String text, Editor editor, String motorcyclingTeam) {
        Article motorcyclingArticle = new MotorcyclingArticle(title, text, editor, motorcyclingTeam);
        articles.add(motorcyclingArticle);
        return "Article titled: \"" + title + "\" created. It has a score of " + motorcyclingArticle.getScore()
                + " and a price of: " + motorcyclingArticle.getPrice();
    }

    public static void deleteArticle(String title, Editor editor) {
        for (int i = 0; i < articles.size(); i++) {
            Article article = articles.get(i);

            if (article.getTitle().equalsIgnoreCase(title) && article.getEditor().getDNI().equals(editor.getDNI())) {
                articles.remove(i);
                break;
            }
        }
    }

}
