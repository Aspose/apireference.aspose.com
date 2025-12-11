---
title: Aspose::Font::Ttf::TtfEncoding::GidToUnicode method
linktitle: GidToUnicode
second_title: Aspose.Font for C++
description: 'Aspose::Font::Ttf::TtfEncoding::GidToUnicode method. Decodes glyph id to unicode. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1''s id is a glyph name, instance of (GlyphStringId) class. TTF''s id is an int index, instance of (GlyphUInt32Id) class in C++.'
type: docs
weight: 400
url: /cpp/aspose.font.ttf/ttfencoding/gidtounicode/
---
## TtfEncoding::GidToUnicode method


Decodes glyph id to unicode. Glyph id is a unique number for a glyph, which is font type dependent. For example: [Type1](../../../aspose.font.type1/)'s id is a glyph name, instance of ([GlyphStringId](../)) class. TTF's id is an int index, instance of ([GlyphUInt32Id](../)) class.

```cpp
uint32_t Aspose::Font::Ttf::TtfEncoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> glyphId) override
```


| Parameter | Type | Description |
| --- | --- | --- |
| glyphId | System::SharedPtr\<Glyphs::GlyphId\> | Glyph identifier of symbol to decode. |

### ReturnValue

Unicode value related to glyph id passed.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TtfEncoding](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
