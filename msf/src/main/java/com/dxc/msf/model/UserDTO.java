package com.dxc.msf.model;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import net.sourceforge.jtds.jdbc.DateTime;


@Entity(name="Users")
public class UserDTO extends AbstractDTO {

	private static final long serialVersionUID = 1L;
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userID;
	
	@Column(name = "userName")
	private String userName;
	
	
	@Column(name = "userPassword")
	private String userPassword;
	
	@Column(name = "isAdmin")
	private String isAdmin;
	
	@Column(name = "userRank")
	private String userRank;
	
	@Column(name = "userActive")
	private Integer userActive;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "createDate")
	private Date createDate;
	
	@Column(name = "deleteDate")
	private Date deleteDate;
	
	@Column(name = "lastModifyDate")
	private Date lastModifyDate;
	
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<FileDTO> fileList;
	
	@OneToMany(mappedBy = "downloadUser", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<DownloadDTO> downloadList;
	
	


	public int getUserID() {
		return userID;
	}


	public void setUserID(int userID) {
		this.userID = userID;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getIsAdmin() {
		return isAdmin;
	}


	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}


	public String getUserRank() {
		return userRank;
	}


	public void setUserRank(String userRank) {
		this.userRank = userRank;
	}
	
	public Integer getUserActive() {
		return userActive;
	}


	public void setUserActive(Integer userActive) {
		this.userActive = userActive;
	}



	public List<FileDTO> getFileList() {
		return fileList;
	}


	public void setFileList(List<FileDTO> fileList) {
		this.fileList = fileList;
	}


	public List<DownloadDTO> getDownloadList() {
		return downloadList;
	}


	public void setDownloadList(List<DownloadDTO> downloadList) {
		this.downloadList = downloadList;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	public Date getDeleteDate() {
		return deleteDate;
	}


	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}
	
	

	public Date getLastModifyDate() {
		return lastModifyDate;
	}


	public void setLastModifyDate(Date lastModifyDate) {
		this.lastModifyDate = lastModifyDate;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
//	 @ManyToMany(cascade = CascadeType.ALL)
//	 @JoinTable(name = "downloads", joinColumns = @JoinColumn(name = "user_ID", referencedColumnName = "userID"), inverseJoinColumns = @JoinColumn(name = "file_ID", referencedColumnName = "fileID"))
//	 private Set<FileDTO> downloadFiles;
//	 public Set<FileDTO> getDownloadFiles() {
//	        return downloadFiles;
//	 }

}
