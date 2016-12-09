/**
 *   Copyright 2013-2015 Sophia
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
*/
package sophia.mmorpg.player.exp.gameevent;

import sophia.foundation.util.ObjectPool;
import sophia.mmorpg.player.Player;

public final class PlayerLevelUp_GE {
	private int curLevel;
	
	private Player player;

	public int getCurLevel() {
		return curLevel;
	}

	public void setCurLevel(int curLevel) {
		this.curLevel = curLevel;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public static final ObjectPool<PlayerLevelUp_GE> pool = new ObjectPool<PlayerLevelUp_GE>() {

		@Override
		protected PlayerLevelUp_GE instance() {
			return new PlayerLevelUp_GE();
		}

		@Override
		protected void onRecycle(PlayerLevelUp_GE obj) {
		}
	};
}
