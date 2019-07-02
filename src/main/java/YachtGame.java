import java.util.HashMap;
import java.util.Map;

public class YachtGame {
    private final DiceCombination diceCombination;
    private final Map<String, Category> categories;

    public YachtGame(DiceCombination diceCombination) {
        this.diceCombination = diceCombination;

        this.categories = new HashMap<String, Category>() {
            {
                put("Ones", new SimpleCategory(1));
                put("Twos", new SimpleCategory(2));
                put("Threes", new SimpleCategory(3));
                put("Fours", new SimpleCategory(4));
                put("Fives", new SimpleCategory(5));
                put("Sixes", new SimpleCategory(6));
                put("Full House", new FullHouseCategory());
                put("Four-Of-A-Kind", new FourOfAKindCategory());
                put("Little Straight", new LittleStraightCategory());
                put("Big Straight", new BigStraightCategory());
                put("Choice", new ChoiceCategory());
                put("Yacht", new YachtCategory());
            }
        };
    }

    public int play(String category) {
        int[] randomCombination = this.diceCombination.generate();

        Category concreteCategory = this.categories.get(category);

        return concreteCategory.calculate(randomCombination);
    }
}
