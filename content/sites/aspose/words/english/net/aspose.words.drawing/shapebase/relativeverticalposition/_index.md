---
title: ShapeBase.RelativeVerticalPosition
linktitle: RelativeVerticalPosition
articleTitle: RelativeVerticalPosition
second_title: Aspose.Words for .NET
description: Discover the ShapeBase RelativeVerticalPosition property to enhance vertical alignment of shapes, ensuring precise layout control in your designs.
type: docs
weight: 470
url: /net/aspose.words.drawing/shapebase/relativeverticalposition/
---
## ShapeBase.RelativeVerticalPosition property

Specifies relative to what the shape is positioned vertically.

```csharp
public RelativeVerticalPosition RelativeVerticalPosition { get; set; }
```

## Remarks

The default value is Paragraph.

Has effect only for top level floating shapes.

## Examples

Shows how to insert a floating image to the center of a page.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Insert a floating image that will appear behind the overlapping text and align it to the page's center.
Shape shape = builder.InsertImage(ImageDir + "Logo.jpg");
shape.WrapType = WrapType.None;
shape.BehindText = true;
shape.RelativeHorizontalPosition = RelativeHorizontalPosition.Page;
shape.RelativeVerticalPosition = RelativeVerticalPosition.Page;
shape.HorizontalAlignment = HorizontalAlignment.Center;
shape.VerticalAlignment = VerticalAlignment.Center;

doc.Save(ArtifactsDir + "Image.CreateFloatingPageCenter.docx");
```

### See Also

* enum [RelativeVerticalPosition](../../relativeverticalposition/)
* class [ShapeBase](../)
* namespace [Aspose.Words.Drawing](../../../aspose.words.drawing/)
* assembly [Aspose.Words](../../../)
