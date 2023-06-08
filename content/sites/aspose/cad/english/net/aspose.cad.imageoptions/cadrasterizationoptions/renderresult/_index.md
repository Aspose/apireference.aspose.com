---
title: CadRasterizationOptions.RenderResult
second_title: Aspose.CAD for .NET API Reference
description: CadRasterizationOptions field. Rendering result handler
type: docs
weight: 190
url: /net/aspose.cad.imageoptions/cadrasterizationoptions/renderresult/
---
## CadRasterizationOptions.RenderResult field

Rendering result handler.

```csharp
public CadRenderHandler RenderResult;
```

## Examples

Sets up error handler to catch all export errors and prints them to STDOUT

```csharp
using (var image = Aspose.CAD.Image.Load("fileName.dwg"))
{
    image.Save("targetFile.bmp", new BmpOptions()
    {
        VectorRasterizationOptions = new CadRasterizationOptions()
        {
            RenderResult = result =>
            {
                if (!result.IsRenderComplete)
                {
                    foreach (var resultFailure in result.Failures)
                    {
                        Console.WriteLine($"Error: {resultFailure.Message} (error code {resultFailure.RenderCode})");
                    }
                }
            }
        }
    });
}
```

### See Also

* delegate [CadRenderHandler](../../cadrasterizationoptions.cadrenderhandler/)
* class [CadRasterizationOptions](../)
* namespace [Aspose.CAD.ImageOptions](../../cadrasterizationoptions/)
* assembly [Aspose.CAD](../../../)


