---
title: "الفئة System::Net::Http::Headers::HttpRequestHeaders"
linktitle: "HttpRequestHeaders"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Net::Http::Headers::HttpRequestHeaders. تمثل مجموعة رؤوس ''Request''. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطالاً في التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1000
url: /ar/cpp/system.net.http.headers/httprequestheaders/
---
## HttpRequestHeaders class


تمثل مجموعة رؤوس 'Request'. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطالاً في التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class HttpRequestHeaders : public System::Net::Http::Headers::HttpHeaders
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) override | يقوم بدمج نسخة الفئة HttpHeaders المحددة مع النسخة الحالية. |
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
| [get_TransferEncoding](./get_transferencoding/)() | إرجاع قيمة من رأس 'Transfer-Encoding'. |
| [get_TransferEncodingChunked](./get_transferencodingchunked/)() | يحصل على قيمة تشير إلى ما إذا كانت قيمة رأس 'Transfer-Encoding' تحتوي على 'Chunked'. |
| [get_Upgrade](./get_upgrade/)() | إرجاع قيمة من رأس 'Upgrade'. |
| [get_UserAgent](./get_useragent/)() | إرجاع قيمة من رأس 'User-Agent'. |
| [get_Via](./get_via/)() | إرجاع قيمة من رأس 'Via'. |
| [get_Warning](./get_warning/)() | إرجاع قيمة من رأس 'Warning'. |
| [HttpRequestHeaders](./httprequestheaders/)() | ينشئ نسخة جديدة. |
| [set_Authorization](./set_authorization/)(System::SharedPtr\<AuthenticationHeaderValue\>) | تعيين قيمة لرأس 'Authorization'. |
| [set_CacheControl](./set_cachecontrol/)(System::SharedPtr\<CacheControlHeaderValue\>) | تعيين قيمة لرأس 'Cache-Control'. |
| [set_ConnectionClose](./set_connectionclose/)(Nullable\<bool\>) | تعيين قيمة تشير إلى ما إذا كانت قيمة رأس 'Connection' تحتوي على 'Close'. |
| [set_Date](./set_date/)(Nullable\<DateTimeOffset\>) | تعيين قيمة لرأس 'Date'. |
| [set_ExpectContinue](./set_expectcontinue/)(Nullable\<bool\>) | تعيين قيمة تشير إلى ما إذا كانت قيمة رأس 'Expect' تحتوي على 'Continue'. |
| [set_From](./set_from/)(String) | تعيين قيمة لرأس 'From'. |
| [set_Host](./set_host/)(String) | تعيين قيمة لرأس 'Host'. |
| [set_IfModifiedSince](./set_ifmodifiedsince/)(Nullable\<DateTimeOffset\>) | تعيين قيمة لرأس 'If-Modified-Since'. |
| [set_IfRange](./set_ifrange/)(System::SharedPtr\<RangeConditionHeaderValue\>) | تعيين قيمة لرأس 'If-Range'. |
| [set_IfUnmodifiedSince](./set_ifunmodifiedsince/)(Nullable\<DateTimeOffset\>) | تعيين قيمة لرأس 'If-Unmodified-Since'. |
| [set_MaxForwards](./set_maxforwards/)(Nullable\<int32_t\>) | تعيين قيمة لرأس 'Max-Forwards'. |
| [set_ProxyAuthorization](./set_proxyauthorization/)(System::SharedPtr\<AuthenticationHeaderValue\>) | تعيين قيمة لرأس 'Proxy-Authorization'. |
| [set_Range](./set_range/)(System::SharedPtr\<RangeHeaderValue\>) | تعيين قيمة لرأس 'Range'. |
| [set_Referrer](./set_referrer/)(System::SharedPtr\<Uri\>) | يضبط قيمة رأس 'Referer'. |
| [set_TransferEncodingChunked](./set_transferencodingchunked/)(Nullable\<bool\>) | تعيين قيمة تشير إلى ما إذا كانت قيمة رأس 'Transfer-Encoding' تحتوي على 'Chunked'. |
## انظر أيضًا

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
