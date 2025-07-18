---
title: StructuredDocumentTagCollection.RemoveAt
linktitle: RemoveAt
articleTitle: RemoveAt
second_title: Aspose.Words for .NET
description: Effortlessly manage your structured document tags with the RemoveAt method. Quickly remove tags by index for streamlined document editing.
type: docs
weight: 80
url: /net/aspose.words.markup/structureddocumenttagcollection/removeat/
---
## StructuredDocumentTagCollection.RemoveAt method

Removes a structured document tag at the specified index.

```csharp
public void RemoveAt(int index)
```

| Parameter | Type | Description |
| --- | --- | --- |
| index | Int32 | An index into the collection. |

## Examples

Shows how to remove structured document tag.

```csharp
Document doc = new Document(MyDir + "Structured document tags.docx");

StructuredDocumentTagCollection structuredDocumentTags = doc.Range.StructuredDocumentTags;
IStructuredDocumentTag sdt;
for (int i = 0; i < structuredDocumentTags.Count; i++)
{
    sdt = structuredDocumentTags[i];
    Console.WriteLine(sdt.Title);
}

sdt = structuredDocumentTags.GetById(1691867797);
Assert.That(sdt.Id, Is.EqualTo(1691867797));

Assert.That(structuredDocumentTags.Count, Is.EqualTo(5));
// Remove the structured document tag by Id.
structuredDocumentTags.Remove(1691867797);
// Remove the structured document tag at position 0.
structuredDocumentTags.RemoveAt(0);
Assert.That(structuredDocumentTags.Count, Is.EqualTo(3));
```

### See Also

* class [StructuredDocumentTagCollection](../)
* namespace [Aspose.Words.Markup](../../../aspose.words.markup/)
* assembly [Aspose.Words](../../../)
