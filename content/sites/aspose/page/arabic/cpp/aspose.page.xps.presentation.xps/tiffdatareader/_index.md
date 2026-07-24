---
title: "Aspose::Page::XPS::Presentation::Xps::TiffDataReader فئة"
linktitle: "TiffDataReader"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::Presentation::Xps::TiffDataReader فئة. تُستخدم الفئة لقراءة البيانات من دليل ملف صورة TIFF (IFD). تساعد على قراءة دقة TIFF والتحقق من توافق TIFF في C++."
type: docs
weight: 100
url: /ar/cpp/aspose.page.xps.presentation.xps/tiffdatareader/
---
## TiffDataReader class


يتم استخدام الفئة لقراءة البيانات من دليل ملف صورة TIFF (IFD). يساعد على قراءة دقة TIFF والتحقق من توافق TIFF.

```cpp
class TiffDataReader : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_ImageHeight](./get_imageheight/)() | يعيد ارتفاع صورة Tiff. إذا كان الارتفاع 0، يعيد القيمة الافتراضية (100). |
| [get_ImageWidth](./get_imagewidth/)() | يعيد عرض صورة Tiff. إذا كان العرض 0، يعيد القيمة الافتراضية (100). |
| [get_ImageXResolution](./get_imagexresolution/)() const | يعيد دقة X لصورة Tiff. |
| [get_ImageYResolution](./get_imageyresolution/)() const | يعيد دقة Y لصورة Tiff. |
| [get_IsConformXpsSpecification](./get_isconformxpsspecification/)() | يعيد true إذا كان صورة TIFF تتوافق مع مواصفة [XPS](../../aspose.page.xps/) ويمكن إدراجها في مستند [XPS](../../aspose.page.xps/) كما هي. |
| static [IsTiff](./istiff/)(System::ArrayPtr\<uint8_t\>) | التوثيق للنسق موجود في Aspose.Words\Doc. |
| [TiffDataReader](./tiffdatareader/)(System::ArrayPtr\<uint8_t\>) | يُهيئ نسخة جديدة من الفئة [TiffDataReader](./). |
| [TiffDataReader](./tiffdatareader/)(System::SharedPtr\<Foundation::BigEndianBinaryReader\>) | يُهيئ نسخة جديدة من الفئة [TiffDataReader](./). |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Presentation::Xps](../)
* Library [Aspose.Page for C++](../../)
