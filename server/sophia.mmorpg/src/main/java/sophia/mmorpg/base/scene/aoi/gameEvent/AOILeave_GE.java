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
package sophia.mmorpg.base.scene.aoi.gameEvent;

import sophia.mmorpg.base.sprite.Sprite;
import sophia.mmorpg.base.sprite.aoi.SpriteInfo;

public final class AOILeave_GE {
	
	private SpriteInfo spriteInfo;
	
	private Sprite sprite;
	
	public AOILeave_GE() {
		
	}

	public SpriteInfo getSpriteInfo() {
		return spriteInfo;
	}

	public void setSpriteInfo(SpriteInfo spriteInfo) {
		this.spriteInfo = spriteInfo;
	}

	public Sprite getSprite() {
		return sprite;
	}

	public void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}

}
