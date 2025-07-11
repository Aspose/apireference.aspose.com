---
title: BuiltInDocumentProperties.HyperlinksChanged
linktitle: HyperlinksChanged
articleTitle: HyperlinksChanged
second_title: Aspose.Words for .NET
description: Discover the BuiltInDocumentProperties HyperlinksChanged property, which tracks changes to hyperlinks in your documents for enhanced editing control.
type: docs
weight: 130
url: /net/aspose.words.properties/builtindocumentproperties/hyperlinkschanged/
---
## BuiltInDocumentProperties.HyperlinksChanged property

Indicates whether hyperlinks in a document were changed.

```csharp
public bool HyperlinksChanged { get; }
```

## Remarks

Aspose.Words does not update this property.

## Examples

Shows how to get extended properties.

```csharp
Document doc = new Document(MyDir + "Extended properties.docx");
Assert.That(doc.BuiltInDocumentProperties.ScaleCrop, Is.True);
Assert.That(doc.BuiltInDocumentProperties.SharedDocument, Is.True);
Assert.That(doc.BuiltInDocumentProperties.HyperlinksChanged, Is.True);
```

### See Also

* class [BuiltInDocumentProperties](../)
* namespace [Aspose.Words.Properties](../../../aspose.words.properties/)
* assembly [Aspose.Words](../../../)
