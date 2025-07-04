---
title: PageSetup.PageWidth
linktitle: PageWidth
articleTitle: PageWidth
second_title: Aspose.Words for .NET
description: Discover the PageSetup PageWidth property to easily adjust page width in points, enhancing your document layout for optimal presentation.
type: docs
weight: 340
url: /net/aspose.words/pagesetup/pagewidth/
---
## PageSetup.PageWidth property

Returns or sets the width of the page in points.

```csharp
public double PageWidth { get; set; }
```

## Examples

Shows how to insert an image, and use it as a watermark.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Insert the image into the header so that it will be visible on every page.
builder.MoveToHeaderFooter(HeaderFooterType.HeaderPrimary);
Shape shape = builder.InsertImage(ImageDir + "Transparent background logo.png");
shape.WrapType = WrapType.None;
shape.BehindText = true;

// Place the image at the center of the page.
shape.RelativeHorizontalPosition = RelativeHorizontalPosition.Page;
shape.RelativeVerticalPosition = RelativeVerticalPosition.Page;
shape.Left = (builder.PageSetup.PageWidth - shape.Width) / 2;
shape.Top = (builder.PageSetup.PageHeight - shape.Height) / 2;

doc.Save(ArtifactsDir + "DocumentBuilder.InsertWatermark.docx");
```

Shows how to insert a floating image, and specify its position and size.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Shape shape = builder.InsertImage(ImageDir + "Logo.jpg");
shape.WrapType = WrapType.None;

// Configure the shape's "RelativeHorizontalPosition" property to treat the value of the "Left" property
// as the shape's horizontal distance, in points, from the left side of the page. 
shape.RelativeHorizontalPosition = RelativeHorizontalPosition.Page;

// Set the shape's horizontal distance from the left side of the page to 100.
shape.Left = 100;

// Use the "RelativeVerticalPosition" property in a similar way to position the shape 80pt below the top of the page.
shape.RelativeVerticalPosition = RelativeVerticalPosition.Page;
shape.Top = 80;

// Set the shape's height, which will automatically scale the width to preserve dimensions.
shape.Height = 125;

Assert.That(shape.Width, Is.EqualTo(125.0d));

// The "Bottom" and "Right" properties contain the bottom and right edges of the image.
Assert.That(shape.Bottom, Is.EqualTo(shape.Top + shape.Height));
Assert.That(shape.Right, Is.EqualTo(shape.Left + shape.Width));

doc.Save(ArtifactsDir + "Image.CreateFloatingPositionSize.docx");
```

### See Also

* class [PageSetup](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
