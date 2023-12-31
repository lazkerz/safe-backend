// Generated by view binder compiler. Do not edit!
package com.example.aplikasisafe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.aplikasisafe.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MenuAtasBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView back1;

  @NonNull
  public final ImageView bell1;

  @NonNull
  public final TextView teksPt0;

  private MenuAtasBinding(@NonNull RelativeLayout rootView, @NonNull ImageView back1,
      @NonNull ImageView bell1, @NonNull TextView teksPt0) {
    this.rootView = rootView;
    this.back1 = back1;
    this.bell1 = bell1;
    this.teksPt0 = teksPt0;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MenuAtasBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MenuAtasBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.menu_atas, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MenuAtasBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back1;
      ImageView back1 = ViewBindings.findChildViewById(rootView, id);
      if (back1 == null) {
        break missingId;
      }

      id = R.id.bell1;
      ImageView bell1 = ViewBindings.findChildViewById(rootView, id);
      if (bell1 == null) {
        break missingId;
      }

      id = R.id.teks_pt0;
      TextView teksPt0 = ViewBindings.findChildViewById(rootView, id);
      if (teksPt0 == null) {
        break missingId;
      }

      return new MenuAtasBinding((RelativeLayout) rootView, back1, bell1, teksPt0);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
