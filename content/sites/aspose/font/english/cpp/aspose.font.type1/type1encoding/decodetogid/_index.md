---
title: Aspose::Font::Type1::Type1Encoding::DecodeToGid method
linktitle: DecodeToGid
second_title: Aspose.Font for C++
description: 'Aspose::Font::Type1::Type1Encoding::DecodeToGid method. Decodes Gid to unicode. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1''s id is a glyph name, instance of (GlyphStringId) class. TTF''s id is an int index, instance of (GlyphUInt32Id) class in C++.'
type: docs
weight: 100
url: /cpp/aspose.font.type1/type1encoding/decodetogid/
---
## Type1Encoding::DecodeToGid method


Decodes Gid to unicode. Glyph id is a unique number for a glyph, which is font type dependent. For example: [Type1](../../)'s id is a glyph name, instance of ([GlyphStringId](../)) class. TTF's id is an int index, instance of ([GlyphUInt32Id](../)) class.

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Type1::Type1Encoding::DecodeToGid(uint32_t charCode) override
```


| Parameter | Type | Description |
| --- | --- | --- |
| charCode | uint32_t | Character code to get glyph identifier for. |

### ReturnValue

Glyph identifier related to character code passed.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Type1Encoding](../)
* Namespace [Aspose::Font::Type1](../../)
* Library [Aspose.Font for C++](../../../)
