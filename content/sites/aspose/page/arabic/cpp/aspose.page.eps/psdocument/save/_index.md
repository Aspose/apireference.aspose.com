---
title: "Aspose::Page::EPS::PsDocument::Save طريقة"
linktitle: "Save"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::EPS::PsDocument::Save طريقة. يحفظ PsDocument المعطى كملف PS أو EPS. تُستخدم هذه الطريقة فقط عندما يتم إنشاء PsDocument من الصفر في C++."
type: docs
weight: 4200
url: /ar/cpp/aspose.page.eps/psdocument/save/
---
## PsDocument::Save() method


يحفظ [PsDocument](../) المعطى كملف PS أو [EPS](../../). تُستخدم هذه الطريقة فقط عندما يتم إنشاء [PsDocument](../) من الصفر.

```cpp
void Aspose::Page::EPS::PsDocument::Save()
```

## انظر أيضًا

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::SharedPtr\<System::IO::Stream\>) method


يحفظ [PsDocument](../) المعطى إلى الدفق. تُستخدم هذه الطريقة فقط بعد تحديث بيانات التعريف [XMP](../../../aspose.page.eps.xmp/). يحفظ الملف الأولي [EPS](../../) مع بيانات التعريف الموجودة المحدثة أو جديدًا تم إنشاؤه أثناء استدعاء طريقة GetMetadata. في الحالة الأخيرة تُضاف جميع شفرة PostScript الضرورية وتعليقات [EPS](../../).

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::SharedPtr<System::IO::Stream> epsStream)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | دفق ملف [EPS](../../) الناتج. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::String) method


يحفظ [PsDocument](../) المعطى كملف [EPS](../../). تُستخدم هذه الطريقة فقط بعد تحديث بيانات التعريف [XMP](../../../aspose.page.eps.xmp/). يحفظ الملف الأولي [EPS](../../) مع بيانات التعريف الموجودة المحدثة أو جديدًا تم إنشاؤه أثناء استدعاء طريقة GetMetadata. في الحالة الأخيرة تُضاف جميع شفرة PostScript الضرورية وتعليقات [EPS](../../).

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::String outEpsFilePath)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| outEpsFilePath | System::String | مسار ملف [EPS](../../) الناتج. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
