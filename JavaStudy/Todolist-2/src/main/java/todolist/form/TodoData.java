package todolist.form;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import todolist.entity.Todo;

@Data
public class TodoData {

	private Integer id;

	@NotBlank(message = "件名を入力してください")
	private String title;

	@NotNull(message="重要度を選択してください")
	private Integer importance;

	@Min(value=0,message="緊急度を選択してください")
	private Integer urgency;

	private String deadline;
	private String done;

	public Todo toEntity(){
		Todo todo=new Todo();
		todo.setId(id);
		todo.setTitle(title);
		todo.setImportance(importance);
		todo.setUrgency(urgency);
		todo.setDone(done);

		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyyMMdd");
		long ms;

		try{
			ms=sdFormat.parse(deadline).getTime();
			todo.setDeadline(new Date(ms));
		}catch(ParseException e){
			todo.setDeadline(null);
		}

		return todo;

	} 
}
