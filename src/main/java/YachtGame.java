public class YachtGame {
    private DiceCombination diceCombination;

    public YachtGame(DiceCombination diceCombination) {

        this.diceCombination = diceCombination;
    }

    public int play(String category) {
        int[] randomCombination = this.diceCombination.generate();

        int scores = 0;

        for (int number : randomCombination) {
            int identifier = 0;

            if (category == "Ones") {
                identifier = 1;
            } else if (category == "Twos") {
                identifier = 2;
            }

            if (number == identifier)
                scores += number;
        }

        return scores;
    }
}
