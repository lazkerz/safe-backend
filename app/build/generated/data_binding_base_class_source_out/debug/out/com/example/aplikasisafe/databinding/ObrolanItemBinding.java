// Generated by view binder compiler. Do not edit!
package com.example.aplikasisafe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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

public final class ObrolanItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView isicht;

  @NonNull
  public final ImageView ivanti;

  @NonNull
  public final LinearLayout layout2;

  @NonNull
  public final ImageView msg;

  @NonNull
  public final TextView nama;

  private ObrolanItemBinding(@NonNull CardView rootView, @NonNull TextView isicht,
      @NonNull ImageView ivanti, @NonNull LinearLayout layout2, @NonNull ImageView msg,
      @NonNull TextView nama) {
    this.rootView = rootView;
    this.isicht = isicht;
    this.ivanti = ivanti;
    this.layout2 = layout2;
    this.msg = msg;
    this.nama = nama;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ObrolanItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ObrolanItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.obrolan_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ObrolanItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.isicht;
      TextView isicht = ViewBindings.findChildViewById(rootView, id);
      if (isicht == null) {
        break missingId;
      }

      id = R.id.ivanti;
      ImageView ivanti = ViewBindings.findChildViewById(rootView, id);
      if (ivanti == null) {
        break missingId;
      }

      id = R.id.layout2;
      LinearLayout layout2 = ViewBindings.findChildViewById(rootView, id);
      if (layout2 == null) {
        break missingId;
      }

      id = R.id.msg;
      ImageView msg = ViewBindings.findChildViewById(rootView, id);
      if (msg == null) {
        break missingId;
      }

      id = R.id.nama;
      TextView nama = ViewBindings.findChildViewById(rootView, id);
      if (nama == null) {
        break missingId;
      }

      return new ObrolanItemBinding((CardView) rootView, isicht, ivanti, layout2, msg, nama);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
