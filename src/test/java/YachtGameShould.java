import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class YachtGameShould {

    private YachtGame yachtGame;

    @Mock
    private DiceCombination diceCombination;

    @Before
    public void Initialize() {
        yachtGame = new YachtGame(this.diceCombination);
    }

    @Test
    public void scores_3_When_Category_Ones_With_Dice_Combination_11134() {
        when(this.diceCombination.generate()).thenReturn(new int[]{1, 1, 1, 3, 4});

        assertThat(yachtGame.play("Ones")).isEqualTo(3);
    }

    @Test
    public void scores_3_When_Category_Ones_With_Dice_Combination_11114() {
        when(this.diceCombination.generate()).thenReturn(new int[]{1, 1, 1, 1, 4});

        assertThat(yachtGame.play("Ones")).isEqualTo(4);
    }

    @Test
    public void scores_6_When_Category_Twos_With_Dice_Combination_22256() {
        when(this.diceCombination.generate()).thenReturn(new int[]{2, 2, 2, 5, 6});

        assertThat(yachtGame.play("Twos")).isEqualTo(6);
    }

    @Test
    public void scores_12_When_Category_Threes_With_Dice_Combination_33334() {
        when(this.diceCombination.generate()).thenReturn(new int[]{3, 3, 3, 3, 4});

        assertThat(yachtGame.play("Threes")).isEqualTo(12);
    }

    @Test
    public void scores_8_When_Category_Fours_With_Dice_Combination_44555() {
        when(this.diceCombination.generate()).thenReturn(new int[]{4, 4, 5, 5, 5});

        assertThat(yachtGame.play("Fours")).isEqualTo(8);
    }

    @Test
    public void scores_0_When_Category_Fives_With_Dice_Combination_11123() {
        when(this.diceCombination.generate()).thenReturn(new int[]{1, 1, 1, 2, 3});

        assertThat(yachtGame.play("Fives")).isEqualTo(0);
    }

    @Test
    public void scores_18_When_Category_Sixes_With_Dice_Combination_22666() {
        when(this.diceCombination.generate()).thenReturn(new int[]{2, 2, 6, 6, 6});

        assertThat(yachtGame.play("Sixes")).isEqualTo(18);
    }

    @Test
    public void scores_19_When_Category_FullHouse_With_Dice_Combination_22555() {
        when(this.diceCombination.generate()).thenReturn(new int[]{2, 2, 5, 5, 5});

        assertThat(yachtGame.play("Full House")).isEqualTo(19);
    }

    @Test
    public void scores_19_When_Category_FullHouse_With_Dice_Combination_11555() {
        when(this.diceCombination.generate()).thenReturn(new int[]{1, 1, 5, 5, 5});

        assertThat(yachtGame.play("Full House")).isEqualTo(17);
    }

    @Test
    public void scores_0_When_Category_FullHouse_With_Dice_Combination_22554() {
        when(this.diceCombination.generate()).thenReturn(new int[]{2, 2, 5, 5, 4});

        assertThat(yachtGame.play("Full House")).isEqualTo(0);
    }

    @Test
    public void scores_20_When_Category_Four_Of_A_Kind_With_Dice_Combination_25555() {
        when(this.diceCombination.generate()).thenReturn(new int[]{2, 5, 5, 5, 5});

        assertThat(yachtGame.play("Four-Of-A-Kind")).isEqualTo(20);
    }

    @Test
    public void scores_30_When_Category_LittleStraight_With_Dice_Combination_12345() {
        when(this.diceCombination.generate()).thenReturn(new int[]{1, 2, 3, 4, 5});

        assertThat(yachtGame.play("Little Straight")).isEqualTo(30);
    }
}
