---
title: Class TextFragmentState
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.Text.TextFragmentState class. Represents a text state of a text fragment
type: docs
weight: 11150
url: /net/aspose.pdf.text/textfragmentstate/
---
## TextFragmentState class

Represents a text state of a text fragment.

```csharp
public sealed class TextFragmentState : TextState
```

## Constructors

| Name | Description |
| --- | --- |
| [TextFragmentState](textfragmentstate/)(TextFragment) | Initializes new instance of the `TextFragmentState` object with specified [`TextFragment`](../textfragment/) object. This `TextFragmentState` initialization is not supported. TextFragmentState is only available with [`TextState`](../textfragment/textstate/) property. |

## Properties

| Name | Description |
| --- | --- |
| override [BackgroundColor](../../aspose.pdf.text/textfragmentstate/backgroundcolor/) { get; set; } | Sets background color of the text, represented by the [`TextFragment`](../textfragment/) object |
| override [CharacterSpacing](../../aspose.pdf.text/textfragmentstate/characterspacing/) { get; set; } | Gets or sets character spacing of the text, represented by the [`TextFragment`](../textfragment/) object. |
| override [CoordinateOrigin](../../aspose.pdf.text/textfragmentstate/coordinateorigin/) { get; set; } | Gets or sets text CoordinateOrigin. If CoordinateOrigin is Descender, the text Y coordinate corresponds to the font's lowest point. If CoordinateOrigin is BaseLine, the text Y coordinate corresponds to the font's baseline. The default value is Descender. If the font's Descent value is too big, text can be rendered higher than other fonts. In this case, CoordinateOrigin BaseLine can be selected for better text rendering. |
| [DrawTextRectangleBorder](../../aspose.pdf.text/textfragmentstate/drawtextrectangleborder/) { get; set; } | Gets or sets if text rectangle border drawn flag. |
| override [Font](../../aspose.pdf.text/textfragmentstate/font/) { get; set; } | Gets or sets font of the text, represented by the [`TextFragment`](../textfragment/) object |
| override [FontSize](../../aspose.pdf.text/textfragmentstate/fontsize/) { get; set; } | Gets or sets font size of the text, represented by the [`TextFragment`](../textfragment/) object |
| override [FontStyle](../../aspose.pdf.text/textfragmentstate/fontstyle/) { get; set; } | Sets font style of the text, represented by the [`TextFragment`](../textfragment/) object |
| override [ForegroundColor](../../aspose.pdf.text/textfragmentstate/foregroundcolor/) { get; set; } | Gets or sets foreground color of the text, represented by the [`TextFragment`](../textfragment/) object |
| [FormattingOptions](../../aspose.pdf.text/textfragmentstate/formattingoptions/) { get; set; } | Gets or sets formatting options. Setting of the options will be effective in generator scenarios only. |
| override [HorizontalAlignment](../../aspose.pdf.text/textfragmentstate/horizontalalignment/) { get; set; } | Gets or sets horizontal alignment for the text. |
| override [HorizontalScaling](../../aspose.pdf.text/textfragmentstate/horizontalscaling/) { get; set; } | Gets or sets horizontal scaling of the text, represented by the [`TextFragment`](../textfragment/) object. |
| override [Invisible](../../aspose.pdf.text/textfragmentstate/invisible/) { get; set; } | Gets or sets invisibility of the text. |
| override [LineSpacing](../../aspose.pdf.text/textfragmentstate/linespacing/) { get; set; } | Gets or sets line spacing of the text. |
| override [RenderingMode](../../aspose.pdf.text/textfragmentstate/renderingmode/) { get; set; } | Gets or sets rendering mode of the text. |
| [Rotation](../../aspose.pdf.text/textfragmentstate/rotation/) { get; set; } | Gets or sets rotation angle in degrees. |
| override [StrikeOut](../../aspose.pdf.text/textfragmentstate/strikeout/) { get; set; } | Gets or sets strikeout for the text, represented by the [`TextFragment`](../textfragment/) object |
| override [StrokingColor](../../aspose.pdf.text/textfragmentstate/strokingcolor/) { get; set; } | Gets or sets color stroking operations of [`TextFragment`](../textfragment/) rendering (stroke text, rectangle border) |
| override [Subscript](../../aspose.pdf.text/textfragmentstate/subscript/) { get; set; } | Gets or sets subscript of the text, represented by the [`TextFragment`](../textfragment/) object. |
| override [Superscript](../../aspose.pdf.text/textfragmentstate/superscript/) { get; set; } | Gets or sets superscript of the text, represented by the [`TextFragment`](../textfragment/) object. |
| [TabStops](../../aspose.pdf.text/textfragmentstate/tabstops/) { get; } | Gets tabstops for the text. |
| [TabTag](../../aspose.pdf.text/textstate/tabtag/) { get; } | You can place this tag in text to declare tabulation. |
| override [Underline](../../aspose.pdf.text/textfragmentstate/underline/) { get; set; } | Gets or sets underline for the text, represented by the [`TextFragment`](../textfragment/) object |
| override [WordSpacing](../../aspose.pdf.text/textfragmentstate/wordspacing/) { get; set; } | Gets or sets word spacing of the text. |

## Methods

| Name | Description |
| --- | --- |
| override [ApplyChangesFrom](../../aspose.pdf.text/textfragmentstate/applychangesfrom/)(TextState) | Applies settings from another textState. |
| [IsFitRectangle](../../aspose.pdf.text/textfragmentstate/isfitrectangle/)(string, Rectangle) | Checks if input string could be placed inside defined rectangle. |
| [MeasureHeight](../../aspose.pdf.text/textfragmentstate/measureheight/#measureheight)(char) | Measures character height. (2 methods) |
| override [MeasureString](../../aspose.pdf.text/textfragmentstate/measurestring/)(string) | Measures the string. |

## Fields

| Name | Description |
| --- | --- |
| readonly [TabstopDefaultValue](../../aspose.pdf.text/textstate/tabstopdefaultvalue/) | Default value of tabulation in widths of space character of default font. |

## Remarks

Provides a way to change following properties of the text: font ([`Font`](./font/) property) font size ([`FontSize`](./fontsize/) property) font style ([`FontStyle`](./fontstyle/) property) foreground color ([`ForegroundColor`](./foregroundcolor/) property) background color ([`BackgroundColor`](./backgroundcolor/) property) Note that changing `TextFragmentState` properties may change inner [`Segments`](../textfragment/segments/) collection because TextFragment is an aggregate object and it may rearrange internal segments or merge them into single segment. If your requirement is to leave the [`Segments`](../textfragment/segments/) collection unchanged, please change inner segments individually.

## Examples

The example demonstrates how to change text color and font size of the text with [`TextState`](../textstate/) object.

```csharp
// Open document
Document doc = new Document(@"D:\Tests\input.pdf");

// Create TextFragmentAbsorber object to find all "hello world" text occurrences
TextFragmentAbsorber absorber = new TextFragmentAbsorber("hello world");

// Accept the absorber for first page
doc.Pages[1].Accept(absorber);

// Change foreground color of the first text occurrence
absorber.TextFragments[1].TextState.ForegroundColor = Color.FromRgb(System.Drawing.Color.Red);
// Change font size of the first text occurrence
absorber.TextFragments[1].TextState.FontSize = 15;

// Save document
doc.Save(@"D:\Tests\output.pdf");  
```

### See Also

* class [TextFragmentAbsorber](../textfragmentabsorber/)
* class [Document](../../aspose.pdf/document/)
* class [TextState](../textstate/)
* namespace [Aspose.Pdf.Text](../../aspose.pdf.text/)
* assembly [Aspose.PDF](../../)


