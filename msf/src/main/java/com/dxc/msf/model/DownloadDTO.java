package com.dxc.msf.model;

import javax.persistence.*;

@Entity(name="Downloads")
public class DownloadDTO extends AbstractDTO{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int downloadID;
	
	@Column(name = "downloadDate")
	private String downloadDate;
	
    @ManyToOne
    private FileDTO downloadFile;
    
    @ManyToOne
    private UserDTO downloadUser;
	
	
	public int getDownloadID() {
		return downloadID;
	}

	public void setDownloadID(int downloadID) {
		this.downloadID = downloadID;
	}

	public String getDownloadDate() {
		return downloadDate;
	}

	public void setDownloadDate(String downloadDate) {
		this.downloadDate = downloadDate;
	}

	@JoinColumn(name = "userID")
 	public UserDTO getDownloadUser() {
        return downloadUser;
    }

    public void setDownloadUser(UserDTO downloadUser) {
		this.downloadUser = downloadUser;
	}

	@JoinColumn(name = "fileID")
    public FileDTO getDownloadFile() {
        return downloadFile;
    }

	public void setDownloadFile(FileDTO downloadFile) {
		this.downloadFile = downloadFile;
	}
	

}
