---
title: Aspose::Font::Glyphs::IGlyphAccessor::GetGlyphById method
linktitle: GetGlyphById
second_title: Aspose.Font for C++
description: 'Aspose::Font::Glyphs::IGlyphAccessor::GetGlyphById method. Returns glyph by glyph id. Glyph id is a unique number for a glyph, which is font type dependent. GlyphId - derived object. For example: Type1''s id is a glyph name, instance of (GlyphStringId) class. TTF''s id is an int index, instance of (GlyphUInt32Id) class in C++.'
type: docs
weight: 400
url: /cpp/aspose.font.glyphs/iglyphaccessor/getglyphbyid/
---
## IGlyphAccessor::GetGlyphById method


Returns glyph by glyph id. [Glyph](../../glyph/) id is a unique number for a glyph, which is font type dependent. [GlyphId](../../glyphid/) - derived object. For example: [Type1](../../../aspose.font.type1/)'s id is a glyph name, instance of ([GlyphStringId](../../glyphstringid/)) class. TTF's id is an int index, instance of ([GlyphUInt32Id](../../glyphuint32id/)) class.

```cpp
virtual System::SharedPtr<Glyph> Aspose::Font::Glyphs::IGlyphAccessor::GetGlyphById(System::SharedPtr<GlyphId> id)=0
```


| Parameter | Type | Description |
| --- | --- | --- |
| id | System::SharedPtr\<GlyphId\> | glyph ID. |

### ReturnValue

[Glyph](../../glyph/)

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../glyph/)
* Class [GlyphId](../../glyphid/)
* Class [IGlyphAccessor](../)
* Namespace [Aspose::Font::Glyphs](../../)
* Library [Aspose.Font for C++](../../../)
