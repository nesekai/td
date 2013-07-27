package td.Engine;

public class BCore {

	private Kernel kernel;
	private String name;
	
	@Override
	public String toString() {
		return name;
	}

	public Kernel getKernel() {
		return kernel;
	}

	public BCore(Kernel pKernel, String pName)
	{
		kernel = pKernel;
		name = pName;
	}
	
	public void update()
	{
		
	}
	
	public void render()
	{
		
	}
}
