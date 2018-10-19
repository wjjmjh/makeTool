import java.util.ArrayList;

public class BasicPlayList implements PlayList {


//	ArrayList<Song> songStore = new ArrayList<>();
//	ArrayList<Advertisement> adStore = new ArrayList<>();

	ArrayList<Item> list = new ArrayList<>();

	@Override
	public void addSong(String name, String band, int time) {
		// TODO Auto-generated method stub
		Song s = new Song(name, band, time);
		list.add(s);

	}

	@Override
	public void addAdvertisment(String company, int time, int earn) {
		// TODO Auto-generated method stub
		Advertisement ad = new Advertisement(company, time, earn);
		list.add(ad);

	}

	@Override
	public String longestSong() {
		// TODO Auto-generated method stub

		ArrayList<Item> songStore = new ArrayList<>();

		for (Item i : list){
			if (i instanceof  Song){
				songStore.add(i);
			}
		}

		Item res = songStore.get(0);
		for (Item s : songStore){
			if (s.time > res.time){
				res = s;
			}
		}

		return res.name;
	}

	@Override
	public boolean tooManyAds() {
		// TODO Auto-generated method stub


		ArrayList<Boolean> check = new ArrayList<>();


		for (Item i : list){
			Item s = i;
			ArrayList<Item> tem = new ArrayList<>();
			int rr = 0;
			while (rr <= 60){
				tem.add(s);
				rr += s.time;
				if (list.indexOf(i) + 1 < list.size()){
					s = list.get(list.indexOf(i) + 1);
				}else {break;}
			}


			check.add(helper(tem));
		}

		if (check.contains(true)){
			return true;
		}



		return false;
	}

	public Boolean helper(ArrayList<Item> ii){
		ArrayList<Item> adStore = new ArrayList<>();
		for (Item i : ii){
			if (i instanceof Advertisement){
				adStore.add(i);
			}
		}
		int res = 0;
		for (Item i : adStore){
			res += i.time;
		}

		if (res > 720){
			return true;
		}else {
			return false;
		}
	}

}
