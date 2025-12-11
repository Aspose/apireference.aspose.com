---
title: Aspose::Font::Cff::CffEncoding::DecodeToGid method
linktitle: DecodeToGid
second_title: Aspose.Font for C++
description: 'Aspose::Font::Cff::CffEncoding::DecodeToGid method. Gets Gid for charCode passed. This method designed for a CFF CIDFonts, where charCode must be a valid CID value. Glyph id is a unique number for a glyph, which is font type dependent. CFF Font glyph id can be instance of (GlyphStringId) class or (GlyphUInt32Id) class in C++.'
type: docs
weight: 100
url: /cpp/aspose.font.cff/cffencoding/decodetogid/
---
## CffEncoding::DecodeToGid method


Gets Gid for charCode passed. This method designed for a CFF CIDFonts, where charCode must be a valid CID value. Glyph id is a unique number for a glyph, which is font type dependent. CFF [Font](../../../aspose.font/font/) glyph id can be instance of ([GlyphStringId](../)) class or ([GlyphUInt32Id](../)) class.

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Cff::CffEncoding::DecodeToGid(uint32_t charCode) override
```


| Parameter | Type | Description |
| --- | --- | --- |
| charCode | uint32_t | Character code(CID) to get glyph identifier for. |

### ReturnValue

Glyph identifier related to CID passed.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [CffEncoding](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
