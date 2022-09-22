package com.example.notesapp2;

import androidx.cardview.widget.CardView;

import com.example.notesapp2.Models.Notes;

public interface NotesClickListener  {
    void onClick (Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
