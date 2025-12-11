---
title: Aspose::Font::Cff::CffEncoding::UnicodeToGid method
linktitle: UnicodeToGid
second_title: Aspose.Font for C++
description: 'Aspose::Font::Cff::CffEncoding::UnicodeToGid method. Decodes a unicode and returns glyph id. Glyph id is a unique number for a glyph, which is font type dependent. CFF Font glyph id can be instance of (GlyphStringId) class or (GlyphUInt32Id) class in C++.'
type: docs
weight: 900
url: /cpp/aspose.font.cff/cffencoding/unicodetogid/
---
## CffEncoding::UnicodeToGid method


Decodes a unicode and returns glyph id. Glyph id is a unique number for a glyph, which is font type dependent. CFF [Font](../../../aspose.font/font/) glyph id can be instance of ([GlyphStringId](../)) class or ([GlyphUInt32Id](../)) class.

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Cff::CffEncoding::UnicodeToGid(uint32_t unicode) override
```


| Parameter | Type | Description |
| --- | --- | --- |
| unicode | uint32_t | Unicode to get glyph identifier for. |

### ReturnValue

Glyph identifier related to unicode passed.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [CffEncoding](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
