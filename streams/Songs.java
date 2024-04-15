package streams;

import java.util.List;

public class Songs {

    public List<Song> getSongs(){
        return  List.of(
          new Song("Rick Flair", "Migos", "Rap", 2017, 20),
          new Song("Letter to Falon", "Jay Electonica", "Rap", 2010, 58),
          new Song("Wetin Man Go do", "Burna Boy", "Afrobeats", 2020, 47),
          new Song("Ojuelgba", "Wizkid", "Afrobeats", 2012, 77),
          new Song("Tennessey Whiskey", "Traveller", "Country", 2018,  30),
          new Song("The beat goes on", "The whispers", "Blues", 1987, 202),
          new Song("Kings Disease II", "Nas", "Rap", 2021, 109)
        );
    }
}
