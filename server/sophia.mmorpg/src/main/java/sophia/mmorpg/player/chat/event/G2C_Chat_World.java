package sophia.mmorpg.player.chat.event;

import org.apache.mina.core.buffer.IoBuffer;

import sophia.foundation.communication.core.ActionEventBase;
import sophia.mmorpg.player.Player;
import sophia.mmorpg.ref.editorgen.MGPropertyAccesser;

public class G2C_Chat_World extends ActionEventBase {
	// 发送内容的玩家
	private Player sender;
	// 发送内容
	private String msg;

	private long time;
	@Override
	public void unpackBody(IoBuffer buffer) {
		msg = getString(buffer) + "," + getString(buffer) + "," + getString(buffer);
	}

	@Override
	protected IoBuffer packBody(IoBuffer buffer) {
		// 发送者名字
		putString(buffer, sender.getName());
		// 发送者id
		putString(buffer, sender.getId());
		// 发送内容
		putString(buffer, msg);
		// 性别
		buffer.put(MGPropertyAccesser.getGender(sender.getProperty()));
		// VIP类型
		buffer.put(sender.getVipType());
		
		buffer.putLong(time);
		return buffer;
	}

	public void setSender(Player player) {
		this.sender = player;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	
}
