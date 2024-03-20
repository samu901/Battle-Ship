package battleship;

public class BattleShip {
    public static void main(String[] args) throws Exception {
        BattleField battleField = new BattleField(10, 10);
        Ship vespucciShip = new Ship("Vespucci", 4);

        battleField.placeShip(vespucciShip, "NS", 0, 5);
        battleField.displayField();
    }
}
