---
title: Class TextParagraph
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.Text.TextParagraph class. Represents text paragraphs as multiline text object
type: docs
weight: 11170
url: /net/aspose.pdf.text/textparagraph/
---
## TextParagraph class

Represents text paragraphs as multiline text object.

```csharp
public sealed class TextParagraph
```

## Constructors

| Name | Description |
| --- | --- |
| [TextParagraph](textparagraph/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [FirstLineIndent](../../aspose.pdf.text/textparagraph/firstlineindent/) { get; set; } | Gets or sets subsequent lines indent value. If set to a non-zero value, it has an advantage over the FormattingOptions.SubsequentLinesIndent value. |
| [FormattingOptions](../../aspose.pdf.text/textparagraph/formattingoptions/) { get; set; } | Gets or sets formatting options. |
| [HorizontalAlignment](../../aspose.pdf.text/textparagraph/horizontalalignment/) { get; set; } | Gets or sets horizontal alignment for the text inside paragrph's [`Rectangle`](./rectangle/). |
| [Justify](../../aspose.pdf.text/textparagraph/justify/) { get; set; } | Gets or sets value whether text is justified. |
| [Margin](../../aspose.pdf.text/textparagraph/margin/) { get; set; } | Gets or sets the padding. |
| [Position](../../aspose.pdf.text/textparagraph/position/) { get; set; } | Gets or sets position of the paragraph. |
| [Rectangle](../../aspose.pdf.text/textparagraph/rectangle/) { get; set; } | Gets or sets rectangle of the paragraph. |
| [Rotation](../../aspose.pdf.text/textparagraph/rotation/) { get; set; } | Gets or sets rotation angle in degrees. |
| [SubsequentLinesIndent](../../aspose.pdf.text/textparagraph/subsequentlinesindent/) { get; set; } | Gets or sets subsequent lines indent value. If set to a non-zero value, it has an advantage over the FormattingOptions.SubsequentLinesIndent value. |
| [TextRectangle](../../aspose.pdf.text/textparagraph/textrectangle/) { get; } | Gets rectangle of the text placed to the paragraph. |
| [VerticalAlignment](../../aspose.pdf.text/textparagraph/verticalalignment/) { get; set; } | Gets or sets vertical alignment for the text inside paragrph's [`Rectangle`](./rectangle/). |

## Methods

| Name | Description |
| --- | --- |
| [AppendLine](../../aspose.pdf.text/textparagraph/appendline/#appendline_3)(string) | Appends text line |
| [AppendLine](../../aspose.pdf.text/textparagraph/appendline/#appendline)(TextFragment) | Appends text line with text state parameters. |
| [AppendLine](../../aspose.pdf.text/textparagraph/appendline/#appendline_6)(string, float) | Appends text line. |
| [AppendLine](../../aspose.pdf.text/textparagraph/appendline/#appendline_4)(string, TextState) | Appends text line with text state parameters. |
| [AppendLine](../../aspose.pdf.text/textparagraph/appendline/#appendline_1)(TextFragment, TextState) | Appends text line with text state parameters. |
| [AppendLine](../../aspose.pdf.text/textparagraph/appendline/#appendline_5)(string, TextState, float) | Appends text line with text state parameters |
| [AppendLine](../../aspose.pdf.text/textparagraph/appendline/#appendline_2)(TextFragment, TextState, float) | Appends text line with text state parameters |
| [BeginEdit](../../aspose.pdf.text/textparagraph/beginedit/)() | Begins the editing of the TextParagraph. |
| [EndEdit](../../aspose.pdf.text/textparagraph/endedit/)() | Ends the editing of the TextParagraph. |

## Examples

The example demonstrates how to create text paragraph object and append it to the Pdf page.

```csharp
Document doc = new Document(inFile);

Page page = (Page)doc.Pages[1];

// create text paragraph
TextParagraph paragraph = new TextParagraph();
           
// set the paragraph rectangle
paragraph.Rectangle = new Rectangle(100, 600, 200, 700);

// set word wrapping options
paragraph.FormattingOptions.WrapMode = TextFormattingOptions.WordWrapMode.ByWords;

// append string lines
paragraph.AppendLine("the quick brown fox jumps over the lazy dog");
paragraph.AppendLine("line2");
paragraph.AppendLine("line3");

// append the paragraph to the Pdf page with the TextBuilder
TextBuilder textBuilder = new TextBuilder(page);
textBuilder.AppendParagraph(paragraph);

// save Pdf document
doc.Save(outFile);
```

### See Also

* namespace [Aspose.Pdf.Text](../../aspose.pdf.text/)
* assembly [Aspose.PDF](../../)


