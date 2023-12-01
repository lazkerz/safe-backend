// Generated by view binder compiler. Do not edit!
package com.example.aplikasisafe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
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

public final class ActivityDaftarKerjaBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton back2;

  @NonNull
  public final ImageButton bell2;

  @NonNull
  public final AppCompatButton btnRegisterKerja;

  @NonNull
  public final EditText editemail1;

  @NonNull
  public final EditText editkontak;

  @NonNull
  public final EditText editnama;

  @NonNull
  public final EditText editpendidikan;

  @NonNull
  public final EditText editupload;

  @NonNull
  public final LinearLayout linearLayout1;

  @NonNull
  public final TextView teksPt1;

  @NonNull
  public final TextView textNama;

  @NonNull
  public final TextView textPesanUpload;

  @NonNull
  public final TextView textemail1;

  @NonNull
  public final TextView textkontak;

  @NonNull
  public final TextView textpendidikan;

  @NonNull
  public final TextView textupload;

  private ActivityDaftarKerjaBinding(@NonNull ConstraintLayout rootView, @NonNull ImageButton back2,
      @NonNull ImageButton bell2, @NonNull AppCompatButton btnRegisterKerja,
      @NonNull EditText editemail1, @NonNull EditText editkontak, @NonNull EditText editnama,
      @NonNull EditText editpendidikan, @NonNull EditText editupload,
      @NonNull LinearLayout linearLayout1, @NonNull TextView teksPt1, @NonNull TextView textNama,
      @NonNull TextView textPesanUpload, @NonNull TextView textemail1, @NonNull TextView textkontak,
      @NonNull TextView textpendidikan, @NonNull TextView textupload) {
    this.rootView = rootView;
    this.back2 = back2;
    this.bell2 = bell2;
    this.btnRegisterKerja = btnRegisterKerja;
    this.editemail1 = editemail1;
    this.editkontak = editkontak;
    this.editnama = editnama;
    this.editpendidikan = editpendidikan;
    this.editupload = editupload;
    this.linearLayout1 = linearLayout1;
    this.teksPt1 = teksPt1;
    this.textNama = textNama;
    this.textPesanUpload = textPesanUpload;
    this.textemail1 = textemail1;
    this.textkontak = textkontak;
    this.textpendidikan = textpendidikan;
    this.textupload = textupload;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDaftarKerjaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDaftarKerjaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_daftar_kerja, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDaftarKerjaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back2;
      ImageButton back2 = ViewBindings.findChildViewById(rootView, id);
      if (back2 == null) {
        break missingId;
      }

      id = R.id.bell2;
      ImageButton bell2 = ViewBindings.findChildViewById(rootView, id);
      if (bell2 == null) {
        break missingId;
      }

      id = R.id.btn_registerKerja;
      AppCompatButton btnRegisterKerja = ViewBindings.findChildViewById(rootView, id);
      if (btnRegisterKerja == null) {
        break missingId;
      }

      id = R.id.editemail1;
      EditText editemail1 = ViewBindings.findChildViewById(rootView, id);
      if (editemail1 == null) {
        break missingId;
      }

      id = R.id.editkontak;
      EditText editkontak = ViewBindings.findChildViewById(rootView, id);
      if (editkontak == null) {
        break missingId;
      }

      id = R.id.editnama;
      EditText editnama = ViewBindings.findChildViewById(rootView, id);
      if (editnama == null) {
        break missingId;
      }

      id = R.id.editpendidikan;
      EditText editpendidikan = ViewBindings.findChildViewById(rootView, id);
      if (editpendidikan == null) {
        break missingId;
      }

      id = R.id.editupload;
      EditText editupload = ViewBindings.findChildViewById(rootView, id);
      if (editupload == null) {
        break missingId;
      }

      id = R.id.linearLayout1;
      LinearLayout linearLayout1 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout1 == null) {
        break missingId;
      }

      id = R.id.teks_pt1;
      TextView teksPt1 = ViewBindings.findChildViewById(rootView, id);
      if (teksPt1 == null) {
        break missingId;
      }

      id = R.id.text_nama;
      TextView textNama = ViewBindings.findChildViewById(rootView, id);
      if (textNama == null) {
        break missingId;
      }

      id = R.id.text_pesan_upload;
      TextView textPesanUpload = ViewBindings.findChildViewById(rootView, id);
      if (textPesanUpload == null) {
        break missingId;
      }

      id = R.id.textemail1;
      TextView textemail1 = ViewBindings.findChildViewById(rootView, id);
      if (textemail1 == null) {
        break missingId;
      }

      id = R.id.textkontak;
      TextView textkontak = ViewBindings.findChildViewById(rootView, id);
      if (textkontak == null) {
        break missingId;
      }

      id = R.id.textpendidikan;
      TextView textpendidikan = ViewBindings.findChildViewById(rootView, id);
      if (textpendidikan == null) {
        break missingId;
      }

      id = R.id.textupload;
      TextView textupload = ViewBindings.findChildViewById(rootView, id);
      if (textupload == null) {
        break missingId;
      }

      return new ActivityDaftarKerjaBinding((ConstraintLayout) rootView, back2, bell2,
          btnRegisterKerja, editemail1, editkontak, editnama, editpendidikan, editupload,
          linearLayout1, teksPt1, textNama, textPesanUpload, textemail1, textkontak, textpendidikan,
          textupload);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
