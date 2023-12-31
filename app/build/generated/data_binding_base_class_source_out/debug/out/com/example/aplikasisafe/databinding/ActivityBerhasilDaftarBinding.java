// Generated by view binder compiler. Do not edit!
package com.example.aplikasisafe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.aplikasisafe.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityBerhasilDaftarBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton bell3;

  @NonNull
  public final ImageButton btnBack;

  @NonNull
  public final AppCompatButton btnDoneHome;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final LinearLayout linearLayout3;

  @NonNull
  public final TextView textView4;

  private ActivityBerhasilDaftarBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton bell3, @NonNull ImageButton btnBack,
      @NonNull AppCompatButton btnDoneHome, @NonNull ImageView imageView2,
      @NonNull LinearLayout linearLayout3, @NonNull TextView textView4) {
    this.rootView = rootView;
    this.bell3 = bell3;
    this.btnBack = btnBack;
    this.btnDoneHome = btnDoneHome;
    this.imageView2 = imageView2;
    this.linearLayout3 = linearLayout3;
    this.textView4 = textView4;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityBerhasilDaftarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityBerhasilDaftarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_berhasil_daftar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityBerhasilDaftarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bell3;
      ImageButton bell3 = ViewBindings.findChildViewById(rootView, id);
      if (bell3 == null) {
        break missingId;
      }

      id = R.id.btn_back;
      ImageButton btnBack = ViewBindings.findChildViewById(rootView, id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.btn_doneHome;
      AppCompatButton btnDoneHome = ViewBindings.findChildViewById(rootView, id);
      if (btnDoneHome == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.linearLayout3;
      LinearLayout linearLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      return new ActivityBerhasilDaftarBinding((ConstraintLayout) rootView, bell3, btnBack,
          btnDoneHome, imageView2, linearLayout3, textView4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
