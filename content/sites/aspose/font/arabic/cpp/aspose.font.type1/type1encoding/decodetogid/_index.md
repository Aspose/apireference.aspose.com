---
title: "Aspose::Font::Type1::Type1Encoding::DecodeToGid طريقة"
linktitle: "DecodeToGid"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::Type1::Type1Encoding::DecodeToGid طريقة. يحول Gid إلى unicode. معرف الشكل هو رقم فريد للشكل، يعتمد على نوع الخط. على سبيل المثال: Type1''s id هو اسم الشكل، مثال على الفئة (GlyphStringId). TTF''s id هو فهرس عدد صحيح، مثال على الفئة (GlyphUInt32Id) في C++."
type: docs
weight: 100
url: /ar/cpp/aspose.font.type1/type1encoding/decodetogid/
---
## Type1Encoding::DecodeToGid method


يحول Gid إلى unicode. معرف الشكل هو رقم فريد للشكل، يعتمد على نوع الخط. على سبيل المثال: [Type1](../../)'s id هو اسم الشكل، مثال على الفئة ([GlyphStringId](../)) . TTF's id هو فهرس عدد صحيح، مثال على الفئة ([GlyphUInt32Id](../)) .

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Type1::Type1Encoding::DecodeToGid(uint32_t charCode) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| charCode | uint32_t | رمز الحرف للحصول على معرف الشكل له. |

### ReturnValue

معرف الشكل المرتبط برمز الحرف الممرَّر.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Type1Encoding](../)
* Namespace [Aspose::Font::Type1](../../)
* Library [Aspose.Font for C++](../../../)
