package schoo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import schoo.entity.EventEntry;

/**
 * event_entryテーブルを操作するためのRepositoryクラスです
 */
public interface EventEntryRepository extends JpaRepository<EventEntry, Integer> {
	/**
	 * 指定したイベントIDからイベント参加者の情報を検索します.
	 * @param eventId イベントID
	 * @return	イベント参加者一覧
	 */
	public List<EventEntry> findByEventId(Integer eventId);
}