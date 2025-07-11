---
title: LoadOptions.MswVersion
linktitle: MswVersion
articleTitle: MswVersion
second_title: Aspose.Words for .NET
description: Optimize document loading with LoadOptions MswVersion. Ensure compatibility with specific MS Word versions, defaulting to Word 2019 for seamless integration.
type: docs
weight: 100
url: /net/aspose.words.loading/loadoptions/mswversion/
---
## LoadOptions.MswVersion property

Allows to specify that the document loading process should match a specific MS Word version. Default value is Word2019

```csharp
public MsWordVersion MswVersion { get; set; }
```

## Remarks

Different Word versions may handle certain aspects of document content and formatting slightly differently during the loading process, which may result in minor differences in Document Object Model.

## Examples

Shows how to emulate the loading procedure of a specific Microsoft Word version during document loading.

```csharp
// By default, Aspose.Words load documents according to Microsoft Word 2019 specification.
LoadOptions loadOptions = new LoadOptions();

Assert.That(loadOptions.MswVersion, Is.EqualTo(MsWordVersion.Word2019));

// This document is missing the default paragraph formatting style.
// This default style will be regenerated when we load the document either with Microsoft Word or Aspose.Words.
loadOptions.MswVersion = MsWordVersion.Word2007;
Document doc = new Document(MyDir + "Document.docx", loadOptions);

// The style's line spacing will have this value when loaded by Microsoft Word 2007 specification.
Assert.That(doc.Styles.DefaultParagraphFormat.LineSpacing, Is.EqualTo(12.95d).Within(0.01d));
```

### See Also

* enum [MsWordVersion](../../../aspose.words.settings/mswordversion/)
* class [LoadOptions](../)
* namespace [Aspose.Words.Loading](../../../aspose.words.loading/)
* assembly [Aspose.Words](../../../)
