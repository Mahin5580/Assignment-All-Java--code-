package CT02;

public class Employee {
	public String name;
	public adderessInfo addressinfo;
	public InsurenceInfo insurenceinfo;
	public Employee(String n,adderessInfo add,InsurenceInfo in) {
		name=n;
		addressinfo=add;
		insurenceinfo=in;
	}
	public void display() {
		System.out.println(name);
		System.out.println(addressinfo.street+addressinfo.city+addressinfo.state+addressinfo.postalCode);
		System.out.println(insurenceinfo.policyId+insurenceinfo.policyName);
	}

}
