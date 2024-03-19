package battleship;

public class BattleShip {
    public static void main(String[] args) throws Exception {
        BattleField battleField = new BattleField(10, 10);
        Ship vespucciShip = new Ship("Vespucci", 4);

        battleField.displayField();
        battleField.placeShip(vespucciShip, "NA", 0, 5);
    }
}
