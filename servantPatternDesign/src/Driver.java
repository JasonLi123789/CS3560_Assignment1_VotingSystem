/**
 * Servant offers some functionality to a group of classes without defining that functionality in
 * each of them. A Servant is a class whose instance provides methods that take care of a desired
 * service, while objects for which the servant does something, are taken as parameters.
 *
 */

public class Driver {

    /**
    * Define servant name
    */
    private static Servant Owen = new Servant("Owen");
    private static final Servant travis = new Servant("Travis");

    public static void main(String[] args){
        scenario(Owen);
    }

    /**
     * Can add a List with enum Actions for variable scenarios.
     */
    public static void scenario(Servant servant){
        King k = new King();
        Queen q = new Queen();

        /**
         * servant give the food to king
         */
        servant.feed(k);
        servant.feed(q);

        /**
         * servant give the drink to king
         */
        servant.giveWine(k);
        servant.giveWine(q);

        /**
         * servant help king massage
         */
        servant.giveMassage(k);
        servant.giveMassage(q);

        /**
         * servant help king hair cut
         */
        servant.giveHairCut(k);
        servant.giveHairCut(q);
    }
}
