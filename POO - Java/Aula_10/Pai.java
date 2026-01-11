public class Pai {
    public String cafe;

    public String getCafe(){
        return this.cafe;
    }

    public void setCafe (String cafe){
        this.cafe = cafe;
    }
    
    public String fazercafe(String cafe){
        this.setCafe(cafe);

        System.out.println("Vou fazer o café");

        return this.getCafe();
    }
}
