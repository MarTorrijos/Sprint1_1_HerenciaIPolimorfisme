package nivell_3_exercici_1.controller;

import nivell_3_exercici_1.model.entity.*;
import nivell_3_exercici_1.model.service.ArticleMethods;
import nivell_3_exercici_1.model.service.EditorMethods;

import java.util.Scanner;

public class RunMain {

    public static void run() {
        int selection, titleId, editorId;
        String dni, title, text, competition, club, player, motorcyclingTeam, result, editorName;

        Scanner scanner = new Scanner(System.in);

        EditorMethods.editors.add(new Editor("Carla", "11223344A"));
        EditorMethods.editors.add(new Editor("Tomas", "22334455B"));

        ArticleMethods.articles.add(new F1Article("Jack Doohan Alpine exit rumours dismissed by former Haas F1 chief",
                "Lorem Ipsum dolor sit amet", EditorMethods.editors.get(0), "Alpine"));
        ArticleMethods.articles.add(new FootballArticle("Karim Benzema signs 3-year deal with Saudi champions Al-Ittihad",
                "Lorem Ipsum dolor sit amet", EditorMethods.editors.get(1), "Saudi Pro League",
                "Al-Ittihad football club", "Benzema"));
        ArticleMethods.articles.add(new BasketballArticle("League Pass Game of the Day: LA Clippers vs. New Orleans Pelicans",
                "Lorem Ipsum dolor sit amer", EditorMethods.editors.get(0), "NBA", "LA Clippers"));
        ArticleMethods.articles.add(new MotorcyclingArticle("Honda CB1000F Rumors Emerge in Japan",
                "Lorem Ipsum dolor sit amet", EditorMethods.editors.get(0), "Honda"));
        ArticleMethods.articles.add(new TennisArticle("Rafael Nadal makes a sporting comeback; 'Who do you think won?\"",
                "Lorem Ipsum dolor sit amet", EditorMethods.editors.get(1), "none", "Nadal"));

        do {
            System.out.println("""
                    1 - Add editor
                    2 - Delete editor
                    3 - Create article
                    4 - Delete article
                    5 - Display all articles by editor
                    6 - Calculate article score
                    7 - Calculate article price
                    0 - Exit""");
            selection = scanner.nextInt();
            scanner.nextLine();

            switch (selection) {
                case 1:
                    System.out.println("Editor's name:");
                    editorName = scanner.nextLine();
                    System.out.println("Editor's DNI:");
                    dni = scanner.nextLine();
                    result = EditorMethods.createEditor(editorName, dni);
                    break;
                case 2:
                    System.out.println(EditorMethods.viewEditors());
                    System.out.println("Write the number of the editor you want to delete:");
                    editorId = scanner.nextInt();
                    scanner.nextLine();

                    if (EditorMethods.checkIfEditorExists(editorId - 1)) {
                        result = EditorMethods.deleteEditor(editorId - 1);
                    } else {
                        result = "The editor doesn't exist";
                    }
                    break;
                case 3:
                    System.out.println("Creating article. Select the editor by number:");
                    System.out.println(EditorMethods.viewEditors());
                    editorId = scanner.nextInt();
                    scanner.nextLine();

                    if (EditorMethods.checkIfEditorExists(editorId - 1)) {
                        Editor editor = EditorMethods.editors.get(editorId - 1);

                        System.out.println("""
                            What's the type of article you want to create?
                            
                            1 - Football
                            2 - Basketball
                            3 - Tennis
                            4 - F1
                            5 - Motorcycling""");
                        selection = scanner.nextInt();
                        scanner.nextLine();

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

                                result = ArticleMethods.createFootballArticle(title, text, editor, competition, club, player);
                                break;
                            case 2:
                                // basketball
                                System.out.println("What's the title?");
                                title = scanner.nextLine();
                                System.out.println("And the text?");
                                text = scanner.nextLine();
                                System.out.println("What's the name of the competition?");
                                competition = scanner.nextLine();
                                System.out.println("Which club?");
                                club = scanner.nextLine();

                                result = ArticleMethods.createBasketballArticle(title, text, editor, competition, club);
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

                                result = ArticleMethods.createTennisArticle(title, text, editor, competition, player);
                                break;
                            case 4:
                                // F1
                                System.out.println("What's the title?");
                                title = scanner.nextLine();
                                System.out.println("And the text?");
                                text = scanner.nextLine();
                                System.out.println("Which team?");
                                motorcyclingTeam = scanner.nextLine();

                                result = ArticleMethods.createF1Article(title, text, editor, motorcyclingTeam);
                                break;
                            case 5:
                                // Motorcycling
                                System.out.println("What's the title?");
                                title = scanner.nextLine();
                                System.out.println("And the text?");
                                text = scanner.nextLine();
                                System.out.println("Which club?");
                                club = scanner.nextLine();

                                result = ArticleMethods.createMotorcyclingArticle(title, text, editor, club);
                                break;
                            default:
                                result = "Invalid article type";
                                break;
                        }
                    } else {
                        result = "The editor doesn't exist";
                    }
                    break;
                case 4:
                    System.out.println("Choose the number of the editor you want to delete an article from:");
                    System.out.println(EditorMethods.viewEditors());
                    editorId = scanner.nextInt();
                    scanner.nextLine();

                    if (!EditorMethods.checkIfEditorExists(editorId - 1)) {
                        result = "The editor doesn't exist";
                    } else {
                        System.out.println("And the article's number:");
                        System.out.println(ArticleMethods.showEditorArticles(editorId - 1));
                        int articleId = scanner.nextInt();
                        scanner.nextLine();

                        if (articleId < 1 || articleId > ArticleMethods.articles.size()) {
                            result = "Invalid article ID";
                        } else {
                            Article articleToDelete = ArticleMethods.articles.get(articleId - 1);
                            String editorDni = EditorMethods.editors.get(editorId - 1).getDNI();

                            if (!articleToDelete.getEditor().getDNI().equals(editorDni)) {
                                result = "This article doesn't belong to the selected editor";
                            } else {
                                ArticleMethods.deleteArticle(articleToDelete.getTitle(), articleToDelete.getEditor());
                                result = "Article deleted";
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("What editor do you want to see articles from? Select the number");
                    System.out.println(EditorMethods.viewEditors());
                    editorId = scanner.nextInt();
                    scanner.nextLine();

                    if (!EditorMethods.checkIfEditorExists(editorId - 1)) {
                        result = "The editor doesn't exist";
                    } else {
                        System.out.println("Showing articles of " + EditorMethods.editors.get(editorId - 1).getName() + ":");
                        result = ArticleMethods.showEditorArticles(editorId - 1);
                    }
                    break;
                case 6:
                    System.out.println("What article do you want to see the score from? Select the number");
                    System.out.println(ArticleMethods.showArticles());
                    titleId = scanner.nextInt();
                    scanner.nextLine();

                    if (titleId < 1 || titleId > ArticleMethods.articles.size()) {
                        result = "Invalid article number";
                    } else {
                        Article article = ArticleMethods.articles.get(titleId - 1);
                        result = ArticleMethods.getArticleScore(article.getTitle());
                    }
                    break;
                case 7:
                    System.out.println("What article do you want to see the price from? Select the number");
                    System.out.println(ArticleMethods.showArticles());
                    titleId = scanner.nextInt();
                    scanner.nextLine();

                    if (titleId < 1 || titleId > ArticleMethods.articles.size()) {
                        result = "Invalid article number";
                    } else {
                        Article article = ArticleMethods.articles.get(titleId - 1);
                        result = ArticleMethods.getArticlePrice(article.getTitle());
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
    }

}