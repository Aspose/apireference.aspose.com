---
title: DwfImage.IsCached
second_title: Aspose.CAD for .NET API Reference
description: DwfImage property. Gets a value indicating whether objects data is cached currently and no data reading is required. Depending on the loading options only the necessary part of the data can be loaded into the cache from the image data. In this case we can use this property to determine that only part of the image data is loaded into the cache
type: docs
weight: 30
url: /net/aspose.cad.fileformats.dwf/dwfimage/iscached/
---
## DwfImage.IsCached property

Gets a value indicating whether object's data is cached currently and no data reading is required. Depending on the loading options only the necessary part of the data can be loaded into the cache from the image data. In this case, we can use this property to determine that only part of the image data is loaded into the cache.

```csharp
public override bool IsCached { get; }
```

### Property Value

`true` if object's data is cached; otherwise, `false`.

## Examples

Checks whether the object's data is currently cached, and if not, caches it.

```csharp
string fileName = "exampleFile";
string file = string.Format("{0}.dwf", fileName);
string outFile = string.Format("{0}.png", fileName);

using (FileStream inStream = new FileStream(file, FileMode.Open))
using (var image = (DwfImage) Image.Load(inStream))
using (FileStream stream = new FileStream(outFile, FileMode.Create))
{

    if(!image.IsCached)
    {
        image.CacheData();
    }

    ImageOptionsBase options = new PngOptions();
    options.VectorRasterizationOptions = new CadRasterizationOptions
                                             {
                                                 DrawType = CadDrawTypeMode.UseObjectColor,
                                             };

    image.Save(stream, options);
}
```

### See Also

* class [DwfImage](../)
* namespace [Aspose.CAD.FileFormats.Dwf](../../../aspose.cad.fileformats.dwf/)
* assembly [Aspose.CAD](../../../)


