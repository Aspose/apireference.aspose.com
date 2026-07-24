---
title: "فئة System::Net::Http::HttpClient"
linktitle: "HttpClient"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Net::Http::HttpClient. تمثل الفئة الأساسية لعميل HTTP لإرسال الطلبات وتلقي الاستجابات. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 200
url: /ar/cpp/system.net.http/httpclient/
---
## HttpClient class


تمثل الفئة الأساسية لعميل HTTP لإرسال الطلبات وتلقي الاستجابات. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class HttpClient : public System::Net::Http::HttpMessageInvoker
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CancelPendingRequests](./cancelpendingrequests/)() | يلغي جميع الطلبات المعلقة. |
| [get_BaseAddress](./get_baseaddress/)() | يحصل على العنوان الأساسي للمورد المستخدم لإرسال الطلبات. |
| [get_DefaultRequestHeaders](./get_defaultrequestheaders/)() | معلومات RTTI. |
| [get_MaxResponseContentBufferSize](./get_maxresponsecontentbuffersize/)() | يحصل على الحد الأقصى لعدد البايتات لمحتوى الاستجابة. |
| [get_Timeout](./get_timeout/)() | يحصل على فترة الانتظار قبل انتهاء مهلة الطلب. |
| [HttpClient](./httpclient/)() | ينشئ نسخة جديدة. |
| [HttpClient](./httpclient/)(System::SharedPtr\<HttpMessageHandler\>) | ينشئ نسخة جديدة. |
| [HttpClient](./httpclient/)(System::SharedPtr\<HttpMessageHandler\>, bool) | ينشئ نسخة جديدة. |
| [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>, HttpCompletionOption) | يرسل طلب HTTP المحدد. |
| [set_BaseAddress](./set_baseaddress/)(System::SharedPtr\<Uri\>) | يضبط عنوان القاعدة للمورد الذي يُستخدم لإرسال الطلبات. |
| [set_MaxResponseContentBufferSize](./set_maxresponsecontentbuffersize/)(int64_t) | يضبط الحد الأقصى لعدد البايتات لمحتوى الاستجابة. |
| [set_Timeout](./set_timeout/)(TimeSpan) | يضبط الفاصل الزمني للانتظار قبل انتهاء مهلة الطلب. |
## انظر أيضًا

* Class [HttpMessageInvoker](../httpmessageinvoker/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
