/**
 * Servant.
 */
public class Servant {

    public String name;

    /**
     * Constructor.
     */
    public Servant(String name){
        this.name = name;
    }

    /**
     * execute feed request
     */
    public void feed(Royalty r){
        r.getFeed();
    }

    /**
     * execute drink request
     */
    public void giveWine(Royalty r){
        r.getDrink();
    }

    /**
     * execute massage request
     */
    public void giveMassage(Royalty r){
        r.getMassage();
    }

    /**
     * execute haircut request
     */
    public void giveHairCut(Royalty r){
        r.gethairCut();
    }

}
