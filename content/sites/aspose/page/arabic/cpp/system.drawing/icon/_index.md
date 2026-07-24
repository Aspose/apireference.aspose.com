---
title: "System::Drawing::Icon فئة"
linktitle: "أيقونة"
second_title: "Aspose.Page لـ C++"
description: "System::Drawing::Icon فئة. تمثل أيقونة Windows. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1100
url: /ar/cpp/system.drawing/icon/
---
## Icon class


يمثل أيقونة [Windows](../../system.windows/). يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class Icon : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Height](./get_height/)() const | يرجع ارتفاع الأيقونة. |
| [get_Width](./get_width/)() const | يرجع عرض الأيقونة. |
| [Icon](./icon/)(const String\&) | ينشئ نسخة جديدة من فئة [Icon](./) التي تمثل أيقونة من الملف المحدد. |
| [ToBitmap](./tobitmap/)() | يحوّل الكائن الحالي إلى كائن [Bitmap](../bitmap/). |
| virtual [~Icon](./~icon/)() | المدمر. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
