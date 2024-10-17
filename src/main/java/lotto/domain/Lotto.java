package lotto.domain;

import lotto.exception.LottoDuplicateNumberException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lotto {

    private final List<LottoNumber> lotto;

    public Lotto(List<LottoNumber> lotto) {
        validDuplicate(lotto);
        this.lotto = lotto;
    }

    private void validDuplicate(List<LottoNumber> lotto) {
        Set<LottoNumber> duplicateLottoNumber = lotto.stream()
                .filter(i -> Collections.frequency(lotto,i) > 1)
                .collect(Collectors.toSet());

        if (duplicateLottoNumber.size() >= 1) {
            throw new LottoDuplicateNumberException(makeDuplicateLottoNumberMessage(duplicateLottoNumber));
        }

    }

    private String makeDuplicateLottoNumberMessage(Set<LottoNumber> duplicateLottoNumber) {
        return duplicateLottoNumber.stream()
                .map(i -> String.valueOf(i.getLottoNumber()))
                .collect(Collectors.joining(" ","중복 요소: ","가 하나 이상 존재"));
    }

    public List<LottoNumber> getLotto() {
        return new ArrayList<>(lotto);
    }

}
