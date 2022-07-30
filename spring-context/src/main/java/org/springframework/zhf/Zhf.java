package org.springframework.zhf;

public class Zhf {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "org.springframework.zhf.Zhf{" +
				"name='" + name + '\'' +
				'}';
	}
}
