package schoo.entity;

import lombok.Data;
/**
 * ユーザ用Entity
 */
//EntityクラスはDBへ登録するためのクラス
@Data
public class UserEntity {

	private String userName;
	private Integer age;
}