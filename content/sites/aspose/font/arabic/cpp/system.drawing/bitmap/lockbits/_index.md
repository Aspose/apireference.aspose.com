---
title: "System::Drawing::Bitmap::LockBits method"
linktitle: "LockBits"
second_title: "Aspose.Font لـ C++"
description: "System::Drawing::Bitmap::LockBits method. يقفل صورة Bitmap في ذاكرة النظام في C++."
type: docs
weight: 1500
url: /ar/cpp/system.drawing/bitmap/lockbits/
---
## Bitmap::LockBits(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat) method


يقفل [Bitmap](../) في ذاكرة النظام.

```cpp
Imaging::BitmapDataPtr System::Drawing::Bitmap::LockBits(const Rectangle &rect, Imaging::ImageLockMode flags, Imaging::PixelFormat format)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| rect | const Rectangle\& | مستطيل يحدد منطقة الصورة التي سيتم قفلها |
| الأعلام | Imaging::ImageLockMode | يحدد مستوى الوصول إلى الصورة النقطية |
| صيغة | Imaging::PixelFormat | تنسيق البيانات لهذه الصورة النقطية |

### ReturnValue

مؤشر مشترك إلى كائن BitmapData يحتوي على معلومات حول عملية القفل التي تم تنفيذها

## انظر أيضًا

* Typedef [BitmapDataPtr](../../../system.drawing.imaging/bitmapdataptr/)
* Class [Rectangle](../../rectangle/)
* Enum [ImageLockMode](../../../system.drawing.imaging/imagelockmode/)
* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Bitmap::LockBits(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat, const Imaging::BitmapDataPtr\&) method


يقفل [Bitmap](../) في ذاكرة النظام.

```cpp
Imaging::BitmapDataPtr System::Drawing::Bitmap::LockBits(const Rectangle &rect, Imaging::ImageLockMode flags, Imaging::PixelFormat format, const Imaging::BitmapDataPtr &bitmap_data)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| rect | const Rectangle\& | مستطيل يحدد منطقة الصورة التي سيتم قفلها |
| الأعلام | Imaging::ImageLockMode | يحدد مستوى الوصول إلى الصورة النقطية |
| صيغة | Imaging::PixelFormat | تنسيق البيانات لهذه الصورة النقطية |
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
* Library [Aspose.Font for C++](../../../)
