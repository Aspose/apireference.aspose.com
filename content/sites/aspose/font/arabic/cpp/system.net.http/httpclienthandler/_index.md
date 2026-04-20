---
title: "فئة System::Net::Http::HttpClientHandler"
linktitle: "HttpClientHandler"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Net::Http::HttpClientHandler. تمثل معالج الرسائل الافتراضي المستخدم من قبل فئة HttpClient. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. يجب دائمًا تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 300
url: /ar/cpp/system.net.http/httpclienthandler/
---
## HttpClientHandler class


تمثل معالج الرسائل الافتراضي المستخدم من قبل فئة [HttpClient](../httpclient/) class. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. يجب دائمًا تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class HttpClientHandler : public System::Net::Http::HttpMessageHandler
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Dispose](./dispose/)() override | لا يفعل شيئًا. |
| [get_CookieContainer](./get_cookiecontainer/)() | يحصل على حاوية الكوكيز المستخدمة لتخزين كوكيز الخادم. |
| [get_Credentials](./get_credentials/)() | يحصل على معلومات المصادقة. |
| [HttpClientHandler](./httpclienthandler/)() | معلومات RTTI. |
| [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) override | معلومات RTTI. |
| [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | يضبط حاوية الكوكيز المستخدمة لتخزين كوكيز الخادم. |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | يضبط معلومات المصادقة. |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) | يضبط معلومات الوكيل. |
| [set_Timeout](./set_timeout/)(int32_t) | يحصل على مقدار الوقت بالمللي ثانية الذي بعده سينتهي مهلة الطلب. |
| [set_UseCookies](./set_usecookies/)(bool) | يضبط القيمة التي تشير إلى ما إذا كانت المثيلة الحالية تستخدم حاوية الكوكيز لتخزين كوكيز الخادم وما إذا كانت المثيلة تستخدم كوكيز الخادم عند إرسال الطلبات. |
| [set_UseProxy](./set_useproxy/)(bool) | يضبط القيمة التي تشير إلى ما إذا كانت المثيلة الحالية تستخدم الوكيل لإرسال الطلبات. |
## انظر أيضًا

* Class [HttpMessageHandler](../httpmessagehandler/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
