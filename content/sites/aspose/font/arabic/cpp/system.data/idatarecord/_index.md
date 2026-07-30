---
title: "الفئة System::Data::IDataRecord"
linktitle: "IDataRecord"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Data::IDataRecord. واجهة لسجل يحتوي على أعمدة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. دائمًا غلف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1300
url: /ar/cpp/system.data/idatarecord/
---
## IDataRecord class


واجهة لسجل يحتوي على أعمدة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. دائمًا غلف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

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
* Library [Aspose.Font for C++](../../)
