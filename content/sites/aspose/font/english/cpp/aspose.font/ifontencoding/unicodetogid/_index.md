---
title: Aspose::Font::IFontEncoding::UnicodeToGid method
linktitle: UnicodeToGid
second_title: Aspose.Font for C++
description: 'Aspose::Font::IFontEncoding::UnicodeToGid method. Decodes a unicode and returns glyph id. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1''s id is a glyph name, instance of (GlyphStringId) class. TTF''s id is an int index, instance of (GlyphUInt32Id) class in C++.'
type: docs
weight: 300
url: /cpp/aspose.font/ifontencoding/unicodetogid/
---
## IFontEncoding::UnicodeToGid method


Decodes a unicode and returns glyph id. Glyph id is a unique number for a glyph, which is font type dependent. For example: [Type1](../../../aspose.font.type1/)'s id is a glyph name, instance of ([GlyphStringId](../)) class. TTF's id is an int index, instance of ([GlyphUInt32Id](../)) class.

```cpp
virtual System::SharedPtr<Glyphs::GlyphId> Aspose::Font::IFontEncoding::UnicodeToGid(uint32_t unicode)=0
```


| Parameter | Type | Description |
| --- | --- | --- |
| unicode | uint32_t | Unicode to get glyph identifier for. |

### ReturnValue

Glyph identifier related to unicode passed.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
