---
title: PdfSaveOptions.AdditionalTextPositioning
linktitle: AdditionalTextPositioning
articleTitle: AdditionalTextPositioning
second_title: Aspose.Words for .NET
description: Discover the PdfSaveOptions AdditionalTextPositioning property to control text positioning in PDFs. Enhance your document's layout effortlessly!
type: docs
weight: 20
url: /net/aspose.words.saving/pdfsaveoptions/additionaltextpositioning/
---
## PdfSaveOptions.AdditionalTextPositioning property

A flag specifying whether to write additional text positioning operators or not.

```csharp
public bool AdditionalTextPositioning { get; set; }
```

## Remarks

If `true`, additional text positioning operators are written to the output PDF. This may help to overcome issues with inaccurate text positioning with some printers. The downside is the increased PDF document size.

The default value is `false`.

## Examples

Show how to write additional text positioning operators.

```csharp
Document doc = new Document(MyDir + "Text positioning operators.docx");

// Create a "PdfSaveOptions" object that we can pass to the document's "Save" method
// to modify how that method converts the document to .PDF.
PdfSaveOptions saveOptions = new PdfSaveOptions
{
    TextCompression = PdfTextCompression.None,

    // Set the "AdditionalTextPositioning" property to "true" to attempt to fix incorrect
    // element positioning in the output PDF, should there be any, at the cost of increased file size.
    // Set the "AdditionalTextPositioning" property to "false" to render the document as usual.
    AdditionalTextPositioning = applyAdditionalTextPositioning
};

doc.Save(ArtifactsDir + "PdfSaveOptions.AdditionalTextPositioning.pdf", saveOptions);
```

### See Also

* class [PdfSaveOptions](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
