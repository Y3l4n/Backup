
package dsai.Aims;
import dsai.Cart.Cart;
import dsai.DigitalVideoDisc.DigitalVideoDisc;

public class Aims {

    public static void main(String[] args) {
        
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = 
        new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f,101);
        DigitalVideoDisc dvd2 = 
        new DigitalVideoDisc("Oppenheimer", "History", "Christopher Nolan" , 180, 50.2f,111);
        DigitalVideoDisc dvd3 = 
        new DigitalVideoDisc("Comedy Frenzy", "Comedy", "Michael Anderson", 95, 7.99f,2312);
        DigitalVideoDisc dvd4 = 
        new DigitalVideoDisc("Love and Drama", "Romance", "Sarah Thompson", 150, 14.99f,0404);
        DigitalVideoDisc dvd5 = 
        new DigitalVideoDisc("Sci-Fi Spectacle", "Science Fiction", "Robert Davis", 135, 11.99f,5);
        DigitalVideoDisc dvd6 = 
        new DigitalVideoDisc("Sci-Fi Spectacle", "Science Fiction", "Robert Davis", 135, 11.99f,13);

        DigitalVideoDisc[] dvdList = {dvd1, dvd2, dvd3, dvd4, dvd5, dvd6};

        anOrder.addDigitalVideoDisc(dvdList);
        // anOrder.printCart();
        
        anOrder.searchByID(0404);
    }
}
