public class LittleStraightCategory extends Category {
    @Override
    public int calculate(int[] diceNumbers) {
        if (diceNumbers[0] == 1 &&
                diceNumbers[1] == 2 &&
                diceNumbers[2] == 3 &&
                diceNumbers[3] == 4 &&
                diceNumbers[4] == 5)
            return 30;


        return 0;
    }
}
