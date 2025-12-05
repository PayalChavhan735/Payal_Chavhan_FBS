package Inheritance;

 class Defence {
	 String nameofHead;
	 int noofVehicle;
	 int budget;
	 int noofdept;
	 int noofmission;
	 static int count;
	 static int getCount1() {
		 return count;
	 }
	 
	 static void setCount(int count) {
		Defence.count = count;
		
	}
	String locationofHeadquator;
	 String getNameofHead() {
		return nameofHead;
	}
	 void setNameofHead(String nameofHead) {
		this.nameofHead = nameofHead;
	}
	 int getNoofVehicle() {
		return noofVehicle;
	}
	 void setNoofVehicle(int noofVehicle) {
		this.noofVehicle = noofVehicle;
	}
	 int getBudget() {
		return budget;
	}
	 void setBudget(int budget) {
		this.budget = budget;
	}
	 int getNoofdept() {
		return noofdept;
	}
	 void setNoofdept(int noofdept) {
		this.noofdept = noofdept;
	}
	 int getNoofmission() {
		return noofmission;
	}
	 void setNoofmission(int noofmission) {
		this.noofmission = noofmission;
	}
	 String getLocationofHeadquator() {
		return locationofHeadquator;
	}
	 void setLocationofHeadquator(String locationofHeadquator) {
		this.locationofHeadquator = locationofHeadquator;
	}
	Defence(){
		nameofHead="pandu";
		noofVehicle=20;
		budget=100000;
		noofdept=5;
		noofmission=5000;
		locationofHeadquator="India";
		count++;
		
	}
	 Defence(String nameofHead, int noofVehicle, int budget, int noofdept, int noofmission,
			String locationofHeadquator) {
		super();
		this.nameofHead = nameofHead;
		this.noofVehicle = noofVehicle;
		this.budget = budget;
		this.noofdept = noofdept;
		this.noofmission = noofmission;
		this.locationofHeadquator = locationofHeadquator;
	}
	void display() {
		
		System.out.println("nameofHead is:"+this.nameofHead);
		System.out.println("noofVehicle is:"+this.noofVehicle);
		System.out.println("budget is:"+this.budget);
		System.out.println("noofdept is:"+this.noofdept);
		System.out.println("noofmission is:"+this.noofmission);
		System.out.println("locationofHeadquator is:"+this.locationofHeadquator);
	}
	public static String getCount() {
		// TODO Auto-generated method stub
		return null;
	}
	
	}
 
 class Navy extends Defence{
	 int noofship;
	 int submarine;
	 int nooftorpedoes;
	public int getNoofship() {
		return noofship;
	}
	 void setNoofship(int noofship) {
		this.noofship = noofship;
	}
	 int getSubmarine() {
		return submarine;
	}
	 void setSubmarine(int submarine) {
		this.submarine = submarine;
	}
	 int getNooftorpedoes() {
		return nooftorpedoes;
	}
	 void setNooftorpedoes(int nooftorpedoes) {
		this.nooftorpedoes = nooftorpedoes;
	}
	Navy(){
		noofship=10000;
		submarine=500;
		nooftorpedoes=800;	
		
	}
	 Navy(String nameofHead, int noofVehicle, int budget, int noofdept, int noofmission,
			String locationofHeadquator) {
		super(nameofHead, noofVehicle, budget, noofdept, noofmission, locationofHeadquator);
		this.noofship = noofship;
		this.submarine = submarine;
		this.nooftorpedoes = nooftorpedoes;
	}
	void display() {
		super.display();
		System.out.println("noofship is:"+this.noofship);
		System.out.println("submarine is:"+this.submarine);
		System.out.println("nooftorpedoes is:"+this.nooftorpedoes);
	}
	 
 }
 class Air extends Defence{
	 int noofmission;
	 int noofAircraft;
	 int noofSquadron;
	 int getNoofmission() {
		return noofmission;
	}
	 void setNoofmission(int noofmission) {
		this.noofmission = noofmission;
	}
	 int getNoofAircraft() {
		return noofAircraft;
	}
	 void setNoofAircraft(int noofAircraft) {
		this.noofAircraft = noofAircraft;
	}
	 int getNoofSquadron() {
		return noofSquadron;
	}
	 void setNoofSquadron(int noofSquadron) {
		this.noofSquadron = noofSquadron;
	}
	Air(){
		noofmission=700;
		noofAircraft=8000;
		noofSquadron=500;
		
	}
	 Air(String nameofHead, int noofVehicle, int budget, int noofdept, int noofmission,
			String locationofHeadquator) {
		super(nameofHead, noofVehicle, budget, noofdept, noofmission, locationofHeadquator);
		this.noofmission = noofmission;
		this.noofAircraft = noofAircraft;
		this.noofSquadron = noofSquadron;
	}
	void display() {
		super.display();
		System.out.println("noofmission is:"+this.noofmission);
		System.out.println("noofAircraft is:"+this.noofAircraft);
		System.out.println("noofSquadron is:"+this.noofSquadron);
	}
 } 
 class Army extends Defence{
	 int noofGuns;
	 int noofGuards;
	 int moofbattalion;
	 int getNoofGuns() {
		return noofGuns;
	}
	 void setNoofGuns(int noofGuns) {
		this.noofGuns = noofGuns;
	}
	 int getNoofGuards() {
		return noofGuards;
	}
	 void setNoofGuards(int noofGuards) {
		this.noofGuards = noofGuards;
	}
	 int getMoofbattalion() {
		return moofbattalion;
	}
	 void setMoofbattalion(int moofbattalion) {
		this.moofbattalion = moofbattalion;
	}
	Army(){
		noofGuns=10000;
		noofGuards=500;
		moofbattalion=200;	
		
	}
	 Army(String nameofHead, int noofVehicle, int budget, int noofdept, int noofmission,
			String locationofHeadquator) {
		super(nameofHead, noofVehicle, budget, noofdept, noofmission, locationofHeadquator);
		this.noofGuns = noofGuns;
		this.noofGuards = noofGuards;
		this.moofbattalion = moofbattalion;
	}
	void display() {
		super.display();
		System.out.println("noofGuns is:"+this.noofGuns);
		System.out.println("noofGuards is"+this.noofGuards);
		System.out.println("moofbattalion is"+this.moofbattalion);
	}
	class Inheritance5 {
		public static void main(String[]args) {
			Defence d=new Defence();
			d.display();
			Navy n=new Navy();
			n.display();
			Air a=new Air();
			a.display();
			Army b=new Army();
			b.display();
			System.out.println("Defence total count is:"+Defence.getCount1());
		}
	}
 }
 
	 
 


