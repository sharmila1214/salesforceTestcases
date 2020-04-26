import java.io.FileInputStream;
import java.util.Properties;

public class salesforceproperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String spath="C:\\Users\\sweet\\eclipse-workspace\\Salesforce\\salesforce.properities";
		try {
		Properties prop=new Properties();
		FileInputStream fr=new FileInputStream(spath);
		prop.load(fr);
		System.getProperties().putAll(prop);
		//System.setProperty("hi","hello");
		//String str1=System.getProperty("Username");
		//String str2=System.getProperty("Password");
		System.out.println("the property "+System.getProperty("Username"));
		System.out.println("the property "+System.getProperty("Password"));}
		catch(Exception e) {
			System.out.println(e);
		}
		
		}
	
}
