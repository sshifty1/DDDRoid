package co.example.dddroid.alex.dddroid;

/**
 * Created by User1 on 2016.07.18..
 */
public class People {
    private String name,id;


    public People(String name, String id) {

        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}