---
title: AdvancedCompareOptions.IgnoreStoreItemId
linktitle: IgnoreStoreItemId
articleTitle: IgnoreStoreItemId
second_title: Aspose.Words for .NET
description: Discover how the AdvancedCompareOptions IgnoreStoreItemId property enhances document comparison by ignoring StructuredDocumentTag ID differences for improved accuracy.
type: docs
weight: 30
url: /net/aspose.words.comparing/advancedcompareoptions/ignorestoreitemid/
---
## AdvancedCompareOptions.IgnoreStoreItemId property

Specifies whether to ignore difference in StructuredDocumentTag store item Id.

```csharp
public bool IgnoreStoreItemId { get; set; }
```

## Remarks

Default value is `false`.

## Examples

Shows how to compare SDT with same content but different store item id.

```csharp
Document docA = new Document(MyDir + "Document with SDT 1.docx");
Document docB = new Document(MyDir + "Document with SDT 2.docx");

// Configure options to compare SDT with same content but different store item id.
CompareOptions compareOptions = new CompareOptions();
compareOptions.AdvancedOptions.IgnoreStoreItemId = false;

docA.Compare(docB, "user", DateTime.Now, compareOptions);
Assert.That(docA.Revisions.Count, Is.EqualTo(8));

compareOptions.AdvancedOptions.IgnoreStoreItemId = true;

docA.Revisions.RejectAll();
docA.Compare(docB, "user", DateTime.Now, compareOptions);
Assert.That(docA.Revisions.Count, Is.EqualTo(0));
```

### See Also

* class [AdvancedCompareOptions](../)
* namespace [Aspose.Words.Comparing](../../../aspose.words.comparing/)
* assembly [Aspose.Words](../../../)
