package ai.aecode.aecode.dtos;
import ai.aecode.aecode.entities.Profile;

public class ArticleDTO {

    private int id_article;
    private Profile profile;
    private String article_title;
    private byte[] article_pdf;

    public int getId_article() {
        return id_article;
    }

    public void setId_article(int id_article) {
        this.id_article = id_article;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getArticle_title() {
        return article_title;
    }

    public void setArticle_title(String article_title) {
        this.article_title = article_title;
    }

    public byte[] getArticle_pdf() {
        return article_pdf;
    }

    public void setArticle_pdf(byte[] article_pdf) {
        this.article_pdf = article_pdf;
    }
}
