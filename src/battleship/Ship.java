package battleship;

public class Ship {
    private String name;
    private Integer width;

    public Ship(String name, Integer width){
        this.name = name;
        this.width = width;
    }

    public String getName(){
        return this.name;
    }

    public Integer getWidth(){
        return this.width;
    }
}
