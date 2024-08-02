package test09;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Article> articles = new ArrayList<>();

    public void addArticle(Article article) {
        articles.add(article);
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void printBoard() {
        System.out.println("----------------------------------");
        System.out.println("| 번호 | 제목            | 내용 | 작성자 |");
        System.out.println("----------------------------------");
        for (Article article : articles) {
            article.printArticleInfo();
            System.out.println("----------------------------------");
        }
    }
}
