---
title: "System::Net::Http::Headers::HttpResponseHeaders क्लास"
linktitle: "HttpResponseHeaders"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::Headers::HttpResponseHeaders क्लास। ''Response'' हेडर का संग्रह दर्शाता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 1100
url: /hi/cpp/system.net.http.headers/httpresponseheaders/
---
## HttpResponseHeaders class


'Response' हेडर का संग्रह दर्शाता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class HttpResponseHeaders : public System::Net::Http::Headers::HttpHeaders
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) override | निर्दिष्ट HttpHeaders-class इंस्टेंस को वर्तमान वाले के साथ जोड़ता है। |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | ज्ञात हेडर को निर्दिष्ट संग्रह में जोड़ता है। |
| [get_AcceptRanges](./get_acceptranges/)() | RTTI जानकारी। |
| [get_Age](./get_age/)() | 'Age' हेडर का मान प्राप्त करता है। |
| [get_CacheControl](./get_cachecontrol/)() | 'Cache-Control' हेडर का मान प्राप्त करता है। |
| [get_Connection](./get_connection/)() | 'Connection' हेडर का मान लौटाता है। |
| [get_ConnectionClose](./get_connectionclose/)() | 'Connection' हेडर मान में 'Close' शामिल है या नहीं, यह दर्शाने वाला मान प्राप्त करता है। |
| [get_Date](./get_date/)() | 'Date' हेडर का मान प्राप्त करता है। |
| [get_ETag](./get_etag/)() | ''ETag'' हेडर का मान प्राप्त करता है। |
| [get_Location](./get_location/)() | 'Location' हेडर का मान प्राप्त करता है। |
| [get_Pragma](./get_pragma/)() | 'Pragma' हेडर का मान लौटाता है। |
| [get_ProxyAuthenticate](./get_proxyauthenticate/)() | 'Proxy-Authenticate' हेडर का मान लौटाता है। |
| [get_RetryAfter](./get_retryafter/)() | 'Retry-After' हेडर का मान प्राप्त करता है। |
| [get_Server](./get_server/)() | 'Server' हेडर का मान लौटाता है। |
| [get_Trailer](./get_trailer/)() | 'Trailer' हेडर का मान लौटाता है। |
| [get_TransferEncoding](./get_transferencoding/)() | 'Transfer-Encoding' हेडर का मान लौटाता है। |
| [get_TransferEncodingChunked](./get_transferencodingchunked/)() | 'Transfer-Encoding' हेडर मान में 'Chunked' शामिल है या नहीं, यह दर्शाने वाला मान प्राप्त करता है। |
| [get_Upgrade](./get_upgrade/)() | 'Upgrade' हेडर का मान लौटाता है। |
| [get_Vary](./get_vary/)() | 'Vary' हेडर का मान लौटाता है। |
| [get_Via](./get_via/)() | 'Via' हेडर का मान लौटाता है। |
| [get_Warning](./get_warning/)() | 'Warning' हेडर का मान लौटाता है। |
| [get_WwwAuthenticate](./get_wwwauthenticate/)() | 'WWW-Authenticate' हेडर का मान लौटाता है। |
| [HttpResponseHeaders](./httpresponseheaders/)() | एक नया उदाहरण बनाता है। |
| [set_Age](./set_age/)(Nullable\<TimeSpan\>) | 'Age' हेडर का मान सेट करता है। |
| [set_CacheControl](./set_cachecontrol/)(System::SharedPtr\<CacheControlHeaderValue\>) | 'Cache-Control' हेडर का मान सेट करता है। |
| [set_ConnectionClose](./set_connectionclose/)(Nullable\<bool\>) | 'Connection' हेडर मान में 'Close' शामिल है या नहीं, यह दर्शाने वाला मान सेट करता है। |
| [set_Date](./set_date/)(Nullable\<DateTimeOffset\>) | 'Date' हेडर का मान सेट करता है। |
| [set_ETag](./set_etag/)(System::SharedPtr\<EntityTagHeaderValue\>) | 'ETag' हेडर का मान सेट करता है। |
| [set_Location](./set_location/)(System::SharedPtr\<Uri\>) | 'Location' हेडर का मान सेट करता है। |
| [set_RetryAfter](./set_retryafter/)(System::SharedPtr\<RetryConditionHeaderValue\>) | 'Retry-After' हेडर का मान सेट करता है। |
| [set_TransferEncodingChunked](./set_transferencodingchunked/)(Nullable\<bool\>) | 'Transfer-Encoding' हेडर मान में 'Chunked' शामिल है या नहीं, यह दर्शाने वाला मान सेट करता है। |
## संबंधित देखें

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
