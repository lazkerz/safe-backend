// Generated by view binder compiler. Do not edit!
package com.example.aplikasisafe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.aplikasisafe.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PelatihanItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView deskPelatihan;

  @NonNull
  public final ImageView imgPelatihan;

  @NonNull
  public final TextView namaPelatihan;

  private PelatihanItemBinding(@NonNull CardView rootView, @NonNull TextView deskPelatihan,
      @NonNull ImageView imgPelatihan, @NonNull TextView namaPelatihan) {
    this.rootView = rootView;
    this.deskPelatihan = deskPelatihan;
    this.imgPelatihan = imgPelatihan;
    this.namaPelatihan = namaPelatihan;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static PelatihanItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PelatihanItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.pelatihan_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PelatihanItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.deskPelatihan;
      TextView deskPelatihan = ViewBindings.findChildViewById(rootView, id);
      if (deskPelatihan == null) {
        break missingId;
      }

      id = R.id.imgPelatihan;
      ImageView imgPelatihan = ViewBindings.findChildViewById(rootView, id);
      if (imgPelatihan == null) {
        break missingId;
      }

      id = R.id.namaPelatihan;
      TextView namaPelatihan = ViewBindings.findChildViewById(rootView, id);
      if (namaPelatihan == null) {
        break missingId;
      }

      return new PelatihanItemBinding((CardView) rootView, deskPelatihan, imgPelatihan,
          namaPelatihan);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
