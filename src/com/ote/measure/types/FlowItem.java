package com.ote.measure.types;

import java.io.Serializable;
import java.util.HashMap;

public class FlowItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4480062324313632838L;
	private String Caption;
	private String description;
	private boolean visible;
	private boolean enabled;

	
	
	
	public FlowItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FlowItem(String caption, String description, boolean visible, boolean enabled) {
		super();
		Caption = caption;
		this.description = description;
		this.visible = visible;
		this.enabled = enabled;
	}

	public String getCaption() {
		return Caption;
	}

	public void setCaption(String caption) {
		Caption = caption;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
