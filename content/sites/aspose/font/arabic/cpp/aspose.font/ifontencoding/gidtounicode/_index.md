---
title: "Aspose::Font::IFontEncoding::GidToUnicode طريقة"
linktitle: "GidToUnicode"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::IFontEncoding::GidToUnicode طريقة. يقوم بفك تشفير Gid إلى Unicode. معرف الشكل (Glyph id) هو رقم فريد للشكل، ويعتمد على نوع الخط. على سبيل المثال: Type1''s هو اسم شكل، وهو مثال على الفئة (GlyphStringId). معرف TTF هو فهرس عدد صحيح، وهو مثال على الفئة (GlyphUInt32Id) في C++."
type: docs
weight: 400
url: /ar/cpp/aspose.font/ifontencoding/gidtounicode/
---
## IFontEncoding::GidToUnicode method


يقوم بفك تشفير Gid إلى Unicode. معرف الشكل هو رقم فريد للشكل، ويعتمد على نوع الخط. على سبيل المثال: [Type1](../../../aspose.font.type1/)'s هو اسم شكل، وهو مثال على الفئة ([GlyphStringId](../)). معرف TTF هو فهرس عدد صحيح، وهو مثال على الفئة ([GlyphUInt32Id](../)).

```cpp
virtual uint32_t Aspose::Font::IFontEncoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> gid)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| gid | System::SharedPtr\<Glyphs::GlyphId\> | معرف الشكل للرمز المراد فك ترميزه. |

### ReturnValue

قيمة يونيكود المرتبطة بمعرف الشكل الممرَّر.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
