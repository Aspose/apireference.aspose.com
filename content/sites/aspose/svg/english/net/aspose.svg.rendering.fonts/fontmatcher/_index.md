---
title: FontMatcher Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Rendering.Fonts.FontMatcher class. This class allows you to control some parts of the font matching algorithm
type: docs
weight: 4840
url: /net/aspose.svg.rendering.fonts/fontmatcher/
---
## FontMatcher class

This class allows you to control some parts of the font matching algorithm.

```csharp
public abstract class FontMatcher
```

## Methods

| Name | Description |
| --- | --- |
| abstract [MatchFontFallback](../../aspose.svg.rendering.fonts/fontmatcher/matchfontfallback/)(*[FontMatchingProperties](../fontmatchingproperties/), int*) | This method is called if there is no appropriate font found in the fonts lookup folders. It should return true type font based on the *fontMatchingProperties* which can render *charCode*, or `null` if such font is not available. |

### See Also

* namespace [Aspose.Svg.Rendering.Fonts](../../aspose.svg.rendering.fonts/)
* assembly [Aspose.SVG](../../)
