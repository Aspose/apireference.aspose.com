---
title: Interface IFontCharactersMerger
second_title: Aspose.Font for .NET API Reference
description: Aspose.Font.TtfHelpers.IFontCharactersMerger interface. Declares helpers functionality to merge TrueType fonts. Font which is passed by parameter font1 considered as primary. It means that many characteristics related to final merged font such as metrics encoding structure and others will be taken from this primary font
type: docs
weight: 800
url: /net/aspose.font.ttfhelpers/ifontcharactersmerger/
---
## IFontCharactersMerger interface

Declares helpers functionality to merge TrueType fonts. Font which is passed by parameter font1 considered as primary. It means that many characteristics, related to final merged font, such as metrics, encoding structure and others, will be taken from this primary font.

```csharp
public interface IFontCharactersMerger
```

## Methods

| Name | Description |
| --- | --- |
| [MergeFonts](../../aspose.font.ttfhelpers/ifontcharactersmerger/mergefonts/#mergefonts)(GlyphId[], GlyphId[], string) | Merges fonts based on glyphs lists passed. Searches for a character code for every glyph passed and add found character code with correspondent glyph into resultant new font. |
| [MergeFonts](../../aspose.font.ttfhelpers/ifontcharactersmerger/mergefonts/#mergefonts_1)(IDictionary&lt;uint, GlyphId&gt;, IDictionary&lt;uint, GlyphId&gt;, string) | This method version designed for cases when you want to set character codes for glyphs in resultant font explicitly. It's not mandatory that code for glyph you provided is included in original font. The sense of code passed is that it will be associated with correspondent glyph identifier in resultant font. So, rule to process every pair passed by dictionary parameter[code, glyph ideitifier] is that only glyph identifer will be taken from original font and then it will be linked with correspondent code in resultant font. It can be helpful when some codes from first font conflict with same codes from second font. |
| [MergeFonts](../../aspose.font.ttfhelpers/ifontcharactersmerger/mergefonts/#mergefonts_2)(uint[], uint[], string) | Merges fonts based on character codes lists passed. To create desired resultant font just pass symbol codes from original fonts you want to include into resultant font. Glyphs related to codes passed will be found automatically. For example, if you want to include into resultant font glyphs related to letters A and B from first font and glyphs, related to letters C and D from second font, just call this method like this: |

### See Also

* namespace [Aspose.Font.TtfHelpers](../../aspose.font.ttfhelpers/)
* assembly [Aspose.Font](../../)


