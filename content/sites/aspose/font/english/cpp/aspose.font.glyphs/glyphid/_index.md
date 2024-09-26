---
title: Aspose::Font::Glyphs::GlyphId class
linktitle: GlyphId
second_title: Aspose.Font for C++
description: 'Aspose::Font::Glyphs::GlyphId class. Represents glyph ids, available in the Font. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1''s id is a glyph name, instance of (GlyphStringId) class. TTF''s id is an int index, instance of (GlyphUInt32Id) class in C++.'
type: docs
weight: 500
url: /cpp/aspose.font.glyphs/glyphid/
---
## GlyphId class


Represents glyph ids, available in the [Font](../../aspose.font/font/). [Glyph](../glyph/) id is a unique number for a glyph, which is font type dependent. For example: [Type1](../../aspose.font.type1/)'s id is a glyph name, instance of ([GlyphStringId](../glyphstringid/)) class. TTF's id is an int index, instance of ([GlyphUInt32Id](../glyphuint32id/)) class.

```cpp
class GlyphId : public System::Object
```

## Methods

| Method | Description |
| --- | --- |
| virtual [CompareTo](./compareto/)(System::SharedPtr\<GlyphId\>) |  |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Returns true if two glyph ids are not equal. |
| virtual [GetHashCode](./gethashcode/)() const | Returns hashcode of object. |
| virtual [ToGlyphStringId](./toglyphstringid/)() | Virtual cast to [GlyphUInt32Id](../glyphuint32id/). [GlyphUInt32Id](../glyphuint32id/) overrides to return instance. |
| virtual [ToGlyphUInt32Id](./toglyphuint32id/)() | Virtual cast to [GlyphUInt32Id](../glyphuint32id/). [GlyphUInt32Id](../glyphuint32id/) overrides to return instance. |
| virtual [ToString](./tostring/)() const | Returns string representation the glyph id. |
## See Also

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Glyphs](../)
* Library [Aspose.Font for C++](../../)
