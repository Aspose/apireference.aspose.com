---
title: "طريقة System::Drawing::Bitmap::LockBits"
linktitle: "LockBits"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Drawing::Bitmap::LockBits. تقوم بقفل صورة Bitmap في ذاكرة النظام في C++."
type: docs
weight: 1500
url: /ar/cpp/system.drawing/bitmap/lockbits/
---
## Bitmap::LockBits(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat) method


يقفل [Bitmap](../) في ذاكرة النظام.

```cpp
Imaging::BitmapDataPtr System::Drawing::Bitmap::LockBits(const Rectangle &rect, Imaging::ImageLockMode flags, Imaging::PixelFormat format)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| rect | const Rectangle\& | مستطيل يحدد منطقة الصورة التي سيتم قفلها |
| flags | Imaging::ImageLockMode | يحدد مستوى الوصول إلى bitmap |
| تنسيق | Imaging::PixelFormat | تنسيق البيانات لهذا bitmap |

### ReturnValue

مؤشر مشترك إلى كائن BitmapData يحتوي على معلومات حول عملية القفل التي تم تنفيذها

## انظر أيضًا

* Typedef [BitmapDataPtr](../../../system.drawing.imaging/bitmapdataptr/)
* Class [Rectangle](../../rectangle/)
* Enum [ImageLockMode](../../../system.drawing.imaging/imagelockmode/)
* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::LockBits(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat, const Imaging::BitmapDataPtr\&) method


يقفل [Bitmap](../) في ذاكرة النظام.

```cpp
Imaging::BitmapDataPtr System::Drawing::Bitmap::LockBits(const Rectangle &rect, Imaging::ImageLockMode flags, Imaging::PixelFormat format, const Imaging::BitmapDataPtr &bitmap_data)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| rect | const Rectangle\& | مستطيل يحدد منطقة الصورة التي سيتم قفلها |
| flags | Imaging::ImageLockMode | يحدد مستوى الوصول إلى bitmap |
| تنسيق | Imaging::PixelFormat | تنسيق البيانات لهذا bitmap |
| bitmap_data | const Imaging::BitmapDataPtr\& | يحتوي على معلومات حول عملية القفل |

### ReturnValue

مؤشر مشترك إلى كائن BitmapData يحتوي على معلومات حول عملية القفل التي تم تنفيذها

## انظر أيضًا

* Typedef [BitmapDataPtr](../../../system.drawing.imaging/bitmapdataptr/)
* Class [Rectangle](../../rectangle/)
* Enum [ImageLockMode](../../../system.drawing.imaging/imagelockmode/)
* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
