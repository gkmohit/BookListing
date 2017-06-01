package com.mohitkishore.www.booklisting.Adaptors;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.mohitkishore.www.booklisting.Model.Books;
import com.mohitkishore.www.booklisting.R;

import java.util.ArrayList;

/**
 * Created by gkmohit on 31/05/17.
 */

public class BookListViewAdaptor extends ArrayAdapter<Books> {


    private ArrayList<Books> mBooks;
    private Context mContext;

    private static class ViewHolder {
        ImageView bookThumbnail;
        TextView bookTitle;
        TextView bookAuthors;
        TextView bookPublisher;
        TextView bookPublishedDate;
    }

    public BookListViewAdaptor(Context context, ArrayList<Books> books) {
        super(context, R.layout.list_view_row_item);
        mBooks = books;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mBooks.size();
    }

    @Override
    public Books getItem(int position) {
        return mBooks.get(position);
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Books book = getItem(position);

        ViewHolder viewHolder;

        if(convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.list_view_row_item, parent, false);

            viewHolder.bookAuthors = (TextView) convertView.findViewById(R.id.authorsNameTV);
            viewHolder.bookPublishedDate = (TextView) convertView.findViewById(R.id.publishedDateTV);
            viewHolder.bookPublisher = (TextView) convertView.findViewById(R.id.publisherTV);
            viewHolder.bookTitle = (TextView) convertView.findViewById(R.id.titleTV);
            viewHolder.bookThumbnail = (ImageView) convertView.findViewById(R.id.bookThumbnail);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.bookAuthors.setText(book.getAuthor());
        viewHolder.bookPublishedDate.setText(book.getPublishedDate());
        viewHolder.bookPublisher.setText(book.getPublisher());
        viewHolder.bookTitle.setText(book.getTitle());
        Glide.with(mContext).load(book.getThumbnailUrl()).into(viewHolder.bookThumbnail);

        return null;
    }
}
