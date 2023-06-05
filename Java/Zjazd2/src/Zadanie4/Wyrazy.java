package Zadanie4;

public class Wyrazy {
    public String str1;
    public String str2;

    public Wyrazy(String str1, String str2)
    {
        this.str1 = str1;
        this.str2 = str2;
    }

    public boolean porownanie(){
        return str1.equals(str2);
    }

    public void wyswietlporownanie(){
        System.out.println("\nstr1:" +str1);
        System.out.println();
        System.out.println("str2:" +str2+"\n\n");
        System.out.println("str1 == str2:\n"+porownanie()+"\n");
        System.out.print("str1.equals(str2): "+porownanie());

    }
}
