package gatling_example.base_config

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.request.builder.HttpRequestBuilder

class BaseSimulation extends Simulation {

  val baseUrl = "https://www.google.com"
  private val userAgentHeader = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.100 Safari/537.36"
  val accept = "*/*"
  val acceptEncoding = "gzip, deflate, br"
  val acceptLanguage = "en-US,en;q=0.9"
  val contentType = "text/plain;charset=UTF-8"
  val htmlAccept = "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3"
  val imageAccept = "image/webp,image/apng,image/*,*/*;q=0.8"
  val ONE = "1"

  val headers_0 = Map(
    "accept" -> accept,
    "accept-encoding" -> acceptEncoding,
    "accept-language" -> acceptLanguage,
    "content-type" -> contentType,
    "origin" -> baseUrl)

  val headers_6 = Map(
    "accept" -> htmlAccept,
    "accept-encoding" -> acceptEncoding,
    "accept-language" -> acceptLanguage,
    "cache-control" -> "max-age=0",
    "upgrade-insecure-requests" -> ONE)

  val headers_15 = Map("Origin" -> baseUrl)

  val headers_17 = Map(
    "accept" -> accept,
    "accept-encoding" -> acceptEncoding,
    "accept-language" -> acceptLanguage)

  val headers_33 = Map(
    "accept" -> imageAccept,
    "accept-encoding" -> acceptEncoding,
    "accept-language" -> acceptLanguage)

  val headers_35 = Map(
    "accept" -> htmlAccept,
    "accept-encoding" -> acceptEncoding,
    "accept-language" -> acceptLanguage,
    "upgrade-insecure-requests" -> ONE)

  val uri1 = "https://ogs.google.com/widget/app/so"
  val uri2 = "https://googleads.g.doubleclick.net/adsid/google/si"
  val uri4 = "https://id.google.com/verify/AAp5M_tlksthXZyzZC5TCudfG0aluxTn9-8mP18pk0twbKdOmFTkLdY4aSiAxs8RwBSvE7dKDr3KKIeWVsQ5fPRaCot45LpNqDQlKshsPSBFJJWXNumL5w"
  val uri5 = "https://adservice.google.com/adsid/google/ui"
  val uri6 = "https://www.gstatic.com"
  val uri7 = "https://apis.google.com/_/scs/abc-static/_/js/k=gapi.gapi.en.57vmlWwHHV4.O/m=gapi_iframes,googleapis_client,plusone/rt=j/sv=1/d=1/ed=1/rs=AHpOoo8g4wyDqrTwJ_zGN6gLyTAGCEPLfg/cb=gapi.loaded_0"
  val uri8 = "https://ssl.gstatic.com/gb/images/i2_2ec824b0.png"
  val logo_uri = "/tia/tia.png"

  val searchResultState: HttpRequestBuilder =
    http("getting content for results").get(uri8)
  http("request_31").get(uri6 + "/inputtools/images/tia.png")
  http("request_32").get(uri6 + "/images/branding/googlemic/2x/googlemic_color_24dp.png")
  http("request_33").get("/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png")
    .headers(headers_33)
  http("request_34").get("/images/nav_logo299.webp")
  http("request_35").get("/search?source=hp&ei=UHAQXeS-Iq3KrgTTqYJY&q=gatling+demo&oq=gatling+demo&gs_l=psy-ab.1.0.0i19l2j0i22i30i19l7.7010.8943..12170...0.0..0.119.1049.10j2......0....1..gws-wiz.....0..0j0i131j0i22i30.cldSLNgYKkg")
    .headers(headers_35)
  http("request_36").get("/gen_204?atyp=i&ct=rfl&cad=&ei=XXAQXY7yA5HxrgTz2574DQ&zx=1561358429625")
    .headers(headers_33)
  http("request_37").get(uri6 + "/og/_/js/k=og.og2.en_US.1bwiG6EETwo.O/rt=j/m=def,aswid/exm=in,fot/d=1/ed=1/rs=AA2YrTt5vceG9GimIrg3uINXIp06Lk0K9A")
  http("request_38").post("/gen_204?s=web&t=aft&atyp=csi&ei=XXAQXY7yA5HxrgTz2574DQ&rt=wsrt.111,aft.500,prt.474,sct.278&ima=3&imn=11")
    .headers(headers_0)
  http("request_39").get("/xjs/_/js/k=xjs.s.uk.ZadUFI2Yb2s.O/m=Fkg7bd,HcFEGb,IvlUe,MC8mtf,OF7gzc,RMhBfe,T4BAC,TJw5qb,TbaHGc,Y33vzc,ZyRBae,cdos,hsm,iDPoPb,jsa,mvYTse,tg8oTe,uz938c,vWNDde,ws9Tlc,yQ43ff,d,csi/am=AABgEbDTTSDP_1cAALsAAAJ3gY0sEEBoWDWA/d=1/dg=2/br=1/rs=ACT90oGgYS6RBGA0BTf5IPQBvi5FnIlpyA")
    .headers(headers_17)
  http("request_40").get(uri7)
  http("request_41").get(uri1 + "?hl=uk&origin=https%3A%2F%2Fwww.google.com&pid=1&spid=1&usegapi=1")
    .headers(headers_15)
  http("request_42").get("/xjs/_/js/k=xjs.s.uk.ZadUFI2Yb2s.O/am=AABgEbDTTSDP_1cAALsAAAJ3gY0sEEBoWDWA/d=1/exm=Fkg7bd,HcFEGb,IvlUe,MC8mtf,OF7gzc,RMhBfe,T4BAC,TJw5qb,TbaHGc,Y33vzc,ZyRBae,cdos,csi,d,hsm,iDPoPb,jsa,mvYTse,tg8oTe,uz938c,vWNDde,ws9Tlc,yQ43ff/ed=1/dg=2/br=1/rs=ACT90oGgYS6RBGA0BTf5IPQBvi5FnIlpyA/m=F8FRnd,NBZ7u,TxZWcc,WgDvvc,WlxEYd,Wq6lxf,XjCeUc,aa,aam1T,abd,abn,adinfo,async,attl,bgd,dvl,exdc,fEVMic,foot,kyn,lazG7b,lu,m,mI3LFb,mUpTid,mpck,mu,oc8g5d,qik19b,sb_wiz,sf,sonic,spch,tl,vs,xz7cCd?xjs=s1")
    .headers(headers_17)
  http("request_43").get("/client_204?&atyp=i&biw=816&bih=754&dpr=1.25&ei=XXAQXY7yA5HxrgTz2574DQ")
    .headers(headers_33)
  http("request_44").get(uri4)
  http("request_45").get("/xjs/_/js/k=xjs.s.uk.ZadUFI2Yb2s.O/am=AABgEbDTTSDP_1cAALsAAAJ3gY0sEEBoWDWA/d=1/exm=F8FRnd,Fkg7bd,HcFEGb,IvlUe,MC8mtf,NBZ7u,OF7gzc,RMhBfe,T4BAC,TJw5qb,TbaHGc,TxZWcc,WgDvvc,WlxEYd,Wq6lxf,XjCeUc,Y33vzc,ZyRBae,aa,aam1T,abd,abn,adinfo,async,attl,bgd,cdos,csi,d,dvl,exdc,fEVMic,foot,hsm,iDPoPb,jsa,kyn,lazG7b,lu,m,mI3LFb,mUpTid,mpck,mu,mvYTse,oc8g5d,qik19b,sb_wiz,sf,sonic,spch,tg8oTe,tl,uz938c,vWNDde,vs,ws9Tlc,xz7cCd,yQ43ff/ed=1/dg=2/br=1/rs=ACT90oGgYS6RBGA0BTf5IPQBvi5FnIlpyA/m=IkchZc,Uuupec,WVLMce,r36a9c?xjs=s2")
    .headers(headers_17)
  http("request_46").get("/async/bgasy?ei=XXAQXY7yA5HxrgTz2574DQ&yv=3&async=_fmt:jspb")
    .headers(headers_17)
  http("request_47").get("/gen_204?atyp=i&ct=phandle&cad=0,det:0&ei=XXAQXY7yA5HxrgTz2574DQ&zx=1561358430170")
    .headers(headers_33)
  http("request_48").get("/images/phd/px.gif")
    .headers(headers_33)
  http("request_49").get(uri5)
  http("request_50").get(uri2 + "?gadsid=AORoGNQq2xsAI7jCoeq0h8-5tSfQyNwAfYSowSO9A7cUr0UscVs1bfNTUI6ISwPL-53RTYxKRlL0Arub_mw_Z4owQ_Hlzt0KKlLqcCNvZnUO_4fmYg")

  val baseState: HttpRequestBuilder =
    http("getting google logo").get(logo_uri)
  http("request_2").get("/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png")
  http("request_3").get(uri8)
  http("request_4").get(uri6 + "/inputtools/images/tia.png")
  http("request_5").get(uri6 + "/images/branding/googlemic/2x/googlemic_color_24dp.png")
  http("request_6").get("/").headers(headers_6)
  http("request_7").get("/xjs/_/js/k=xjs.s.uk.ZadUFI2Yb2s.O/m=Fkg7bd,HcFEGb,IvlUe,MC8mtf,OF7gzc,RMhBfe,T4BAC,TJw5qb,TbaHGc,Y33vzc,cdos,hsm,iDPoPb,jsa,mvYTse,tg8oTe,uz938c,vWNDde,ws9Tlc,yQ43ff,d,csi/am=AABgEbDTTSDI_1cAALsAAAJ3gY0sEEFoWDWA/d=1/dg=2/br=1/rs=ACT90oHeGexGKbavVxCywT6SMs02KEHkWA")
  http("request_8").get("/images/nav_logo299.webp")
  http("request_9").post("/gen_204?s=webhp&t=aft&atyp=csi&ei=UHAQXeS-Iq3KrgTTqYJY&rt=wsrt.123,aft.96,prt.96&ima=0&imn=2")
    .headers(headers_0)
  http("request_10").get("/xjs/_/js/k=xjs.s.uk.ZadUFI2Yb2s.O/am=AABgEbDTTSDI_1cAALsAAAJ3gY0sEEFoWDWA/d=1/exm=Fkg7bd,HcFEGb,IvlUe,MC8mtf,OF7gzc,RMhBfe,T4BAC,TJw5qb,TbaHGc,Y33vzc,cdos,csi,d,hsm,iDPoPb,jsa,mvYTse,tg8oTe,uz938c,vWNDde,ws9Tlc,yQ43ff/ed=1/dg=2/br=1/rs=ACT90oHeGexGKbavVxCywT6SMs02KEHkWA/m=WgDvvc,aa,abd,async,dvl,fEVMic,foot,lu,m,mUpTid,mu,sb_wiz,sf,sonic,spch,xz7cCd?xjs=s1")
  http("request_11").post("/gen_204?atyp=csi&ei=UHAQXeS-Iq3KrgTTqYJY&s=jsa&jsi=s,t.0,et.focus,n.iDPoPb,cn.1&zx=1561358416861")
    .headers(headers_0)
  http("request_12").get(uri6 + "/og/_/js/k=og.og2.en_US.1bwiG6EETwo.O/rt=j/m=def,aswid/exm=in,fot/d=1/ed=1/rs=AA2YrTt5vceG9GimIrg3uINXIp06Lk0K9A")
  http("request_13").get(uri7)
  http("request_14").post("/gen_204?atyp=csi&ei=UHAQXeS-Iq3KrgTTqYJY&s=webhp&t=all&imn=2&adh=&conn=onchange&ima=1&ime=1&imeb=0&imeo=0&wh=738&scp=0&net=dl.10000,ect.4g,rtt.100&mem=ujhs.20,tjhs.22,jhsl.2198,dm.8&sto=&sys=hc.4&rt=xjsls.89,iml.60,prt.96,aft.96,dcl.102,xjses.153,xjsee.195,xjs.195,ol.286,wsrt.123,cst.39,dnst.0,rqst.188,rspt.70,sslt.39,rqstt.5,unt.3,ppunt.1,cstt.4,dit.225&zx=1561358416941")
    .headers(headers_0)
  http("request_15").get(uri1 + "?hl=uk&origin=https%3A%2F%2Fwww.google.com&pid=1&spid=1&usegapi=1")
    .headers(headers_15)
  http("request_16").get(uri5)

  val httpConf = http
    .baseUrl("https://www.google.com")
    .inferHtmlResources()
    .userAgentHeader(userAgentHeader)


  private val GATLING_DEMO_SEARCH_STRING = "/complete/search?q=gatling%20demo&cp=12&client=psy-ab&xssi=t&gs_ri=gws-wiz&hl=uk&authuser=0&psi=UHAQXeS-Iq3KrgTTqYJY.1561358416875&ei=UHAQXeS-Iq3KrgTTqYJY&gs_mss=gatling%20de"
  private val some_get_url = "/gen_204?atyp=i&ei=XXAQXY7yA5HxrgTz2574DQ&ct=slh&v=2&m=HV&t=C&s=1&pv=0.9151691384890015&me=1:1561358430203,x:1,V,0,0,816,754:0,N,1,XXAQXY7yA5HxrgTz2574DQ:0,R,1,7,30,28,92,34:0,R,1,CAkQAA,166,173,600,116:0,R,1,CAQQAA,166,315,600,96:0,R,1,CAAQAA,166,438,600,96:0,R,1,CAgQAA,166,574,600,339:0,R,1,CAgQAQ,166,608,600,306:0,R,1,CAgQAg,146,608,639,306:2,B,1949:119,h,1,CAkQAA,i:28,h,1,CAkQAA,o:1040,e,B&zx=1561358431395"
  private val initial_post_uri = "/gen_204?atyp=csi&ei=LHAQXcSNEsH5qwG8wrSoDw&s=jsa&jsi=s,et.focus,n.iDPoPb,cn.2&zx=1561358416514"
  private final val RESPONSE_BODY = "responseBody"

  protected def openHomePage() = {
    exec(http("Getting Google Homepage")
      .post(initial_post_uri)
      .headers(headers_0)
      .resources(baseState)
      .check(status.is(204)))
  }

  protected def searchForGatlingDemo() = {
    exec(http("Searching for 'gatling demo'")
      .get(GATLING_DEMO_SEARCH_STRING)
      .headers(headers_17)
      .check(status.is(200))
      .check(bodyString.saveAs(RESPONSE_BODY)))
      .exec { session => println("\n---------------------------------------------" + session(RESPONSE_BODY).as[String]); session}
  }

  protected def getAdditionalContent() = {
    exec(http("Getting additional data for search page content")
      .get(logo_uri)
      .resources(searchResultState)
      .check(status.is(200)))
      .pause(1)
      .exec(http("getting content")
        .post(some_get_url)
        .headers(headers_0))
  }
}
