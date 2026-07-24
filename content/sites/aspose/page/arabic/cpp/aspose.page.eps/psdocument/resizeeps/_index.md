---
title: "Aspose::Page::EPS::PsDocument::ResizeEps طريقة"
linktitle: "ResizeEps"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::EPS::PsDocument::ResizeEps طريقة. يعيد تحجيم PsDocument المعطى كملف EPS. تُستخدم هذه الطريقة فقط بعد استخراج حجم EPS. يحفظ الملف EPS الأصلي مع تحديث %BoundingBox الموجود أو يتم إنشاء واحد جديد. سيتم أيضًا تعيين مصفوفة تحويل الصفحة في C++."
type: docs
weight: 4000
url: /ar/cpp/aspose.page.eps/psdocument/resizeeps/
---
## PsDocument::ResizeEps(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) method


يقوم بتغيير حجم [PsDocument](../) كملف [EPS](../../). تُستخدم هذه الطريقة فقط بعد استخراج حجم [EPS](../../). يحفظ الملف الأولي [EPS](../../) مع تحديث %BoundingBox الموجود أو سيتم إنشاء واحد جديد. سيتم أيضًا تعيين مصفوفة التحويل لـ [Page](../../../aspose.page/).

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::SharedPtr<System::IO::Stream> epsStream, System::Drawing::SizeF newSizeInUnits, Units units)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | دفق ملف [EPS](../../) الناتج. |
| newSizeInUnits | System::Drawing::SizeF | الحجم الجديد لصورة [EPS](../../) بالوحدات المحددة. |
| الوحدات | الوحدات | وحدات الحجم الجديد. يمكن أن تكون نقاط، بوصات، مليمترات، سنتيمترات ونسب مئوية من الحجم الأصلي. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::ResizeEps(System::String, System::Drawing::SizeF, Units) method


يقوم بتغيير حجم [PsDocument](../) كملف [EPS](../../). تُستخدم هذه الطريقة فقط بعد استخراج حجم [EPS](../../). يحفظ الملف الأولي [EPS](../../) filD:\\ASPOSE.GIT\\aspose.pdf.cpp\\cs_porter_produce\\Aspose.Page.Cpp.Page.Cpp\\eps\\src_eps\\PsDocument.hالدليل الناتج حيث سيتم حفظ ملف الصورة.e مع تحديث %BoundingBox الموجود أو سيتم إنشاء واحد جديد. سيتم أيضًا تعيين مصفوفة التحويل لـ [Page](../../../aspose.page/).

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::String outEpsFilePath, System::Drawing::SizeF newSizeInUnits, Units units)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| outEpsFilePath | System::String | مسار ملف [EPS](../../) الناتج. |
| newSizeInUnits | System::Drawing::SizeF | الحجم الجديد لصورة [EPS](../../) بالوحدات المحددة. |
| الوحدات | الوحدات | وحدات الحجم الجديد. يمكن أن تكون نقاط، بوصات، مليمترات، سنتيمترات ونسب مئوية من الحجم الأصلي. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
