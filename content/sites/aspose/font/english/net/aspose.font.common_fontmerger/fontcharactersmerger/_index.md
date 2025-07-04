---
title: Class FontCharactersMerger
second_title: Aspose.Font for .NET API Reference
description: Aspose.Font.Common_FontMerger.FontCharactersMerger class. Declares functionality to merge fonts of different types. Fonts pair is needed for merge operation. One font from this pair is considered as primary. It means that many characteristics related to final merged font such as metrics encoding structure and others will be taken from this primary font. Another font from this pair secondary provides only glyphs for final merged font
type: docs
weight: 150
url: /net/aspose.font.common_fontmerger/fontcharactersmerger/
---
## FontCharactersMerger class

Declares functionality to merge fonts of different types. Fonts pair is needed for merge operation. One font from this pair is considered as primary. It means that many characteristics, related to final merged font, such as metrics, encoding structure and others, will be taken from this primary font. Another font from this pair (secondary) provides only glyphs for final merged font.

```csharp
public abstract class FontCharactersMerger
```

## Properties

| Name | Description |
| --- | --- |
| abstract [PrimaryFont](../../aspose.font.common_fontmerger/fontcharactersmerger/primaryfont/) { get; } | Gets primary font. |
| abstract [SecondaryFont](../../aspose.font.common_fontmerger/fontcharactersmerger/secondaryfont/) { get; } | Gets secondary font. |

## Methods

| Name | Description |
| --- | --- |
| abstract [MergeFonts](../../aspose.font.common_fontmerger/fontcharactersmerger/mergefonts/#mergefonts)(GlyphId[], GlyphId[], string) | Merges fonts based on glyphs lists passed. Searches for a character code for every glyph passed and adds found character code with correspondent glyph into resultant new font. |
| abstract [MergeFonts](../../aspose.font.common_fontmerger/fontcharactersmerger/mergefonts/#mergefonts_1)(IDictionary&lt;uint, GlyphId&gt;, IDictionary&lt;uint, GlyphId&gt;, string) | This method version designed for cases when you want to set character codes for glyphs in resultant font explicitly. It's not mandatory that code for glyph you provided is included in original font. The sense of code passed is that it will be associated with correspondent glyph identifier in resultant font. So, rule to process every pair passed by dictionary parameter[code, glyph ideitifier] is that only glyph identifer will be taken from original font and then it will be linked with correspondent code in resultant font. It can be helpful when some codes from first font conflict with same codes from second font. |
| abstract [MergeFonts](../../aspose.font.common_fontmerger/fontcharactersmerger/mergefonts/#mergefonts_2)(uint[], uint[], string) | Merges fonts based on character codes lists passed. To create desired resultant font just pass symbol codes from original fonts you want to include into resultant font. Glyphs related to codes passed will be found automatically. For example, if you want to include into resultant font glyphs related to letters A and B from first font and glyphs, related to letters C and D from second font, just call this method like this: |

### See Also

* namespace [Aspose.Font.Common_FontMerger](../../aspose.font.common_fontmerger/)
* assembly [Aspose.Font](../../)


