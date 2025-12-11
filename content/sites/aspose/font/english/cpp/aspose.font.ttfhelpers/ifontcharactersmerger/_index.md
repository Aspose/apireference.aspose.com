---
title: Aspose::Font::TtfHelpers::IFontCharactersMerger class
linktitle: IFontCharactersMerger
second_title: Aspose.Font for C++
description: 'Aspose::Font::TtfHelpers::IFontCharactersMerger class. Declares helpers functionality to merge TrueType fonts. Font which is passed by parameter font1 considered as primary. It means that many characteristics, related to final merged font, such as metrics, encoding structure and others, will be taken from this primary font in C++.'
type: docs
weight: 200
url: /cpp/aspose.font.ttfhelpers/ifontcharactersmerger/
---
## IFontCharactersMerger class


Declares helpers functionality to merge TrueType fonts. [Font](../../aspose.font/font/) which is passed by parameter font1 considered as primary. It means that many characteristics, related to final merged font, such as metrics, encoding structure and others, will be taken from this primary font.

```cpp
class IFontCharactersMerger : public virtual System::Object
```

## Methods

| Method | Description |
| --- | --- |
| virtual [MergeFonts](./mergefonts/)(System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::ArrayPtr\<System::SharedPtr\<Glyphs::GlyphId\>\>, System::String) | Merges fonts based on glyphs lists passed. Searches for a character code for every glyph passed and add found character code with correspondent glyph into resultant new font. |
| virtual [MergeFonts](./mergefonts/)(System::ArrayPtr\<uint32_t\>, System::ArrayPtr\<uint32_t\>, System::String) | Merges fonts based on character codes lists passed. To create desired resultant font just pass symbol codes from original fonts you want to include into resultant font. [Glyphs](../../aspose.font.glyphs/) related to codes passed will be found automatically. For example, if you want to include into resultant font glyphs related to letters A and B from first font and glyphs, related to letters C and D from second font, just call this method like this: **MergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, "NewFont")** |
| virtual [MergeFonts](./mergefonts/)(System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::SharedPtr\<System::Collections::Generic::IDictionary\<uint32_t, System::SharedPtr\<Glyphs::GlyphId\>\>\>, System::String) | This method version designed for cases when you want to set character codes for glyphs in resultant font explicitly. It's not mandatory that code for glyph you provided is included in original font. The sense of code passed is that it will be associated with correspondent glyph identifier in resultant font. So, rule to process every pair passed by dictionary parameter[code, glyph ideitifier] is that only glyph identifer will be taken from original font and then it will be linked with correspondent code in resultant font. It can be helpful when some codes from first font conflict with same codes from second font. |
## See Also

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::TtfHelpers](../)
* Library [Aspose.Font for C++](../../)
