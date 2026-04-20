---
title: "System::Drawing::Imaging::ImageFlags enum"
linktitle: "ImageFlags"
second_title: "Aspose.Font لـ C++"
description: "System::Drawing::Imaging::ImageFlags enum. يمثل خصائص بيانات البكسل التي يمثلها كائن Image في C++."
type: docs
weight: 2200
url: /ar/cpp/system.drawing.imaging/imageflags/
---
## ImageFlags enum


يمثل خصائص بيانات البكسل التي يمثلها كائن [Image](../../system.drawing/image/) .

```cpp
enum class ImageFlags
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| None | 0 |  |
| Scalable | 1 | قابل للتوسع. |
| HasAlpha | 2 | يحتوي على معلومات ألفا. |
| HasTranslucent | 4 | هناك قيم ألفا أكبر من 0 وأقل من 255. |
| PartiallyScalable | 8 |  |
| ColorSpaceRgb | 16 | يتم تمثيل بيانات البكسل في مساحة اللون RGB. |
| ColorSpaceCmyk | 32 | يتم تمثيل بيانات البكسل في مساحة اللون CMYK. |
| ColorSpaceGray | 64 | بيانات البكسل هي بتدرج الرمادي. |
| ColorSpaceYcbcr | 128 | يتم تمثيل بيانات البكسل في مساحة اللون YCBCR. |
| ColorSpaceYcck | 256 | يتم تمثيل بيانات البكسل في مساحة اللون YCCK. |
| HasRealDpi | 4096 | يتم تخزين معلومات DPI في الصورة. |
| HasRealPixelSize | 8192 | يتم تخزين حجم البكسل في الصورة. |
| ReadOnly | 65536 | بيانات البكسل للقراءة فقط. |
| Caching | 131072 | يمكن تخزينها مؤقتًا للوصول الأسرع. |

## انظر أيضًا

* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
