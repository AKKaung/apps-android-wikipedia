package org.wikipedia.feed.dayheader;

import org.wikipedia.feed.model.Card;
import org.wikipedia.feed.model.CardType;
import org.wikipedia.util.DateUtils;

import androidx.annotation.NonNull;

public class DayHeaderCard extends Card {
    private int age;

    public DayHeaderCard(int age) {
        this.age = age;
    }

    @Override @NonNull public String title() {
        return DateUtils.getFeedCardDayHeaderDate(age);
    }

    @NonNull @Override public CardType type() {
        return CardType.DAY_HEADER;
    }
}
