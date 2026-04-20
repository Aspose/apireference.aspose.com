---
title: "System::Drawing::Imaging::BitmapData class"
linktitle: "BitmapData"
second_title: "Aspose.Font لـ C++"
description: "System::Drawing::Imaging::BitmapData class. تمثّل مجموعة من السمات لصورة bitmap. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال في التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.drawing.imaging/bitmapdata/
---
## BitmapData class


تمثّل مجموعة من السمات لصورة bitmap. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال في التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class BitmapData : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Height](./get_height/)() const | يعيد ارتفاع الصورة بالبكسل. |
| [get_PixelFormat](./get_pixelformat/)() const | يعيد تنسيق البكسل لصورة bitmap. |
| [get_Scan0](./get_scan0/)() const | يعيد عنوان أول بيانات بكسل في الـ bitmap. |
| [get_Stride](./get_stride/)() const | يعيد عرض الخطوة (stride) للصورة بالبايت. |
| [get_Width](./get_width/)() const | يعيد عرض الصورة بالبكسل. |
| [set_Height](./set_height/)(int) | يضبط ارتفاع الصورة بالبكسل. |
| [set_PixelFormat](./set_pixelformat/)(PixelFormat) | يضبط تنسيق البكسل لصورة bitmap. |
| [set_Scan0](./set_scan0/)(IntPtr) | يضبط عنوان أول بيانات بكسل في الـ bitmap. |
| [set_Stride](./set_stride/)(int) | يضبط عرض الخطوة (stride) للصورة بالبايت. |
| [set_Width](./set_width/)(int) | يضبط عرض الصورة بالبكسل. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
