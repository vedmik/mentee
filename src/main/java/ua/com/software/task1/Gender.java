package ua.com.software.task1;

public enum Gender {
    MAN("Man"),
    WOMAN("Woman");

    private String gender;

    Gender(String gender){
        this.gender = gender;
    }

    public String getGender(){ return gender;}
}
