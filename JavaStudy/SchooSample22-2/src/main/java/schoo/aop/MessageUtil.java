package schoo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MessageUtil {
	//このアノテーションはログの位置を指定している。
	//この位置を「ジョインポイント」（実行タイミング）とも呼ぶ
	@Before("execution(* schoo.service.*.*(..))")//ポイントカット式
	public void beforeMessage(JoinPoint joinPoint) {
							// 引数を渡すことでわざわざ記述しなくてもそこのJoinPointのクラスのメソッドを取得している。	
		System.out.println(joinPoint.getSignature()+"だお");
	}
}