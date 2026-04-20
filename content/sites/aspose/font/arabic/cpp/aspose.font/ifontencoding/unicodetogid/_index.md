---
title: "Aspose::Font::IFontEncoding::UnicodeToGid طريقة"
linktitle: "UnicodeToGid"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::IFontEncoding::UnicodeToGid طريقة. يقوم بفك تشفير Unicode ويعيد معرف الشكل. معرف الشكل هو رقم فريد للشكل، ويعتمد على نوع الخط. على سبيل المثال: Type1''s هو اسم شكل، وهو مثال على الفئة (GlyphStringId). معرف TTF هو فهرس عدد صحيح، وهو مثال على الفئة (GlyphUInt32Id) في C++."
type: docs
weight: 500
url: /ar/cpp/aspose.font/ifontencoding/unicodetogid/
---
## IFontEncoding::UnicodeToGid method


يقوم بفك تشفير Unicode ويعيد معرف الشكل. معرف الشكل هو رقم فريد للشكل، ويعتمد على نوع الخط. على سبيل المثال: [Type1](../../../aspose.font.type1/)'s هو اسم شكل، وهو مثال على الفئة ([GlyphStringId](../)). معرف TTF هو فهرس عدد صحيح، وهو مثال على الفئة ([GlyphUInt32Id](../)).

```cpp
virtual System::SharedPtr<Glyphs::GlyphId> Aspose::Font::IFontEncoding::UnicodeToGid(uint32_t unicode)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| unicode | uint32_t | يونيكود للحصول على معرف الشكل له. |

### ReturnValue

معرف الشكل المرتبط بيونيكود الممرَّر.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
