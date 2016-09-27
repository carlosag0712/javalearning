
public class ProductOwner extends ScrumTeamMember implements ScrumKnowledge{
	
	

	public ProductOwner(String name, String role, int projectNum) {
		super(name, role, projectNum);
		// TODO Auto-generated constructor stub
	}

	public void provideFocus(){
		System.out.println(name+ "who works in our company as: "+role+ "is our product owner for project: "+projectNum);
		
	}
//	public void knowsScrum(){
//		System.out.println("Barely trained");
//	}

		
	

}

	
