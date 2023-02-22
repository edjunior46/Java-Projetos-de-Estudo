import java.text.SimpleDateFormat;

import entities.Coments;
import entities.Post;

public class App {
    public static void main(String[] args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        String momentoP1 = "21/06/2018 13:05:49";
        String titleP1 = "Traveling to New Zealand";
        String contentP1 = "Im going to visit this wonderfull country!";
        Post post1 = new Post(sdf.parse(momentoP1), titleP1, contentP1);

        post1.setLikes(12);

        Coments comentsP1 = new Coments("Have a nice trip");
        post1.addComent(comentsP1);

        comentsP1 = new Coments("Wow! That's awesome!");
        post1.addComent(comentsP1);

        String momentoP2 = "21/06/2018 23:22:06";
        String titleP2 = "Good night guys";
        String contentP2 = "See you tomorrow ;)";
        Post post2 = new Post(sdf.parse(momentoP2), titleP2, contentP2);

        post2.setLikes(14);

        Coments comentsP2 = new Coments("Good night");
        post2.addComent(comentsP2);
        comentsP2 = new Coments("May the force be with you");
        post2.addComent(comentsP2);

        System.out.println(post1);
        System.out.println(post2);

    }
}
