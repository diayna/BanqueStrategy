package Banque_Strategy;

public class VisaStrategy implements PaiementStrategy {
	private String code;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public VisaStrategy(String code) {
		this.code = code;
	}
	public int estValide(String ch) {
		this.setCode(ch);
		Luhn luhn = new Luhn(ch);
		if (ch.length()==12) {
			if((ch.startsWith("39"))||(ch.startsWith("40"))){
	            boolean valid = luhn.check(ch);
	            System.out.println("Control : "+luhn.getControl());
	            if(valid)
	            {
	            	System.out.println("Validité : "+valid);
	            }
			}
			return 1;
		}
		else {
            return 0;
		}
	}

	
}
