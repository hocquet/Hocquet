package fr.univartois.firssreader;

import androidx.annotation.NonNull;

public class RssItem {
    private String title;
    private String description;
    private String pubDate;
    private String link;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public RssItem(String title,
                   String description,
                   String pubDate,
                   String link) {
        this.title = title;
        this.description = description;
        this.pubDate = pubDate;
        this.link = link;
    }

    public RssItem(String title) {
        this.title = title;
    }

    public RssItem() {
    }

    @Override
    public String toString() {
        return this.title;
    }
}
