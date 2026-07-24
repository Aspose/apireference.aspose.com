---
title: "فئة System::Data::Common::DbDataReader"
linktitle: "DbDataReader"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Data::Common::DbDataReader. واجهة برمجة التطبيقات لاستلام البيانات من قاعدة البيانات. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 400
url: /ar/cpp/system.data.common/dbdatareader/
---
## DbDataReader class


واجهة برمجة التطبيقات لاستلام البيانات من قاعدة البيانات. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class DbDataReader : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Close](./close/)() | يغلق قناة استرجاع البيانات. |
| virtual [idx_get](./idx_get/)(String) | يحصل على العنصر المسمى. |
| virtual [idx_get](./idx_get/)(int) | يحصل على العنصر حسب الفهرس. |
| virtual [Read](./read/)() | يقرأ السجل التالي من قاعدة البيانات. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | معلومات RTTI. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Page for C++](../../)
