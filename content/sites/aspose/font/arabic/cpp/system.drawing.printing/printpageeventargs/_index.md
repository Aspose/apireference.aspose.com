---
title: "الفئة System::Drawing::Printing::PrintPageEventArgs"
linktitle: "PrintPageEventArgs"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Drawing::Printing::PrintPageEventArgs. توفر بيانات لحدث PrintPage. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 900
url: /ar/cpp/system.drawing.printing/printpageeventargs/
---
## PrintPageEventArgs class


يوفر بيانات لحدث PrintPage. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class PrintPageEventArgs : public System::EventArgs
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Graphics](./get_graphics/)() | غير مُنفّذ. |
| [get_HasMorePages](./get_hasmorepages/)() | غير مُنفّذ. |
| [get_PageSettings](./get_pagesettings/)() | غير مُنفّذ. |
| [PrintPageEventArgs](./printpageeventargs/)(const SharedPtr\<Graphics\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<PageSettings\>\&) | ينشئ مثيلاً جديداً من الفئة [PrintPageEventArgs](./). |
| [set_HasMorePages](./set_hasmorepages/)(bool) | غير مُنفّذ. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | عضو ثابت يمثل مؤشرًا مشتركًا "فارغ" [EventArgs](../../system/eventargs/) (مؤشر فارغ). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## انظر أيضًا

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Drawing::Printing](../)
* Library [Aspose.Font for C++](../../)
