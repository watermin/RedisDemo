package com.coinvs.entity;

import java.io.Serializable;

/**
    * �ֲ�ͼ��ʵ����
    * Fri Nov 13 10:19:07 CST 2015 ��֮Դ
    */ 


public class Banner implements Serializable{
	private String id;
	private String title;
	private String img_pc;//pc��ͼ
	private String img_wap;//�ƶ�����ͼ
	private String url_pc;//pc���ӵ�ַ
	private String url_wap;//�ƶ������ӵ�ַ
	private String sort;//����
	private String stop;//�Ƿ�ͣ��
	private TotalNote note;//
	/**
	 * �ֲ�ͼ��serialVersionUID
	 */
	private static final long serialVersionUID = 1112L;
	
	public void setId(String id){
	this.id=id;
	}
	public String getId(){
		return id;
	}
	public void setTitle(String title){
	this.title=title;
	}
	public String getTitle(){
		return title;
	}
	public void setImg_pc(String img_pc){
	this.img_pc=img_pc;
	}
	public String getImg_pc(){
		return img_pc;
	}
	public void setImg_wap(String img_wap){
	this.img_wap=img_wap;
	}
	public String getImg_wap(){
		return img_wap;
	}
	public void setUrl_pc(String url_pc){
	this.url_pc=url_pc;
	}
	public String getUrl_pc(){
		return url_pc;
	}
	public void setUrl_wap(String url_wap){
	this.url_wap=url_wap;
	}
	public String getUrl_wap(){
		return url_wap;
	}
	public void setSort(String sort){
	this.sort=sort;
	}
	public String getSort(){
		return sort;
	}
	public void setStop(String stop){
	this.stop=stop;
	}
	public String getStop(){
		return stop;
	}
	
	public TotalNote getNote() {
		return note;
	}
	public void setNote(TotalNote note) {
		this.note = note;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((img_pc == null) ? 0 : img_pc.hashCode());
		result = prime * result + ((img_wap == null) ? 0 : img_wap.hashCode());
		result = prime * result + ((sort == null) ? 0 : sort.hashCode());
		result = prime * result + ((stop == null) ? 0 : stop.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((url_pc == null) ? 0 : url_pc.hashCode());
		result = prime * result + ((url_wap == null) ? 0 : url_wap.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Banner other = (Banner) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (img_pc == null) {
			if (other.img_pc != null)
				return false;
		} else if (!img_pc.equals(other.img_pc))
			return false;
		if (img_wap == null) {
			if (other.img_wap != null)
				return false;
		} else if (!img_wap.equals(other.img_wap))
			return false;
		if (sort == null) {
			if (other.sort != null)
				return false;
		} else if (!sort.equals(other.sort))
			return false;
		if (stop == null) {
			if (other.stop != null)
				return false;
		} else if (!stop.equals(other.stop))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (url_pc == null) {
			if (other.url_pc != null)
				return false;
		} else if (!url_pc.equals(other.url_pc))
			return false;
		if (url_wap == null) {
			if (other.url_wap != null)
				return false;
		} else if (!url_wap.equals(other.url_wap))
			return false;
		return true;
	}
	public String toString(){
		return id+","+title+","+img_pc+","+img_wap+","+url_pc+","+url_wap+","+sort+","+stop;
	}
	
}

