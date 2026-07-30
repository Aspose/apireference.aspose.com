---
title: "Aspose::Font::Font::GetGlyphById method"
linktitle: "GetGlyphById"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::Font::GetGlyphById method. يُرجِع الحرف وفقًا لمعرّف الحرف. معرّف الحرف هو رقم فريد للحرف، يعتمد على نوع الخط. GlyphId - كائن مشتق. على سبيل المثال: معرّف Type1 هو اسم حرف، وهو مثال على فئة (GlyphStringId). معرّف TTF هو فهرس عدد صحيح، وهو مثال على فئة (GlyphUInt32Id) في C++."
type: docs
weight: 1700
url: /ar/cpp/aspose.font/font/getglyphbyid/
---
## Font::GetGlyphById method


يعيد الحرف وفقًا لمعرف الحرف. معرف الحرف هو رقم فريد لكل حرف، ويعتمد على نوع الخط. GlyphId - كائن مشتق. على سبيل المثال: معرف [Type1](../../../aspose.font.type1/) هو اسم حرف، وهو مثال على فئة ([GlyphStringId](../)). معرف TTF هو فهرس عدد صحيح، وهو مثال على فئة ([GlyphUInt32Id](../)).

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Font::GetGlyphById(System::SharedPtr<Glyphs::GlyphId> id) override=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| المعرّف | System::SharedPtr\<Glyphs::GlyphId\> | معرّف الشكل. |

### ReturnValue

الحرف.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Font](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
