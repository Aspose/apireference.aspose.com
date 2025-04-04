---
title: DocSaveOptions.AlwaysCompressMetafiles
linktitle: AlwaysCompressMetafiles
articleTitle: AlwaysCompressMetafiles
second_title: Aspose.Words for .NET
description: Optimize your document management with the AlwaysCompressMetafiles property. Improve performance by controlling metafile compression for efficiency.
type: docs
weight: 20
url: /net/aspose.words.saving/docsaveoptions/alwayscompressmetafiles/
---
## DocSaveOptions.AlwaysCompressMetafiles property

When `false`, small metafiles are not compressed for performance reason. Default value is `true`, all metafiles are compressed regardless of its size.

```csharp
public bool AlwaysCompressMetafiles { get; set; }
```

## Examples

Shows how to change metafiles compression in a document while saving.

```csharp
// Open a document that contains a Microsoft Equation 3.0 formula.
Document doc = new Document(MyDir + "Microsoft equation object.docx");

// When we save a document, smaller metafiles are not compressed for performance reasons.
// We can set a flag in a SaveOptions object to compress every metafile when saving.
// Some editors such as LibreOffice cannot read uncompressed metafiles.
DocSaveOptions saveOptions = new DocSaveOptions();
saveOptions.AlwaysCompressMetafiles = compressAllMetafiles;

doc.Save(ArtifactsDir + "DocSaveOptions.AlwaysCompressMetafiles.docx", saveOptions);
```

### See Also

* class [DocSaveOptions](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
