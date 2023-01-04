package tr.edu.medipol.yoa.metin;

import static org.junit.Assert.*;

import org.junit.Test;

public class MetinIslemleri2Test {

	@Test
	public void testBosluklariTemizle() {
		// GIVE - On Hazirliklar
		String orjinalMetin = "Uc tas hos     ho  saf  . . .";
		
		// WHEN - Asil Testi Gerceklestir
		String sonuc = MetinIslemleri2.bosluklariTemizle(orjinalMetin);
		
		// THEN - Kontroller
		assertEquals("Uctashoshosaf...", sonuc);
	}
	
	@Test
	public void testBosluklariTemizle2() {
		// GIVE - On Hazirliklar
		String orjinalMetin = "Mer ha   ba . .. ";
		
		// WHEN - Asil Testi Gerceklestir
		String sonuc = MetinIslemleri2.bosluklariTemizle(orjinalMetin);
		
		// THEN - Kontroller
		assertEquals("Merhaba...", sonuc);

}
}
