---
title: DwfImage.CacheData
second_title: Aspose.CAD for .NET API Reference
description: DwfImage method. Caches the data and ensures no additional data loading will be performed from the underlying DataStreamContainer. Depending on the loading options only the necessary part of the data can be loaded into the cache from the image data. In this case we can use this method to load all image data into the cache
type: docs
weight: 80
url: /net/aspose.cad.fileformats.dwf/dwfimage/cachedata/
---
## DwfImage.CacheData method

Caches the data and ensures no additional data loading will be performed from the underlying [`DataStreamContainer`](../../../aspose.cad/datastreamsupporter/datastreamcontainer/). Depending on the loading options only the necessary part of the data can be loaded into the cache from the image data. In this case, we can use this method to load all image data into the cache.

```csharp
public override void CacheData()
```

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


