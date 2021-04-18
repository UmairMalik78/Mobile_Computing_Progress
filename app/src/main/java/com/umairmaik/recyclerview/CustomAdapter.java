package com.umairmaik.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
	private List<ModelClass> itemsList;

	public CustomAdapter(List<ModelClass> modelClassList) {
		this.itemsList = modelClassList;
	}

	@NonNull
	@Override
	public CustomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design, parent, false);
		return new ViewHolder(view);
	}

	@Override
	public void onBindViewHolder(@NonNull CustomAdapter.ViewHolder holder, int position) {
		int imgResource = itemsList.get(position).getImageView();
		String msgText = itemsList.get(position).getMsgTextView();
		String timeText = itemsList.get(position).getTimeTextView();
		String nameText = itemsList.get(position).getNameTextView();
		String msgDivider = itemsList.get(position).getMsgDivider();
		holder.setData(imgResource, nameText, msgText, timeText, msgDivider);
	}

	@Override
	public int getItemCount() {
		return itemsList.size();
	}

	public static class ViewHolder extends RecyclerView.ViewHolder {
		private final ImageView imageView;
		private final TextView msgTextView;
		private final TextView nameTextView;
		private final TextView timeTextView;
		private final TextView messageDivider;

		public ViewHolder(@NonNull View itemView) {
			super(itemView);
			imageView = itemView.findViewById(R.id.imageView);
			nameTextView = itemView.findViewById(R.id.nameTextView);
			timeTextView = itemView.findViewById(R.id.timeTextView);
			msgTextView = itemView.findViewById(R.id.messageTextView);
			messageDivider = itemView.findViewById(R.id.dividerTextView);
		}

		public void setData(int imgResource, String nameText, String msgText, String timeText, String msgDivider) {
			imageView.setImageResource(imgResource);
			nameTextView.setText(nameText);
			timeTextView.setText(timeText);
			msgTextView.setText(msgText);
			messageDivider.setText(msgDivider);
		}
	}
}
