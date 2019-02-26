package com.htp.redcompany.jaxb.entity;

import java.util.Date;
import java.util.Objects;

public class Movie {

    private String title;
    private String director;
    private Date date_of_issue;
    private String news_body;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Date getDate_of_issue() {
        return date_of_issue;
    }

    public void setDate_of_issue(Date date_of_issue) {
        this.date_of_issue = date_of_issue;
    }

    public String getNews_body() {
        return news_body;
    }

    public void setNews_body(String news_boby) {
        this.news_body = news_boby;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", date_of_issue=" + date_of_issue +
                ", news_boby='" + news_body + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(title, movie.title) &&
                Objects.equals(director, movie.director) &&
                Objects.equals(date_of_issue, movie.date_of_issue) &&
                Objects.equals(news_body, movie.news_body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, director, date_of_issue, news_body);
    }
}
