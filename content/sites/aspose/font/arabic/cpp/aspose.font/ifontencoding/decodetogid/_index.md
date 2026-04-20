---
title: "Aspose::Font::IFontEncoding::DecodeToGid طريقة"
linktitle: "DecodeToGid"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::IFontEncoding::DecodeToGid طريقة. يقوم بفك تشفير رمز حرف ويعيد معرف الشكل. معرف الشكل هو رقم فريد للشكل، ويعتمد على نوع الخط. على سبيل المثال: Type1''s هو اسم شكل، وهو مثال على الفئة (GlyphStringId). معرف TTF هو فهرس عدد صحيح، وهو مثال على الفئة (GlyphUInt32Id). ملاحظة: رمز الحرف ليس بالضرورة Unicode. رمز الحرف هو فهرس حرف في \\"جدول\\" ترميز الخط Font في C++."
type: docs
weight: 100
url: /ar/cpp/aspose.font/ifontencoding/decodetogid/
---
## IFontEncoding::DecodeToGid method


يقوم بفك تشفير رمز حرف ويعيد معرف الشكل. معرف الشكل هو رقم فريد للشكل، ويعتمد على نوع الخط. على سبيل المثال: [Type1](../../../aspose.font.type1/)'s هو اسم شكل، وهو مثال على الفئة ([GlyphStringId](../)). معرف TTF هو فهرس عدد صحيح، وهو مثال على الفئة ([GlyphUInt32Id](../)). ملاحظة: رمز الحرف ليس بالضرورة Unicode. رمز الحرف هو فهرس حرف في ترميز [Font](../../font/) \"جدول\".

```cpp
virtual System::SharedPtr<Glyphs::GlyphId> Aspose::Font::IFontEncoding::DecodeToGid(uint32_t charCode)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| charCode | uint32_t | رمز الحرف للحصول على معرف الشكل له. |

### ReturnValue

معرف الحرف المتعلق بـ charCode الممرَّر.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
