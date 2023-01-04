package tr.edu.medipol.yoa.metin;

import org.apache.commons.lang3.StringUtils;

public class MetinIslemleri2 {

	public static String bosluklariTemizle(String orjinalMetin) {
		if (orjinalMetin == null) 
		{
			return "";
		}
		String sonuc = StringUtils.deleteWhitespace(orjinalMetin); 
		return sonuc;

	}

}
