package net.kigen;

import org.sql2o.Sql2o;

import java.net.URI;
import java.net.URISyntaxException;

public class DB {
    private static URI dbUri;
    public static Sql2o sql2o;

    static {

        try {
            if (System.getenv("DATABASE_URL") == null) {
                dbUri = new URI("mysql://192.168.10.93:3360/wildlife_tracker");
            } else {
                dbUri = new URI(System.getenv("DATABASE_URL"));
            }

            int port = dbUri.getPort();
            String host = dbUri.getHost();
            String path = dbUri.getPath();
            String username = (dbUri.getUserInfo() == null) ? "demouser" : dbUri.getUserInfo().split(":")[0];
            String password = (dbUri.getUserInfo() == null) ? "pw123456" : dbUri.getUserInfo().split(":")[1];

            sql2o = new Sql2o("jdbc:mysql://" + host + ":" + port + path, username, password);
        } catch (URISyntaxException e ) {
        }
    }

}
