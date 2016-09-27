
public class ScrumTeamMember {
	
	String name;
	String role;
	int projectNum;
	
	public ScrumTeamMember(String name, String role, int projectNum){
		this.name = name;
		this.role = role;
		this.projectNum = projectNum;
		
	}
	
	public void knowsScrum(){
		System.out.println("Must be trained in scrum");
	}
	
	public void hasAProject(){
		System.out.println("Scrum Team member assigned to project"+projectNum);
	}

}
