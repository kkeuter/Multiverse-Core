/******************************************************************************
 * Multiverse 2 Copyright (c) the Multiverse Team 2020.                       *
 * Multiverse 2 is licensed under the BSD License.                            *
 * For more information please check the README.md file included              *
 * with this project.                                                         *
 ******************************************************************************/

package com.onarandombox.MultiverseCore.commandTools;

import org.bukkit.GameRule;

public class GameRuleProperty<T> {

    private final GameRule<T> gameRule;
    private final T value;

    public GameRuleProperty(GameRule<T> gameRule, T value) {
        this.gameRule = gameRule;
        this.value = value;
    }

    public GameRule<T> getGameRule() {
        return gameRule;
    }

    public T getValue() {
        return value;
    }
}
