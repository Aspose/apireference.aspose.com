---
title: "فئة System::Data::IDataRecord"
linktitle: "IDataRecord"
second_title: "Aspose.Page لـ C++"
description: "System::Data::IDataRecord فئة. واجهة لتسجيل مع أعمدة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أعطال تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريرها إلى الدوال كمعامل في C++."
type: docs
weight: 1300
url: /ar/cpp/system.data/idatarecord/
---
## IDataRecord class


واجهة لتسجيل مع أعمدة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أعطال تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريرها إلى الدوال كمعامل.

```cpp
class IDataRecord : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [get_FieldCount](./get_fieldcount/)() | معلومات RTTI. |
| virtual [GetName](./getname/)(const int32_t) | يحصل على اسم الحقل في الموضع المحدد. |
| virtual [idx_get](./idx_get/)(const int32_t) | يحصل على القيمة في الفهرس المحدد. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Page for C++](../../)
