package schoo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * participantテーブルのEntityクラスです
 */
@Data
@Entity
@Table(name="participant")
public class Participant {
	// 参加者ID
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "participant_id")
	private Integer participantId;
	// 参加者名
	@Column(name = "participant_name")
	private String participantName;
}