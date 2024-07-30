package sub2;

public class Person {

	private String id;
	private String name;
	private String hp;
	private String age;

	public Person(String id, String name, String hp, String age) {
		super();
		this.id = id;
		this.name = name;
		this.hp = hp;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
