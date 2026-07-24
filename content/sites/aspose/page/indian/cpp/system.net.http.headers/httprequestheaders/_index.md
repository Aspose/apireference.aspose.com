---
title: "System::Net::Http::Headers::HttpRequestHeaders क्लास"
linktitle: "HttpRequestHeaders"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::Headers::HttpRequestHeaders क्लास। ''Request'' हेडर का संग्रह दर्शाता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 1000
url: /hi/cpp/system.net.http.headers/httprequestheaders/
---
## HttpRequestHeaders class


'Request' हेडर का संग्रह दर्शाता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class HttpRequestHeaders : public System::Net::Http::Headers::HttpHeaders
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) override | निर्दिष्ट HttpHeaders-class इंस्टेंस को वर्तमान वाले के साथ जोड़ता है। |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | ज्ञात हेडर को निर्दिष्ट संग्रह में जोड़ता है। |
| [get_Accept](./get_accept/)() | RTTI जानकारी। |
| [get_AcceptCharset](./get_acceptcharset/)() | 'Accept-Charset' हेडर का मान लौटाता है। |
| [get_AcceptEncoding](./get_acceptencoding/)() | 'Accept-Encoding' हेडर का मान लौटाता है। |
| [get_AcceptLanguage](./get_acceptlanguage/)() | 'Accept-Language' हेडर का मान लौटाता है। |
| [get_Authorization](./get_authorization/)() | 'Authorization' हेडर का मान प्राप्त करता है। |
| [get_CacheControl](./get_cachecontrol/)() | 'Cache-Control' हेडर का मान प्राप्त करता है। |
| [get_Connection](./get_connection/)() | 'Connection' हेडर का मान लौटाता है। |
| [get_ConnectionClose](./get_connectionclose/)() | 'Connection' हेडर मान में 'Close' शामिल है या नहीं, यह दर्शाने वाला मान प्राप्त करता है। |
| [get_Date](./get_date/)() | 'Date' हेडर का मान प्राप्त करता है। |
| [get_Expect](./get_expect/)() | 'Expect' हेडर का मान लौटाता है। |
| [get_ExpectContinue](./get_expectcontinue/)() | 'Expect' हेडर मान में 'Continue' शामिल है या नहीं, यह दर्शाने वाला मान प्राप्त करता है। |
| [get_From](./get_from/)() | 'From' हेडर का मान प्राप्त करता है। |
| [get_Host](./get_host/)() | 'Host' हेडर का मान प्राप्त करता है। |
| [get_IfMatch](./get_ifmatch/)() | 'If-Match' हेडर का मान लौटाता है। |
| [get_IfModifiedSince](./get_ifmodifiedsince/)() | 'If-Modified-Since' हेडर का मान प्राप्त करता है। |
| [get_IfNoneMatch](./get_ifnonematch/)() | 'If-None-Match' हेडर का मान लौटाता है। |
| [get_IfRange](./get_ifrange/)() | 'If-Range' हेडर का मान प्राप्त करता है। |
| [get_IfUnmodifiedSince](./get_ifunmodifiedsince/)() | 'If-Unmodified-Since' हेडर का मान प्राप्त करता है। |
| [get_MaxForwards](./get_maxforwards/)() | 'Max-Forwards' हेडर का मान प्राप्त करता है। |
| [get_Pragma](./get_pragma/)() | 'Pragma' हेडर का मान लौटाता है। |
| [get_ProxyAuthorization](./get_proxyauthorization/)() | 'Proxy-Authorization' हेडर का मान प्राप्त करता है। |
| [get_Range](./get_range/)() | 'Range' हेडर का मान प्राप्त करता है। |
| [get_Referrer](./get_referrer/)() | 'Referer' हेडर का मान प्राप्त करता है। |
| [get_TE](./get_te/)() | 'TE' हेडर का मान लौटाता है। |
| [get_Trailer](./get_trailer/)() | 'Trailer' हेडर का मान लौटाता है। |
| [get_TransferEncoding](./get_transferencoding/)() | 'Transfer-Encoding' हेडर का मान लौटाता है। |
| [get_TransferEncodingChunked](./get_transferencodingchunked/)() | 'Transfer-Encoding' हेडर मान में 'Chunked' शामिल है या नहीं, यह दर्शाने वाला मान प्राप्त करता है। |
| [get_Upgrade](./get_upgrade/)() | 'Upgrade' हेडर का मान लौटाता है। |
| [get_UserAgent](./get_useragent/)() | 'User-Agent' हेडर का मान लौटाता है। |
| [get_Via](./get_via/)() | 'Via' हेडर का मान लौटाता है। |
| [get_Warning](./get_warning/)() | 'Warning' हेडर का मान लौटाता है। |
| [HttpRequestHeaders](./httprequestheaders/)() | एक नया उदाहरण बनाता है। |
| [set_Authorization](./set_authorization/)(System::SharedPtr\<AuthenticationHeaderValue\>) | 'Authorization' हेडर का मान सेट करता है। |
| [set_CacheControl](./set_cachecontrol/)(System::SharedPtr\<CacheControlHeaderValue\>) | 'Cache-Control' हेडर का मान सेट करता है। |
| [set_ConnectionClose](./set_connectionclose/)(Nullable\<bool\>) | 'Connection' हेडर मान में 'Close' शामिल है या नहीं, यह दर्शाने वाला मान सेट करता है। |
| [set_Date](./set_date/)(Nullable\<DateTimeOffset\>) | 'Date' हेडर का मान सेट करता है। |
| [set_ExpectContinue](./set_expectcontinue/)(Nullable\<bool\>) | 'Expect' हेडर मान में 'Continue' शामिल है या नहीं, यह दर्शाने वाला मान सेट करता है। |
| [set_From](./set_from/)(String) | 'From' हेडर का मान सेट करता है। |
| [set_Host](./set_host/)(String) | 'Host' हेडर का मान सेट करता है। |
| [set_IfModifiedSince](./set_ifmodifiedsince/)(Nullable\<DateTimeOffset\>) | 'If-Modified-Since' हेडर का मान सेट करता है। |
| [set_IfRange](./set_ifrange/)(System::SharedPtr\<RangeConditionHeaderValue\>) | 'If-Range' हेडर का मान सेट करता है। |
| [set_IfUnmodifiedSince](./set_ifunmodifiedsince/)(Nullable\<DateTimeOffset\>) | 'If-Unmodified-Since' हेडर का मान सेट करता है। |
| [set_MaxForwards](./set_maxforwards/)(Nullable\<int32_t\>) | 'Max-Forwards' हेडर का मान सेट करता है। |
| [set_ProxyAuthorization](./set_proxyauthorization/)(System::SharedPtr\<AuthenticationHeaderValue\>) | 'Proxy-Authorization' हेडर का मान सेट करता है। |
| [set_Range](./set_range/)(System::SharedPtr\<RangeHeaderValue\>) | 'Range' हेडर का मान सेट करता है। |
| [set_Referrer](./set_referrer/)(System::SharedPtr\<Uri\>) | सेट करता है 'Referer' हेडर का मान। |
| [set_TransferEncodingChunked](./set_transferencodingchunked/)(Nullable\<bool\>) | 'Transfer-Encoding' हेडर मान में 'Chunked' शामिल है या नहीं, यह दर्शाने वाला मान सेट करता है। |
## संबंधित देखें

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
