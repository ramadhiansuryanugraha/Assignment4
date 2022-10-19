// Generated by view binder compiler. Do not edit!
package com.example.unj.cs.hw4.coffeeapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.unj.cs.hw4.coffeeapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDescriptionBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView descdesc;

  @NonNull
  public final TextView desctittle;

  @NonNull
  public final TextView fulldesc;

  @NonNull
  public final ImageView imagedesc;

  private ActivityDescriptionBinding(@NonNull LinearLayout rootView, @NonNull TextView descdesc,
      @NonNull TextView desctittle, @NonNull TextView fulldesc, @NonNull ImageView imagedesc) {
    this.rootView = rootView;
    this.descdesc = descdesc;
    this.desctittle = desctittle;
    this.fulldesc = fulldesc;
    this.imagedesc = imagedesc;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDescriptionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDescriptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_description, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDescriptionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.descdesc;
      TextView descdesc = ViewBindings.findChildViewById(rootView, id);
      if (descdesc == null) {
        break missingId;
      }

      id = R.id.desctittle;
      TextView desctittle = ViewBindings.findChildViewById(rootView, id);
      if (desctittle == null) {
        break missingId;
      }

      id = R.id.fulldesc;
      TextView fulldesc = ViewBindings.findChildViewById(rootView, id);
      if (fulldesc == null) {
        break missingId;
      }

      id = R.id.imagedesc;
      ImageView imagedesc = ViewBindings.findChildViewById(rootView, id);
      if (imagedesc == null) {
        break missingId;
      }

      return new ActivityDescriptionBinding((LinearLayout) rootView, descdesc, desctittle, fulldesc,
          imagedesc);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
