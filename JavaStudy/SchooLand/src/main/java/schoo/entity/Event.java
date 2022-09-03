package schoo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

/**
 * eventテーブルのEntityクラスです
 */
@Data
@Entity
@Table(name="event")
public class Event {
	// イベントID
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "event_id")
	private Integer eventId;
	// イベント名
	@Column(name = "event_name")
	private String eventName;
	// イベント開催場所
	@Column(name = "event_venue")
	private String eventVenue;
	// イベント日付
	@Column(name = "event_date")
	@Temporal(TemporalType.DATE)
	private Date eventDate;
}