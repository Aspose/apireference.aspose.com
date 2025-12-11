---
title: Aspose::Font::Cff::CffFont::GetGlyphById method
linktitle: GetGlyphById
second_title: Aspose.Font for C++
description: 'Aspose::Font::Cff::CffFont::GetGlyphById method. Returns glyph by glyph id. Glyph id is a unique number for a glyph, which is font type dependent. CFF Font glyph id can be instance of (GlyphStringId) class or (GlyphUInt32Id) class in C++.'
type: docs
weight: 1800
url: /cpp/aspose.font.cff/cfffont/getglyphbyid/
---
## CffFont::GetGlyphById(System::SharedPtr\<Glyphs::GlyphId\>) method


Returns glyph by glyph id. Glyph id is a unique number for a glyph, which is font type dependent. CFF [Font](../../../aspose.font/font/) glyph id can be instance of ([GlyphStringId](../)) class or ([GlyphUInt32Id](../)) class.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Cff::CffFont::GetGlyphById(System::SharedPtr<Glyphs::GlyphId> id) override
```


| Parameter | Type | Description |
| --- | --- | --- |
| id | System::SharedPtr\<Glyphs::GlyphId\> | Glyph id. |

### ReturnValue

Glyph.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [CffFont](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
## CffFont::GetGlyphById(System::String) method


Returns glyph by glyph name.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Cff::CffFont::GetGlyphById(System::String glyphName)
```


| Parameter | Type | Description |
| --- | --- | --- |
| glyphName | System::String | Glyph name. |

### ReturnValue

Glyph.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [String](../../../system/string/)
* Class [CffFont](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
## CffFont::GetGlyphById(uint32_t) method


Returns glyph by glyph id.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Cff::CffFont::GetGlyphById(uint32_t id)
```


| Parameter | Type | Description |
| --- | --- | --- |
| id | uint32_t | Glyph id. |

### ReturnValue

Glyph.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [CffFont](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
