package com.io.less1android3.ui;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.io.less1android3.data.Card;
import com.io.less1android3.data.Game;

import java.util.List;

public class EmojiGame {

    @RequiresApi(api = Build.VERSION_CODES.R)

    public EmojiGame() {
        List<String> content = List.of("❤️", "🎃", "👹", "😎", "👽");
        game = new Game<>(content);
    }

    public void choose(Card<String> card) {
        game.choose(card);
    }

    public List<Card<String>> getCards() {
        return game.getCard();
    }
}
