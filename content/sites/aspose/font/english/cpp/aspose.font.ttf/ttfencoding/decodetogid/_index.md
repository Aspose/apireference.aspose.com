---
title: Aspose::Font::Ttf::TtfEncoding::DecodeToGid method
linktitle: DecodeToGid
second_title: Aspose.Font for C++
description: 'Aspose::Font::Ttf::TtfEncoding::DecodeToGid method. TTF Font''s DecodeToGlyphId implementation finds unicode table and returns glyph id for unicode char. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1''s id is a glyph name, instance of (GlyphStringId) class. TTF''s id is an int index, instance of (GlyphUInt32Id) class in C++.'
type: docs
weight: 100
url: /cpp/aspose.font.ttf/ttfencoding/decodetogid/
---
## TtfEncoding::DecodeToGid method


TTF [Font](../../../aspose.font/font/)'s DecodeToGlyphId implementation finds unicode table and returns glyph id for unicode char. Glyph id is a unique number for a glyph, which is font type dependent. For example: [Type1](../../../aspose.font.type1/)'s id is a glyph name, instance of ([GlyphStringId](../)) class. TTF's id is an int index, instance of ([GlyphUInt32Id](../)) class.

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Ttf::TtfEncoding::DecodeToGid(uint32_t unicode) override
```


| Parameter | Type | Description |
| --- | --- | --- |
| unicode | uint32_t | Character code to get glyph identifier for. |

### ReturnValue

Glyph identifier related to character code passed.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TtfEncoding](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
