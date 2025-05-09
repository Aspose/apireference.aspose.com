---
title: RelativeHorizontalSize Enum
linktitle: RelativeHorizontalSize
articleTitle: RelativeHorizontalSize
second_title: Aspose.Words for .NET
description: Discover Aspose.Words.Drawing.RelativeHorizontalSize enum for precise control over shape and text frame widths in your documents. Enhance your formatting today!
type: docs
weight: 1590
url: /net/aspose.words.drawing/relativehorizontalsize/
---
## RelativeHorizontalSize enumeration

Specifies relatively to what the width of a shape or a text frame is calculated horizontally.

```csharp
public enum RelativeHorizontalSize
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Margin | `0` | Specifies that the width is calculated relatively to the space between the left and the right margins. |
| Page | `1` | Specifies that the width is calculated relatively to the page width. |
| LeftMargin | `2` | Specifies that the width is calculated relatively to the left margin area size. |
| RightMargin | `3` | Specifies that the width is calculated relatively to the right margin area size. |
| InnerMargin | `4` | Specifies that the width is calculated relatively to the inside margin area size, to the left margin area size for odd pages and to the right margin area size for even pages. |
| OuterMargin | `5` | Specifies that the width is calculated relatively to the outside margin area size, to the right margin area size for odd pages and to the left margin area size for even pages. |
| Default | `1` | Default value is Margin. |

## Examples

Shows how to set relative size and position.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Adding a simple shape with absolute size and position.
Shape shape = builder.InsertShape(ShapeType.Rectangle, 100, 40);
// Set WrapType to WrapType.None since Inline shapes are automatically converted to absolute units.
shape.WrapType = WrapType.None;

// Checking and setting the relative horizontal size.
if (shape.RelativeHorizontalSize == RelativeHorizontalSize.Default)
{
    // Setting the horizontal size binding to Margin.
    shape.RelativeHorizontalSize = RelativeHorizontalSize.Margin;
    // Setting the width to 50% of Margin width.
    shape.WidthRelative = 50;
}

// Checking and setting the relative vertical size.
if (shape.RelativeVerticalSize == RelativeVerticalSize.Default)
{
    // Setting the vertical size binding to Margin.
    shape.RelativeVerticalSize = RelativeVerticalSize.Margin;
    // Setting the heigh to 30% of Margin height.
    shape.HeightRelative = 30;
}

// Checking and setting the relative vertical position.
if (shape.RelativeVerticalPosition == RelativeVerticalPosition.Paragraph)
{
    // etting the position binding to TopMargin.
    shape.RelativeVerticalPosition = RelativeVerticalPosition.TopMargin;
    // Setting relative Top to 30% of TopMargin position.
    shape.TopRelative = 30;
}

// Checking and setting the relative horizontal position.
if (shape.RelativeHorizontalPosition == RelativeHorizontalPosition.Default)
{
    // Setting the position binding to RightMargin.
    shape.RelativeHorizontalPosition = RelativeHorizontalPosition.RightMargin;
    // The position relative value can be negative.
    shape.LeftRelative = -260;
}

doc.Save(ArtifactsDir + "Shape.RelativeSizeAndPosition.docx");
```

### See Also

* property [RelativeHorizontalSize](../shapebase/relativehorizontalsize/)
* namespace [Aspose.Words.Drawing](../../aspose.words.drawing/)
* assembly [Aspose.Words](../../)
