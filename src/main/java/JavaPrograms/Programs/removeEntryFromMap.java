/**
 * 
 */
package JavaPrograms.Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author PUNITH
 * https://www.java67.com/2017/06/how-to-remove-entry-keyvalue-from-HashMap-in-java.html
 */
public class removeEntryFromMap {
	public static void main(String[] args) {
		Map<String, Integer> certificationCost = new HashMap<>();
		certificationCost.put("OCAJP 1Z0-808", 248);
		certificationCost.put("OCPJP 1Z0-809", 248);
		certificationCost.put("Spring Professional Certification Exam", 200);
		certificationCost.put("Spring Web Application Developer Exam", 200);
		certificationCost.put("OCMJEA 1Z0-807", 600);
		
		System.out.println("before: "+certificationCost);
		
		Iterator<String> itr=certificationCost.keySet().iterator();
		
		while(itr.hasNext()) {
			String certificate=itr.next();
			if(certificate.contains("OCPJP")) {
				itr.remove();
			}
		}		
		System.out.println("after: "+certificationCost);
	}
}