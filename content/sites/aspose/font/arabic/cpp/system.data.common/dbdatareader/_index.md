---
title: "System::Data::Common::DbDataReader class"
linktitle: "DbDataReader"
second_title: "Aspose.Font لـ C++"
description: "System::Data::Common::DbDataReader class. واجهة برمجة تطبيقات لاستلام البيانات من قاعدة البيانات. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام operator new، لأن ذلك سيسبّب أخطاء تشغيلية و/أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 400
url: /ar/cpp/system.data.common/dbdatareader/
---
## DbDataReader class


واجهة برمجة تطبيقات لاستلام البيانات من قاعدة البيانات. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام operator new، لأن ذلك سيسبّب أخطاء تشغيلية و/أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

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
* Library [Aspose.Font for C++](../../)
