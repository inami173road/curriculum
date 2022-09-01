package schoo.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * ユーザ情報のFormクラス
 */
public class UserForm {
	@NotBlank
	private String name;
	@NotBlank
	@Pattern(regexp = "[0-9]*")
	private String age;
	@NotBlank
	@Email
	private String mailAddress;

	/**
	 * コンストラクタ
	 * @param name
	 * @param age
	 * @param mailAddress
	 */
	public UserForm(String name, String age, String mailAddress) {
		this.name = name;
		this.age = age;
		this.mailAddress = mailAddress;
	}
	/**
	 * コンストラクタ
	 */
	public UserForm() {
	}

	/**
	 * @return name
	 */
	public String getName() {
		System.out.println("getName："+name);
		return name;
	}
	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
		System.out.println("setName："+this.name);
		System.out.println("-------------------------------------------");
	}
	/**
	 * @return age
	 */
	public String getAge() {
		System.out.println("getAge："+age);
		return age;
	}
	/**
	 * @param age セットする age
	 */
	public void setAge(String age) {
		this.age = age;
		System.out.println("setAge："+this.age);
		System.out.println("-------------------------------------------");
	}
	/**
	 * @return mailAddress
	 */
	public String getMailAddress() {
		System.out.println("getMailAddress："+mailAddress);
		return mailAddress;
	}
	/**
	 * @param mailAddress セットする mailAddress
	 */
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
		System.out.println("setMailAddress："+this.mailAddress);
		System.out.println("-------------------------------------------");
	}
}