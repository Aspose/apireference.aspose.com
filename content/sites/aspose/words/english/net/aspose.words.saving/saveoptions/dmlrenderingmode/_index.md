---
title: SaveOptions.DmlRenderingMode
linktitle: DmlRenderingMode
articleTitle: DmlRenderingMode
second_title: Aspose.Words for .NET
description: Discover how the SaveOptions DmlRenderingMode property enhances your DrawingML shape rendering. Optimize your document visuals effortlessly!
type: docs
weight: 70
url: /net/aspose.words.saving/saveoptions/dmlrenderingmode/
---
## SaveOptions.DmlRenderingMode property

Gets or sets a value determining how DrawingML shapes are rendered.

```csharp
public DmlRenderingMode DmlRenderingMode { get; set; }
```

## Remarks

The default value is Fallback.

This property is used when the document is exported to fixed page formats.

## Examples

Shows how to render fallback shapes when saving to PDF.

```csharp
Document doc = new Document(MyDir + "DrawingML shape fallbacks.docx");

// Create a "PdfSaveOptions" object that we can pass to the document's "Save" method
// to modify how that method converts the document to .PDF.
PdfSaveOptions options = new PdfSaveOptions();

// Set the "DmlRenderingMode" property to "DmlRenderingMode.Fallback"
// to substitute DML shapes with their fallback shapes.
// Set the "DmlRenderingMode" property to "DmlRenderingMode.DrawingML"
// to render the DML shapes themselves.
options.DmlRenderingMode = dmlRenderingMode;

doc.Save(ArtifactsDir + "PdfSaveOptions.DrawingMLFallback.pdf", options);
```

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

* enum [DmlRenderingMode](../../dmlrenderingmode/)
* class [SaveOptions](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
