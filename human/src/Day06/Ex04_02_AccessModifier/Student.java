package Day06.Ex04_02_AccessModifier;

import Day06.Ex04_01_AccessModifier.Person;

public class Student extends Person {

	public Student() {

	}

	public Student(String name, int height, int age, int weight) {
		super(name, height, age, weight);
	}
	
    public void defaultSetting() {
    	name = "이름없음";
    	height = 160;
    	// age = 20;       // default 라서 같은 패키지에서만 접근 가능
    	// weight = 50;    // private 이라서 해당 클래스에서만 접근 가능
    	setAge(20);
    	setWeight(50);
    }


}
