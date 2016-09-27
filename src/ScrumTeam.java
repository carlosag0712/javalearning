
public class ScrumTeam extends ScrumTeamMember{
	
	public ScrumTeam(String name,String role, int projectNum){
		super(name,role,projectNum);
		
	}
	
	public void Develop(){
		System.out.println(name + "who works in the company as: "+role+"will be the lead dev for our project: "+projectNum);
	}
	


}