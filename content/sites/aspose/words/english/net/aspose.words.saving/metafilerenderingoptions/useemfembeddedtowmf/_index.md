---
title: MetafileRenderingOptions.UseEmfEmbeddedToWmf
linktitle: UseEmfEmbeddedToWmf
articleTitle: UseEmfEmbeddedToWmf
second_title: Aspose.Words for .NET
description: Discover how the UseEmfEmbeddedToWmf property optimizes WMF metafile rendering, enhancing performance and quality for your graphics applications.
type: docs
weight: 70
url: /net/aspose.words.saving/metafilerenderingoptions/useemfembeddedtowmf/
---
## MetafileRenderingOptions.UseEmfEmbeddedToWmf property

Gets or sets a value determining how WMF metafiles with embedded EMF metafiles should be rendered.

```csharp
public bool UseEmfEmbeddedToWmf { get; set; }
```

## Remarks

WMF metafiles could contain embedded EMF data. MS Word in most cases uses embedded EMF data. GDI+ always uses WMF data.

When this value is set to `true`, Aspose.Words uses embedded EMF data when rendering.

When this value is set to `false`, Aspose.Words uses WMF data when rendering.

This option is used only when metafile is rendered as vector graphics. When metafile is rendered to bitmap, WMF data is always used.

The default value is `true`.

## Examples

Shows how to configure Enhanced Windows Metafile-related rendering options when saving to PDF.

```csharp
Document doc = new Document(MyDir + "EMF.docx");

// Create a "PdfSaveOptions" object that we can pass to the document's "Save" method
// to modify how that method converts the document to .PDF.
PdfSaveOptions saveOptions = new PdfSaveOptions();

// Set the "EmfPlusDualRenderingMode" property to "EmfPlusDualRenderingMode.Emf"
// to only render the EMF part of an EMF+ dual metafile.
// Set the "EmfPlusDualRenderingMode" property to "EmfPlusDualRenderingMode.EmfPlus" to
// to render the EMF+ part of an EMF+ dual metafile.
// Set the "EmfPlusDualRenderingMode" property to "EmfPlusDualRenderingMode.EmfPlusWithFallback"
// to render the EMF+ part of an EMF+ dual metafile if all of the EMF+ records are supported.
// Otherwise, Aspose.Words will render the EMF part.
saveOptions.MetafileRenderingOptions.EmfPlusDualRenderingMode = renderingMode;

// Set the "UseEmfEmbeddedToWmf" property to "true" to render embedded EMF data
// for metafiles that we can render as vector graphics.
saveOptions.MetafileRenderingOptions.UseEmfEmbeddedToWmf = true;

doc.Save(ArtifactsDir + "PdfSaveOptions.RenderMetafile.pdf", saveOptions);
```

### See Also

* class [MetafileRenderingOptions](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
