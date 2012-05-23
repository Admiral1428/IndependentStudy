
public class RectPrism extends ThreeDShape
{
	double height;
	double width;
	double depth;
	public RectPrism(double pMass, double pVelo, double pAngle, double pAccl, 
			double pXPos, double pYPos,double height, double width, double depth)
	{
		super(pMass, pVelo, pAngle, pAccl, pXPos, pYPos);
		this.height=height;
		this.width=width;
		this.depth=depth;
	}
	public double getVolume()
	{
		return height*width*depth;
	}
	public double getSArea()
	{
		return 2*depth*width+2*depth*height+2*height*width;
	}
	public double getDensity()
	{
		return getVolume()/getMass();
	}
	
}