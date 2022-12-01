/**
 * Client class
 */
public class King implements Royalty{

    @Override
    public void getFeed() {
        System.out.println("King got food");
    }

    @Override
    public void getDrink() {
        System.out.println("King got drink");
    }

    @Override
    public void getMassage() {
        System.out.println("King got massage");
    }

    @Override
    public void gethairCut() {
        System.out.println("King got hair cut");
    }

}
