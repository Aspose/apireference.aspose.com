---
title: Aspose::Font::Cff::CffEncoding::GidToUnicode method
linktitle: GidToUnicode
second_title: Aspose.Font for C++
description: 'Aspose::Font::Cff::CffEncoding::GidToUnicode method. Decodes Gid to unicode. Glyph id is a unique number for a glyph, which is font type dependent. CFF Font glyph id can be instance of (GlyphStringId) class or (GlyphUInt32Id) class in C++.'
type: docs
weight: 800
url: /cpp/aspose.font.cff/cffencoding/gidtounicode/
---
## CffEncoding::GidToUnicode method


Decodes Gid to unicode. Glyph id is a unique number for a glyph, which is font type dependent. CFF [Font](../../../aspose.font/font/) glyph id can be instance of ([GlyphStringId](../)) class or ([GlyphUInt32Id](../)) class.

```cpp
uint32_t Aspose::Font::Cff::CffEncoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> gid) override
```


| Parameter | Type | Description |
| --- | --- | --- |
| gid | System::SharedPtr\<Glyphs::GlyphId\> | Glyph identifier of symbol to decode. |

### ReturnValue

Unicode value related to glyph id passed.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [CffEncoding](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
