---
title: "فئة System::Net::IPHostEntry"
linktitle: "IPHostEntry"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Net::IPHostEntry. تمثل معلومات حول عنوان مضيف الإنترنت. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2600
url: /ar/cpp/system.net/iphostentry/
---
## IPHostEntry class


تمثل معلومات حول عنوان مضيف الإنترنت. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class IPHostEntry : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_AddressList](./get_addresslist/)() | يحصل على مجموعة عناوين IP للمضيف. |
| [get_Aliases](./get_aliases/)() | يحصل على مجموعة الأسماء المستعارة للمضيف. |
| [get_HostName](./get_hostname/)() const | معلومات RTTI. |
| [IPHostEntry](./iphostentry/)() | ينشئ نسخة جديدة. |
| [set_AddressList](./set_addresslist/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>) | يضبط مجموعة عناوين IP للمضيف. |
| [set_Aliases](./set_aliases/)(System::ArrayPtr\<String\>) | يضبط مجموعة الأسماء المستعارة للمضيف. |
| [set_HostName](./set_hostname/)(String) | يضبط اسم المضيف. |
| [ToString](./tostring/)() const override | تماثل طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
