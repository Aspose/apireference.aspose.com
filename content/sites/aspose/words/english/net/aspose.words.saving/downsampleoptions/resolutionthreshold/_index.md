---
title: DownsampleOptions.ResolutionThreshold
linktitle: ResolutionThreshold
articleTitle: ResolutionThreshold
second_title: Aspose.Words for .NET
description: Optimize your images with the DownsampleOptions ResolutionThreshold property. Control downsampling based on resolution for better performance and quality.
type: docs
weight: 40
url: /net/aspose.words.saving/downsampleoptions/resolutionthreshold/
---
## DownsampleOptions.ResolutionThreshold property

Specifies the threshold resolution in pixels per inch. If resolution of an image in the document is less than threshold value, the downsampling algorithm will not be applied. A value of 0 means the threshold check is not used and all images that can be reduced in size are downsampled.

```csharp
public int ResolutionThreshold { get; set; }
```

## Remarks

The default value is 0.

## Examples

Shows how to change the resolution of images in the PDF document.

```csharp
Document doc = new Document(MyDir + "Images.docx");

// Create a "PdfSaveOptions" object that we can pass to the document's "Save" method
// to modify how that method converts the document to .PDF.
PdfSaveOptions options = new PdfSaveOptions();

// By default, Aspose.Words downsample all images in a document that we save to PDF to 220 ppi.
Assert.That(options.DownsampleOptions.DownsampleImages, Is.True);
Assert.That(options.DownsampleOptions.Resolution, Is.EqualTo(220));
Assert.That(options.DownsampleOptions.ResolutionThreshold, Is.EqualTo(0));

doc.Save(ArtifactsDir + "PdfSaveOptions.DownsampleOptions.Default.pdf", options);

// Set the "Resolution" property to "36" to downsample all images to 36 ppi.
options.DownsampleOptions.Resolution = 36;

// Set the "ResolutionThreshold" property to only apply the downsampling to
// images with a resolution that is above 128 ppi.
options.DownsampleOptions.ResolutionThreshold = 128;

// Only the first two images from the document will be downsampled at this stage.
doc.Save(ArtifactsDir + "PdfSaveOptions.DownsampleOptions.LowerResolution.pdf", options);
```

### See Also

* class [DownsampleOptions](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
