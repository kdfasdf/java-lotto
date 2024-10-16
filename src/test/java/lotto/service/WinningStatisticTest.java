package lotto.service;

import lotto.domain.Lottos;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Stack;

public class WinningStatisticTest {

    @Test
    @DisplayName("우승자 통계 테스트")
    void 우승자_통계_테스트() {
        Lottos lottos = Lottos.createLottos(1000 , purChaseAmount -> new ArrayList<>());

        Assertions.assertThat(lottos.calculateStatistic(2_000_005_000, new Stack<>())
        ).containsExactly(1,0,0,1);
    }

    @Test
    @DisplayName("수익률 계산 테스트")
    void 수익률_계산_테스트() {

        Lottos lottos = Lottos.createLottos(1000 , purChaseAmount -> new ArrayList<>());

        Assertions.assertThat(lottos.calculateProfit(5000,14000)).isEqualTo(0.35);

    }

}
