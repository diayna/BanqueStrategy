package Banque_Strategy;

public class EcobankStrategy implements PaiementStrategy {
	private String code;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public EcobankStrategy(String code) {
		this.code = code;
	}
	public int estValide(String ch) {
		this.setCode(ch);
		String ch1=ch.substring(1, (ch.length()-1));
		Luhn luhn = new Luhn(ch1);
		if (ch.length()==11) {
			if((ch.startsWith("E"))||(ch.startsWith("A"))){
	            boolean valid = luhn.check(ch1);
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
