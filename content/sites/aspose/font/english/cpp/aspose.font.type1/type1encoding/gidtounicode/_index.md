---
title: Aspose::Font::Type1::Type1Encoding::GidToUnicode method
linktitle: GidToUnicode
second_title: Aspose.Font for C++
description: 'Aspose::Font::Type1::Type1Encoding::GidToUnicode method. Decodes Gid to Unicode. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1''s id is a glyph name, instance of (GlyphStringId) class. TTF''s id is an int index, instance of (GlyphUInt32Id) class in C++.'
type: docs
weight: 500
url: /cpp/aspose.font.type1/type1encoding/gidtounicode/
---
## Type1Encoding::GidToUnicode method


Decodes Gid to Unicode. Glyph id is a unique number for a glyph, which is font type dependent. For example: [Type1](../../)'s id is a glyph name, instance of ([GlyphStringId](../)) class. TTF's id is an int index, instance of ([GlyphUInt32Id](../)) class.

```cpp
uint32_t Aspose::Font::Type1::Type1Encoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> gid) override
```


| Parameter | Type | Description |
| --- | --- | --- |
| gid | System::SharedPtr\<Glyphs::GlyphId\> | Glyph identifier of symbol to decode. |

### ReturnValue

Unicode value related to glyph id passed.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Type1Encoding](../)
* Namespace [Aspose::Font::Type1](../../)
* Library [Aspose.Font for C++](../../../)
