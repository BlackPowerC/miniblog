package repo;

import org.joda.time.DateTime;

import java.util.Set;

public class Post
{
    public int id ;
    public String title ;
    public String content ;
    public DateTime date ;
    public Set<String> tags ;
}
