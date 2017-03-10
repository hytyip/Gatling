package default

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseURL("http://sports.williamhill.com")
		.inferHtmlResources()
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-GB,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0")

	val headers_0 = Map(
		"Accept" -> "text/html, */*; q=0.01",
		"Origin" -> "http://sports.williamhill.com")

	val headers_4 = Map("Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")

	val headers_19 = Map("Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8")

	val headers_22 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Content-Type" -> "text/plain")

    val uri1 = "http://metrics.williamhill.com/b/ss/whg-intl-prod-v3,whgintltraf-prod/1/JS-1.5.1"
    val uri2 = "http://20763245p.rfihub.com/ca.html"
    val uri3 = "http://w.sports.williamhill.com"
    val uri4 = "http://trc.taboola.com/sg/rocketfuel-network/1/rtb-h"
    val uri5 = "http://20763234p.rfihub.com/ca.html"
    val uri6 = "http://sports.williamhill.com/slp/en-gb"
    val uri7 = "http://pushsc1.williamhill.com/push"
    val uri8 = "http://a.rfihub.com/pstats.html"

	val scn = scenario("RecordedSimulation")
		.exec(http("request_0")
			.get(uri3 + "/fragments/sidebarLeft/en-gb/homepage/home")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri3 + "/betting/en-gb.partial")
			.headers(headers_0),
            http("request_2")
			.get(uri3 + "/fragments/topBets/en-gb/homepage")
			.headers(headers_0),
            http("request_3")
			.get(uri3 + "/fragments/topBets/en-gb/homepage")
			.headers(headers_0),
            http("request_4")
			.get(uri5 + "?rfiidc=1040401894962900381&rfiaid=f36502773eb54534bb04af2623bd95ca&ver=9&rb=29987&ca=20763234&_o=29987&_t=20763234&pe=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&pf=&ra=07677620070615498")
			.headers(headers_4),
            http("request_5")
			.get(uri2 + "?rfiidc=1040401894962900381&rfiaid=f36502773eb54534bb04af2623bd95ca&ver=9&rb=29987&ca=20763245&_o=29987&_t=20763245&pe=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&pf=&ra=42223825273621307")
			.headers(headers_4),
            http("request_6")
			.get(uri1 + "/s98308599986019?AQB=1&ndh=1&pf=1&t=9%2F2%2F2017%2023%3A52%3A34%204%200&mid=86506162786843452209061728061415271602&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&cc=&server=sports.williamhill.com&aamb=NRX38WO0n5BH8Th-nqAG_A&c1=D%3Dg&c2=D%3Dv21&c3=D%3Dv22&c4=D%3Dv23&c5=D%3Dv24&c6=D%3Dv25&c7=D%3Dv26&c8=D%3Dv27&c9=D%3Dv28&v10=D%3Ds_vi&v12=Non-customer&v13=nonc&c14=D%3Dbw&v14=Not%20logged%20in&c15=11%3A52%20PM&c16=Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20WOW64%3B%20rv%3A47.0%29%20Gecko%2F20100101%20Firefox%2F47.0&v20=D%3Dg&v21=sports&v22=betting&c23=11%3A52%20PM%7CThursday&v23=Homepage&v24=en-gb&v25=default&v26=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&v27=Website&c28=TRAFALGAR&v28=&v42=fraction&v60=11%3A52%20PM%7CThursday&v63=Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20WOW64%3B%20rv%3A47.0%29%20Gecko%2F20100101%20Firefox%2F47.0&v67=TRAFALGAR&v118=Standard%20Browsing&v122=Flash%20disabled&v132=suggestionsEnabledLarge&s=1536x864&c=24&j=1.8.5&v=N&k=Y&bw=1372&bh=635&AQE=1"),
            http("request_7")
			.get(uri4 + "/?taboola_hm=1040401894962900381"),
            http("request_8")
			.get(uri4 + "/?taboola_hm=1040401894962900381"),
            http("request_9")
			.get(uri8 + "?rb=29987&ca=20763245&ri=b1ac098fdcb9db13a8dc489447f4515c&rfiidc=1040401894962900381&rfiaid=f36502773eb54534bb04af2623bd95ca&stats=%7B%2257419%22%3A%2280%2C2%22%7D&ra=803399782334417")
			.headers(headers_4),
            http("request_10")
			.get(uri8 + "?rb=29987&ca=20763234&ri=23619b902d69b62ae1d8677f9a47fb92&rfiidc=1040401894962900381&rfiaid=f36502773eb54534bb04af2623bd95ca&stats=%7B%2257419%22%3A%22151%2C2%22%7D&ra=5664237367441847")
			.headers(headers_4)))
		.pause(2)
		.exec(http("request_11")
			.get(uri1 + "/s9441180962206?AQB=1&ndh=1&pf=1&t=9%2F2%2F2017%2023%3A52%3A37%204%200&mid=86506162786843452209061728061415271602&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb&cc=&pe=lnk_o&pev2=Carousel%20button%20clicked&events=event100&v95=Homepage%7CFootball&s=1536x864&c=24&j=1.8.5&v=N&k=Y&bw=1372&bh=635&AQE=1")
			.resources(http("request_12")
			.get(uri3 + "/fragments/sidebarLeft/en-gb/football/highlights")
			.headers(headers_0),
            http("request_13")
			.get(uri3 + "/betting/en-gb/football.partial")
			.headers(headers_0),
            http("request_14")
			.get(uri3 + "/fragments/topBets/en-gb/football")
			.headers(headers_0),
            http("request_15")
			.get(uri1 + "/s99415794295092?AQB=1&ndh=1&pf=1&t=9%2F2%2F2017%2023%3A52%3A39%204%200&mid=86506162786843452209061728061415271602&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb%3Afootball&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball&cc=&server=sports.williamhill.com&aamb=NRX38WO0n5BH8Th-nqAG_A&c1=D%3Dg&c2=D%3Dv21&c3=D%3Dv22&c4=D%3Dv23&c5=D%3Dv24&c6=D%3Dv25&c7=D%3Dv26&c8=D%3Dv27&c9=D%3Dv28&v10=D%3Ds_vi&v12=Non-customer&v13=nonc&c14=D%3Dbw&v14=Not%20logged%20in&c15=11%3A52%20PM&c16=Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20WOW64%3B%20rv%3A47.0%29%20Gecko%2F20100101%20Firefox%2F47.0&v20=D%3Dg&v21=sports&v22=betting%20%7C%20football&c23=11%3A52%20PM%7CThursday&v23=football%7CHomepage&v24=en-gb&v25=default&v26=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball&v27=Website&c28=TRAFALGAR&v28=&v60=11%3A52%20PM%7CThursday&v63=Mozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20WOW64%3B%20rv%3A47.0%29%20Gecko%2F20100101%20Firefox%2F47.0&v67=TRAFALGAR&v118=Standard%20Browsing&v122=Flash%20disabled&v132=suggestionsEnabledLarge&s=1536x864&c=24&j=1.8.5&v=N&k=Y&bw=1372&bh=635&AQE=1"),
            http("request_16")
			.get(uri5 + "?rfiidc=1040401894962900381&rfiaid=f36502773eb54534bb04af2623bd95ca&ver=9&rb=29987&ca=20763234&_o=29987&_t=20763234&pe=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball&pf=&ra=2896616856782668")
			.headers(headers_4),
            http("request_17")
			.get(uri4 + "/?taboola_hm=1040401894962900381"),
            http("request_18")
			.get(uri8 + "?rb=29987&ca=20763234&ri=8676d910f45ef42be89a558a8536d4ad&rfiidc=1040401894962900381&rfiaid=f36502773eb54534bb04af2623bd95ca&stats=%7B%2257419%22%3A%2275%2C2%22%7D&ra=015051818988829346")
			.headers(headers_4)))
		.pause(1)
		.exec(http("request_19")
			.post("/slp/en-gb")
			.headers(headers_19)
			.formParam("action", "GoRemoveLeg")
			.formParam("bet_no", "0")
			.formParam("blockbuster_id", "-1")
			.formParam("switch_tab", "1")
			.formParam("csrf_token", "61ecc631a8fa899393b5")
			.resources(http("request_20")
			.get(uri1 + "/s98499534042362?AQB=1&ndh=1&pf=1&t=9%2F2%2F2017%2023%3A52%3A42%204%200&mid=86506162786843452209061728061415271602&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb%3Afootball&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball&cc=&pe=lnk_o&pev2=betslip%3A%20bet%20removed%20from%20slip&pid=sports%3Abetting%3Aen-gb%3Afootball&pidt=1&oid=17%2F20%20&oidt=3&ot=SUBMIT&events=scRemove&products=%3B1480299570&v36=sports%3Abetting%3Aen-gb%3Afootball&s=1536x864&c=24&j=1.8.5&v=N&k=Y&bw=1372&bh=635&AQE=1")))
		.pause(2)
		.exec(http("request_21")
			.post("/slp/en-gb")
			.headers(headers_19)
			.formParam("action", "GoAddLeg")
			.formParam("leg_sort", "--")
			.formParam("price_type", "L")
			.formParam("lp_num", "17")
			.formParam("lp_den", "20")
			.formParam("hcap_value", "0")
			.formParam("bir_index", "")
			.formParam("ew_places", "")
			.formParam("ew_fac_num", "")
			.formParam("ew_fac_den", "")
			.formParam("ev_oc_id", "1480299570")
			.formParam("combi_sel", "Y")
			.formParam("blockbuster_id", "-1")
			.formParam("switch_tab", "1")
			.formParam("aff_id", "850")
			.formParam("csrf_token", "f3125657d92b5742d264")
			.resources(http("request_22")
			.post(uri7 + "")
			.headers(headers_22)
			.body(RawFileBody("RecordedSimulation_0022_request.txt")),
            http("request_23")
			.get(uri1 + "/s98559604766533?AQB=1&ndh=1&pf=1&t=9%2F2%2F2017%2023%3A52%3A45%204%200&mid=86506162786843452209061728061415271602&aamlh=6&ce=UTF-8&ns=williamhill&pageName=sports%3Abetting%3Aen-gb%3Afootball&g=http%3A%2F%2Fsports.williamhill.com%2Fbetting%2Fen-gb%2Ffootball&cc=&pe=lnk_o&pev2=bet%20added%20to%20betslip&events=scOpen%2CscAdd&products=%3B1480299570&v36=sports%3Abetting%3Aen-gb%3Afootball&v44=Pre%20Match&v70=Brighton%20v%20Derby%7C90%20Minutes%7CEnglish%20Championship%7C10%20Mar%202017&v113=Brighton&s=1536x864&c=24&j=1.8.5&v=N&k=Y&bw=1372&bh=635&AQE=1")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}