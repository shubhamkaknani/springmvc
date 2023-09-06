package org.studyeasy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "apple")
@Table(name = "apple")
public class Apple {

	@Id
	@Column(name = "iden")
	private int iden;
	@Column(name = "model")
	private String model;
	@Column(name = "type")
	private String type;

	public Apple() {
	}

	public Apple(int iden, String model, String type) {
		this.iden = iden;
		this.model = model;
		this.type = type;
	}

	public int getIden() {
		return iden;
	}

	public void setIden(int iden) {
		this.iden = iden;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Apple [iden=" + iden + ", model=" + model + ", type=" + type + "]";
	}

}
