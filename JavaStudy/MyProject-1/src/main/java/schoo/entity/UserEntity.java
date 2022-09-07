package schoo.entity;

import lombok.Data;

/**
 * ユーザ用Entity
 */
@Data
public class UserEntity {
	private String loginId;
	private String loginPassword;
	private String loginUsername;
}