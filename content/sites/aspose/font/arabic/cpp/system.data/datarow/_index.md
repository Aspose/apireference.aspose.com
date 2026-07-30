---
title: "فئة System::Data::DataRow"
linktitle: "DataRow"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Data::DataRow. صف في مجموعة البيانات. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المُعامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 500
url: /ar/cpp/system.data/datarow/
---
## DataRow class


صف في مجموعة البيانات. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class DataRow : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Table](./get_table/)() | يحصل على صف الجدول الذي ينتمي إليه. |
| [GetChildRows](./getchildrows/)(const System::SharedPtr\<System::Data::DataRelation\>\&) | يحصل على الصفوف التي تُعتبر فرعية عبر العلاقة المحددة. |
| [idx_get](./idx_get/)(const int32_t) | معلومات RTTI. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Font for C++](../../)
