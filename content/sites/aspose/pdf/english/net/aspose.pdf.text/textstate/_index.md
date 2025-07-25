---
title: Class TextState
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.Text.TextState class. Represents a text state of a text
type: docs
weight: 11260
url: /net/aspose.pdf.text/textstate/
---
## TextState class

Represents a text state of a text

```csharp
public class TextState
```

## Constructors

| Name | Description |
| --- | --- |
| [TextState](textstate/#constructor)() | Creates text state object. |
| [TextState](textstate/#constructor_2)(Color) | Creates text state object with foreground color specification. |
| [TextState](textstate/#constructor_1)(double) | Creates text state object with font size specification. |
| [TextState](textstate/#constructor_4)(string) | Creates text state object with font family specification. |
| [TextState](textstate/#constructor_3)(Color, double) | Creates text state object with foreground color and font size specification. |
| [TextState](textstate/#constructor_6)(string, double) | Creates text state object with font family and font size specification. |
| [TextState](textstate/#constructor_5)(string, bool, bool) | Creates text state object with font family and font style specification. |

## Properties

| Name | Description |
| --- | --- |
| virtual [BackgroundColor](../../aspose.pdf.text/textstate/backgroundcolor/) { get; set; } | Sets background color of the text. |
| virtual [CharacterSpacing](../../aspose.pdf.text/textstate/characterspacing/) { get; set; } | Gets or sets character spacing of the text. |
| virtual [CoordinateOrigin](../../aspose.pdf.text/textstate/coordinateorigin/) { get; set; } | Gets or sets text CoordinateOrigin. If CoordinateOrigin is Descender, the text Y coordinate corresponds to the font's lowest point. If CoordinateOrigin is BaseLine, the text Y coordinate corresponds to the font's baseline. The default value is Descender. If the font's Descent value is too big, text can be rendered higher than other fonts. In this case, CoordinateOrigin BaseLine can be selected for better text rendering. |
| virtual [Font](../../aspose.pdf.text/textstate/font/) { get; set; } | Gets or sets font of the text. |
| virtual [FontSize](../../aspose.pdf.text/textstate/fontsize/) { get; set; } | Gets or sets font size of the text. |
| virtual [FontStyle](../../aspose.pdf.text/textstate/fontstyle/) { get; set; } | Sets font style of the text. |
| virtual [ForegroundColor](../../aspose.pdf.text/textstate/foregroundcolor/) { get; set; } | Gets or sets foreground color of the text. |
| virtual [HorizontalAlignment](../../aspose.pdf.text/textstate/horizontalalignment/) { get; set; } | Gets or sets horizontal alignment for the text. |
| virtual [HorizontalScaling](../../aspose.pdf.text/textstate/horizontalscaling/) { get; set; } | Gets or sets horizontal scaling of the text. |
| virtual [Invisible](../../aspose.pdf.text/textstate/invisible/) { get; set; } | Gets or sets the invisibility of text. This basically reflects the [`RenderingMode`](./renderingmode/) state, except for some special cases (like clipping). |
| virtual [LineSpacing](../../aspose.pdf.text/textstate/linespacing/) { get; set; } | Gets or sets line spacing of the text. |
| virtual [RenderingMode](../../aspose.pdf.text/textstate/renderingmode/) { get; set; } | Gets or sets rendering mode of text. |
| virtual [StrikeOut](../../aspose.pdf.text/textstate/strikeout/) { get; set; } | Gets or sets strikeout for the text, represented by the [`TextSegment`](../textsegment/) object |
| virtual [StrokingColor](../../aspose.pdf.text/textstate/strokingcolor/) { get; set; } | Gets or sets foreground color of the text. |
| virtual [Subscript](../../aspose.pdf.text/textstate/subscript/) { get; set; } | Gets or sets subscript of the text. |
| virtual [Superscript](../../aspose.pdf.text/textstate/superscript/) { get; set; } | Gets or sets superscript of the text. |
| [TabTag](../../aspose.pdf.text/textstate/tabtag/) { get; } | You can place this tag in text to declare tabulation. |
| virtual [Underline](../../aspose.pdf.text/textstate/underline/) { get; set; } | Gets or sets underline for the text, represented by the [`TextFragment`](../textfragment/) object |
| virtual [WordSpacing](../../aspose.pdf.text/textstate/wordspacing/) { get; set; } | Gets or sets word spacing of the text. |

## Methods

| Name | Description |
| --- | --- |
| virtual [ApplyChangesFrom](../../aspose.pdf.text/textstate/applychangesfrom/)(TextState) | Applies settings from another textState. |
| [MeasureHeight](../../aspose.pdf.text/textstate/measureheight/)(char) | Measures character height. |
| virtual [MeasureString](../../aspose.pdf.text/textstate/measurestring/)(string) | Measures the string. |

## Fields

| Name | Description |
| --- | --- |
| readonly [TabstopDefaultValue](../../aspose.pdf.text/textstate/tabstopdefaultvalue/) | Default value of tabulation in widths of space character of default font. |

### See Also

* namespace [Aspose.Pdf.Text](../../aspose.pdf.text/)
* assembly [Aspose.PDF](../../)


