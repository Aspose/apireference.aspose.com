---
title: "فئة System::Net::Http::HttpMessageInvoker"
linktitle: "HttpMessageInvoker"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Net::Http::HttpMessageInvoker. تسمح للتطبيقات باستدعاء طريقة Send على سلسلة معالجات HTTP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. يجب دائمًا تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 600
url: /ar/cpp/system.net.http/httpmessageinvoker/
---
## HttpMessageInvoker class


تسمح للتطبيقات باستدعاء طريقة Send على سلسلة معالجات HTTP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. يجب دائمًا تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class HttpMessageInvoker : public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Dispose](./dispose/)() override | يقوم بتحرير المثيلة الحالية. كما يقوم هذا الأسلوب بتحرير المعالج إذا لزم الأمر. |
| [HttpMessageInvoker](./httpmessageinvoker/)(System::SharedPtr\<HttpMessageHandler\>) | معلومات RTTI. |
| [HttpMessageInvoker](./httpmessageinvoker/)(System::SharedPtr\<HttpMessageHandler\>, bool) | ينشئ نسخة جديدة. |
| virtual [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) | يرسل الطلب المحدد. |
## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
