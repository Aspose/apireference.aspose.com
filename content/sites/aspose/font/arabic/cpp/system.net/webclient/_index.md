---
title: "فئة System::Net::WebClient"
linktitle: "WebClient"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Net::WebClient. يوفر WebClient طرقًا شائعة لإرسال واستقبال البيانات. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام العامل new، حيث سيؤدي ذلك إلى أخطاء تشغيلية و/أو أعطال في التحقق. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3500
url: /ar/cpp/system.net/webclient/
---
## WebClient class


[WebClient](./) provides common methods for sending and receiving data. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class WebClient : public System::ComponentModel::Component
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [DownloadData](./downloaddata/)(const String\&) const | يقوم بتنزيل المورد المحدد كمصفوفة بايت. |
| [DownloadData](./downloaddata/)(const SharedPtr\<Uri\>\&) const | يقوم بتنزيل المورد المحدد كمصفوفة بايت. |
| [DownloadString](./downloadstring/)(const String\&) const | يقوم بتنزيل المورد المحدد كسلسلة نصية. |
| [DownloadString](./downloadstring/)(const SharedPtr\<Uri\>\&) const | يقوم بتنزيل المورد المحدد كسلسلة نصية. |
| [get_Encoding](./get_encoding/)() const | يحصل على الترميز المستخدم لتنزيل أو رفع السلاسل. |
| [set_Encoding](./set_encoding/)(const SharedPtr\<Text::Encoding\>\&) | يحدد الترميز المستخدم لتنزيل أو رفع السلاسل. |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | غير مُنفّذ. |
| [WebClient](./webclient/)() | معلومات RTTI. |
| [~WebClient](./~webclient/)() | يدمر النسخة الحالية. |
## انظر أيضًا

* Class [Component](../../system.componentmodel/component/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
