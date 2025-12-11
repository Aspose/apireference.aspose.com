---
title: Aspose::Font::TtfHelpers::IFontCharactersMerger::MergeFonts method
linktitle: MergeFonts
second_title: Aspose.Font for C++
description: 'Aspose::Font::TtfHelpers::IFontCharactersMerger::MergeFonts method. Merges fonts based on glyphs lists passed. Searches for a character code for every glyph passed and add found character code with correspondent glyph into resultant new font in C++.'
type: docs
weight: 100
url: /cpp/aspose.font.ttfhelpers/ifontcharactersmerger/mergefonts/
---
## IFontCharactersMerger::MergeFonts(System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::String) method


Merges fonts based on glyphs lists passed. Searches for a character code for every glyph passed and add found character code with correspondent glyph into resultant new font.

```cpp
virtual System::SharedPtr<Ttf::TtfFont> Aspose::Font::TtfHelpers::IFontCharactersMerger::MergeFonts(System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> font1Glyphs, System::ArrayPtr<System::SharedPtr<Glyphs::GlyphId>> font2Glyphs, System::String newFontName)=0
```


| Parameter | Type | Description |
| --- | --- | --- |
| font1Glyphs | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | List of glyphs from first font |
| font2Glyphs | System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\> | List of glyphs from second font |
| newFontName | System::String | Desired name for resultant font |

### ReturnValue

Merged font

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TtfFont](../../../aspose.font.ttf/ttffont/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFontCharactersMerger](../)
* Namespace [Aspose::Font::TtfHelpers](../../)
* Library [Aspose.Font for C++](../../../)
## IFontCharactersMerger::MergeFonts(System::ArrayPtr\<uint32_t\>, System::ArrayPtr\<uint32_t\>, System::String) method


Merges fonts based on character codes lists passed. To create desired resultant font just pass symbol codes from original fonts you want to include into resultant font. [Glyphs](../../../aspose.font.glyphs/) related to codes passed will be found automatically. For example, if you want to include into resultant font glyphs related to letters A and B from first font and glyphs, related to letters C and D from second font, just call this method like this: **MergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, "NewFont")**

```cpp
virtual System::SharedPtr<Ttf::TtfFont> Aspose::Font::TtfHelpers::IFontCharactersMerger::MergeFonts(System::ArrayPtr<uint32_t> font1CharCodes, System::ArrayPtr<uint32_t> font2CharCodes, System::String newFontName)=0
```


| Parameter | Type | Description |
| --- | --- | --- |
| font1CharCodes | System::ArrayPtr\<uint32_t\> | Codes to take from first font |
| font2CharCodes | System::ArrayPtr\<uint32_t\> | Codes to take from second font |
| newFontName | System::String | Desired name for resultant font |

### ReturnValue

Merged font

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TtfFont](../../../aspose.font.ttf/ttffont/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [IFontCharactersMerger](../)
* Namespace [Aspose::Font::TtfHelpers](../../)
* Library [Aspose.Font for C++](../../../)
## IFontCharactersMerger::MergeFonts(System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::String) method


This method version designed for cases when you want to set character codes for glyphs in resultant font explicitly. It's not mandatory that code for glyph you provided is included in original font. The sense of code passed is that it will be associated with correspondent glyph identifier in resultant font. So, rule to process every pair passed by dictionary parameter[code, glyph ideitifier] is that only glyph identifer will be taken from original font and then it will be linked with correspondent code in resultant font. It can be helpful when some codes from first font conflict with same codes from second font.

```cpp
virtual System::SharedPtr<Ttf::TtfFont> Aspose::Font::TtfHelpers::IFontCharactersMerger::MergeFonts(System::SharedPtr<System::Collections::Generic::IDictionary<uint32_t, System::SharedPtr<Glyphs::GlyphId>>> font1Dict, System::SharedPtr<System::Collections::Generic::IDictionary<uint32_t, System::SharedPtr<Glyphs::GlyphId>>> font2Dict, System::String newFontName)=0
```


| Parameter | Type | Description |
| --- | --- | --- |
| font1Dict | System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\> | Dictionary with pairs [symbol code, glyph identifier] from first font |
| font2Dict | System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\> | Dictionary with pairs [symbol code, glyph identifier] from second font |
| newFontName | System::String | Desired name for resultant font |

### ReturnValue

Merged font

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TtfFont](../../../aspose.font.ttf/ttffont/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [String](../../../system/string/)
* Class [IFontCharactersMerger](../)
* Namespace [Aspose::Font::TtfHelpers](../../)
* Library [Aspose.Font for C++](../../../)
