/**
 * Created by Ny Derry on 7/9/2017.
 */
public class Movie {

    String title;
    String category;

    //getter and setter keep the value private while being accessible through public method

    Movie(String title, String category) {//setter
        this.title = title;
        this.category = category;
    }

    public String getTitle() {//getter
        return title;
    }

    public String getCategory() {
        return category;
    }
}

