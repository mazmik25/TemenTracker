// Generated code from Butter Knife. Do not modify!
package wmotion.co.id.temantreker;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FriendsListAdapter$ViewHolder_ViewBinding implements Unbinder {
  private FriendsListAdapter.ViewHolder target;

  @UiThread
  public FriendsListAdapter$ViewHolder_ViewBinding(FriendsListAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.avatarImageView = Utils.findRequiredViewAsType(source, R.id.avatarImageView, "field 'avatarImageView'", ImageView.class);
    target.friendNameTextView = Utils.findRequiredViewAsType(source, R.id.friendsNameTextView, "field 'friendNameTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FriendsListAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.avatarImageView = null;
    target.friendNameTextView = null;
  }
}
