package stream.dto;

/**
 * 処理対象のDTO(想定)
 * @author fiorenzia
 *
 */
public class StreamInfoDto {
	
	public StreamInfoDto(String id, String num, String date) {
		this.personalId=id;
		this.accountNum = num;
		this.scheduledExecuteDate = date;
	}
	
	/** 個人ID */
	String personalId;
	/** アカウント番号 */
	String accountNum;
	/** 実行予定日 */
	String scheduledExecuteDate;
	
	public String getPersonalId() {
		return this.personalId;
	}
	
	public String getAccountNum() {
		return this.accountNum;
	}
	
	public String getScheduledExecuteDate() {
		return this.scheduledExecuteDate;
	}
}
