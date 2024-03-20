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

        if(shipWidht<this.field.length && shipWidht<this.field[0].length){
            if(orientation.equals("NS")){
                if(y+shipWidht < this.field.length){
                    for(Integer i=y; i<shipWidht+y; i++){
                        this.field[i][x] = shipName;
                    }
                }else{
                    System.out.println("The ship is out of bound!");
                }
            }
        }else{
            System.out.println("The ship \""+shipName+"\" is too large for the battle field!");
        }
    }
}
