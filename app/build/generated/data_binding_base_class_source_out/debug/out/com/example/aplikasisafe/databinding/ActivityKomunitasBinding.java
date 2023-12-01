// Generated by view binder compiler. Do not edit!
package com.example.aplikasisafe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.SearchView;
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

public final class ActivityKomunitasBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton backPelatihan;

  @NonNull
  public final LinearLayout barKomunitas;

  @NonNull
  public final AppCompatButton btnPelatihan;

  @NonNull
  public final AppCompatButton btnRiwayat;

  @NonNull
  public final LinearLayout layoutKomunitas;

  @NonNull
  public final ImageButton riwayatKomunitas;

  @NonNull
  public final RecyclerView rvKomunitas;

  @NonNull
  public final SearchView searchPelatihan;

  private ActivityKomunitasBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton backPelatihan, @NonNull LinearLayout barKomunitas,
      @NonNull AppCompatButton btnPelatihan, @NonNull AppCompatButton btnRiwayat,
      @NonNull LinearLayout layoutKomunitas, @NonNull ImageButton riwayatKomunitas,
      @NonNull RecyclerView rvKomunitas, @NonNull SearchView searchPelatihan) {
    this.rootView = rootView;
    this.backPelatihan = backPelatihan;
    this.barKomunitas = barKomunitas;
    this.btnPelatihan = btnPelatihan;
    this.btnRiwayat = btnRiwayat;
    this.layoutKomunitas = layoutKomunitas;
    this.riwayatKomunitas = riwayatKomunitas;
    this.rvKomunitas = rvKomunitas;
    this.searchPelatihan = searchPelatihan;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityKomunitasBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityKomunitasBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_komunitas, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityKomunitasBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backPelatihan;
      ImageButton backPelatihan = ViewBindings.findChildViewById(rootView, id);
      if (backPelatihan == null) {
        break missingId;
      }

      id = R.id.bar_komunitas;
      LinearLayout barKomunitas = ViewBindings.findChildViewById(rootView, id);
      if (barKomunitas == null) {
        break missingId;
      }

      id = R.id.btn_pelatihan;
      AppCompatButton btnPelatihan = ViewBindings.findChildViewById(rootView, id);
      if (btnPelatihan == null) {
        break missingId;
      }

      id = R.id.btn_riwayat;
      AppCompatButton btnRiwayat = ViewBindings.findChildViewById(rootView, id);
      if (btnRiwayat == null) {
        break missingId;
      }

      id = R.id.layoutKomunitas;
      LinearLayout layoutKomunitas = ViewBindings.findChildViewById(rootView, id);
      if (layoutKomunitas == null) {
        break missingId;
      }

      id = R.id.riwayat_komunitas;
      ImageButton riwayatKomunitas = ViewBindings.findChildViewById(rootView, id);
      if (riwayatKomunitas == null) {
        break missingId;
      }

      id = R.id.rv_komunitas;
      RecyclerView rvKomunitas = ViewBindings.findChildViewById(rootView, id);
      if (rvKomunitas == null) {
        break missingId;
      }

      id = R.id.searchPelatihan;
      SearchView searchPelatihan = ViewBindings.findChildViewById(rootView, id);
      if (searchPelatihan == null) {
        break missingId;
      }

      return new ActivityKomunitasBinding((ConstraintLayout) rootView, backPelatihan, barKomunitas,
          btnPelatihan, btnRiwayat, layoutKomunitas, riwayatKomunitas, rvKomunitas,
          searchPelatihan);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
