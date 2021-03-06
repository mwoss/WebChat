import static spark.Spark.*;

/**
 * Created by Matthew on 2017-01-13.
 */
public class ChatInit { // przenisc do klasy chat

    public static void main(String[] args) {
        staticFileLocation("/public"); //index.html is served at localhost:4567 (default port)
        staticFiles.expireTime(800);
        webSocket("/chat", ChatWebSocketHandler.class);
        init();
    }
}
