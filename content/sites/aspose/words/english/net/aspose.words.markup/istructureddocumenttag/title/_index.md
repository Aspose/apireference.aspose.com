---
title: IStructuredDocumentTag.Title
linktitle: Title
articleTitle: Title
second_title: Aspose.Words for .NET
description: Discover the IStructuredDocumentTag Title property—define a user-friendly name for your SDT and enhance document clarity. Learn more now!
type: docs
weight: 140
url: /net/aspose.words.markup/istructureddocumenttag/title/
---
## IStructuredDocumentTag.Title property

Specifies the friendly name associated with this **SDT**. Can not be null.

```csharp
public string Title { get; set; }
```

## Examples

Shows how to get structured document tag.

```csharp
Document doc = new Document(MyDir + "Structured document tags by id.docx");

// Get the structured document tag by Id.
IStructuredDocumentTag sdt = doc.Range.StructuredDocumentTags.GetById(1160505028);
Console.WriteLine(sdt.IsMultiSection);
Console.WriteLine(sdt.Title);

// Get the structured document tag or ranged tag by Title.
sdt = doc.Range.StructuredDocumentTags.GetByTitle("Alias4");
Console.WriteLine(sdt.Id);
```

### See Also

* interface [IStructuredDocumentTag](../)
* namespace [Aspose.Words.Markup](../../../aspose.words.markup/)
* assembly [Aspose.Words](../../../)
