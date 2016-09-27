
public class Project1 {
	public static void main(String args[]){
		ProductOwner PO = new ProductOwner("Amanda","SVP",1);
		ScrumMaster SM = new ScrumMaster("Carlos", "ADM", 1);
		ScrumTeam ST = new ScrumTeam("Carlos", "Software Engineer", 1);
		
		PO.provideFocus();
		PO.knowsScrum();
		SM.ServantLeader();
		ST.Develop();
		

		}

}
