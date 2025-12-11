---
title: Aspose::Font::Type1::Type1Encoding::UnicodeToGid method
linktitle: UnicodeToGid
second_title: Aspose.Font for C++
description: 'Aspose::Font::Type1::Type1Encoding::UnicodeToGid method. Returns GlyphId for unicode. Or notdef if font doesn''t contain glyph for the unicode. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1''s id is a glyph name, instance of (GlyphStringId) class. TTF''s id is an int index, instance of (GlyphUInt32Id) class in C++.'
type: docs
weight: 600
url: /cpp/aspose.font.type1/type1encoding/unicodetogid/
---
## Type1Encoding::UnicodeToGid method


Returns GlyphId for unicode. Or notdef if font doesn't contain glyph for the unicode. Glyph id is a unique number for a glyph, which is font type dependent. For example: [Type1](../../)'s id is a glyph name, instance of ([GlyphStringId](../)) class. TTF's id is an int index, instance of ([GlyphUInt32Id](../)) class.

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Type1::Type1Encoding::UnicodeToGid(uint32_t unicode) override
```


| Parameter | Type | Description |
| --- | --- | --- |
| unicode | uint32_t | Unicode to get glyph identifier for. |

### ReturnValue

Glyph identifier related to unicode passed.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [Type1Encoding](../)
* Namespace [Aspose::Font::Type1](../../)
* Library [Aspose.Font for C++](../../../)
