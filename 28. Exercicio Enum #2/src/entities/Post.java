package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    
    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    List<Coments> coments = new ArrayList<Coments>();

    public Post() {

    }

    public Post(Date moment, String title, String content) {
        this.moment = moment;
        this.title = title;
        this.content = content;
    }

    public Date getMoment() {
        return this.moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return this.likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public String getComents() {
        String result = "";

        for (int i = 0; i < coments.size(); i++) {
            result += coments.get(i).getText() + "\n";
        };

        return result;
    }

    public void addComent(Coments coment) {
        coments.add(coment);
    }

    public String toString() {
        return getTitle() + "\n" +
            getMoment() + "\n" +
            getContent() + "\n" +
            "Likes: " + getLikes() + "\n" +
            getComents();
    }


}
