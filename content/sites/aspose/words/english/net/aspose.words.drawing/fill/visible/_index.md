---
title: Fill.Visible
linktitle: Visible
articleTitle: Visible
second_title: Aspose.Words for .NET
description: Control visibility with the Fill Visible property. Easily manage formatting to enhance your design and ensure clarity in your application.
type: docs
weight: 210
url: /net/aspose.words.drawing/fill/visible/
---
## Fill.Visible property

Gets or sets value that is `true` if the formatting applied to this instance, is visible.

```csharp
public bool Visible { get; set; }
```

## Examples

Shows to create a variety of shapes.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Below are four examples of shapes that we can insert into our documents.
// 1 -  Dotted, horizontal, half-transparent red line
// with an arrow on the left end and a diamond on the right end:
Shape arrow = new Shape(doc, ShapeType.Line);
arrow.Width = 200;
arrow.Stroke.Color = Color.Red;
arrow.Stroke.StartArrowType = ArrowType.Arrow;
arrow.Stroke.StartArrowLength = ArrowLength.Long;
arrow.Stroke.StartArrowWidth = ArrowWidth.Wide;
arrow.Stroke.EndArrowType = ArrowType.Diamond;
arrow.Stroke.EndArrowLength = ArrowLength.Long;
arrow.Stroke.EndArrowWidth = ArrowWidth.Wide;
arrow.Stroke.DashStyle = DashStyle.Dash;
arrow.Stroke.Opacity = 0.5;

Assert.That(arrow.Stroke.JoinStyle, Is.EqualTo(JoinStyle.Miter));

builder.InsertNode(arrow);

// 2 -  Thick black diagonal line with rounded ends:
Shape line = new Shape(doc, ShapeType.Line);
line.Top = 40;
line.Width = 200;
line.Height = 20;
line.StrokeWeight = 5.0;
line.Stroke.EndCap = EndCap.Round;

builder.InsertNode(line);

// 3 -  Arrow with a green fill:
Shape filledInArrow = new Shape(doc, ShapeType.Arrow);
filledInArrow.Width = 200;
filledInArrow.Height = 40;
filledInArrow.Top = 100;
filledInArrow.Fill.ForeColor = Color.Green;
filledInArrow.Fill.Visible = true;

builder.InsertNode(filledInArrow);

// 4 -  Arrow with a flipped orientation filled in with the Aspose logo:
Shape filledInArrowImg = new Shape(doc, ShapeType.Arrow);
filledInArrowImg.Width = 200;
filledInArrowImg.Height = 40;
filledInArrowImg.Top = 160;
filledInArrowImg.FlipOrientation = FlipOrientation.Both;

byte[] imageBytes = File.ReadAllBytes(ImageDir + "Logo.jpg");

using (MemoryStream stream = new MemoryStream(imageBytes))
{
    Image image = Image.FromStream(stream);
    // When we flip the orientation of our arrow, we also flip the image that the arrow contains.
    // Flip the image the other way to cancel this out before getting the shape to display it.
    image.RotateFlip(RotateFlipType.RotateNoneFlipXY);

    filledInArrowImg.ImageData.SetImage(image);
    filledInArrowImg.Stroke.JoinStyle = JoinStyle.Round;

    builder.InsertNode(filledInArrowImg);
}

doc.Save(ArtifactsDir + "Drawing.VariousShapes.docx");
```

### See Also

* class [Fill](../)
* namespace [Aspose.Words.Drawing](../../../aspose.words.drawing/)
* assembly [Aspose.Words](../../../)
