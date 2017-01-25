package exafinal.edu.cibertec.com.desarrolloandroid;

import java.util.List;

/**
 * Created by HENRY on 25/01/2017.
 */

public class ImagenesResponse {

    private List<ImagenesBean> imagenes;

    public List<ImagenesBean> getImagenes() {
        return imagenes;
    }

    public void setImagenes(List<ImagenesBean> imagenes) {
        this.imagenes = imagenes;
    }

    public static class ImagenesBean {
        /**
         * url : https://smediacacheak0.pinimg.com/originals/de/f6/96/def69643889ee29e232637646e839064.jpg
         * id : 515
         */

        private String url;
        private int id;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}
