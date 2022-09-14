package project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
/**
 * user_accountテーブルのEntity
 */
@Data
@Entity
@Table(name="user_accuont")
public class UserAccuontEntiy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "loginusername")
	private String loginUsername;
	@Column(name = "loginid")
	private String loginId;
	@Column(name = "loginpassword")
	private String loginPassword;
}