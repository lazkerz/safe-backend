// Generated by view binder compiler. Do not edit!
package com.example.aplikasisafe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.aplikasisafe.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityJobBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton btnKategori;

  @NonNull
  public final AppCompatButton btnSimpan;

  @NonNull
  public final ImageButton iconBell;

  @NonNull
  public final ImageButton iconSearch;

  @NonNull
  public final ImageButton image1;

  @NonNull
  public final RecyclerView kerjaRecyclerView;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final Space space1;

  @NonNull
  public final TextView txtKerja;

  private ActivityJobBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton btnKategori, @NonNull AppCompatButton btnSimpan,
      @NonNull ImageButton iconBell, @NonNull ImageButton iconSearch, @NonNull ImageButton image1,
      @NonNull RecyclerView kerjaRecyclerView, @NonNull LinearLayout linearLayout,
      @NonNull Space space1, @NonNull TextView txtKerja) {
    this.rootView = rootView;
    this.btnKategori = btnKategori;
    this.btnSimpan = btnSimpan;
    this.iconBell = iconBell;
    this.iconSearch = iconSearch;
    this.image1 = image1;
    this.kerjaRecyclerView = kerjaRecyclerView;
    this.linearLayout = linearLayout;
    this.space1 = space1;
    this.txtKerja = txtKerja;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityJobBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityJobBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_job, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityJobBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_kategori;
      AppCompatButton btnKategori = ViewBindings.findChildViewById(rootView, id);
      if (btnKategori == null) {
        break missingId;
      }

      id = R.id.btn_simpan;
      AppCompatButton btnSimpan = ViewBindings.findChildViewById(rootView, id);
      if (btnSimpan == null) {
        break missingId;
      }

      id = R.id.icon_bell;
      ImageButton iconBell = ViewBindings.findChildViewById(rootView, id);
      if (iconBell == null) {
        break missingId;
      }

      id = R.id.icon_search;
      ImageButton iconSearch = ViewBindings.findChildViewById(rootView, id);
      if (iconSearch == null) {
        break missingId;
      }

      id = R.id.image1;
      ImageButton image1 = ViewBindings.findChildViewById(rootView, id);
      if (image1 == null) {
        break missingId;
      }

      id = R.id.kerjaRecyclerView;
      RecyclerView kerjaRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (kerjaRecyclerView == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.space1;
      Space space1 = ViewBindings.findChildViewById(rootView, id);
      if (space1 == null) {
        break missingId;
      }

      id = R.id.txt_kerja;
      TextView txtKerja = ViewBindings.findChildViewById(rootView, id);
      if (txtKerja == null) {
        break missingId;
      }

      return new ActivityJobBinding((ConstraintLayout) rootView, btnKategori, btnSimpan, iconBell,
          iconSearch, image1, kerjaRecyclerView, linearLayout, space1, txtKerja);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
