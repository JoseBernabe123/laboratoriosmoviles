// Generated by data binding compiler. Do not edit!
package com.example.laboratorio11.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.laboratorio11.R;
import com.example.laboratorio11.ui.register.viewmodel.RegisterViewModel;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentRegisterBinding extends ViewDataBinding {
  @NonNull
  public final TextInputLayout emailEditText;

  @NonNull
  public final ImageView loginIcon;

  @NonNull
  public final TextInputLayout nameEditText;

  @NonNull
  public final TextInputLayout passwordEditText;

  @NonNull
  public final Button registerBtn;

  @Bindable
  protected RegisterViewModel mViewmodel;

  protected FragmentRegisterBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextInputLayout emailEditText, ImageView loginIcon, TextInputLayout nameEditText,
      TextInputLayout passwordEditText, Button registerBtn) {
    super(_bindingComponent, _root, _localFieldCount);
    this.emailEditText = emailEditText;
    this.loginIcon = loginIcon;
    this.nameEditText = nameEditText;
    this.passwordEditText = passwordEditText;
    this.registerBtn = registerBtn;
  }

  public abstract void setViewmodel(@Nullable RegisterViewModel viewmodel);

  @Nullable
  public RegisterViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_register, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentRegisterBinding>inflateInternal(inflater, R.layout.fragment_register, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_register, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentRegisterBinding>inflateInternal(inflater, R.layout.fragment_register, null, false, component);
  }

  public static FragmentRegisterBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentRegisterBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentRegisterBinding)bind(component, view, R.layout.fragment_register);
  }
}
