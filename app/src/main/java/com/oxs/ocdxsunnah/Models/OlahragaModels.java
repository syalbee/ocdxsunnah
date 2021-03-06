package com.oxs.ocdxsunnah.Models;

import java.util.ArrayList;

public class OlahragaModels {
    private ArrayList<Data> data;

    public ArrayList<Data> getData() {
        return data;
    }

    public void setData(ArrayList<Data> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "OlahragaModels{" +
                "data=" + data +
                '}';
    }

    public class Data{
        private String id;
        private String image;
        private String title;
        private String kalori;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getKalori() {
            return kalori;
        }

        public void setKalori(String kalori) {
            this.kalori = kalori;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "id='" + id + '\'' +
                    ", image='" + image + '\'' +
                    ", title='" + title + '\'' +
                    ", kalori='" + kalori + '\'' +
                    '}';
        }
    }
}
