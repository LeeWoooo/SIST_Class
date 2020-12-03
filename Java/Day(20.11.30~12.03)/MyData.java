package day1203.mydata;

import java.io.Serializable;

/**
 * ���� ��������
 * 
 * @author owner
 */
public class MyData implements Serializable {

	
	/**
	 * �� ���̵�� 2021�� 12�� 03�� 00�� 00�� 00�ʱ��� ��ȿ�մϴ�.
	 * ���� �ٸ� ������ ����˴ϴ�. 
	 */
	private static final long serialVersionUID = -4833088407624055249L;
	
	
	private transient String name; //����ȭ ����
	private int age;
	private double height;
	private transient double weight;

	public MyData() {
		// TODO Auto-generated constructor stub
	}// My data

	public MyData(String name, int age, double height, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}// My Data

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "MyData [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}

	
}// class
