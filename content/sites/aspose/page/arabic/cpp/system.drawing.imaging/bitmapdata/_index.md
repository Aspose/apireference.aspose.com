---
title: "System::Drawing::Imaging::BitmapData class"
linktitle: "BitmapData"
second_title: "Aspose.Page لـ C++"
description: "System::Drawing::Imaging::BitmapData class. يمثل مجموعة من الخصائص لصورة bitmap. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أعطال تأكيدية. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.drawing.imaging/bitmapdata/
---
## BitmapData class


يمثل مجموعة من الخصائص لصورة bitmap. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أعطال تأكيدية. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class BitmapData : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Height](./get_height/)() const | يعيد ارتفاع الصورة بالبكسل. |
| [get_PixelFormat](./get_pixelformat/)() const | يعيد تنسيق البكسل لصورة bitmap. |
| [get_Scan0](./get_scan0/)() const | يعيد عنوان أول بيانات بكسل في الـ bitmap. |
| [get_Stride](./get_stride/)() const | يعيد عرض الخط (stride) للصورة بالبايت. |
| [get_Width](./get_width/)() const | يعيد عرض الصورة بالبكسل. |
| [set_Height](./set_height/)(int) | يضبط ارتفاع الصورة بالبكسل. |
| [set_PixelFormat](./set_pixelformat/)(PixelFormat) | يضبط تنسيق البكسل لصورة bitmap. |
| [set_Scan0](./set_scan0/)(IntPtr) | يضبط عنوان أول بيانات بكسل في الـ bitmap. |
| [set_Stride](./set_stride/)(int) | يضبط عرض الخط (stride) للصورة بالبايت. |
| [set_Width](./set_width/)(int) | يضبط عرض الصورة بالبكسل. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
