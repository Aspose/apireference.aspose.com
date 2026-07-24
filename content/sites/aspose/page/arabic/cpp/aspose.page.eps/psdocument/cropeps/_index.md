---
title: "طريقة Aspose::Page::EPS::PsDocument::CropEps"
linktitle: "CropEps"
second_title: "Aspose.Page لـ C++"
description: "طريقة Aspose::Page::EPS::PsDocument::CropEps. يقتص ملف PsDocument المعطى كملف EPS. يحفظ ملف EPS الأصلي مع تحديث %BoundingBox الموجود أو يتم إنشاء واحد جديد في C++."
type: docs
weight: 900
url: /ar/cpp/aspose.page.eps/psdocument/cropeps/
---
## PsDocument::CropEps(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<float\>) method


يقص [PsDocument](../) كملف [EPS](../../). يحفظ ملف [EPS](../../) الأصلي مع تحديث %BoundingBox الموجود أو يتم إنشاء واحد جديد.

```cpp
void Aspose::Page::EPS::PsDocument::CropEps(System::SharedPtr<System::IO::Stream> epsStream, System::ArrayPtr<float> cropBox)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | دفق ملف [EPS](../../) الناتج. |
| cropBox | System::ArrayPtr\<float\> | مربع القص (x0, y0, x, y). |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::CropEps(System::String, System::ArrayPtr\<float\>) method


يقص [PsDocument](../) كملف [EPS](../../). يحفظ ملف [EPS](../../) الأصلي مع تحديث %BoundingBox الموجود أو يتم إنشاء واحد جديد.

```cpp
void Aspose::Page::EPS::PsDocument::CropEps(System::String outEpsFilePath, System::ArrayPtr<float> cropBox)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| outEpsFilePath | System::String | مسار ملف [EPS](../../) الناتج. |
| cropBox | System::ArrayPtr\<float\> | مربع القص (x0, y0, x, y). |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
