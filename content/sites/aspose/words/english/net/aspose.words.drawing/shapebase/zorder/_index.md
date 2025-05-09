---
title: ShapeBase.ZOrder
linktitle: ZOrder
articleTitle: ZOrder
second_title: Aspose.Words for .NET
description: Discover how the ShapeBase ZOrder property enhances your design by controlling the display order of overlapping shapes for a clearer, more organized layout.
type: docs
weight: 650
url: /net/aspose.words.drawing/shapebase/zorder/
---
## ShapeBase.ZOrder property

Determines the display order of overlapping shapes.

```csharp
public int ZOrder { get; set; }
```

## Remarks

Has effect only for top level shapes.

The default value is 0.

The number represents the stacking precedence. A shape with a higher number will be displayed as if it were overlapping (in "front" of) a shape with a lower number.

The order of overlapping shapes is independent for shapes in the header and in the main text of the document.

The display order of child shapes in a group shape is determined by their order inside the group shape.

## Examples

Shows how to manipulate the order of shapes.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Insert three different colored rectangles that partially overlap each other.
// When we insert a shape that overlaps another shape, Aspose.Words places the newer shape on top of the old one.
// The light green rectangle will overlap the light blue rectangle and partially obscure it,
// and the light blue rectangle will obscure the orange rectangle.
Shape shape = builder.InsertShape(ShapeType.Rectangle, RelativeHorizontalPosition.LeftMargin, 100,
    RelativeVerticalPosition.TopMargin, 100, 200, 200, WrapType.None);
shape.FillColor = Color.Orange;

shape = builder.InsertShape(ShapeType.Rectangle, RelativeHorizontalPosition.LeftMargin, 150,
    RelativeVerticalPosition.TopMargin, 150, 200, 200, WrapType.None);
shape.FillColor = Color.LightBlue;

shape = builder.InsertShape(ShapeType.Rectangle, RelativeHorizontalPosition.LeftMargin, 200,
    RelativeVerticalPosition.TopMargin, 200, 200, 200, WrapType.None);
shape.FillColor = Color.LightGreen;

Shape[] shapes = doc.GetChildNodes(NodeType.Shape, true).OfType<Shape>().ToArray();

// The "ZOrder" property of a shape determines its stacking priority among other overlapping shapes.
// If two overlapping shapes have different "ZOrder" values,
// Microsoft Word will place the shape with a higher value over the shape with the lower value. 
// Set the "ZOrder" values of our shapes to place the first orange rectangle over the second light blue one
// and the second light blue rectangle over the third light green rectangle.
// This will reverse their original stacking order.
shapes[0].ZOrder = 3;
shapes[1].ZOrder = 2;
shapes[2].ZOrder = 1;

doc.Save(ArtifactsDir + "Shape.ZOrder.docx");
```

### See Also

* class [ShapeBase](../)
* namespace [Aspose.Words.Drawing](../../../aspose.words.drawing/)
* assembly [Aspose.Words](../../../)
