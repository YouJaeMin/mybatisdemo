package part05;

public class EmpDTO {
	private String employee_id;
	private String first_name;
	private DeptDTO dept;
	private LocDTO loc;

	public EmpDTO() {
	}

	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public DeptDTO getDept() {
		return dept;
	}

	public void setDept(DeptDTO dept) {
		this.dept = dept;
	}

	public LocDTO getLoc() {
		return loc;
	}

	public void setLoc(LocDTO loc) {
		this.loc = loc;
	}

}
