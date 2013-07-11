package testCompare;

public class testCompareBase implements Comparable<testCompareBase>
{

	private String name;
	
	private int cmpA;
	
	private int cmpB;
	
	private int cmpC;
	
	public testCompareBase(){
		this.setName("CompareBase");
		this.setCmpA(10);
		this.setCmpB(100);
		this.setCmpC(1000);
	}
	
	public testCompareBase(String name,int cmpA,int cmpB,int cmpC){
		this.setName(name);
		this.setCmpA(cmpA);
		this.setCmpB(cmpB);
		this.setCmpC(cmpC);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCmpA() {
		return cmpA;
	}

	public void setCmpA(int cmpA) {
		this.cmpA = cmpA;
	}

	public int getCmpB() {
		return cmpB;
	}

	public void setCmpB(int cmpB) {
		this.cmpB = cmpB;
	}

	public int getCmpC() {
		return cmpC;
	}

	public void setCmpC(int cmpC) {
		this.cmpC = cmpC;
	}
	
	@Override
	public int compareTo(testCompareBase o) {
		int result = this.getCmpA() - o.getCmpA();
		if(result!=0){
			return result;
		}
		result = this.getCmpB() - o.getCmpB();
		if(result!=0){
			return result;
		}
		result = this.getCmpC() - o.getCmpC();
		if(result!=0){
			return result;
		}
		return 0;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + "name:" + this.getName();
		//return super.toString();
	}
	
}
