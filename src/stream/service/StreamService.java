package stream.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import stream.dto.StreamInfoDto;

/**
 * Streamを使用するクラス
 * @author kona
 *
 */
public class StreamService {

	public void execute() {
		System.out.println("Steram Service ===> START!");
		String today = getSystemDate();
		List<StreamInfoDto> dto = getStreamInfo(today);
		dto.stream().forEach(t->print(t));
		System.out.println("Steram Service ===> END!");
	}

	private String getSystemDate() {
		Date today = new Date();
		TimeZone timeZoneJP = TimeZone.getTimeZone("Asia/Tokyo");
		SimpleDateFormat fmt = new SimpleDateFormat();
		fmt.setTimeZone(timeZoneJP);
		System.out.println(fmt.format(today));
		return fmt.format(today);
	}

	// DBから値を取得して返却される想定のDTO
	private List<StreamInfoDto> getStreamInfo(String targetDate) {
		List<StreamInfoDto> result = new ArrayList<>();
		String date = getSystemDate();
		for (int i = 0; i < 100; i++) {
			result.add(new StreamInfoDto(String.format("%06d", i), String.format("%06d", i*2), date));
		}
		System.out.println(result.size());
		return result;
	}
	
	private void print(StreamInfoDto dto) {
		System.out.println("☆☆☆☆☆☆☆☆☆");
		System.out.println(dto.getPersonalId());
		System.out.println(dto.getAccountNum());
		System.out.println(dto.getScheduledExecuteDate());
		System.out.println("☆☆☆☆☆☆☆☆☆");
	}
	
}
