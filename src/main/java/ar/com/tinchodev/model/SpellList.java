package ar.com.tinchodev.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpellList {
	private String status;
	private int code;
	private int total;
	private List<Spell> data;
	private Student estudiante;
	
	public Student getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Student estudiante) {
		this.estudiante = estudiante;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Spell> getData() {
		return data;
	}

	public void setData(List<Spell> data) {
		this.data = data;
	}
	
}
