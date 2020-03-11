package pja5_02032020;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andi
 */
public final class StudentRecordWithConstructor {
    private String name;
    private String address;
    private String noHP;
    private int age;
    private String NoBp;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;

    StudentRecordWithConstructor(String anna, String padang, String string, String _tahun) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNoHP() {
        return noHP;
    }

    public int getAge() {
        return age;
    }

    public String getNoBp() {
        return NoBp;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public double getScienceGrade() {
        return scienceGrade;
    }

    public double getAverage() {
        return average;
    }

    
    public StudentRecordWithConstructor(String name, String alamat, String nohp, int age){
        this.name = name;
        this.address = alamat;
        this.noHP = nohp;
        this.age = age;
        
        System.out.println("Nama   :"+this.getName());
        System.out.println("Alamat :"+this.getAddress());
        System.out.println("No HP  :"+this.getNoHP());
        System.out.println("Umur   :"+this.getAge()+" tahun\n");
    }
    
    public StudentRecordWithConstructor(String name, String alamat, String nohp, int age, 
                                        double mGrade, double eGrade, double scGrade)
    {
        this.name = name;
        this.address = alamat;
        this.noHP = nohp;
        this.age = age;
        this.mathGrade = mGrade;
        this.englishGrade = eGrade;
        this.scienceGrade = scGrade;
        
        System.out.println("Nama          :"+this.getName());
        System.out.println("Alamat        :"+this.getAddress());
        System.out.println("No HP         :"+this.getNoHP());
        System.out.println("Umur          :"+this.getAge()+" tahun");
        System.out.println("Nilai Math    :"+this.getMathGrade());
        System.out.println("Nilai English :"+this.getEnglishGrade());
        System.out.println("Nilai Science :"+this.getScienceGrade()+"\n");
    }
}
