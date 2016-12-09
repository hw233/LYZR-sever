CREATE TABLE IF NOT EXISTS game_giftcode(
	`name` VARCHAR(12) COMMENT '角色名',
	`keyCode` VARCHAR(12) COMMENT '礼包码',
	`groupId` VARCHAR(12) COMMENT '礼包码组',
	PRIMARY KEY(`name`,keyCode,groupId)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPRESSED KEY_BLOCK_SIZE=16;
