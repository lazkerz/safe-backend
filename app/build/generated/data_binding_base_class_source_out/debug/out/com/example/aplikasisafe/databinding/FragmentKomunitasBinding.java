// Generated by view binder compiler. Do not edit!
package com.example.aplikasisafe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.aplikasisafe.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentKomunitasBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageButton btnPost;

  @NonNull
  public final ImageView imgKomunitas;

  @NonNull
  public final ImageView imgKomunitas2;

  @NonNull
  public final TextView komunitas;

  @NonNull
  public final TextView komunitas1;

  @NonNull
  public final TextView komunitas2;

  @NonNull
  public final LinearLayout layout2;

  @NonNull
  public final LinearLayout layout3;

  @NonNull
  public final RecyclerView recyleview;

  private FragmentKomunitasBinding(@NonNull FrameLayout rootView, @NonNull ImageButton btnPost,
      @NonNull ImageView imgKomunitas, @NonNull ImageView imgKomunitas2,
      @NonNull TextView komunitas, @NonNull TextView komunitas1, @NonNull TextView komunitas2,
      @NonNull LinearLayout layout2, @NonNull LinearLayout layout3,
      @NonNull RecyclerView recyleview) {
    this.rootView = rootView;
    this.btnPost = btnPost;
    this.imgKomunitas = imgKomunitas;
    this.imgKomunitas2 = imgKomunitas2;
    this.komunitas = komunitas;
    this.komunitas1 = komunitas1;
    this.komunitas2 = komunitas2;
    this.layout2 = layout2;
    this.layout3 = layout3;
    this.recyleview = recyleview;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentKomunitasBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentKomunitasBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_komunitas, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentKomunitasBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_post;
      ImageButton btnPost = ViewBindings.findChildViewById(rootView, id);
      if (btnPost == null) {
        break missingId;
      }

      id = R.id.img_komunitas;
      ImageView imgKomunitas = ViewBindings.findChildViewById(rootView, id);
      if (imgKomunitas == null) {
        break missingId;
      }

      id = R.id.img_komunitas2;
      ImageView imgKomunitas2 = ViewBindings.findChildViewById(rootView, id);
      if (imgKomunitas2 == null) {
        break missingId;
      }

      id = R.id.komunitas;
      TextView komunitas = ViewBindings.findChildViewById(rootView, id);
      if (komunitas == null) {
        break missingId;
      }

      id = R.id.komunitas1;
      TextView komunitas1 = ViewBindings.findChildViewById(rootView, id);
      if (komunitas1 == null) {
        break missingId;
      }

      id = R.id.komunitas2;
      TextView komunitas2 = ViewBindings.findChildViewById(rootView, id);
      if (komunitas2 == null) {
        break missingId;
      }

      id = R.id.layout2;
      LinearLayout layout2 = ViewBindings.findChildViewById(rootView, id);
      if (layout2 == null) {
        break missingId;
      }

      id = R.id.layout3;
      LinearLayout layout3 = ViewBindings.findChildViewById(rootView, id);
      if (layout3 == null) {
        break missingId;
      }

      id = R.id.recyleview;
      RecyclerView recyleview = ViewBindings.findChildViewById(rootView, id);
      if (recyleview == null) {
        break missingId;
      }

      return new FragmentKomunitasBinding((FrameLayout) rootView, btnPost, imgKomunitas,
          imgKomunitas2, komunitas, komunitas1, komunitas2, layout2, layout3, recyleview);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
