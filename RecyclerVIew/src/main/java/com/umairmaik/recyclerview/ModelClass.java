package com.umairmaik.recyclerview;

public class ModelClass {
	private int imageView;
	private String nameTextView;
	private String timeTextView;
	private String msgTextView;
	private String msgDivider;

	public ModelClass(int imageView, String nameTextView, String timeTextView, String msgTextView,String msgDivider) {
		this.imageView = imageView;
		this.nameTextView = nameTextView;
		this.timeTextView = timeTextView;
		this.msgTextView = msgTextView;
		this.msgDivider = msgDivider;
	}

	public int getImageView() {
		return imageView;
	}

	public void setImageView(int imageView) {
		this.imageView = imageView;
	}

	public String getNameTextView() {
		return nameTextView;
	}

	public void setNameTextView(String nameTextView) {
		this.nameTextView = nameTextView;
	}

	public String getTimeTextView() {
		return timeTextView;
	}

	public void setTimeTextView(String timeTextView) {
		this.timeTextView = timeTextView;
	}

	public String getMsgTextView() {
		return msgTextView;
	}

	public void setMsgTextView(String msgTextView) {
		this.msgTextView = msgTextView;
	}

	public String getMsgDivider() {
		return msgDivider;
	}

	public void setMsgDivider(String msgDivider) {
		this.msgDivider = msgDivider;
	}

}
