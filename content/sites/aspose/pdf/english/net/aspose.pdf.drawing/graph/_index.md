---
title: Class Graph
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.Drawing.Graph class. Represents graph  graphics generator paragraph
type: docs
weight: 4060
url: /net/aspose.pdf.drawing/graph/
---
## Graph class

Represents graph - graphics generator paragraph.

```csharp
public sealed class Graph : BaseParagraph
```

## Constructors

| Name | Description |
| --- | --- |
| [Graph](graph/#constructor)(double, double) | Initializes a new instance of the `Graph` class. |

## Properties

| Name | Description |
| --- | --- |
| [Border](../../aspose.pdf.drawing/graph/border/) { get; set; } | Gets or sets the border. |
| [GraphInfo](../../aspose.pdf.drawing/graph/graphinfo/) { get; set; } | Gets or sets a [`GraphInfo`](./graphinfo/) object that indicates the graph info,such as color, line width,etc. |
| [Height](../../aspose.pdf.drawing/graph/height/) { get; set; } | Gets or sets a float value that indicates the graph height. The unit is point. |
| virtual [HorizontalAlignment](../../aspose.pdf/baseparagraph/horizontalalignment/) { get; set; } | Gets or sets a horizontal alignment of paragraph |
| virtual [Hyperlink](../../aspose.pdf/baseparagraph/hyperlink/) { get; set; } | Gets or sets the fragment hyperlink(for pdf generator). |
| [IsChangePosition](../../aspose.pdf.drawing/graph/ischangeposition/) { get; set; } | Gets or sets change curret position after process paragraph.(default true) |
| [IsFirstParagraphInColumn](../../aspose.pdf/baseparagraph/isfirstparagraphincolumn/) { get; set; } | Gets or sets a bool value that indicates whether this paragraph will be at next column. Default is false.(for pdf generation) |
| [IsInLineParagraph](../../aspose.pdf/baseparagraph/isinlineparagraph/) { get; set; } | Gets or sets a paragraph is inline. Default is false.(for pdf generation) |
| [IsInNewPage](../../aspose.pdf/baseparagraph/isinnewpage/) { get; set; } | Gets or sets a bool value that force this paragraph generates at new page. Default is false.(for pdf generation) |
| [IsKeptWithNext](../../aspose.pdf/baseparagraph/iskeptwithnext/) { get; set; } | Gets or sets a bool value that indicates whether current paragraph remains in the same page along with next paragraph. Default is false.(for pdf generation) |
| [Left](../../aspose.pdf.drawing/graph/left/) { get; set; } | Gets or sets the table left coordinate. |
| [Margin](../../aspose.pdf/baseparagraph/margin/) { get; set; } | Gets or sets a outer margin for paragraph (for pdf generation) |
| [Shapes](../../aspose.pdf.drawing/graph/shapes/) { get; set; } | Gets or sets a [`Shapes`](./shapes/) collection that indicates all shapes in the graph. |
| [Title](../../aspose.pdf.drawing/graph/title/) { get; set; } | Gets or sets a string value that indicates the title of the graph. |
| [Top](../../aspose.pdf.drawing/graph/top/) { get; set; } | Gets or sets the table top coordinate. |
| virtual [VerticalAlignment](../../aspose.pdf/baseparagraph/verticalalignment/) { get; set; } | Gets or sets a vertical alignment of paragraph |
| [Width](../../aspose.pdf.drawing/graph/width/) { get; set; } | Gets or sets a float value that indicates the graph width. The unit is point. |
| [ZIndex](../../aspose.pdf/baseparagraph/zindex/) { get; set; } | Gets or sets a int value that indicates the Z-order of the graph. A graph with larger ZIndex will be placed over the graph with smaller ZIndex. ZIndex can be negative. Graph with negative ZIndex will be placed behind the text in the page. |

## Methods

| Name | Description |
| --- | --- |
| override [Clone](../../aspose.pdf.drawing/graph/clone/)() | Clone the graph. |

### See Also

* class [BaseParagraph](../../aspose.pdf/baseparagraph/)
* namespace [Aspose.Pdf.Drawing](../../aspose.pdf.drawing/)
* assembly [Aspose.PDF](../../)


