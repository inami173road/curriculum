package schoo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * event_entryテーブルのEntityクラスです
 */
@Data
@Entity
@Table(name="event_entry")
public class EventEntry {
	// イベント参加ID
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "event_entry_id")
	private Integer eventEntryId;
	// イベントID
	@Column(name = "event_id")
	private Integer eventId;
	// イベント参加者ID
	@Column(name = "participant_id")
	private Integer participantId;
}