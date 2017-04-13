/*
 * Copyright (c) 2015. William Mora
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.stc.runner;

import com.badlogic.gdx.Game;
import com.stc.runner.screens.GameScreen;
import com.stc.runner.utils.AssetsManager;
import com.stc.runner.utils.AudioUtils;
import com.stc.runner.utils.GameEventListener;
import com.stc.runner.utils.GameManager;

public class MartianRun extends Game {

    public MartianRun(GameEventListener listener) {
        GameManager.getInstance().setGameEventListener(listener);
    }

    @Override
    public void create() {
        AssetsManager.loadAssets();
        setScreen(new GameScreen());
    }

    @Override
    public void dispose() {
        super.dispose();
        AudioUtils.dispose();
        AssetsManager.dispose();
    }
}
