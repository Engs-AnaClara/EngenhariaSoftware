public class Filho extends Pai{
  
    private String Milkshake;

    public void setMilkshake(String Milkshake){
      this.Milkshake = Milkshake;

    }

    public String getMilkshake (){
        return this.Milkshake;
    }


    public void fazermilk(){
        System.out.println("Vou fazer milkshake");
    }

    @Override
        public String fazercafe(String cafe){
        this.setCafe(cafe);
        this.setMilkshake(cafe);

        System.out.println("Vou fazer o café");
        System.out.println("Café: " + this.getMilkshake());
        System.out.println("Milkshake: " + this.getMilkshake());

        return this.getCafe();

}}