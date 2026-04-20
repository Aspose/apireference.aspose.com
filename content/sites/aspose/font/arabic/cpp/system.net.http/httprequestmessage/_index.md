---
title: "System::Net::Http::HttpRequestMessage الفئة"
linktitle: "HttpRequestMessage"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Http::HttpRequestMessage الفئة. تمثل رسالة طلب HTTP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 800
url: /ar/cpp/system.net.http/httprequestmessage/
---
## HttpRequestMessage class


تمثل رسالة طلب HTTP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class HttpRequestMessage : public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Dispose](./dispose/)() override | يتخلص من المثيل الحالي. كما تقوم هذه الطريقة أيضًا بالتخلص من محتوى طلب HTTP. |
| [get_Content](./get_content/)() | يحصل على محتوى طلب HTTP. |
| [get_Headers](./get_headers/)() | يعيد رؤوس محتوى HTTP. |
| [get_Method](./get_method/)() | يحصل على طريقة طلب HTTP. |
| [get_Properties](./get_properties/)() | يعيد مجموعة خصائص طلب HTTP. |
| [get_RequestUri](./get_requesturi/)() | يحصل على URI المورد المطلوب. |
| [get_Version](./get_version/)() | معلومات RTTI. |
| [HttpRequestMessage](./httprequestmessage/)() | ينشئ نسخة جديدة. |
| [HttpRequestMessage](./httprequestmessage/)(System::SharedPtr\<HttpMethod\>, System::SharedPtr\<Uri\>) | ينشئ نسخة جديدة. |
| [HttpRequestMessage](./httprequestmessage/)(System::SharedPtr\<HttpMethod\>, String) | ينشئ نسخة جديدة. |
| [MarkAsSent](./markassent/)() | يعلّم الطلب الحالي كمرسل. |
| [set_Content](./set_content/)(System::SharedPtr\<HttpContent\>) | يضبط محتوى طلب HTTP. |
| [set_Method](./set_method/)(System::SharedPtr\<HttpMethod\>) | يضبط طريقة طلب HTTP. |
| [set_RequestUri](./set_requesturi/)(System::SharedPtr\<Uri\>) | يضبط URI المورد المطلوب. |
| [set_Version](./set_version/)(System::Version) | يضبط إصدار HTTP. |
| [ToString](./tostring/)() const override | تماثل طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
