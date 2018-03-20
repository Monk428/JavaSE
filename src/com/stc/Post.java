package com.stc;


public class Post{
    private String title;
    private String content;

    private static int count = 1;
    static {
        count = 10;
    }
    Post(){
        count++;
    }
    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        //外部无法直接调用count
        System.out.println(Post.count);
        Post p1= new Post();
        System.out.println(p1.getCount());
        System.out.println(Post.count);

    }
}