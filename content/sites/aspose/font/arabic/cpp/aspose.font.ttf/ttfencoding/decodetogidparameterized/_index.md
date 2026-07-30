---
title: "Aspose::Font::Ttf::TtfEncoding::DecodeToGidParameterized method"
linktitle: "DecodeToGidParameterized"
second_title: "Aspose.Font لـ C++"
description: "طريقة Aspose::Font::Ttf::TtfEncoding::DecodeToGidParameterized. النسخة المعلمة تسمح باستخدام جدول CMap محدد (ليس يونيكود) في C++."
type: docs
weight: 200
url: /ar/cpp/aspose.font.ttf/ttfencoding/decodetogidparameterized/
---
## TtfEncoding::DecodeToGidParameterized method


الإصدار المعلم يسمح باستخدام جدول CMap محدد (ليس Unicode).

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Ttf::TtfEncoding::DecodeToGidParameterized(System::SharedPtr<IEncodingParameters> parameters, uint32_t charCode) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| parameters | System::SharedPtr\<IEncodingParameters\> | تنفيذ واجهة [IEncodingParameters](../../../aspose.font/iencodingparameters/). |
| charCode | uint32_t | رمز الحرف للحصول على معرف الشكل له. |

### ReturnValue

معرف الشكل المرتبط برمز الحرف الممرَّر.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IEncodingParameters](../../../aspose.font/iencodingparameters/)
* Class [TtfEncoding](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
