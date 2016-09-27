
public class ScrumMaster extends ScrumTeamMember  {
	
	public ScrumMaster(String name, String role, int projectNum){
		super(name, role, projectNum);
	}

	
	public void ServantLeader(){
		System.out.println(name+ "who works in our company as: "+role+" is our scrum master for project: "+ projectNum);
	}
	
	

}
