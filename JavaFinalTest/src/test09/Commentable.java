package test09;

import java.util.ArrayList;
import java.util.List;

public abstract class Commentable {
    protected List<Comment> comments = new ArrayList<>();

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public List<Comment> getComments() {
        return comments;
    }
}
