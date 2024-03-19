package battleship;
import java.util.Arrays;

public class BattleField {
    private Integer width, height;
    private String[][] field;

    public BattleField(Integer width, Integer height){
        this.width = width;
        this.height = height;
        this.field = new String[this.height][this.width];
    }

    public void displayField(){
        for(String[] row : field) System.out.println(Arrays.toString(row));
    }

    public void placeShip(Ship ship, String orientation, Integer x, Integer y){
        String shipName = ship.getName();
        Integer shipWidht = ship.getWidth();
    }
}
