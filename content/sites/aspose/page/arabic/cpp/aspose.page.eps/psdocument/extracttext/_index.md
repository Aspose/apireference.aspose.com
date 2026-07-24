---
title: "طريقة Aspose::Page::EPS::PsDocument::ExtractText"
linktitle: "ExtractText"
second_title: "Aspose.Page لـ C++"
description: "طريقة Aspose::Page::EPS::PsDocument::ExtractText. استخراج النص من ملف PS. يمكن استخراج النص فقط إذا كان مكتوبًا بخط Type 42 (TrueType) أو بخط Type 0 مع خطوط Type 42 في خريطة المتجهات الخاصة به في C++."
type: docs
weight: 2300
url: /ar/cpp/aspose.page.eps/psdocument/extracttext/
---
## PsDocument::ExtractText method


استخراج النص من ملف PS. يمكن استخراج النص فقط إذا كان مكتوبًا بخط Type 42 (**TrueType**) أو بخط Type 0 يحتوي على خطوط Type 42 في خريطة المتجهات الخاصة به.

```cpp
System::String Aspose::Page::EPS::PsDocument::ExtractText(System::SharedPtr<SaveOptions> options, int32_t startPage=0, int32_t endPage=0)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| خيارات | System::SharedPtr\<SaveOptions\> | خيارات الحفظ. |
| startPage | int32_t | الصفحة التي يبدأ منها استخراج النص. هذا المعامل مفيد للمستندات متعددة الصفحات. |
| endPage | int32_t | الصفحة التي ينتهي عندها استخراج النص. هذا المعامل مفيد للمستندات متعددة الصفحات. |

### ReturnValue

النص المستخرج.

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [SaveOptions](../../../aspose.page/saveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
