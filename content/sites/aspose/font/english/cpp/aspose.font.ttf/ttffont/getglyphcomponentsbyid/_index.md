---
title: Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById method
linktitle: GetGlyphComponentsById
second_title: Aspose.Font for C++
description: 'Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById method. Gets a glyph by glyph identifier passed and fills passed list of glyph identifiers with components of this glyph. Glyph id is a unique number for a glyph, which is font type dependent. TTF Font glyph id can be instance of (GlyphStringId) class or (GlyphUInt32Id) class. Name (string) glyph addressing is supported for TTF Fonts via Post table mapping. In case CFF Font inside, the CFF structures are used to address glyphs by name in C++.'
type: docs
weight: 1900
url: /cpp/aspose.font.ttf/ttffont/getglyphcomponentsbyid/
---
## TtfFont::GetGlyphComponentsById(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphIdList\>) method


Gets a glyph by glyph identifier passed and fills passed list of glyph identifiers with components of this glyph. Glyph id is a unique number for a glyph, which is font type dependent. TTF [Font](../../../aspose.font/font/) glyph id can be instance of ([GlyphStringId](../)) class or ([GlyphUInt32Id](../)) class. Name (string) glyph addressing is supported for TTF Fonts via Post table mapping. In case CFF [Font](../../../aspose.font/font/) inside, the CFF structures are used to address glyphs by name.

```cpp
virtual void Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById(System::SharedPtr<Glyphs::GlyphId> id, System::SharedPtr<Glyphs::GlyphIdList> componentsToPopulate)
```


| Parameter | Type | Description |
| --- | --- | --- |
| id | System::SharedPtr\<Glyphs::GlyphId\> | Glyph id. |
| componentsToPopulate | System::SharedPtr\<Glyphs::GlyphIdList\> | List of glyph identifiers to fill. |
## Remarks


Empty collection componentsToPopulate should be passed that will contain glyph components id list. 

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphComponentsById(System::String, System::SharedPtr\<Glyphs::GlyphIdList\>) method


Gets a glyph by glyph name passed and fills passed list of glyph identifiers with components of this glyph.

```cpp
void Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById(System::String glyphName, System::SharedPtr<Glyphs::GlyphIdList> componentsToPopulate)
```


| Parameter | Type | Description |
| --- | --- | --- |
| glyphName | System::String | Glyph name. |
| componentsToPopulate | System::SharedPtr\<Glyphs::GlyphIdList\> | List of glyph identifiers to fill. |
## Remarks


Empty collection componentsToPopulate should be passed that will contain glyph components id list. 

## See Also

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
## TtfFont::GetGlyphComponentsById(uint32_t, System::SharedPtr\<Glyphs::GlyphIdList\>) method


Gets a glyph by glyph index passed and fills passed list of glyph identifiers with components of this glyph.

```cpp
void Aspose::Font::Ttf::TtfFont::GetGlyphComponentsById(uint32_t id, System::SharedPtr<Glyphs::GlyphIdList> componentsToPopulate)
```


| Parameter | Type | Description |
| --- | --- | --- |
| id | uint32_t | Glyph index. |
| componentsToPopulate | System::SharedPtr\<Glyphs::GlyphIdList\> | List of glyph identifiers to fill. |
## Remarks


Empty collection componentsToPopulate should be passed that will contain glyph components id list. 

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* Class [TtfFont](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
