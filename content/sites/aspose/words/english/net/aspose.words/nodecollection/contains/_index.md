---
title: NodeCollection.Contains
linktitle: Contains
articleTitle: Contains
second_title: Aspose.Words for .NET
description: Discover how the NodeCollection Contains method efficiently checks if a node exists in your collection, enhancing your data management capabilities.
type: docs
weight: 50
url: /net/aspose.words/nodecollection/contains/
---
## NodeCollection.Contains method

Determines whether a node is in the collection.

```csharp
public bool Contains(Node node)
```

| Parameter | Type | Description |
| --- | --- | --- |
| node | Node | The node to locate. |

### Return Value

`true` if item is found in the collection; otherwise, `false`.

## Remarks

This method performs a linear search; therefore, the average execution time is proportional to [`Count`](../count/).

## Examples

Shows how to work with a NodeCollection.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Add text to the document by inserting Runs using a DocumentBuilder.
builder.Write("Run 1. ");
builder.Write("Run 2. ");

// Every invocation of the "Write" method creates a new Run,
// which then appears in the parent Paragraph's RunCollection.
RunCollection runs = doc.FirstSection.Body.FirstParagraph.Runs;

Assert.AreEqual(2, runs.Count);

// We can also insert a node into the RunCollection manually.
Run newRun = new Run(doc, "Run 3. ");
runs.Insert(3, newRun);

Assert.True(runs.Contains(newRun));
Assert.AreEqual("Run 1. Run 2. Run 3.", doc.GetText().Trim());

// Access individual runs and remove them to remove their text from the document.
Run run = runs[1];
runs.Remove(run);

Assert.AreEqual("Run 1. Run 3.", doc.GetText().Trim());
Assert.NotNull(run);
Assert.False(runs.Contains(run));
```

### See Also

* class [Node](../../node/)
* class [NodeCollection](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
