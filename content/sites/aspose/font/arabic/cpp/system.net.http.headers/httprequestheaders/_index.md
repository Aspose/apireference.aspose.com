---
title: "System::Net::Http::Headers::HttpRequestHeaders فئة"
linktitle: "HttpRequestHeaders"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Http::Headers::HttpRequestHeaders فئة. تمثّل مجموعة رؤوس ''Request''. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1000
url: /ar/cpp/system.net.http.headers/httprequestheaders/
---
## HttpRequestHeaders class


تمثّل مجموعة رؤوس 'Request'. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class HttpRequestHeaders : public System::Net::Http::Headers::HttpHeaders
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) override | يقوم بدمج كائن فئة HttpHeaders المحدد مع الكائن الحالي. |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | يضيف الرؤوس المعروفة إلى المجموعة المحددة. |
| [get_Accept](./get_accept/)() | معلومات RTTI. |
| [get_AcceptCharset](./get_acceptcharset/)() | يعيد قيمة رأس 'Accept-Charset'. |
| [get_AcceptEncoding](./get_acceptencoding/)() | يعيد قيمة رأس 'Accept-Encoding'. |
| [get_AcceptLanguage](./get_acceptlanguage/)() | يعيد قيمة رأس 'Accept-Language'. |
| [get_Authorization](./get_authorization/)() | يحصل على قيمة رأس 'Authorization'. |
| [get_CacheControl](./get_cachecontrol/)() | يحصل على قيمة رأس 'Cache-Control'. |
| [get_Connection](./get_connection/)() | يعيد قيمة رأس 'Connection'. |
| [get_ConnectionClose](./get_connectionclose/)() | يحصل على قيمة تشير إلى ما إذا كانت قيمة رأس 'Connection' تحتوي على 'Close'. |
| [get_Date](./get_date/)() | يحصل على قيمة رأس 'Date'. |
| [get_Expect](./get_expect/)() | يعيد قيمة رأس 'Expect'. |
| [get_ExpectContinue](./get_expectcontinue/)() | يحصل على قيمة تشير إلى ما إذا كانت قيمة رأس 'Expect' تحتوي على 'Continue'. |
| [get_From](./get_from/)() | يحصل على قيمة رأس 'From'. |
| [get_Host](./get_host/)() | يحصل على قيمة رأس 'Host'. |
| [get_IfMatch](./get_ifmatch/)() | يعيد قيمة رأس 'If-Match'. |
| [get_IfModifiedSince](./get_ifmodifiedsince/)() | يحصل على قيمة رأس 'If-Modified-Since'. |
| [get_IfNoneMatch](./get_ifnonematch/)() | يعيد قيمة رأس 'If-None-Match'. |
| [get_IfRange](./get_ifrange/)() | يحصل على قيمة رأس 'If-Range'. |
| [get_IfUnmodifiedSince](./get_ifunmodifiedsince/)() | يحصل على قيمة رأس 'If-Unmodified-Since'. |
| [get_MaxForwards](./get_maxforwards/)() | يحصل على قيمة رأس 'Max-Forwards'. |
| [get_Pragma](./get_pragma/)() | يعيد قيمة رأس 'Pragma'. |
| [get_ProxyAuthorization](./get_proxyauthorization/)() | يحصل على قيمة رأس 'Proxy-Authorization'. |
| [get_Range](./get_range/)() | يحصل على قيمة رأس 'Range'. |
| [get_Referrer](./get_referrer/)() | يحصل على قيمة رأس 'Referer'. |
| [get_TE](./get_te/)() | يعيد قيمة رأس 'TE'. |
| [get_Trailer](./get_trailer/)() | يعيد قيمة رأس 'Trailer'. |
| [get_TransferEncoding](./get_transferencoding/)() | يعيد قيمة رأس 'Transfer-Encoding'. |
| [get_TransferEncodingChunked](./get_transferencodingchunked/)() | يحصل على قيمة تشير إلى ما إذا كانت قيمة رأس 'Transfer-Encoding' تحتوي على 'Chunked'. |
| [get_Upgrade](./get_upgrade/)() | يعيد قيمة رأس 'Upgrade'. |
| [get_UserAgent](./get_useragent/)() | يعيد قيمة رأس 'User-Agent'. |
| [get_Via](./get_via/)() | يعيد قيمة رأس 'Via'. |
| [get_Warning](./get_warning/)() | يعيد قيمة رأس 'Warning'. |
| [HttpRequestHeaders](./httprequestheaders/)() | ينشئ نسخة جديدة. |
| [set_Authorization](./set_authorization/)(System::SharedPtr\<AuthenticationHeaderValue\>) | يضبط قيمة رأس 'Authorization'. |
| [set_CacheControl](./set_cachecontrol/)(System::SharedPtr\<CacheControlHeaderValue\>) | يضبط قيمة رأس 'Cache-Control'. |
| [set_ConnectionClose](./set_connectionclose/)(Nullable\<bool\>) | يضبط قيمة تشير إلى ما إذا كانت قيمة رأس 'Connection' تحتوي على 'Close'. |
| [set_Date](./set_date/)(Nullable\<DateTimeOffset\>) | يضبط قيمة رأس 'Date'. |
| [set_ExpectContinue](./set_expectcontinue/)(Nullable\<bool\>) | يضبط قيمة تشير إلى ما إذا كانت قيمة رأس 'Expect' تحتوي على 'Continue'. |
| [set_From](./set_from/)(String) | يضبط قيمة رأس 'From'. |
| [set_Host](./set_host/)(String) | يضبط قيمة رأس 'Host'. |
| [set_IfModifiedSince](./set_ifmodifiedsince/)(Nullable\<DateTimeOffset\>) | يضبط قيمة رأس 'If-Modified-Since'. |
| [set_IfRange](./set_ifrange/)(System::SharedPtr\<RangeConditionHeaderValue\>) | يضبط قيمة رأس 'If-Range'. |
| [set_IfUnmodifiedSince](./set_ifunmodifiedsince/)(Nullable\<DateTimeOffset\>) | يضبط قيمة رأس 'If-Unmodified-Since'. |
| [set_MaxForwards](./set_maxforwards/)(Nullable\<int32_t\>) | يضبط قيمة رأس 'Max-Forwards'. |
| [set_ProxyAuthorization](./set_proxyauthorization/)(System::SharedPtr\<AuthenticationHeaderValue\>) | يضبط قيمة رأس 'Proxy-Authorization'. |
| [set_Range](./set_range/)(System::SharedPtr\<RangeHeaderValue\>) | يضبط قيمة رأس 'Range'. |
| [set_Referrer](./set_referrer/)(System::SharedPtr\<Uri\>) | يضبط قيمة رأس 'Referer'. |
| [set_TransferEncodingChunked](./set_transferencodingchunked/)(Nullable\<bool\>) | يضبط قيمة تشير إلى ما إذا كانت قيمة رأس 'Transfer-Encoding' تحتوي على 'Chunked'. |
## انظر أيضًا

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
