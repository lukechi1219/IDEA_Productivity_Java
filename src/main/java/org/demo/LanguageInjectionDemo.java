package org.demo;

/**
 * @author Luke Chi
 */
public class LanguageInjectionDemo {

	public static void main(String[] args) {

		//language=JSON
		String json = "{\n"
			+ "  \"timed_out\": false,\n"
			+ "  \"recomd_list\": [\n"
			+ "    {\n"
			+ "      \"name\": \"TP-Link Deco X25 AX1800 真Mesh 雙頻智慧無線網路WiFi 6分享器路由器 (3入)\",\n"
			+ "      \"score\": 98,\n"
			+ "      \"sale_price\": 9999,\n"
			+ "      \"category_code\": \"h24\",\n"
			+ "      \"msg\": \"熱門商品\",\n"
			+ "      \"msg_score\": 98\n"
			+ "    }\n"
			+ "    \n"
			+ "  ]\n"
			+ "}";

		String regex = "";

		// alt + enter -> inject language or reference
		String sql = "select 1 from dual";
	}

}
