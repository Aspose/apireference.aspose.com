---
title: PdfSaveOptions.DmlEffectsRenderingMode
linktitle: DmlEffectsRenderingMode
articleTitle: DmlEffectsRenderingMode
second_title: Aspose.Words for .NET
description: Discover the PdfSaveOptions DmlEffectsRenderingMode property to control the rendering of DrawingML effects for enhanced PDF output quality.
type: docs
weight: 100
url: /net/aspose.words.saving/pdfsaveoptions/dmleffectsrenderingmode/
---
## PdfSaveOptions.DmlEffectsRenderingMode property

Gets or sets a value determining how DrawingML effects are rendered.

```csharp
public override DmlEffectsRenderingMode DmlEffectsRenderingMode { get; set; }
```

## Remarks

The default value is Simplified.

This property is used when the document is exported to fixed page formats.

If [`Compliance`](../compliance/) is set to PdfA1a or PdfA1b, property always returns None.

## Examples

Shows how to configure the rendering quality of DrawingML effects in a document as we save it to PDF.

```csharp
Document doc = new Document(MyDir + "DrawingML shape effects.docx");

// Create a "PdfSaveOptions" object that we can pass to the document's "Save" method
// to modify how that method converts the document to .PDF.
PdfSaveOptions options = new PdfSaveOptions();

// Set the "DmlEffectsRenderingMode" property to "DmlEffectsRenderingMode.None" to discard all DrawingML effects.
// Set the "DmlEffectsRenderingMode" property to "DmlEffectsRenderingMode.Simplified"
// to render a simplified version of DrawingML effects.
// Set the "DmlEffectsRenderingMode" property to "DmlEffectsRenderingMode.Fine" to
// render DrawingML effects with more accuracy and also with more processing cost.
options.DmlEffectsRenderingMode = effectsRenderingMode;

Assert.That(options.DmlRenderingMode, Is.EqualTo(DmlRenderingMode.DrawingML));

doc.Save(ArtifactsDir + "PdfSaveOptions.DrawingMLEffects.pdf", options);
```

### See Also

* enum [DmlEffectsRenderingMode](../../dmleffectsrenderingmode/)
* class [PdfSaveOptions](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
