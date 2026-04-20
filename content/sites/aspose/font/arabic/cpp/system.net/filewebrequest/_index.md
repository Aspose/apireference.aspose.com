---
title: "System::Net::FileWebRequest class"
linktitle: "FileWebRequest"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Net::FileWebRequest. توفر تنفيذًا للفئة المجردة WebRequest للعمل مع نظام الملفات. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. يجب دائمًا تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1000
url: /ar/cpp/system.net/filewebrequest/
---
## FileWebRequest class


يوفر تنفيذًا للفئة المجردة [WebRequest](../webrequest/) للعمل مع نظام الملفات. يجب تخصيص كائنات هذه الفئة باستخدام الدالة [System::MakeObject()](../../system/makeobject/) فقط. لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class FileWebRequest : public System::Net::WebRequest
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Abort](./abort/)() override | يلغي الطلب الحالي. |
| [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) override | يبدأ عملية غير متزامنة للحصول على تدفق لكتابة البيانات إلى المورد. |
| [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) override | يبدأ طلبًا غير متزامنًا للمورد. |
| [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) override | ينتظر حتى تكتمل العملية غير المتزامنة المحددة للحصول على تدفق. |
| [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) override | ينتظر حتى يكتمل الطلب غير المتزامن المحدد للمورد. |
| [FileWebRequest](./filewebrequest/)(System::SharedPtr\<Uri\>) | ينشئ نسخة جديدة. |
| [get_ContentType](./get_contenttype/)() override | يحصل على نوع MIME للطلب. |
| [get_Headers](./get_headers/)() override | يحصل على مجموعة رؤوس HTTP. |
| [get_Method](./get_method/)() override | يحصل على طريقة HTTP. |
| [get_RequestUri](./get_requesturi/)() override | يعيد URI الطلب. |
| [GetResponse](./getresponse/)() override | يعيد استجابة الويب المرتبطة بالطلب الويب الحالي. |
| [set_ContentType](./set_contenttype/)(String) override | يضبط نوع MIME للطلب. |
| [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) override | يضبط مجموعة رؤوس HTTP. |
| [set_Method](./set_method/)(String) override | يضبط طريقة HTTP. |
| [set_Timeout](./set_timeout/)(int) override | معلومات RTTI. |
## انظر أيضًا

* Class [WebRequest](../webrequest/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
