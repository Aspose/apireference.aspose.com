---
title: PdfOptions.Is3DContent
second_title: Aspose.CAD for .NET API Reference
description: PdfOptions property. Gets or sets whether content of the document should be represented as 3D model. Allows to export U3D content directly to PDF in a form of interactive 3D annotation object. The resulting PDF file will contain single 3D model object occupying the entire page with margins
type: docs
weight: 30
url: /net/aspose.cad.imageoptions/pdfoptions/is3dcontent/
---
## PdfOptions.Is3DContent property

Gets or sets whether content of the document should be represented as 3D model. Allows to export U3D content directly to PDF in a form of interactive 3D annotation object. The resulting PDF file will contain single 3D model object occupying the entire page with margins.

```csharp
public bool Is3DContent { get; set; }
```

## Examples

Sets up the export of U3dImage into PDF containing 3D model with desired size.

```csharp
using (U3dImage u3dImage = (U3dImage)Image.Load(fileName))
{
    PdfOptions pdfOptions = new PdfOptions() {Is3DContent = true};
    var rasterizationOptions = new CadRasterizationOptions();
    rasterizationOptions.PageWidth = 1600; 
    rasterizationOptions.PageHeight = 1600; 
    pdfOptions.VectorRasterizationOptions = rasterizationOptions;
    u3dImage.Save(outFile, pdfOptions);
}
```

### See Also

* class [PdfOptions](../)
* namespace [Aspose.CAD.ImageOptions](../../../aspose.cad.imageoptions/)
* assembly [Aspose.CAD](../../../)


