package HW2.Task5;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;
    private List<Comment> comments;
    public Post(){

    }

    public Post(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
        this.comments = new ArrayList<>();
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        if (userId>0) {
            this.userId = userId;
        }
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Post: {" + "\n" +
                "userId: " + userId + ",\n" +
                "id: " + id + ",\n" +
                "title: " + title + ",\n" +
                "body: " + body + ",\n" +
                "comments: " + comments +
                "}" + "\n" +
                "____________________________________________________________________";
    }
}
