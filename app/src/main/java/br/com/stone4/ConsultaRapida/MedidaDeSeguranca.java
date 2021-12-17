package br.com.stone4.ConsultaRapida;

import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;

public class MedidaDeSeguranca implements Serializable {

    private String title;
    private String subTitle;
    private String recomend;
    private int image;
    private String URLpdf;

    public MedidaDeSeguranca() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getRecomend() {
        return recomend;
    }

    public void setRecomend(String recomend) {
        this.recomend = recomend;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getURLpdf() {
        return URLpdf;
    }

    public void setURLpdf(String URLpdf) {
        this.URLpdf = URLpdf;
    }

}
