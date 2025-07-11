---
title: NodeCollection.RemoveAt
linktitle: RemoveAt
articleTitle: RemoveAt
second_title: Aspose.Words for .NET
description: Effortlessly remove nodes from your collection with the NodeCollection RemoveAt method. Streamline document management by removing specific nodes quickly.
type: docs
weight: 100
url: /net/aspose.words/nodecollection/removeat/
---
## NodeCollection.RemoveAt method

Removes the node at the specified index from the collection and from the document.

```csharp
public void RemoveAt(int index)
```

| Parameter | Type | Description |
| --- | --- | --- |
| index | Int32 | The zero-based index of the node. Negative indexes are allowed and indicate access from the back of the list. For example -1 means the last node, -2 means the second before last and so on. |

## Examples

Shows how to add and remove sections in a document.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Write("Section 1");
builder.InsertBreak(BreakType.SectionBreakNewPage);
builder.Write("Section 2");

Assert.That(doc.GetText().Trim(), Is.EqualTo("Section 1\x000cSection 2"));

// Delete the first section from the document.
doc.Sections.RemoveAt(0);

Assert.That(doc.GetText().Trim(), Is.EqualTo("Section 2"));

// Append a copy of what is now the first section to the end of the document.
int lastSectionIdx = doc.Sections.Count - 1;
Section newSection = doc.Sections[lastSectionIdx].Clone();
doc.Sections.Add(newSection);

Assert.That(doc.GetText().Trim(), Is.EqualTo("Section 2\x000cSection 2"));
```

### See Also

* class [NodeCollection](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
