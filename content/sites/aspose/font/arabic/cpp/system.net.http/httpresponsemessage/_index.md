---
title: "فئة System::Net::Http::HttpResponseMessage"
linktitle: "HttpResponseMessage"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Net::Http::HttpResponseMessage. تمثل رسالة استجابة HTTP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 900
url: /ar/cpp/system.net.http/httpresponsemessage/
---
## HttpResponseMessage class


تمثل رسالة استجابة HTTP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class HttpResponseMessage : public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Dispose](./dispose/)() override | يقوم بتحرير النسخة الحالية. كما تقوم هذه الطريقة بتحرير محتوى استجابة HTTP. |
| [EnsureSuccessStatusCode](./ensuresuccessstatuscode/)() | يفحص رمز الحالة. سيتم رمي [HttpRequestException](../httprequestexception/) عندما لا ينتمي رمز الحالة إلى 2xx. |
| [get_Content](./get_content/)() const | يحصل على محتوى استجابة HTTP. |
| [get_Headers](./get_headers/)() const | يعيد رؤوس محتوى HTTP. |
| [get_IsSuccessStatusCode](./get_issuccessstatuscode/)() const | يفحص ما إذا كان رمز الحالة يشير إلى أن الإجراء المطلوب من العميل تم استلامه وفهمه وقبوله. |
| [get_ReasonPhrase](./get_reasonphrase/)() const | يحصل على عبارة السبب (Reason-Phrase) التي يرسلها الخادم مع رمز الحالة. |
| [get_RequestMessage](./get_requestmessage/)() const | يحصل على رسالة طلب HTTP. |
| [get_StatusCode](./get_statuscode/)() const | يحصل على رمز حالة HTTP. |
| [get_Version](./get_version/)() const | معلومات RTTI. |
| [HttpResponseMessage](./httpresponsemessage/)() | ينشئ نسخة جديدة. |
| [HttpResponseMessage](./httpresponsemessage/)(HttpStatusCode) | ينشئ نسخة جديدة. |
| [set_Content](./set_content/)(System::SharedPtr\<HttpContent\>) | يضبط محتوى استجابة HTTP. |
| [set_ReasonPhrase](./set_reasonphrase/)(String) | يضبط عبارة السبب (Reason-Phrase) التي يرسلها الخادم مع رمز الحالة. |
| [set_RequestMessage](./set_requestmessage/)(System::SharedPtr\<HttpRequestMessage\>) | يضبط رسالة طلب HTTP. |
| [set_StatusCode](./set_statuscode/)(HttpStatusCode) | يضبط رمز حالة HTTP. |
| [set_Version](./set_version/)(System::Version) | يضبط إصدار HTTP. |
| [ToString](./tostring/)() const override | [System::Object::ToString](../../system/object/tostring/). |
## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
