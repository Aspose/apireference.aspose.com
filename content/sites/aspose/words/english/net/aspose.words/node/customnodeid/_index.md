---
title: Node.CustomNodeId
linktitle: CustomNodeId
articleTitle: CustomNodeId
second_title: Aspose.Words for .NET
description: Discover the Node CustomNodeId property for efficient custom node identification. Enhance your project with unique identifiers for better organization!
type: docs
weight: 10
url: /net/aspose.words/node/customnodeid/
---
## Node.CustomNodeId property

Specifies custom node identifier.

```csharp
public int CustomNodeId { get; set; }
```

## Remarks

Default is zero.

This identifier can be set and used arbitrarily. For example, as a key to get external data.

Important note, specified value is not saved to an output file and exists only during the node lifetime.

## Examples

Shows how to traverse through a composite node's collection of child nodes.

```csharp
Document doc = new Document();

// Add two runs and one shape as child nodes to the first paragraph of this document.
Paragraph paragraph = (Paragraph)doc.GetChild(NodeType.Paragraph, 0, true);
paragraph.AppendChild(new Run(doc, "Hello world! "));

Shape shape = new Shape(doc, ShapeType.Rectangle);
shape.Width = 200;
shape.Height = 200;
// Note that the 'CustomNodeId' is not saved to an output file and exists only during the node lifetime.
shape.CustomNodeId = 100;
shape.WrapType = WrapType.Inline;
paragraph.AppendChild(shape);

paragraph.AppendChild(new Run(doc, "Hello again!"));

// Iterate through the paragraph's collection of immediate children,
// and print any runs or shapes that we find within.
NodeCollection children = paragraph.GetChildNodes(NodeType.Any, false);

Assert.That(paragraph.GetChildNodes(NodeType.Any, false).Count, Is.EqualTo(3));

foreach (Node child in children)
    switch (child.NodeType)
    {
        case NodeType.Run:
            Console.WriteLine("Run contents:");
            Console.WriteLine($"\t\"{child.GetText().Trim()}\"");
            break;
        case NodeType.Shape:
            Shape childShape = (Shape)child;
            Console.WriteLine("Shape:");
            Console.WriteLine($"\t{childShape.ShapeType}, {childShape.Width}x{childShape.Height}");
            break;
    }
```

### See Also

* class [Node](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
