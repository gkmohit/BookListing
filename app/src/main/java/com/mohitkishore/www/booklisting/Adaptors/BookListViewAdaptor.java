package com.mohitkishore.www.booklisting.Adaptors;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

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
        return null;
    }
}
