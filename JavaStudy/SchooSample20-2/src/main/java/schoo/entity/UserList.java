package schoo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
/**
 * user_listテーブルのEntityクラスです
 */
@Data
//ゲッター、セッターの代わり
@Entity
@Table(name="user_list")
public class UserList {
	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private Integer age;
}