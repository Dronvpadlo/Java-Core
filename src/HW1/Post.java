package HW1;

public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;
    public Post (int userId, int id, String title, String body){
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        if (userId>0){
            this.userId = userId;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id>0){
            this.id = id;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    public String toString(){
        return "{User ID: " + userId +
                ", ID: " + id +
                ", Title: " + title +
                ", Body: " + body + "}";
    }
}
