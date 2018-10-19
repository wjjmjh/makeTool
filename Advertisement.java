public class Advertisement extends Item{


    int earn;

    public Advertisement(String company, int time, int earn){
        this.name = company;
        this.time = time;
        this.earn = earn;
    }

    @Override
    public int getTime(){
        return this.time;
    }

    @Override
    public String getName(){
        return this.name;
    }
}
