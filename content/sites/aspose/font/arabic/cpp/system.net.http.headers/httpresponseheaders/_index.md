---
title: "System::Net::Http::Headers::HttpResponseHeaders الفئة"
linktitle: "HttpResponseHeaders"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Http::Headers::HttpResponseHeaders الفئة. تمثِّل مجموعة رؤوس ''Response''. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً في وقت التشغيل أو أعطال تأكيدية. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1100
url: /ar/cpp/system.net.http.headers/httpresponseheaders/
---
## HttpResponseHeaders class


تمثِّل مجموعة رؤوس 'Response'. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً في وقت التشغيل أو أعطال تأكيدية. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class HttpResponseHeaders : public System::Net::Http::Headers::HttpHeaders
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) override | يقوم بدمج كائن فئة HttpHeaders المحدد مع الكائن الحالي. |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | يضيف الرؤوس المعروفة إلى المجموعة المحددة. |
| [get_AcceptRanges](./get_acceptranges/)() | معلومات RTTI. |
| [get_Age](./get_age/)() | يحصل على قيمة رأس 'Age'. |
| [get_CacheControl](./get_cachecontrol/)() | يحصل على قيمة رأس 'Cache-Control'. |
| [get_Connection](./get_connection/)() | يعيد قيمة رأس 'Connection'. |
| [get_ConnectionClose](./get_connectionclose/)() | يحصل على قيمة تشير إلى ما إذا كانت قيمة رأس 'Connection' تحتوي على 'Close'. |
| [get_Date](./get_date/)() | يحصل على قيمة رأس 'Date'. |
| [get_ETag](./get_etag/)() | يحصل على قيمة رأس 'ETag'. |
| [get_Location](./get_location/)() | يحصل على قيمة رأس 'Location'. |
| [get_Pragma](./get_pragma/)() | يعيد قيمة رأس 'Pragma'. |
| [get_ProxyAuthenticate](./get_proxyauthenticate/)() | يرجع قيمة رأس 'Proxy-Authenticate'. |
| [get_RetryAfter](./get_retryafter/)() | يحصل على قيمة رأس 'Retry-After'. |
| [get_Server](./get_server/)() | يرجع قيمة رأس 'Server'. |
| [get_Trailer](./get_trailer/)() | يعيد قيمة رأس 'Trailer'. |
| [get_TransferEncoding](./get_transferencoding/)() | يعيد قيمة رأس 'Transfer-Encoding'. |
| [get_TransferEncodingChunked](./get_transferencodingchunked/)() | يحصل على قيمة تشير إلى ما إذا كانت قيمة رأس 'Transfer-Encoding' تحتوي على 'Chunked'. |
| [get_Upgrade](./get_upgrade/)() | يعيد قيمة رأس 'Upgrade'. |
| [get_Vary](./get_vary/)() | يرجع قيمة رأس 'Vary'. |
| [get_Via](./get_via/)() | يعيد قيمة رأس 'Via'. |
| [get_Warning](./get_warning/)() | يعيد قيمة رأس 'Warning'. |
| [get_WwwAuthenticate](./get_wwwauthenticate/)() | يرجع قيمة رأس 'WWW-Authenticate'. |
| [HttpResponseHeaders](./httpresponseheaders/)() | ينشئ نسخة جديدة. |
| [set_Age](./set_age/)(Nullable\<TimeSpan\>) | يضبط قيمة رأس 'Age'. |
| [set_CacheControl](./set_cachecontrol/)(System::SharedPtr\<CacheControlHeaderValue\>) | يضبط قيمة رأس 'Cache-Control'. |
| [set_ConnectionClose](./set_connectionclose/)(Nullable\<bool\>) | يضبط قيمة تشير إلى ما إذا كانت قيمة رأس 'Connection' تحتوي على 'Close'. |
| [set_Date](./set_date/)(Nullable\<DateTimeOffset\>) | يضبط قيمة رأس 'Date'. |
| [set_ETag](./set_etag/)(System::SharedPtr\<EntityTagHeaderValue\>) | يضبط قيمة رأس 'ETag'. |
| [set_Location](./set_location/)(System::SharedPtr\<Uri\>) | يضبط قيمة رأس 'Location'. |
| [set_RetryAfter](./set_retryafter/)(System::SharedPtr\<RetryConditionHeaderValue\>) | يضبط قيمة رأس 'Retry-After'. |
| [set_TransferEncodingChunked](./set_transferencodingchunked/)(Nullable\<bool\>) | يضبط قيمة تشير إلى ما إذا كانت قيمة رأس 'Transfer-Encoding' تحتوي على 'Chunked'. |
## انظر أيضًا

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
