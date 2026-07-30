---
title: "Aspose::Font::Glyphs::IGlyphAccessor::GetGlyphById method"
linktitle: "GetGlyphById"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::Glyphs::IGlyphAccessor::GetGlyphById method. يرجع الشكل وفقًا لمعرف الشكل. معرف الشكل هو رقم فريد للشكل، يعتمد على نوع الخط. GlyphId - كائن مشتق. على سبيل المثال: معرف Type1 هو اسم الشكل، وهو مثال على فئة (GlyphStringId). معرف TTF هو فهرس عدد صحيح، وهو مثال على فئة (GlyphUInt32Id) في C++."
type: docs
weight: 300
url: /ar/cpp/aspose.font.glyphs/iglyphaccessor/getglyphbyid/
---
## IGlyphAccessor::GetGlyphById method


يرجع الشكل وفقًا لمعرف الشكل. معرف [Glyph](../../glyph/) هو رقم فريد للشكل، يعتمد على نوع الخط. [GlyphId](../../glyphid/) - كائن مشتق. على سبيل المثال: معرف [Type1](../../../aspose.font.type1/) هو اسم الشكل، وهو مثال على فئة ([GlyphStringId](../../glyphstringid/)). معرف TTF هو فهرس عدد صحيح، وهو مثال على فئة ([GlyphUInt32Id](../../glyphuint32id/)).

```cpp
virtual System::SharedPtr<Glyph> Aspose::Font::Glyphs::IGlyphAccessor::GetGlyphById(System::SharedPtr<GlyphId> id)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| المعرّف | System::SharedPtr\<GlyphId\> | معرف glyph. |

### ReturnValue

[Glyph](../../glyph/)

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../glyph/)
* Class [GlyphId](../../glyphid/)
* Class [IGlyphAccessor](../)
* Namespace [Aspose::Font::Glyphs](../../)
* Library [Aspose.Font for C++](../../../)
