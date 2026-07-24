---
title: "System::Drawing::Printing::PrintEventArgs class"
linktitle: "PrintEventArgs"
second_title: "Aspose.Page لـ C++"
description: "System::Drawing::Printing::PrintEventArgs class. يوفّر بيانات لأحداث BeginPrint و EndPrint. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 800
url: /ar/cpp/system.drawing.printing/printeventargs/
---
## PrintEventArgs class


يوفّر بيانات لأحداث BeginPrint و EndPrint. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class PrintEventArgs : public System::ComponentModel::CancelEventArgs
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_PrintAction](./get_printaction/)() | يعيد قيمة تحدد إجراء الطباعة الممثّل بالكائن الحالي. |
| [PrintEventArgs](./printeventargs/)() | ينشئ مثيلاً جديداً من كائن [PrintEventArgs](./). |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | عضو ثابت يمثل [EventArgs](../../system/eventargs/) مؤشرًا مشتركًا "فارغًا" (null-pointer). |
## انظر أيضًا

* Class [CancelEventArgs](../../system.componentmodel/canceleventargs/)
* Namespace [System::Drawing::Printing](../)
* Library [Aspose.Page for C++](../../)
