package exafinal.edu.cibertec.com.desarrolloandroid;

import java.util.List;

/**
 * Created by HENRY on 24/01/2017.
 */

public class BromaResponse {


    /**
     * type : success
     * value : [{"id":480,"joke":"The class object inherits from Chuck Norris","categories":["nerdy"]},{"id":395,"joke":"Chuck Norris will never have a heart attack. His heart isn't nearly foolish enough to attack him.","categories":[]},{"id":43,"joke":"Police label anyone attacking Chuck Norris as a Code 45-11.... A suicide.","categories":[]},{"id":365,"joke":"Chuck Norris has never won an Academy Award for acting... because he's not acting.","categories":[]},{"id":405,"joke":"One time, at band camp, Chuck Norris ate a percussionist.","categories":[]},{"id":552,"joke":"Chuck Norris knows the value of NULL, and he can sort by it too.","categories":["nerdy"]},{"id":370,"joke":"Godzilla is a Japanese rendition of Chuck Norris' first visit to Tokyo.","categories":[]},{"id":68,"joke":"When Chuck Norris falls in water, Chuck Norris doesn't get wet. Water gets Chuck Norris.","categories":[]},{"id":337,"joke":"The chemical formula for the highly toxic cyanide ion is CN-. These are also Chuck Norris' initials. This is not a coincidence.","categories":[]},{"id":402,"joke":"There is no such thing as a lesbian, just a woman who has never met Chuck Norris.","categories":[]},{"id":82,"joke":"When an episode of Walker Texas Ranger was aired in France, the French surrendered to Chuck Norris just to be on the safe side.","categories":[]},{"id":2,"joke":"MacGyver can build an airplane out of gum and paper clips. Chuck Norris can kill him and take it.","categories":[]},{"id":408,"joke":"Love does not hurt. Chuck Norris does.","categories":[]},{"id":212,"joke":"Chuck Norris does not play the lottery. It doesn't have nearly enough balls.","categories":[]},{"id":326,"joke":"As an infant, Chuck Norris' parents gave him a toy hammer. He gave the world Stonehenge.","categories":[]},{"id":49,"joke":"CNN was originally created as the &quot;Chuck Norris Network&quot; to update Americans with on-the-spot ass kicking in real-time.","categories":[]},{"id":224,"joke":"When Chuck Norris plays Oregon Trail, his family does not die from cholera or dysentery, but rather, roundhouse kicks to the face. He also requires no wagon, since he carries the oxen, axels, and buffalo meat on his back. He always makes it to Oregon before you.","categories":[]},{"id":261,"joke":"Never look a gift Chuck Norris in the mouth, because he will bite your damn eyes off.","categories":[]},{"id":553,"joke":"China lets Chuck Norris search for porn on Google.","categories":["explicit"]},{"id":218,"joke":"Chuck Norris invented the internet? just so he had a place to store his porn.","categories":[]}]
     */

    private String type;
    private List<ValueBean> value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<ValueBean> getValue() {
        return value;
    }

    public void setValue(List<ValueBean> value) {
        this.value = value;
    }

    public static class ValueBean {
        /**
         * id : 480
         * joke : The class object inherits from Chuck Norris
         * categories : ["nerdy"]
         */

        private int id;
        private String joke;
        private List<String> categories;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getJoke() {
            return joke;
        }

        public void setJoke(String joke) {
            this.joke = joke;
        }

        public List<String> getCategories() {
            return categories;
        }

        public void setCategories(List<String> categories) {
            this.categories = categories;
        }
    }
}
