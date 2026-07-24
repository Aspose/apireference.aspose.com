---
title: "System::Drawing::Printing::PrintPageEventArgs فئة"
linktitle: "PrintPageEventArgs"
second_title: "Aspose.Page لـ C++"
description: "System::Drawing::Printing::PrintPageEventArgs فئة. توفر بيانات لحدث PrintPage. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 900
url: /ar/cpp/system.drawing.printing/printpageeventargs/
---
## PrintPageEventArgs class


توفر بيانات لحدث PrintPage. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class PrintPageEventArgs : public System::EventArgs
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Graphics](./get_graphics/)() | غير مُنفَّذ. |
| [get_HasMorePages](./get_hasmorepages/)() | غير مُنفَّذ. |
| [get_PageSettings](./get_pagesettings/)() | غير مُنفَّذ. |
| [PrintPageEventArgs](./printpageeventargs/)(const SharedPtr\<Graphics\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<PageSettings\>\&) | ينشئ نسخة جديدة من فئة [PrintPageEventArgs](./). |
| [set_HasMorePages](./set_hasmorepages/)(bool) | غير مُنفَّذ. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | عضو ثابت يمثل [EventArgs](../../system/eventargs/) مؤشرًا مشتركًا "فارغًا" (null-pointer). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## انظر أيضًا

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Drawing::Printing](../)
* Library [Aspose.Page for C++](../../)
