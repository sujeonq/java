package test09;

import java.util.List;

public class Article extends Commentable {
    int no;
    String title;
    String content;
    User user;

    public Article(int no, String title, String content, User user) {
        this.no = no;
        this.title = title;
        this.content = content;
        this.user = user;
    }

    public int getNo() {
        return no;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public User getUser() {
        return user;
    }

    public void printArticleInfo() {
        System.out.printf("| %-2d  | %-12s | %-2s | %-2s |%n", no, title, content, user.getName());
        for (Comment comment : getComments()) {
            System.out.printf("  └ %s%n", comment.getContent());
        }
    }
}
