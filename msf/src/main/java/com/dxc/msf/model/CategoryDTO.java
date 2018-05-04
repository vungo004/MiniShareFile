package com.dxc.msf.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;


@Entity(name="Categories")
public class CategoryDTO extends AbstractDTO{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categoryID;
	
	@Column(name = "categoryName")
	private String categoryName;
	
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<FileDTO> fileList;
	
	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<FileDTO> getFileList() {
		return fileList;
	}

	public void setFileList(List<FileDTO> fileList) {
		this.fileList = fileList;
	}
	
}
