---
title: "منشئ System::Drawing::Bitmap::Bitmap"
linktitle: "Bitmap"
second_title: "Aspose.Page لـ C++"
description: "منشئ System::Drawing::Bitmap::Bitmap. يُنشئ كائن Bitmap جديد من الصورة الموجودة المحددة في C++."
type: docs
weight: 100
url: /ar/cpp/system.drawing/bitmap/bitmap/
---
## Bitmap::Bitmap(const SharedPtr\<Image\>\&) constructor


يُنشئ كائن [Bitmap](../) جديد من الصورة الموجودة المحددة.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الأصلي | const SharedPtr\<Image\>\& | الصورة الموجودة لإنشاء صورة bitmap منها |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<Image\>\&, const Size\&) constructor


يُنشئ كائن [Bitmap](../) جديد من الصورة الموجودة المحددة، مُقاسًا إلى الحجم المحدد.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original, const Size &size)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الأصلي | const SharedPtr\<Image\>\& | الصورة الموجودة لإنشاء صورة bitmap منها |
| size | const Size\& | حجم الصورة الجديدة |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Size](../../size/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<Image\>\&, int, int) constructor


يُنشئ كائن [Bitmap](../) جديد من الصورة الموجودة المحددة مع تعديل العرض والارتفاع إلى القيم المحددة.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original, int width, int height)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الأصلي | const SharedPtr\<Image\>\& | الصورة الموجودة لإنشاء صورة bitmap منها |
| العرض | int | عرض الصورة الجديدة |
| الارتفاع | int | ارتفاع الصورة الجديدة |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<System::IO::Stream\>\&, bool) constructor


يُنشئ كائن [Bitmap](../) جديد من الدفق المحدد.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<System::IO::Stream> &stream, bool useIcm=false)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| دفق | const SharedPtr\<System::IO::Stream\>\& | دفق يحتوي على بيانات الصورة |
| useIcm | bool | IGNORED |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const String\&) constructor


يُنشئ كائن [Bitmap](../) جديد من الملف المحدد.

```cpp
System::Drawing::Bitmap::Bitmap(const String &filename)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| اسم الملف | const String\& | اسم الملف الذي يحتوي على بيانات الصورة |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const String\&, bool) constructor


يُنشئ كائن [Bitmap](../) جديد من الملف المحدد.

```cpp
System::Drawing::Bitmap::Bitmap(const String &filename, bool useIcm)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| اسم الملف | const String\& | اسم الملف الذي يحتوي على بيانات الصورة |
| useIcm | bool | IGNORED |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(int, int, Imaging::PixelFormat) constructor


يُنشئ كائن [Bitmap](../) جديد يمثل صورة bitmap بالعرض والارتفاع وتنسيق البكسل وبيانات البكسل المحددة.

```cpp
System::Drawing::Bitmap::Bitmap(int width, int height, Imaging::PixelFormat format=Imaging::PixelFormat::Format32bppArgb)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| العرض | int | عرض الصورة |
| الارتفاع | int | ارتفاع الصورة |
| تنسيق | Imaging::PixelFormat | تنسيق بكسل الصورة |

## انظر أيضًا

* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
