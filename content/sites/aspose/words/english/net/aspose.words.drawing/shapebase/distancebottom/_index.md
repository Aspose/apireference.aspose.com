---
title: ShapeBase.DistanceBottom
linktitle: DistanceBottom
articleTitle: DistanceBottom
second_title: Aspose.Words for .NET
description: Discover the ShapeBase DistanceBottom property, easily set and adjust the gap in points between your document text and the shape's bottom edge for optimal layout.
type: docs
weight: 130
url: /net/aspose.words.drawing/shapebase/distancebottom/
---
## ShapeBase.DistanceBottom property

Returns or sets the distance (in points) between the document text and the bottom edge of the shape.

```csharp
public double DistanceBottom { get; set; }
```

## Remarks

The default value is 0.

Has effect only for top level shapes.

## Examples

Shows how to set the wrapping distance for a text that surrounds a shape.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Insert a rectangle and, get the text to wrap tightly around its bounds.
Shape shape = builder.InsertShape(ShapeType.Rectangle, 150, 150);
shape.WrapType = WrapType.Tight;

// Set the minimum distance between the shape and surrounding text to 40pt from all sides.
shape.DistanceTop = 40;
shape.DistanceBottom = 40;
shape.DistanceLeft = 40;
shape.DistanceRight = 40;

// Move the shape closer to the center of the page, and then rotate the shape 60 degrees clockwise.
shape.Top = 75;
shape.Left = 150;
shape.Rotation = 60;

// Add text that will wrap around the shape.
builder.Font.Size = 24;
builder.Write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
              "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");

doc.Save(ArtifactsDir + "Shape.Coordinates.docx");
```

### See Also

* class [ShapeBase](../)
* namespace [Aspose.Words.Drawing](../../../aspose.words.drawing/)
* assembly [Aspose.Words](../../../)
