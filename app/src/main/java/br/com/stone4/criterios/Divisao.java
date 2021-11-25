package br.com.stone4.criterios;

import java.io.Serializable;

public class Divisao implements Serializable {

    private String id;
    private int image;

    public Divisao() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
