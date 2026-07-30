---
title: "فئة System::Data::DataTable"
linktitle: "DataTable"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Data::DataTable. البيانات مُنظمة في صفوف وأعمدة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المُعامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 900
url: /ar/cpp/system.data/datatable/
---
## DataTable class


[Data](../) structured in rows and columns. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DataTable : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Columns](./get_columns/)() | يحصل على الأعمدة الموجودة في الجدول. |
| [get_DataSet](./get_dataset/)() | يحصل على مجموعة البيانات التي ينتمي إليها الجدول. |
| [get_Rows](./get_rows/)() | معلومات RTTI. |
| [get_TableName](./get_tablename/)() | يحصل على اسم الجدول. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Font for C++](../../)
