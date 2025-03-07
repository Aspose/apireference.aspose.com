---
title: CdrImage.Pages
second_title: Aspose.Imaging for .NET API Reference
description: CdrImage property. Retrieve the pages of the image seamlessly with this intuitive property. Ideal for developers seeking to access and manipulate individual pages within multipage images ensuring efficient navigation and processing
type: docs
weight: 80
url: /net/aspose.imaging.fileformats.cdr/cdrimage/pages/
---
## CdrImage.Pages property

Retrieve the pages of the image seamlessly with this intuitive property. Ideal for developers seeking to access and manipulate individual pages within multi-page images, ensuring efficient navigation and processing.

```csharp
public override Image[] Pages { get; }
```

### Property Value

The pages.

## Examples

The following example shows how to cache all pages of a CDR image.

```csharp
[C#]

string dir = "c:\\temp\\";

// Load an image from a CDR file.
using (Aspose.Imaging.FileFormats.Cdr.CdrImage image = (Aspose.Imaging.FileFormats.Cdr.CdrImage)Aspose.Imaging.Image.Load(dir + "sample.cdr"))
{
    // This call caches only the default page.
    image.CacheData();

    // Cache all pages so that no additional data loading will be performed from the underlying data stream.
    foreach (Aspose.Imaging.FileFormats.Cdr.CdrImagePage page in image.Pages)
    {
        page.CacheData();
    }
}
```

The following example shows how to export a single page of CDR document to PDF.

```csharp
[C#]

int pageNumber = 0;
string dir = "c:\\aspose.imaging\\issues\\net\\3635\\testdata\\3570";
string inputCdrFileName = System.IO.Path.Combine(dir, "tiger.cdr");
string outputPdfFileName = System.IO.Path.Combine(dir, "tiger.cdr.page" + pageNumber + ".pdf");

using (Aspose.Imaging.FileFormats.Cdr.CdrImage image = (Aspose.Imaging.FileFormats.Cdr.CdrImage) Aspose.Imaging.Image.Load(inputCdrFileName))
{
    Aspose.Imaging.FileFormats.Cdr.CdrImagePage imagePage = (Aspose.Imaging.FileFormats.Cdr.CdrImagePage) image.Pages[pageNumber];

    Aspose.Imaging.ImageOptions.PdfOptions pdfOptions = new Aspose.Imaging.ImageOptions.PdfOptions();
    Aspose.Imaging.ImageOptions.CdrRasterizationOptions rasterizationOptions = new Aspose.Imaging.ImageOptions.CdrRasterizationOptions()
    {
        TextRenderingHint = Aspose.Imaging.TextRenderingHint.SingleBitPerPixel,
        SmoothingMode = Aspose.Imaging.SmoothingMode.None
    };

    pdfOptions.VectorRasterizationOptions = rasterizationOptions;
    pdfOptions.VectorRasterizationOptions.PageWidth = imagePage.Width;
    pdfOptions.VectorRasterizationOptions.PageHeight = imagePage.Height;

    imagePage.Save(outputPdfFileName, pdfOptions);
}
```

### See Also

* class [Image](../../../aspose.imaging/image/)
* class [CdrImage](../)
* namespace [Aspose.Imaging.FileFormats.Cdr](../../cdrimage/)
* assembly [Aspose.Imaging](../../../)


