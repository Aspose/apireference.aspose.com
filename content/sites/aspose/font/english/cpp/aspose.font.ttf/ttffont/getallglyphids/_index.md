---
title: Aspose::Font::Ttf::TtfFont::GetAllGlyphIds method
linktitle: GetAllGlyphIds
second_title: Aspose.Font for C++
description: 'Aspose::Font::Ttf::TtfFont::GetAllGlyphIds method. Returns array of all glyph ids, available in the Font. Glyph id is a unique number for a glyph, which is font type dependent. TTF Font glyph id can be instance of (GlyphStringId) class or (GlyphUInt32Id) class. Name (string) glyph addressing is supported for TTF Fonts via Post table mapping. In case CFF Font inside, the CFF structures are used to address glyphs by name in C++.'
type: docs
weight: 1700
url: /cpp/aspose.font.ttf/ttffont/getallglyphids/
---
## TtfFont::GetAllGlyphIds method


Returns array of all glyph ids, available in the [Font](../../../aspose.font/font/). Glyph id is a unique number for a glyph, which is font type dependent. TTF [Font](../../../aspose.font/font/) glyph id can be instance of ([GlyphStringId](../)) class or ([GlyphUInt32Id](../)) class. Name (string) glyph addressing is supported for TTF Fonts via Post table mapping. In case CFF [Font](../../../aspose.font/font/) inside, the CFF structures are used to address glyphs by name.

```cpp
System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> Aspose::Font::Ttf::TtfFont::GetAllGlyphIds() override
```


### ReturnValue

Glyph identifiers.

## See Also

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
