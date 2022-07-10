package pluscalculate;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlusCalculateTest {

    @Test
    @DisplayName("덧셈 계산기")
    void 덧셈계산기(){
        String no = "1,2";
        int[] result = Calculate.splitString(no);
        Calculate.plus(result);
        assertThat(result).isEqualTo(3);
    }


    @Test
    @DisplayName("문자열 쪼개기")
    void 문자열쪼개기(){
        String no = "1,2,3";

        int[] result = Calculate.splitString(no);

        assertThat(result[0]).isEqualTo(1);
        assertThat(result[1]).isEqualTo(2);
        assertThat(result[2]).isEqualTo(3);
    }

    @Test
    @DisplayName("숫자 더하기")
    void 덧셈하기(){
        int [] arr = new int[] {1, 2, 3};

        int plus = Calculate.plus(arr);

        assertThat(plus).isEqualTo(6);
    }

    @Test
    @DisplayName("")
    void 구분하기(){


        //given
        String no = "1,2,3";


        //when
        int i = Calculate.splitAndSum(no);


        //then
        assertThat(i).isEqualTo(6);


    }
}
