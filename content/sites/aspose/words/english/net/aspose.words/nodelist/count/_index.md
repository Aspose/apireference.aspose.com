---
title: NodeList.Count
linktitle: Count
articleTitle: Count
second_title: Aspose.Words for .NET
description: Discover the NodeList Count property to easily retrieve the total number of nodes in your list, enhancing your web development efficiency.
type: docs
weight: 10
url: /net/aspose.words/nodelist/count/
---
## NodeList.Count property

Gets the number of nodes in the list.

```csharp
public int Count { get; }
```

## Examples

Shows how to use XPaths to navigate a NodeList.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Insert some nodes with a DocumentBuilder.
builder.Writeln("Hello world!");

builder.StartTable();
builder.InsertCell();
builder.Write("Cell 1");
builder.InsertCell();
builder.Write("Cell 2");
builder.EndTable();

builder.InsertImage(ImageDir + "Logo.jpg");

// Our document contains three Run nodes.
NodeList nodeList = doc.SelectNodes("//Run");

Assert.AreEqual(3, nodeList.Count);
Assert.True(nodeList.Any(n => n.GetText().Trim() == "Hello world!"));
Assert.True(nodeList.Any(n => n.GetText().Trim() == "Cell 1"));
Assert.True(nodeList.Any(n => n.GetText().Trim() == "Cell 2"));

// Use a double forward slash to select all Run nodes
// that are indirect descendants of a Table node, which would be the runs inside the two cells we inserted.
nodeList = doc.SelectNodes("//Table//Run");

Assert.AreEqual(2, nodeList.Count);
Assert.True(nodeList.Any(n => n.GetText().Trim() == "Cell 1"));
Assert.True(nodeList.Any(n => n.GetText().Trim() == "Cell 2"));

// Single forward slashes specify direct descendant relationships,
// which we skipped when we used double slashes.
Assert.AreEqual(doc.SelectNodes("//Table//Run"), 
    doc.SelectNodes("//Table/Row/Cell/Paragraph/Run"));

// Access the shape that contains the image we inserted.
nodeList = doc.SelectNodes("//Shape");

Assert.AreEqual(1, nodeList.Count);

Shape shape = (Shape)nodeList[0];
Assert.True(shape.HasImage);
```

### See Also

* class [NodeList](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
