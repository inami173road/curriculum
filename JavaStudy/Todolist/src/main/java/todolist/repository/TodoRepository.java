package todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import todolist.entity.Todo;



													// 第１引数：このリポジトリが対象となるEntityクラス
													// 第２引数：対象のEntityクラスの＠Idで指定されているプロパティの型
public interface TodoRepository extends JpaRepository<Todo, Integer>{
}
