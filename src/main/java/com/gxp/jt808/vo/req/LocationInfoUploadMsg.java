package com.gxp.jt808.vo.req;




import java.util.Date;

import com.gxp.jt808.vo.PackageData;

/**
 * 位置信息汇报消息
 *
 * @author hylexus
 *
 */
public class LocationInfoUploadMsg extends PackageData {
	// 告警信息
	// byte[0-3]
	private int warningFlagField;
	// byte[4-7] 状态(DWORD(32))
	private int statusField;
	// byte[8-11] 纬度(DWORD(32))
	private double latitude;
	// byte[12-15] 经度(DWORD(32))
	private double longitude;
	// byte[16-17] 高程(WORD(16)) 海拔高度，单位为米（ m）
	// TODO ==>int?海拔
	private int elevation;
	// byte[18-19] 速度(WORD) 1/10km/h
	// TODO ==>float?速度
	private float speed;
	// byte[20-21] 方向(WORD) 0-359，正北为 0，顺时针
	private int direction;
	// byte[22-x] 时间(BCD[6]) yyMMddHHmmss
	// GMT+8 时间，本标准中之后涉及的时间均采用此时区
	private String dateTime;

	public LocationInfoUploadMsg() {
	}

	public LocationInfoUploadMsg(PackageData packageData) {
		this();
		this.channel = packageData.getChannel();
		this.checkSum = packageData.getCheckSum();
		this.msgBodyBytes = packageData.getMsgBodyBytes();
		this.msgHeader = packageData.getMsgHeader();
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public int getElevation() {
		return elevation;
	}

	public void setElevation(int elevation) {
		this.elevation = elevation;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}
 

	/**
	 * @return the dataTime
	 */
	public String getDateTime() {
		return dateTime;
	}

	/**
	 * @param dataTime the dataTime to set
	 */
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public int getWarningFlagField() {
		return warningFlagField;
	}

	public void setWarningFlagField(int warningFlagField) {
		this.warningFlagField = warningFlagField;
	}

	public int getStatusField() {
		return statusField;
	}

	public void setStatusField(int statusField) {
		this.statusField = statusField;
	}

	@Override
	public String toString() {
		return "LocationInfoUploadMsg [warningFlagField=" + warningFlagField + ", statusField=" + statusField
				+ ", latitude=" + latitude + ", longitude=" + longitude + ", elevation=" + elevation + ", speed="
				+ speed + ", direction=" + direction + ", dateTime=" + dateTime + "]";
	}

}
