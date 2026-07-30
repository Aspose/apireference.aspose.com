---
title: "Aspose::Font::Type1::Type1Encoding::UnicodeToGid طريقة"
linktitle: "UnicodeToGid"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::Type1::Type1Encoding::UnicodeToGid طريقة. تُرجع GlyphId للـ Unicode. أو notdef إذا لم يحتوي الخط على شكل للـ Unicode. معرف الشكل هو رقم فريد للشكل، يعتمد على نوع الخط. على سبيل المثال: Type1''s id هو اسم الشكل، مثال على الفئة (GlyphStringId). TTF''s id هو فهرس عدد صحيح، مثال على الفئة (GlyphUInt32Id) في C++."
type: docs
weight: 600
url: /ar/cpp/aspose.font.type1/type1encoding/unicodetogid/
---
## Type1Encoding::UnicodeToGid method


تُرجع GlyphId للـ Unicode. أو notdef إذا لم يحتوي الخط على شكل للـ Unicode. معرف الشكل هو رقم فريد للشكل، يعتمد على نوع الخط. على سبيل المثال: [Type1](../../)'s id هو اسم الشكل، مثال على الفئة ([GlyphStringId](../)) . TTF's id هو فهرس عدد صحيح، مثال على الفئة ([GlyphUInt32Id](../)) .

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Type1::Type1Encoding::UnicodeToGid(uint32_t unicode) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| unicode | uint32_t | يونيكود للحصول على معرف الشكل له. |

### ReturnValue

معرف الشكل المرتبط بيونيكود الممرَّر.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Type1Encoding](../)
* Namespace [Aspose::Font::Type1](../../)
* Library [Aspose.Font for C++](../../../)
