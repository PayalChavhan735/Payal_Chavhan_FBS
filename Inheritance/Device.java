package Inheritance;

class Device {
	String Brand;
	String Model;
	int price;
	int batterylevel;
	static int count;

	String getBrand() {
		return Brand;
	}

	void setBrand(String brand) {
		Brand = brand;
	}

	String getModel() {
		return Model;
	}

	void setModel(String model) {
		Model = model;
	}

	int getPrice() {
		return price;
	}

	void setPrice(int price) {
		this.price = price;
	}

	int getBatterylevel() {
		return batterylevel;
	}

	void setBatterylevel(int batterylevel) {
		this.batterylevel = batterylevel;
	}

	static int getCount() {
		return count;
	}

	static void setCount(int count) {
		Device.count = count;
	}

	Device() {
		Brand = "Apple";
		Model = "iPhone17";
		price = 500000;
		batterylevel = 100;
		count++;
	}
	

	Device(String brand, String model, int price, int batterylevel) {
		super();
		this.Brand = brand;
		this.Model = model;
		this.price = price;
		this.batterylevel = batterylevel;
		count++;
	}

	void display() {
		System.out.println("Brand is:"+this.Brand);
		System.out.println("Model is:"+this.Model);
		System.out.println("price is:"+this.price);
		System.out.println("batterylevel is:"+this.batterylevel);

	}

}

class Mobile extends Device {
	int simsloats;
	int cameraMP;
	int Storage;
	String is5G;

	 int getSimsloats() {
		return simsloats;
	}

	 void setSimsloats(int simsloats) {
		this.simsloats = simsloats;
	}

	 int getCameraMP() {
		return cameraMP;
	}

	 void setCameraMP(int cameraMP) {
		this.cameraMP = cameraMP;
	}

	 int getStorage() {
		return Storage;
	}

	 void setStorage(int storage) {
		Storage = storage;
	}

	 String getIs5G() {
		return is5G;
	}

	 void setIs5G(String is5g) {
		is5G = is5g;
	}

	 Mobile() {
		super();
		simsloats = 2;
		cameraMP = 50;
		Storage = 128;
		is5G = "yes";

	}

	Mobile(String brand, String model, int price, int batterylevel,int simsloats,int cameraMP,int Storage,String is5G ) {
		super(brand, model, price, batterylevel);
		this.simsloats = simsloats;
		this.cameraMP = cameraMP;
		this.Storage = Storage;
		this.is5G = is5G;
	}

	void display() {
		super.display();
		System.out.println("simsloats is:"+this.simsloats);
		System.out.println("cameraMP is:"+this.cameraMP);
		System.out.println("Storage is:"+this.Storage);
		System.out.println("is5G is:"+this.is5G);
	}
}

class Laptop extends Device {
	int ramsize;
	String processor;
	String OperatingSystem;

	 int getRamsize() {
		return ramsize;
	}

	 void setRamsize(int ramsize) {
		this.ramsize = ramsize;
	}

	 String getProcessor() {
		return processor;
	}

	 void setProcessor(String processor) {
		this.processor = processor;
	}

	 String getOperatingSystem() {
		return OperatingSystem;
	}

	 void setOperatingSystem(String operatingSystem) {
		OperatingSystem = operatingSystem;
	}

	Laptop() {
		ramsize = 64;
		processor = "Ryzen";
		OperatingSystem = "Windows";
	}

	 Laptop(String brand, String model, int price, int batterylevel,int ramsize,String processor,String OperatingSystem ) {
		super(brand, model, price, batterylevel);
		this.ramsize = ramsize;
		this.processor = processor;
		this.OperatingSystem = OperatingSystem;
	}

	void display() {
		super.display();
		System.out.println("ramsize is:"+this.ramsize);
		System.out.println("processor is:"+this.processor);
		System.out.println("OperatingSystem is:"+this.OperatingSystem);
	}

}

class SmartWatch extends Device {
	int HeartRate;
	int setpcount;

	 int getHeartRate() {
		return HeartRate;
	}

	 void setHeartRate(int heartRate) {
		HeartRate = heartRate;
	}

	 int getSetpcount() {
		return setpcount;
	}

	 void setSetpcount(int setpcount) {
		this.setpcount = setpcount;
	}

	SmartWatch() {
		HeartRate = 90;
		setpcount = 10000;
	}

	 SmartWatch(String brand, String model, int price, int batterylevel, int setpcount,int HeartRate,int Setpcount){
		super(brand, model, price, batterylevel);
		this.HeartRate = HeartRate;
		this.setpcount = setpcount;
	}

	void display() {
		super.display();
		System.out.println("HeartRate is:"+this.HeartRate);
		System.out.println("setpcount is:"+this.setpcount);
	}
}

class DemoInheritance1 {
	public static void main(String[]args) {
		Mobile m=new Mobile();
		m.display();
		Laptop l=new Laptop();
		l.display();
		SmartWatch b=new SmartWatch();
		b.display();
		System.out.println("device total count is:"+Device.getCount());
	}	
		
	}


