package Inheritance;

 class Farmer {
	 int farmerId;
	 String farmername;
	 int area;
	 int annualincome;
	 int noofequipment;
	 static int count;
	 static int getCount1() {
		 return count;
	 }
	
	 public static void setCount(int count) {
		Farmer.count = count;
	}
	int getFarmerId() {
		return farmerId;
	}
	 void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}
	 String getFarmername() {
		return farmername;
	}
	 void setFarmername(String farmername) {
		this.farmername = farmername;
	}
	 int getArea() {
		return area;
	}
	 void setArea(int area) {
		this.area = area;
	}
	 int getAnnualincome() {
		return annualincome;
	}
	 void setAnnualincome(int annualincome) {
		this.annualincome = annualincome;
	}
	 int getNoofequipment() {
		return noofequipment;
	}
	 void setNoofequipment(int noofequipment) {
		this.noofequipment = noofequipment;
	}
	Farmer(){
		farmerId=202;
		farmername="ramu";
		area=1000;
		annualincome=50000;
		noofequipment=45;
		count++;
	
		
	}
	 Farmer(int farmerId, String farmername, int area, int annualincome, int noofequipment) {
		super();
		this.farmerId = farmerId;
		this.farmername = farmername;
		this.area = area;
		this.annualincome = annualincome;
		this.noofequipment = noofequipment;
	}
	void display() {
		
		System.out.println("farmerId is:"+this.farmerId);
		System.out.println("farmername is:"+this.farmername);
		System.out.println("area is:"+this.area);
		System.out.println("annualincome is:"+this.annualincome);
		System.out.println("noofequipment is:"+this.noofequipment);
	}
	public static String getCount() {
		// TODO Auto-generated method stub
		return null;
	}

}
 class Diaryfarmer extends Farmer{
	 int noofcattles;
	 int milkproductionrate;
	 int diarylicenseno;
	 int getNoofcattles() {
		return noofcattles;
	}
	 void setNoofcattles(int noofcattles) {
		this.noofcattles = noofcattles;
	}
	 int getMilkproductionrate() {
		return milkproductionrate;
	}
	 void setMilkproductionrate(int milkproductionrate) {
		this.milkproductionrate = milkproductionrate;
	}
	 int getDiarylicenseno() {
		return diarylicenseno;
	}
	 void setDiarylicenseno(int diarylicenseno) {
		this.diarylicenseno = diarylicenseno;
	}
	Diaryfarmer(){
		noofcattles=400;
		milkproductionrate=50;
		diarylicenseno=112;
			
			
	}
	 Diaryfarmer(int farmerId, String farmername, int area, int annualincome, int noofequipment,int noofcattles,int milkproductionrate,int diarylicenseno ) {
		super(farmerId, farmername, area, annualincome, noofequipment);
		
		this.noofcattles = noofcattles;
		this.milkproductionrate = milkproductionrate;
		this.diarylicenseno = diarylicenseno;
	}
	 void display() {
		 super.display();
		 System.out.println("noofcattles is:"+this.noofcattles);
		 System.out.println("milkproductionrate is"+this.milkproductionrate);
		 System.out.println("diarylicenseno is"+this.diarylicenseno);
	 }
	 
 }
 class Polatryfarmer extends Farmer{
	 int noofchiken;
	 int noofshades;
	 int eggproduction;
	 String poultryfarmername;
	 int getNoofchiken() {
		return noofchiken;
	}
	 void setNoofchiken(int noofchiken) {
		this.noofchiken = noofchiken;
	}
	 int getNoofshades() {
		return noofshades;
	}
	 void setNoofshades(int noofshades) {
		this.noofshades = noofshades;
	}
	 int getEggproduction() {
		return eggproduction;
	}
	 void setEggproduction(int eggproduction) {
		this.eggproduction = eggproduction;
	}
	 String getPoultryfarmername() {
		return poultryfarmername;
	}
	 void setPoultryfarmername(String poultryfarmername) {
		this.poultryfarmername = poultryfarmername;
	}
	Polatryfarmer(){
		noofchiken=400;
		noofshades=5;
		eggproduction=700;
		poultryfarmername="Suguna Foods";
		
	}
	 Polatryfarmer(int farmerId, String farmername, int area, int annualincome, int noofequipment) {
		super(farmerId, farmername, area, annualincome, noofequipment);
		this.noofchiken = noofchiken;
		this.noofshades = noofshades;
		this.eggproduction = eggproduction;
		this.poultryfarmername = poultryfarmername;
	}
	void display() {
		super.display();
		System.out.println("noofchiken is:"+this.noofchiken);
		System.out.println("noofshades is:"+this.noofshades);
		System.out.println("eggproduction:"+this.eggproduction);
		System.out.println("poultryfarmername:"+this.poultryfarmername);
	}
	 
	 
 }
 class Organicfarmer extends Farmer{
	 int organicId;
	 String cropType;
	 String Fertilizerused;
	 int getOrganicId() {
		return organicId;
	}
    void setOrganicId(int organicId) {
		this.organicId = organicId;
	}
	 String getCropType() {
		return cropType;
	}
	 void setCropType(String cropType) {
		this.cropType = cropType;
	}
	 String getFertilizerused() {
		return Fertilizerused;
	}
	 void setFertilizerused(String fertilizerused) {
		Fertilizerused = fertilizerused;
	}
	Organicfarmer(){
		organicId=1234;
		cropType="wheat";
		Fertilizerused="urea";	
		
	}
	public Organicfarmer(int farmerId, String farmername, int area, int annualincome, int noofequipment) {
		super(farmerId, farmername, area, annualincome, noofequipment);
		this.organicId = organicId;
		this.cropType = cropType;
	    this.Fertilizerused = Fertilizerused;
	}
		void display() {
			super.display();
			System.out.println("organicId is:"+this.organicId);
			System.out.println("cropType is:"+this.cropType);
			System.out.println("Fertilizerused is:"+this.Fertilizerused);
		}
	}
 class Inheritance4 {
		public static void main(String[]args) {
			Farmer f=new Farmer();
			f.display();
			Diaryfarmer d=new Diaryfarmer();
			d.display();
			Polatryfarmer p=new Polatryfarmer();
			p.display();
			Organicfarmer o=new Organicfarmer();
			o.display();
			System.out.println("Farmer total count is:"+Farmer.getCount1());
	 
		}
	}
	
