---
title: "System::Net::Http::HttpMessageInvoker فئة"
linktitle: "HttpMessageInvoker"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Net::Http::HttpMessageInvoker. تسمح للتطبيقات باستدعاء طريقة Send على سلسلة معالجات HTTP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 600
url: /ar/cpp/system.net.http/httpmessageinvoker/
---
## HttpMessageInvoker class


تسمح للتطبيقات باستدعاء طريقة Send على سلسلة معالجات HTTP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class HttpMessageInvoker : public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Dispose](./dispose/)() override | يفكّ الموارد للمثيلة الحالية. تقوم هذه الطريقة أيضاً بتحرير المعالج إذا لزم الأمر. |
| [HttpMessageInvoker](./httpmessageinvoker/)(System::SharedPtr\<HttpMessageHandler\>) | معلومات RTTI. |
| [HttpMessageInvoker](./httpmessageinvoker/)(System::SharedPtr\<HttpMessageHandler\>, bool) | ينشئ نسخة جديدة. |
| virtual [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) | يرسل الطلب المحدد. |
## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
