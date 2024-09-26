---
title: Aspose::Font::IFontEncoding::DecodeToGid method
linktitle: DecodeToGid
second_title: Aspose.Font for C++
description: 'Aspose::Font::IFontEncoding::DecodeToGid method. Decodes a character code and returns glyph id. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1''s id is a glyph name, instance of (GlyphStringId) class. TTF''s id is an int index, instance of (GlyphUInt32Id) class. Note: character code is not necessary a unicode. Character code is a char index in Font encoding "table" in C++.'
type: docs
weight: 400
url: /cpp/aspose.font/ifontencoding/decodetogid/
---
## IFontEncoding::DecodeToGid method


Decodes a character code and returns glyph id. Glyph id is a unique number for a glyph, which is font type dependent. For example: [Type1](../../../aspose.font.type1/)'s id is a glyph name, instance of ([GlyphStringId](../)) class. TTF's id is an int index, instance of ([GlyphUInt32Id](../)) class. Note: character code is not necessary a unicode. Character code is a char index in [Font](../../font/) encoding "table".

```cpp
virtual System::SharedPtr<Glyphs::GlyphId> Aspose::Font::IFontEncoding::DecodeToGid(uint32_t charCode)=0
```


| Parameter | Type | Description |
| --- | --- | --- |
| charCode | uint32_t | Character code to get glyph identifier for. |

### ReturnValue

Glyph identifier related to charCode passed.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
