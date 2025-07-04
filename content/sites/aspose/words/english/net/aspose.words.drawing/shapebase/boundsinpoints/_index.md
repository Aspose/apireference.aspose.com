---
title: ShapeBase.BoundsInPoints
linktitle: BoundsInPoints
articleTitle: BoundsInPoints
second_title: Aspose.Words for .NET
description: Discover the ShapeBase BoundsInPoints property to easily access a shape's size and location in points, enhancing your design precision and layout control.
type: docs
weight: 80
url: /net/aspose.words.drawing/shapebase/boundsinpoints/
---
## ShapeBase.BoundsInPoints property

Gets the location and size of the containing block of the shape in points, relative to the anchor of the topmost shape.

```csharp
public RectangleF BoundsInPoints { get; }
```

## Remarks

The returned bounds do not include the rotation of this shape or the rotation of the parent group shape, if any.

## Examples

Shows how to verify shape containing block boundaries.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Shape shape = builder.InsertShape(ShapeType.Line, RelativeHorizontalPosition.LeftMargin, 50,
    RelativeVerticalPosition.TopMargin, 50, 100, 100, WrapType.None);
shape.StrokeColor = Color.Orange;

// Even though the line itself takes up little space on the document page,
// it occupies a rectangular containing block, the size of which we can determine using the "Bounds" properties.
Assert.That(shape.Bounds, Is.EqualTo(new RectangleF(50, 50, 100, 100)));
Assert.That(shape.BoundsInPoints, Is.EqualTo(new RectangleF(50, 50, 100, 100)));

// Create a group shape, and then set the size of its containing block using the "Bounds" property.
GroupShape group = new GroupShape(doc);
group.Bounds = new RectangleF(0, 100, 250, 250);

Assert.That(group.BoundsInPoints, Is.EqualTo(new RectangleF(0, 100, 250, 250)));

// Create a rectangle, verify the size of its bounding block, and then add it to the group shape.
shape = new Shape(doc, ShapeType.Rectangle)
{
    Width = 100,
    Height = 100,
    Left = 700,
    Top = 700
};

Assert.That(shape.BoundsInPoints, Is.EqualTo(new RectangleF(700, 700, 100, 100)));

group.AppendChild(shape);

// The group shape's coordinate plane has its origin on the top left-hand side corner of its containing block,
// and the x and y coordinates of (1000, 1000) on the bottom right-hand side corner.
// Our group shape is 250x250pt in size, so every 4pt on the group shape's coordinate plane
// translates to 1pt in the document body's coordinate plane.
// Every shape that we insert will also shrink in size by a factor of 4.
// The change in the shape's "BoundsInPoints" property will reflect this.
Assert.That(shape.BoundsInPoints, Is.EqualTo(new RectangleF(175, 275, 25, 25)));

doc.FirstSection.Body.FirstParagraph.AppendChild(group);

// Insert a shape and place it outside of the bounds of the group shape's containing block.
shape = new Shape(doc, ShapeType.Rectangle)
{
    Width = 100,
    Height = 100,
    Left = 1000,
    Top = 1000
};

group.AppendChild(shape);

// The group shape's footprint in the document body has increased, but the containing block remains the same.
Assert.That(group.BoundsInPoints, Is.EqualTo(new RectangleF(0, 100, 250, 250)));
Assert.That(shape.BoundsInPoints, Is.EqualTo(new RectangleF(250, 350, 25, 25)));

doc.Save(ArtifactsDir + "Shape.Bounds.docx");
```

### See Also

* class [ShapeBase](../)
* namespace [Aspose.Words.Drawing](../../../aspose.words.drawing/)
* assembly [Aspose.Words](../../../)
