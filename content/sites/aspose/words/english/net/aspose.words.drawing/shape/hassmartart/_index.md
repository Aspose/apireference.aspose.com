---
title: Shape.HasSmartArt
linktitle: HasSmartArt
articleTitle: HasSmartArt
second_title: Aspose.Words for .NET
description: Discover if your Shape features a SmartArt object with the HasSmartArt property. Unlock creative design possibilities for your projects!
type: docs
weight: 100
url: /net/aspose.words.drawing/shape/hassmartart/
---
## Shape.HasSmartArt property

Returns `true` if this [`Shape`](../) has a SmartArt object.

```csharp
public bool HasSmartArt { get; }
```

## Examples

Shows how to count the number of shapes in a document with SmartArt objects.

```csharp
Document doc = new Document(MyDir + "SmartArt.docx");

int numberOfSmartArtShapes = doc.GetChildNodes(NodeType.Shape, true).Cast<Shape>().Count(shape => shape.HasSmartArt);

Assert.That(numberOfSmartArtShapes, Is.EqualTo(2));
```

### See Also

* class [Shape](../)
* namespace [Aspose.Words.Drawing](../../../aspose.words.drawing/)
* assembly [Aspose.Words](../../../)
