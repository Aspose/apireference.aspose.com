---
title: Class TeXFragment
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.TeXFragment class. Represents TeX fragment
type: docs
weight: 10540
url: /net/aspose.pdf/texfragment/
---
## TeXFragment class

Represents TeX fragment.

```csharp
public class TeXFragment : FormattedFragment
```

## Constructors

| Name | Description |
| --- | --- |
| [TeXFragment](texfragment/#constructor)(string) | Initializes a new instance of the HtmlFragment class. |
| [TeXFragment](texfragment/#constructor_1)(string, bool) | Initializes a new instance of the HtmlFragment class. |

## Properties

| Name | Description |
| --- | --- |
| virtual [HorizontalAlignment](../../aspose.pdf/baseparagraph/horizontalalignment/) { get; set; } | Gets or sets a horizontal alignment of paragraph |
| virtual [Hyperlink](../../aspose.pdf/baseparagraph/hyperlink/) { get; set; } | Gets or sets the fragment hyperlink(for pdf generator). |
| [IsFirstParagraphInColumn](../../aspose.pdf/baseparagraph/isfirstparagraphincolumn/) { get; set; } | Gets or sets a bool value that indicates whether this paragraph will be at next column. Default is false.(for pdf generation) |
| [IsInLineParagraph](../../aspose.pdf/baseparagraph/isinlineparagraph/) { get; set; } | Gets or sets a paragraph is inline. Default is false.(for pdf generation) |
| [IsInNewPage](../../aspose.pdf/baseparagraph/isinnewpage/) { get; set; } | Gets or sets a bool value that force this paragraph generates at new page. Default is false.(for pdf generation) |
| [IsKeptWithNext](../../aspose.pdf/baseparagraph/iskeptwithnext/) { get; set; } | Gets or sets a bool value that indicates whether current paragraph remains in the same page along with next paragraph. Default is false.(for pdf generation) |
| [Margin](../../aspose.pdf/baseparagraph/margin/) { get; set; } | Gets or sets a outer margin for paragraph (for pdf generation) |
| [TeXLoadOptionsOfInstance](../../aspose.pdf/texfragment/texloadoptionsofinstance/) { get; set; } | Gets or sets TeXLoadOptions that will be used for loading (and rendering) of LaTeX into this instance of class. Please use it when it's necessary use specific setting for import of LaTeX for this or that instance (f.e when this or that instance should use specific BasePath for imported LaTeX or should use specific loader of external resources) If parameter is default (null), then standard LaTeX loading options will be used. |
| virtual [VerticalAlignment](../../aspose.pdf/baseparagraph/verticalalignment/) { get; set; } | Gets or sets a vertical alignment of paragraph |
| [ZIndex](../../aspose.pdf/baseparagraph/zindex/) { get; set; } | Gets or sets a int value that indicates the Z-order of the graph. A graph with larger ZIndex will be placed over the graph with smaller ZIndex. ZIndex can be negative. Graph with negative ZIndex will be placed behind the text in the page. |

## Methods

| Name | Description |
| --- | --- |
| override [Clone](../../aspose.pdf/texfragment/clone/)() | Clones fragment. |

### See Also

* class [FormattedFragment](../formattedfragment/)
* namespace [Aspose.Pdf](../../aspose.pdf/)
* assembly [Aspose.PDF](../../)


