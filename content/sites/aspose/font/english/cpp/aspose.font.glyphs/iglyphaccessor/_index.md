---
title: Aspose::Font::Glyphs::IGlyphAccessor class
linktitle: IGlyphAccessor
second_title: Aspose.Font for C++
description: 'Aspose::Font::Glyphs::IGlyphAccessor class. Defines functionality to retrieve specified glyph identifiers and glyphs in C++.'
type: docs
weight: 1000
url: /cpp/aspose.font.glyphs/iglyphaccessor/
---
## IGlyphAccessor class


Defines functionality to retrieve specified glyph identifiers and glyphs.

```cpp
class IGlyphAccessor : public virtual System::Object
```

## Methods

| Method | Description |
| --- | --- |
| virtual [get_GlyphIdType](./get_glyphidtype/)() | [Glyph](../glyph/) id type specification. |
| virtual [GetAllGlyphIds](./getallglyphids/)() | Returns all glyph ids, available in the [Font](../../aspose.font/font/). [Glyph](../glyph/) id is a unique number for a glyph, which is font type dependent. For example: [Type1](../../aspose.font.type1/)'s id is a glyph name, instance of ([GlyphStringId](../glyphstringid/)) class. TTF's id is an int index, instance of ([GlyphUInt32Id](../glyphuint32id/)) class. |
| virtual [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<GlyphId\>) | Returns glyph by glyph id. [Glyph](../glyph/) id is a unique number for a glyph, which is font type dependent. [GlyphId](../glyphid/) - derived object. For example: [Type1](../../aspose.font.type1/)'s id is a glyph name, instance of ([GlyphStringId](../glyphstringid/)) class. TTF's id is an int index, instance of ([GlyphUInt32Id](../glyphuint32id/)) class. |
| virtual [GetGlyphsForText](./getglyphsfortext/)(System::String) | Get glyphs representation for text. |
## See Also

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Glyphs](../)
* Library [Aspose.Font for C++](../../)
