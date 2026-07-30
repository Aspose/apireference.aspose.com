---
title: "System::Drawing::Imaging::Metafile class"
linktitle: "Metafile"
second_title: "Aspose.Font لـ C++"
description: "System::Drawing::Imaging::Metafile class. تمثل ملف ميتا رسومي. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء تشغيلية و/أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1200
url: /ar/cpp/system.drawing.imaging/metafile/
---
## Metafile class


تمثل ملف ميتا رسومي. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء تشغيلية و/أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class Metafile : public System::Drawing::Image
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() override | يعيد نسخة من الكائن الحالي. |
| [get_Height](./get_height/)() const override | يعيد ارتفاعات الصورة بالبكسل. |
| [get_PixelFormat](./get_pixelformat/)() const override | يعيد قيمة تشير إلى تنسيق البكسل. |
| [get_RawFormat](./get_rawformat/)() const override | يعيد قيمة تشير إلى تنسيق الصورة. |
| [get_Width](./get_width/)() const override | يعيد عرض الصورة بالبكسل. |
| [GetHenhmetafile](./gethenhmetafile/)() | غير مُنفّذ. |
| [GetMetafileHeader](./getmetafileheader/)() | يعيد رأسًا مرتبطًا بالكائن الحالي. |
| [Metafile](./metafile/)(const System::String\&) | غير مُنفّذ. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&) | غير مُنفّذ. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, EmfType) | غير مُنفّذ. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr) | غير مُنفّذ. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, Rectangle, MetafileFrameUnit, EmfType) | غير مُنفّذ. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | غير مُنفّذ. |
| [Metafile](./metafile/)(IntPtr, EmfType) | غير مُنفّذ. |
| [PlayRecord](./playrecord/)(EmfPlusRecordType, int32_t, int32_t, System::ByteArrayPtr) | غير مُنفّذ. |
| virtual [~Metafile](./~metafile/)() | المدمر. |
## انظر أيضًا

* Class [Image](../../system.drawing/image/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
