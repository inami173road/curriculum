package todolist.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.AllArgsConstructor;
import todolist.entity.Todo;
import todolist.form.TodoData;
import todolist.repository.TodoRepository;
import todolist.service.TodoService;

@Controller
@AllArgsConstructor
public class TodoListController{
	private final TodoRepository todoRepository;
	private final TodoService todoService;//Todolist2で追加 

	//ToDo一覧表示(Todolistで追加) 
	@GetMapping("/")
	public ModelAndView showTodoList(ModelAndView mv){
		//一覧を検索して表示する
		mv.setViewName("todoList");
		List<Todo>todoList=todoRepository.findAll();
		mv.addObject("todoList",todoList);
		return mv;
	}

	//ToDo入力フォーム表示(Todolist-2で追加)
	//【処理1】ToDo一覧画面(todoList.html)で[新規追加]リンクがクリックされたとき
	@GetMapping("/todo/create")
	public ModelAndView createTodo(ModelAndView mv){
		mv.setViewName("todoForm");//①
		mv.addObject("todoData",new TodoData());//②
		return mv;
	}

	//ToDo追加処理(Todolist-2で追加)
	//【処理2】ToDo入力画面(todoForm.html)で[登録]ボタンがクリックされたとき
	@PostMapping("/todo/create")
	public ModelAndView createTodo(
			@ModelAttribute 
			@Validated 
			TodoData todoData,//③
			BindingResult result,
			ModelAndView mv){
		//エラーチェック
		boolean isValid = todoService.isValid(todoData,result);//④
		if(!result.hasErrors() && isValid){
			//エラーなし
			Todo todo=todoData.toEntity();//⑤
			todoRepository.saveAndFlush(todo);
			return showTodoList(mv);
		}else{
			//エラーあり
			mv.setViewName("todoForm");//⑥
			//mv.addObject("todoData",todoData);
			return mv;
		}
	} 
	
	//ToDo一覧へ戻る(Todolist-2で追加)
	//【処理3】ToDo入力画面で[キャンセル登録]ボタンがクリックされたとき
	@PostMapping("/todo/cancel")
	public String cancel(){
		return"redirect:/todo";
	}
}