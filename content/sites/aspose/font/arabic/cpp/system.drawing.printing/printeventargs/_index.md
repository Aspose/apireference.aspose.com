---
title: "System::Drawing::Printing::PrintEventArgs فئة"
linktitle: "PrintEventArgs"
second_title: "Aspose.Font لـ C++"
description: "System::Drawing::Printing::PrintEventArgs فئة. توفر البيانات لأحداث BeginPrint و EndPrint. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 800
url: /ar/cpp/system.drawing.printing/printeventargs/
---
## PrintEventArgs class


توفر البيانات لأحداث BeginPrint و EndPrint. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class PrintEventArgs : public System::ComponentModel::CancelEventArgs
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_PrintAction](./get_printaction/)() | يعيد قيمة تحدد إجراء الطباعة الممثل بالكائن الحالي. |
| [PrintEventArgs](./printeventargs/)() | ينشئ مثيلاً جديداً لكائن [PrintEventArgs](./). |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | عضو ثابت يمثل مؤشرًا مشتركًا "فارغ" [EventArgs](../../system/eventargs/) (مؤشر فارغ). |
## انظر أيضًا

* Class [CancelEventArgs](../../system.componentmodel/canceleventargs/)
* Namespace [System::Drawing::Printing](../)
* Library [Aspose.Font for C++](../../)
