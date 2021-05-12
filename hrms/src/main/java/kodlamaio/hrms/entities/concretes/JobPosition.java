package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "job_position")
@Data
public class JobPosition {

	
	@Id 
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "position_number")
	private String positionNumber;
	
	@Column(name = "position_name")
	private String positionName;

	public JobPosition() {

	}

	public JobPosition(int id, String positionNumber, String positionName) {
		super();
		this.id = id;
		this.positionNumber = positionNumber;
		this.positionName = positionName;
	}

}
