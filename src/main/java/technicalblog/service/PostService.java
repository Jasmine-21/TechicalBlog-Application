package technicalblog.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import technicalblog.model.Post;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    public ArrayList<Post> getAllPosts(){

        ArrayList<Post> list = new ArrayList<>();

        Post p1 = new Post();
        p1.setId(1);
        p1.setTitle("java");
        p1.setBody("Java is a programming language");
        p1.setDate(new Date());

        Post p2 = new Post();
        p2.setId(2);
        p2.setTitle("python");
        p2.setBody("python is used in machine learning");
        p2.setDate(new Date());

        Post p3 = new Post();
        p3.setId(3);
        p3.setTitle("html");
        p3.setBody("html is used for creating web pages");
        p3.setDate(new Date());

        list.add(p1);
        list.add(p2);
        list.add(p3);

        return list;

    }
}