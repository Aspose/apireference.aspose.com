---
title: Fill.BaseForeColor
linktitle: BaseForeColor
articleTitle: BaseForeColor
second_title: Aspose.Words for .NET
description: Discover the BaseForeColor property to access a Color object representing the true foreground color for your fill, enhancing your design's clarity and appeal.
type: docs
weight: 40
url: /net/aspose.words.drawing/fill/baseforecolor/
---
## Fill.BaseForeColor property

Gets a Color object that represents the base foreground color for the fill without any modifiers.

```csharp
public Color BaseForeColor { get; }
```

## Examples

Shows how to get foreground color without modifiers.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder();

Shape shape = builder.InsertShape(ShapeType.Rectangle, 100, 40);
shape.Fill.ForeColor = Color.Red;
shape.Fill.ForeTintAndShade = 0.5;
shape.Stroke.Fill.ForeColor = Color.Green;
shape.Stroke.Fill.Transparency = 0.5;

Assert.AreEqual(Color.FromArgb(255, 255, 188, 188).ToArgb(), shape.Fill.ForeColor.ToArgb());
Assert.AreEqual(Color.Red.ToArgb(), shape.Fill.BaseForeColor.ToArgb());

Assert.AreEqual(Color.FromArgb(128, 0, 128, 0).ToArgb(), shape.Stroke.ForeColor.ToArgb());
Assert.AreEqual(Color.Green.ToArgb(), shape.Stroke.BaseForeColor.ToArgb());

Assert.AreEqual(Color.Green.ToArgb(), shape.Stroke.Fill.ForeColor.ToArgb());
Assert.AreEqual(Color.Green.ToArgb(), shape.Stroke.Fill.BaseForeColor.ToArgb());
```

### See Also

* class [Fill](../)
* namespace [Aspose.Words.Drawing](../../../aspose.words.drawing/)
* assembly [Aspose.Words](../../../)
