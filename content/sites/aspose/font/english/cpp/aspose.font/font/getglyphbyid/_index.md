---
title: Aspose::Font::Font::GetGlyphById method
linktitle: GetGlyphById
second_title: Aspose.Font for C++
description: 'Aspose::Font::Font::GetGlyphById method. Returns glyph by glyph id. Glyph id is a unique number for a glyph, which is font type dependent. GlyphId - derived object. For example: Type1''s id is a glyph name, instance of (GlyphStringId) class. TTF''s id is an int index, instance of (GlyphUInt32Id) class in C++.'
type: docs
weight: 2200
url: /cpp/aspose.font/font/getglyphbyid/
---
## Font::GetGlyphById method


Returns glyph by glyph id. Glyph id is a unique number for a glyph, which is font type dependent. GlyphId - derived object. For example: [Type1](../../../aspose.font.type1/)'s id is a glyph name, instance of ([GlyphStringId](../)) class. TTF's id is an int index, instance of ([GlyphUInt32Id](../)) class.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Font::GetGlyphById(System::SharedPtr<Glyphs::GlyphId> id) override=0
```


| Parameter | Type | Description |
| --- | --- | --- |
| id | System::SharedPtr\<Glyphs::GlyphId\> | Glyph id. |

### ReturnValue

Glyph.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Font](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
