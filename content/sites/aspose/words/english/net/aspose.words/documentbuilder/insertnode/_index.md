---
title: DocumentBuilder.InsertNode
linktitle: InsertNode
articleTitle: InsertNode
second_title: Aspose.Words for .NET
description: Enhance your document creation with the DocumentBuilder InsertNode method. Effortlessly insert nodes before the cursor for seamless editing!
type: docs
weight: 410
url: /net/aspose.words/documentbuilder/insertnode/
---
## DocumentBuilder.InsertNode method

Inserts a node before the cursor.

```csharp
public void InsertNode(Node node)
```

## Examples

Shows how to insert a linked image into a document.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

string imageFileName = ImageDir + "Windows MetaFile.wmf";

// Below are two ways of applying an image to a shape so that it can display it.
// 1 -  Set the shape to contain the image.
Shape shape = new Shape(builder.Document, ShapeType.Image);
shape.WrapType = WrapType.Inline;
shape.ImageData.SetImage(imageFileName);

builder.InsertNode(shape);

doc.Save(ArtifactsDir + "Image.CreateLinkedImage.Embedded.docx");

// Every image that we store in shape will increase the size of our document.
Assert.That(70000 < new FileInfo(ArtifactsDir + "Image.CreateLinkedImage.Embedded.docx").Length, Is.True);

doc.FirstSection.Body.FirstParagraph.RemoveAllChildren();

// 2 -  Set the shape to link to an image file in the local file system.
shape = new Shape(builder.Document, ShapeType.Image);
shape.WrapType = WrapType.Inline;
shape.ImageData.SourceFullName = imageFileName;

builder.InsertNode(shape);
doc.Save(ArtifactsDir + "Image.CreateLinkedImage.Linked.docx");

// Linking to images will save space and result in a smaller document.
// However, the document can only display the image correctly while
// the image file is present at the location that the shape's "SourceFullName" property points to.
Assert.That(10000 > new FileInfo(ArtifactsDir + "Image.CreateLinkedImage.Linked.docx").Length, Is.True);
```

### See Also

* class [Node](../../node/)
* class [DocumentBuilder](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
