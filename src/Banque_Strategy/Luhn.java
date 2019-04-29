package Banque_Strategy;

public class Luhn {
    private int control;
    private String code;
    private int sum;

    public Luhn()
    {
        this.code = "";
        this.control = 0;
        this.sum = 0;
    }

    public Luhn(String code)
    {
        this.code = code;
        this.control = 0;
        this.sum = 0;
    }
    public int getControl()
    {
        return this.control;
    }
    public String getCode()
    {
        return this.code;
    }

    public boolean check()
    {
        sum = 0;
        int lc = this.code.length();

        for(int i=lc-1; i>=0 ;i--)
        {
            int digit = Integer.parseInt(Character.toString(code.charAt(i)));
            if((i % 2) == 0)
                digit *= 2;
            if(digit > 9)
                digit -= 9;
            sum += digit;
        }
        this.control = (sum%10);
        return this.control == 0;
    }
    public int rectifCrtl()
    {
        control = 10-(this.sum%10);
        return this.control;
    }
    public boolean check(String code)
    {
        sum = 0;
        int lc = code.length();

        for(int i=lc-1; i>=0 ;i--)
        {
            int digit = Integer.parseInt(Character.toString(code.charAt(i)));
            if((i % 2) == 0)
                digit *= 2;
            if(digit > 9)
                digit -= 9;
            sum += digit;
        }
        this.control = (sum%10);
        return this.control == 0;
    }
}

