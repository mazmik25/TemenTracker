package wmotion.co.id.temantreker;

import android.content.Context;
import android.os.Binder;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FriendsListAdapter extends RecyclerView.Adapter<FriendsListAdapter.ViewHolder> {

    public interface OnItemClickListener {
        void OnItemClick(int position);
    }

    private Context context;
    private OnItemClickListener listener;

    public FriendsListAdapter(Context context, OnItemClickListener listener) {
        this.context = context;
        this.listener = listener;
    }

    // uncomment this section to attach friend list to adapter
    // private List<Friend> friendList;

    /**
     * uncomment this section to connect adapter to the list
     * after getting the real time database of friends list

        public FriendsListAdapter(Context context, List<Friend> friendList) {
            this.context = context;
            this.friendList = friendList;
        }

     */

    @NonNull
    @Override
    public FriendsListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).
                inflate(R.layout.friends_item_layout, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FriendsListAdapter.ViewHolder holder, int position) {
        final int viewPosition = position;
        Integer avatar = TemporaryData.friendsAvatar.get(viewPosition);
        String name = TemporaryData.friendsName.get(viewPosition);

        holder.avatarImageView.setImageResource(avatar);
        holder.friendNameTextView.setText(name);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.OnItemClick(viewPosition);
            }
        });
    }

    @Override
    public int getItemCount() {
        //return friendList.size();
        return TemporaryData.friendsAvatar.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.avatarImageView)
        ImageView avatarImageView;

        @BindView(R.id.friendsNameTextView)
        TextView friendNameTextView;

        ViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }
}
