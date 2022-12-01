/**
 * Client class
 */
public class Queen implements Royalty{

    @Override
    public void getFeed() {
        System.out.println("Queen got food");
    }

    @Override
    public void getDrink() {
        System.out.println("Queen got drink");
    }

    @Override
    public void getMassage() {
        System.out.println("Queen got massage");
    }

    @Override
    public void gethairCut() {
        System.out.println("Queen got hair cut");
    }
}
