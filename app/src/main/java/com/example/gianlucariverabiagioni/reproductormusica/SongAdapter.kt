package com.example.gianlucariverabiagioni.reproductormusica

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import java.util.ArrayList;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;



class SongAdapter(c: Context, theSongs: ArrayList<Song>) : BaseAdapter() {
    private var songs: ArrayList<Song>? = theSongs
    private var songInf: LayoutInflater? = LayoutInflater.from(c)

    override fun getCount(): Int {
        // TODO Auto-generated method stub
        return songs!!.size;
    }

    override fun getItem(arg0: Int): Any? {
        // TODO Auto-generated method stub
        return null
    }

    override fun getItemId(arg0: Int): Long {
        // TODO Auto-generated method stub
        return 0
    }

    override fun getView(position: Int, convertView: View, parent: ViewGroup): View {
        //map to song layout
        val songLay = songInf!!.inflate(R.layout.song, parent, false) as LinearLayout
        //get title and artist views
        val songView = songLay.findViewById<View>(R.id.song_title) as TextView
        val artistView = songLay.findViewById<View>(R.id.song_artist) as TextView
        //get song using position
        val currSong = songs!!.get(position)
        //get title and artist strings
        songView.text = currSong.title
        artistView.text = currSong.artist
        //set position as tag
        songLay.tag = position
        return songLay
    }
}
