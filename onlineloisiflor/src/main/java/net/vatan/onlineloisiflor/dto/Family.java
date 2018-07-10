package net.vatan.onlineloisiflor.dto;

public class Family {
	/**
	 * Private fields
	 */
	private long idFamily;
	private String nameFamily;
	private String descriptionF;
	private byte[] photoFamily;
	private String imageURLFamily;
	private boolean activeF = true;
	
//	public Family(String nameFamily, String descriptionF, byte[] photoFamily,
//			String imageURLFamily, boolean activeF) {
//		super();
//		this.nameFamily = nameFamily;
//		this.descriptionF = descriptionF;
//		this.photoFamily = photoFamily;
//		this.imageURLFamily = imageURLFamily;
//		this.activeF = activeF;
//	}
	
//	public Family(long idFamily, String nameFamily, String descriptionF,
//		byte[] photoFamily, String imageURLFamily, boolean activeF) {
//	super();
//	this.idFamily = idFamily;
//	this.nameFamily = nameFamily;
//	this.descriptionF = descriptionF;
//	this.photoFamily = photoFamily;
//	this.imageURLFamily = imageURLFamily;
//	this.activeF = activeF;
//	}

	public String getNameFamily() {
		return nameFamily;
	}

	public long getIdFamily() {
		return idFamily;
	}
	
	public void setIdFamily(long idFamily) {
		this.idFamily = idFamily;
	}
	
	public void setNameFamily(String nameFamily) {
		this.nameFamily = nameFamily;
	}
	
	public String getDescriptionF() {
		return descriptionF;
	}
	
	public void setDescriptionF(String descriptionF) {
		this.descriptionF = descriptionF;
	}
	
	public byte[] getPhotoFamily() {
		return photoFamily;
	}
	
	
	public void setPhotoFamily(byte[] photoFamily) {
		this.photoFamily = photoFamily;
	}
	public String getImageURLFamily() {
		return imageURLFamily;
	}
	
	public void setImageURLFamily(String imageURLFamily) {
		this.imageURLFamily = imageURLFamily;
	}
	
	public boolean isActiveF() {
		return activeF;
	}
	
	public void setActiveF(boolean activeF) {
		this.activeF = activeF;
	}
	

	
	
	
	
}
