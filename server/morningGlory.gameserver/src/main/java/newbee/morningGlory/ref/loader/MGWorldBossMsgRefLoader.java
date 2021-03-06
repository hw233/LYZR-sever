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
package newbee.morningGlory.ref.loader;

import newbee.morningGlory.ref.RefKey;
import sophia.mmorpg.player.worldBossMsg.WorldBoss;
import sophia.mmorpg.player.worldBossMsg.WorldBossMsgRef;

import com.google.gson.JsonObject;

public class MGWorldBossMsgRefLoader extends AbstractGameRefObjectLoader<WorldBossMsgRef> {

	public MGWorldBossMsgRefLoader() {
		super(RefKey.worldBoss);
	}

	@Override
	protected WorldBossMsgRef create() {
		return new WorldBossMsgRef();
	}

	@Override
	protected void fillNonPropertyDictionary(WorldBossMsgRef ref, JsonObject refData) {	
		String monsterRefId = ref.getId();
		WorldBoss.addMonsterRefId(monsterRefId, 0l);
		WorldBoss.addWorldBossRef(ref);
		WorldBoss.sortBosses();
		super.fillNonPropertyDictionary(ref, refData);
	}

}
