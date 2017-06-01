package com.mohitkishore.www.booklisting.Model;

/**
 * Created by gkmohit on 31/05/17.
 */

public class Books {
    String mAuthor;
    String mTitle;
    String mPublisher;
    String mPublishedDate;
    String mThumbnailUrl;

    public Books(String author, String title, String publisher, String publishedDate, String thumbnailUrl) {
        mAuthor = author;
        mTitle = title;
        mPublisher = publisher;
        mPublishedDate = publishedDate;
        mThumbnailUrl = thumbnailUrl;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getPublisher() {
        return mPublisher;
    }

    public String getPublishedDate() {
        return mPublishedDate;
    }

    public String getThumbnailUrl() {
        return mThumbnailUrl;
    }
}
