---
title: Aspose::Font::Ttf::TtfFont::GetGlyphById method
linktitle: GetGlyphById
second_title: Aspose.Font for C++
description: 'Aspose::Font::Ttf::TtfFont::GetGlyphById method. Returns glyph by glyph id. Glyph id is a unique number for a glyph, which is font type dependent. TTF Font glyph id can be instance of (GlyphStringId) class or (GlyphUInt32Id) class. Name (string) glyph addressing is supported for TTF Fonts via Post table mapping. In case CFF Font inside, the CFF structures are used to address glyphs by name in C++.'
type: docs
weight: 1800
url: /cpp/aspose.font.ttf/ttffont/getglyphbyid/
---
## TtfFont::GetGlyphById(System::SharedPtr\<Glyphs::GlyphId\>) method


Returns glyph by glyph id. Glyph id is a unique number for a glyph, which is font type dependent. TTF [Font](../../../aspose.font/font/) glyph id can be instance of ([GlyphStringId](../)) class or ([GlyphUInt32Id](../)) class. Name (string) glyph addressing is supported for TTF Fonts via Post table mapping. In case CFF [Font](../../../aspose.font/font/) inside, the CFF structures are used to address glyphs by name.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Ttf::TtfFont::GetGlyphById(System::SharedPtr<Glyphs::GlyphId> id) override
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
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphById(System::String) method


Returns glyph by glyph name. Name (string) glyph addressing is supported for TTF fonts via Post table mapping. In case CFF [Font](../../../aspose.font/font/) inside, the CFF structures are used to address glyphs by name.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Ttf::TtfFont::GetGlyphById(System::String glyphName)
```


| Parameter | Type | Description |
| --- | --- | --- |
| glyphName | System::String | Glyph string identifier. |

### ReturnValue

Glyph.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [String](../../../system/string/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphById(uint32_t) method


Returns glyph by glyph id.

```cpp
System::SharedPtr<Glyphs::Glyph> Aspose::Font::Ttf::TtfFont::GetGlyphById(uint32_t id)
```


| Parameter | Type | Description |
| --- | --- | --- |
| id | uint32_t | Glyph index. |

### ReturnValue

Glyph.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Glyph](../../../aspose.font.glyphs/glyph/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
