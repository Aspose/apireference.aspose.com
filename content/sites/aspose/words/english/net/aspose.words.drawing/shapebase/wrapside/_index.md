---
title: ShapeBase.WrapSide
linktitle: WrapSide
articleTitle: WrapSide
second_title: Aspose.Words for .NET
description: Discover the ShapeBase WrapSide property to control text wrapping around shapes, enhancing your design's visual appeal and readability.
type: docs
weight: 630
url: /net/aspose.words.drawing/shapebase/wrapside/
---
## ShapeBase.WrapSide property

Specifies how the text is wrapped around the shape.

```csharp
public WrapSide WrapSide { get; set; }
```

## Remarks

The default value is Both.

Has effect only for top level shapes.

## Examples

Shows how to replace all textbox shapes with image shapes.

```csharp
Document doc = new Document(MyDir + "Textboxes in drawing canvas.docx");

Shape[] shapes = doc.GetChildNodes(NodeType.Shape, true).OfType<Shape>().ToArray();

Assert.That(shapes.Count(s => s.ShapeType == ShapeType.TextBox), Is.EqualTo(3));
Assert.That(shapes.Count(s => s.ShapeType == ShapeType.Image), Is.EqualTo(1));

foreach (Shape shape in shapes)
{
    if (shape.ShapeType == ShapeType.TextBox)
    {
        Shape replacementShape = new Shape(doc, ShapeType.Image);
        replacementShape.ImageData.SetImage(ImageDir + "Logo.jpg");
        replacementShape.Left = shape.Left;
        replacementShape.Top = shape.Top;
        replacementShape.Width = shape.Width;
        replacementShape.Height = shape.Height;
        replacementShape.RelativeHorizontalPosition = shape.RelativeHorizontalPosition;
        replacementShape.RelativeVerticalPosition = shape.RelativeVerticalPosition;
        replacementShape.HorizontalAlignment = shape.HorizontalAlignment;
        replacementShape.VerticalAlignment = shape.VerticalAlignment;
        replacementShape.WrapType = shape.WrapType;
        replacementShape.WrapSide = shape.WrapSide;

        shape.ParentNode.InsertAfter(replacementShape, shape);
        shape.Remove();
    }
}

shapes = doc.GetChildNodes(NodeType.Shape, true).OfType<Shape>().ToArray();

Assert.That(shapes.Count(s => s.ShapeType == ShapeType.TextBox), Is.EqualTo(0));
Assert.That(shapes.Count(s => s.ShapeType == ShapeType.Image), Is.EqualTo(4));

doc.Save(ArtifactsDir + "Shape.ReplaceTextboxesWithImages.docx");
```

### See Also

* enum [WrapSide](../../wrapside/)
* class [ShapeBase](../)
* namespace [Aspose.Words.Drawing](../../../aspose.words.drawing/)
* assembly [Aspose.Words](../../../)
