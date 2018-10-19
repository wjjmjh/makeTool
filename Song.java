public class Song extends Item {


    String band;


    public Song(String name, String band, int time){
        this.name = name;
        this.band = band;
        this.time = time;
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
