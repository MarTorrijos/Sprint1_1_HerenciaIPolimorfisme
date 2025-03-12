package nivell_3_exercici_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Editor> editors = new ArrayList<>();
    static ArrayList<Article> articles = new ArrayList<>();
    static boolean editorExists = false;
    static boolean articleExists = false;

    public static void main(String[] args) {

        int selection;
        String editorName, dni, title, text, competition, club, player, motorcyclingTeam;
        String result = "";

        Scanner scanner = new Scanner(System.in);

        editors.add(new Editor("Carla", "11223344A"));
        editors.add(new Editor("Tomas", "22334455B"));

        articles.add(new F1Article("Jack Doohan Alpine exit rumours dismissed by former Haas F1 chief",
                "Lorem Ipsum dolor sit amet", editors.get(0), "Alpine"));
        articles.add(new FootballArticle("Karim Benzema signs 3-year deal with Saudi champions Al-Ittihad",
                "Lorem Ipsum dolor sit amet", editors.get(1), "Saudi Pro League",
                "Al-Ittihad football club", "Benzema"));
        articles.add(new FootballArticle("Karim Benzema signs 3-year deal with Saudi champions Al-Ittihad",
                "Lorem Ipsum dolor sit amet", editors.get(1), "Saudi Pro League",
                "Al-Ittihad football club", "Benzema"));
        articles.add(new BasketballArticle("League Pass Game of the Day: LA Clippers vs. New Orleans Pelicans",
                "Lorem Ipsum dolor sit amer", editors.get(0), "NBA", "LA Clippers"));
        articles.add(new MotorcyclingArticle("Honda CB1000F Rumors Emerge in Japan",
                "Lorem Ipsum dolor sit amet", editors.get(0), "Honda"));
        articles.add(new TennisArticle("Rafael Nadal makes a sporting comeback; 'Who do you think won?\"",
                "Lorem Ipsum dolor sit amet", editors.get(1), "none", "Nadal"));

        do {
            System.out.println("1 - Add editor"
                    + "\n2 - Delete editor"
                    + "\n3 - Create article"
                    + "\n4 - Delete article"
                    + "\n5 - Display all articles by editor"
                    + "\n6 - Calculate article score"
                    + "\n7 - Calculate article price"
                    + "\n0 - Exit");

            selection = scanner.nextInt();
            scanner.nextLine();

            switch (selection) {
                case 1:
                    System.out.println("Editor's name:");
                    editorName = scanner.nextLine();
                    System.out.println("Editor's DNI:");
                    dni = scanner.nextLine();
                    result = createEditor(editorName, dni);
                    break;
                case 2:
                    System.out.println(viewEditors());
                    System.out.println("Write the name of the editor you want to delete");
                    editorName = scanner.nextLine();

                    checkIfEditorExists(editorName);
                    if (editorExists) {
                        result = deleteEditor(editorName);
                    } else {
                        System.out.println("The editor doesn't exist");
                    }
                    break;
                case 3:
                    System.out.println("Creating article. What's the name of the editor?");
                    System.out.println(viewEditors());
                    editorName = scanner.nextLine();

                    boolean found = false;
                    for (int i = 0; i < editors.size(); i++) {
                        if (editorName.equalsIgnoreCase(editors.get(i).getName())) {
                            System.out.println("What's the type of article you want to create?"
                                    + "\n1 - Football"
                                    + "\n2 - Basketball"
                                    + "\n3 - Tennis"
                                    + "\n4 - F1"
                                    + "\n5 - Motorcycling");
                            selection = scanner.nextInt();
                            scanner.nextLine();

                            found = true;

                            switch (selection) {
                                case 1:
                                    // football
                                    System.out.println("What's the title?");
                                    title = scanner.nextLine();
                                    System.out.println("And the text?");
                                    text = scanner.nextLine();
                                    System.out.println("What's the name of the competition?");
                                    competition = scanner.nextLine();
                                    System.out.println("Which club?");
                                    club = scanner.nextLine();
                                    System.out.println("And the player's name?");
                                    player = scanner.nextLine();

                                    result = createFootballArticle(title, text, editors.get(i), competition, club, player);
                                    break;
                                case 2:
                                    // basket
                                    System.out.println("What's the title?");
                                    title = scanner.nextLine();
                                    System.out.println("And the text?");
                                    text = scanner.nextLine();
                                    System.out.println("What's the name of the competition?");
                                    competition = scanner.nextLine();
                                    System.out.println("Which club?");
                                    club = scanner.nextLine();

                                    result = createBasketballArticle(title, text, editors.get(i), competition, club);
                                    break;
                                case 3:
                                    // tennis
                                    System.out.println("What's the title?");
                                    title = scanner.nextLine();
                                    System.out.println("And the text?");
                                    text = scanner.nextLine();
                                    System.out.println("What's the name of the competition?");
                                    competition = scanner.nextLine();
                                    System.out.println("And the name of the tennis player?");
                                    player = scanner.nextLine();

                                    result = createTennisArticle(title, text, editors.get(i), competition, player);
                                    break;
                                case 4:
                                    // F1
                                    System.out.println("What's the title?");
                                    title = scanner.nextLine();
                                    System.out.println("And the text?");
                                    text = scanner.nextLine();
                                    System.out.println("Which team?");
                                    motorcyclingTeam = scanner.nextLine();

                                    result = createF1Article(title, text, editors.get(i), motorcyclingTeam);
                                    break;
                                case 5:
                                    // Motorcycling
                                    System.out.println("What's the title?");
                                    title = scanner.nextLine();
                                    System.out.println("And the text?");
                                    text = scanner.nextLine();
                                    System.out.println("Which club?");
                                    club = scanner.nextLine();

                                    result = createMotorcyclingArticle(title, text, editors.get(i), club);
                                    break;
                                default:
                                    System.out.println("Invalid input");
                                    break;
                            }
                        }
                    }
                    if (!found) {
                        System.out.println("The editor doesn't exist");
                    }
                    break;
                case 4:
                    System.out.println("Editor's name:");
                    System.out.println(viewEditors());
                    editorName = scanner.nextLine();

                    checkIfEditorExists(editorName);
                    if (!editorExists) {
                        result = "The editor doesn't exist";
                    } else {
                        System.out.println("And the article's title:");
                        System.out.println(showEditorArticles(editorName));
                        title = scanner.nextLine();

                        checkIfArticleExists(title);
                        if (!articleExists) {
                            result = "The article doesn't exist";
                        } else {
                            deleteArticle(title);
                            result = "Article deleted";
                        }
                    }
                    break;
                case 5:
                    System.out.println("What editor do you want to see articles from?");
                    System.out.println(viewEditors());
                    editorName = scanner.nextLine();

                    checkIfEditorExists(editorName);
                    if (!editorExists) {
                        result = "The editor doesn't exist";
                    } else {
                        System.out.println("Showing articles of " + editorName + ":");
                        result = showEditorArticles(editorName);
                    }
                    break;
                case 6:
                    System.out.println("What article do you want to see the score from?");
                    System.out.println(showArticles());
                    title = scanner.nextLine();

                    checkIfArticleExists(title);
                    if (!articleExists) {
                        result = "The article doesn't exist";
                    } else {
                        result = "The article has a score of " + getArticleScore(title);
                    }
                    break;
                case 7:
                    System.out.println("What article do you want to see the price from?");
                    System.out.println(showArticles());
                    title = scanner.nextLine();

                    checkIfArticleExists(title);
                    if (!articleExists) {
                        result = "The article doesn't exist";
                    } else {
                        result = "The article has a price of " + getArticlePrice(title);
                    }
                    break;
                case 0:
                    result = "Bye!";
                    break;
                default:
                    result = "Invalid input";
            }

            System.out.println(result);

        } while (selection != 0);

        scanner.close();

    }

    public static boolean checkIfEditorExists(String editorName) {
        editorExists = false;
        for (Editor editor : editors) {
            if (editorName.equalsIgnoreCase(editor.getName())) {
                editorExists = true;
                break;
            }
        }
        return editorExists;
    }

    public static String createEditor(String name, String dni) {
        Editor editor = new Editor(name, dni);
        editors.add(editor);
        return "Editor " + name + " with DNI " + dni + " created";
    }

    public static String deleteEditor(String name) {
        String result = "Editor does not exist";
        for (int i = 0; i < editors.size(); i++) {
            if (editors.get(i).getName().equalsIgnoreCase(name)) {
                editorExists = true;
                editors.remove(i);
                result = "Editor " + name + " deleted";
                break;
            }
        }
        return result;
    }

    public static String viewEditors() {
        String result = "";
        for (Editor editor : editors) {
            result += editor.getName() + "\n";
        }
        return result;
    }

    public static boolean checkIfArticleExists(String title) {
        articleExists = false;
        for (Article article : articles) {
            if (title.equalsIgnoreCase(article.getTitle())) {
                articleExists = true;
                break;
            }
        }
        return articleExists;
    }

    public static String showArticles() {
        String articlesList = "";
        for (int i = 0; i < articles.size(); i++) {
            articlesList += articles.get(i).getTitle() + "\n";
        }
        return articlesList;
    }

    public static String showEditorArticles(String editorName) {
        String articlesList = "";
        for (int i = 0; i < articles.size(); i++) {
            if (articles.get(i).getEditor().getName().equalsIgnoreCase(editorName)) {
                articlesList += articles.get(i).getTitle() + "\n";
            }
        }
        return articlesList;
    }

    public static String getArticleScore(String title) {
        String score = "";
        for (Article article : articles) {
            if (title.equalsIgnoreCase(article.getTitle())) {
                score = "Score of: " + article.getScore();
                break;
            }
        }
        return score;
    }

    public static String getArticlePrice(String title) {
        String price = "";
        for (Article article : articles) {
            if (title.equalsIgnoreCase(article.getTitle())) {
                price = "Price of: " + article.getPrice();
                break;
            }
        }
        return price;
    }

    public static String createFootballArticle(String title, String text, Editor editor, String competition, String club,
                                               String player) {
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

    public static void deleteArticle(String title) {
        for (int i = 0; i < articles.size(); i++) {
            if (articles.get(i).getTitle().equalsIgnoreCase(title)) {
                articles.remove(i);
                break;
            }
        }
    }

}