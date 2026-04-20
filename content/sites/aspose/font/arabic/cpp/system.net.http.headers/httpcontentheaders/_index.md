---
title: "فئة System::Net::Http::Headers::HttpContentHeaders"
linktitle: "HttpContentHeaders"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Net::Http::Headers::HttpContentHeaders. تمثّل مجموعة رؤوس ''Content''. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 600
url: /ar/cpp/system.net.http.headers/httpcontentheaders/
---
## HttpContentHeaders class


تمثّل مجموعة رؤوس 'Content'. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class HttpContentHeaders : public System::Net::Http::Headers::HttpHeaders
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | يضيف الرؤوس المعروفة إلى المجموعة المحددة. |
| [get_Allow](./get_allow/)() | معلومات RTTI. |
| [get_ContentDisposition](./get_contentdisposition/)() | يحصل على قيمة رأس 'Content-Disposition'. |
| [get_ContentEncoding](./get_contentencoding/)() | يحصل على قيمة رأس 'Content-Encoding'. |
| [get_ContentLanguage](./get_contentlanguage/)() | يحصل على قيمة رأس 'Content-Language'. |
| [get_ContentLength](./get_contentlength/)() | يحصل على قيمة رأس 'Content-Length'. |
| [get_ContentLocation](./get_contentlocation/)() | يحصل على قيمة رأس 'Content-Location'. |
| [get_ContentMD5](./get_contentmd5/)() | يسترجع قيمة من رأس 'Content-MD5'. |
| [get_ContentRange](./get_contentrange/)() | يسترجع قيمة من رأس 'Content-Range'. |
| [get_ContentType](./get_contenttype/)() | يسترجع قيمة من رأس 'Content-Type'. |
| [get_Expires](./get_expires/)() | يسترجع قيمة من رأس 'Expires'. |
| [get_LastModified](./get_lastmodified/)() | يسترجع قيمة من رأس 'Last-Modified'. |
| [HttpContentHeaders](./httpcontentheaders/)(HeaderFunc\<Nullable\<int64_t\>\>) | ينشئ نسخة جديدة. |
| [set_ContentDisposition](./set_contentdisposition/)(System::SharedPtr\<ContentDispositionHeaderValue\>) | يضبط قيمة رأس 'Content-Disposition'. |
| [set_ContentLength](./set_contentlength/)(Nullable\<int64_t\>) | يضبط قيمة رأس 'Content-Length'. |
| [set_ContentLocation](./set_contentlocation/)(System::SharedPtr\<Uri\>) | يضبط قيمة رأس 'Content-Location'. |
| [set_ContentMD5](./set_contentmd5/)(System::ArrayPtr\<uint8_t\>) | يضبط قيمة رأس 'Content-MD5'. |
| [set_ContentRange](./set_contentrange/)(System::SharedPtr\<ContentRangeHeaderValue\>) | يضبط قيمة رأس 'Content-Range'. |
| [set_ContentType](./set_contenttype/)(System::SharedPtr\<MediaTypeHeaderValue\>) | يضبط قيمة رأس 'Content-Type'. |
| [set_Expires](./set_expires/)(Nullable\<DateTimeOffset\>) | يضبط قيمة رأس 'Expires'. |
| [set_LastModified](./set_lastmodified/)(Nullable\<DateTimeOffset\>) | يضبط قيمة رأس 'Last-Modified'. |
## انظر أيضًا

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
