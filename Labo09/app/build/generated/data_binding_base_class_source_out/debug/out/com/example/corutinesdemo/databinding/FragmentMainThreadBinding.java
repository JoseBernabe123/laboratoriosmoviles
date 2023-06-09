// Generated by view binder compiler. Do not edit!
package com.example.corutinesdemo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.corutinesdemo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMainThreadBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button counterButtonMt;

  @NonNull
  public final TextView counterTextViewMt;

  @NonNull
  public final Button downloadButtonMt;

  @NonNull
  public final TextView messageTextViewMt;

  private FragmentMainThreadBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button counterButtonMt, @NonNull TextView counterTextViewMt,
      @NonNull Button downloadButtonMt, @NonNull TextView messageTextViewMt) {
    this.rootView = rootView;
    this.counterButtonMt = counterButtonMt;
    this.counterTextViewMt = counterTextViewMt;
    this.downloadButtonMt = downloadButtonMt;
    this.messageTextViewMt = messageTextViewMt;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMainThreadBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMainThreadBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_main_thread, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMainThreadBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.counter_button_mt;
      Button counterButtonMt = ViewBindings.findChildViewById(rootView, id);
      if (counterButtonMt == null) {
        break missingId;
      }

      id = R.id.counter_text_view_mt;
      TextView counterTextViewMt = ViewBindings.findChildViewById(rootView, id);
      if (counterTextViewMt == null) {
        break missingId;
      }

      id = R.id.download_button_mt;
      Button downloadButtonMt = ViewBindings.findChildViewById(rootView, id);
      if (downloadButtonMt == null) {
        break missingId;
      }

      id = R.id.message_text_view_mt;
      TextView messageTextViewMt = ViewBindings.findChildViewById(rootView, id);
      if (messageTextViewMt == null) {
        break missingId;
      }

      return new FragmentMainThreadBinding((ConstraintLayout) rootView, counterButtonMt,
          counterTextViewMt, downloadButtonMt, messageTextViewMt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
