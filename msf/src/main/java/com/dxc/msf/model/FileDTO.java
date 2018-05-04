package com.dxc.msf.model;

import java.util.HashSet;
import java.util.List;
import java.util.Locale.Category;
import java.util.Set;

import javax.persistence.*;

@Entity(name="Files")
public class FileDTO extends AbstractDTO{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fileID;
	
	@Column(name = "fileName")
	private String fileName;
	
	@Column(name = "fileSize")
	private Double fileSize;
	
	@Column(name = "description")
	private String description;
	
	@ManyToOne
	private CategoryDTO category;
	
    @ManyToOne
	private UserDTO user;
	
	@OneToMany(mappedBy = "downloadFile", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<DownloadDTO> downloadList;
	

	public String getFileName() {
		return fileName;
	}

	public int getFileID() {
		return fileID;
	}

	public void setFileID(int fileID) {
		this.fileID = fileID;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Double getFileSize() {
		return fileSize;
	}

	public void setFileSize(Double fileSize) {
		this.fileSize = fileSize;
	}
	
    public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@JoinColumn(name = "categoryID")
	public CategoryDTO getCategory() {
		return category;
	}
    
	public void setCategory(CategoryDTO category) {
		this.category = category;
	}
    

	
    @JoinColumn(name = "userID")
	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public List<DownloadDTO> getDownloadList() {
		return downloadList;
	}

	public void setDownloadList(List<DownloadDTO> downloadList) {
		this.downloadList = downloadList;
	}
	

}
