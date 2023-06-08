---
title: Image.Save
second_title: Aspose.CAD for .NET API Reference
description: Image method. Saves the image data to the underlying stream
type: docs
weight: 140
url: /net/aspose.cad/image/save/
---
## Save() {#save}

Saves the image data to the underlying stream.

```csharp
public void Save()
```

## Examples

Saves all changes made to drawing. Note: Only DXF is currently supported

```csharp
using (var image = Aspose.CAD.Image.Load("fileName.dwg"))
{
    image.Save();
}
```

### See Also

* class [Image](../)
* namespace [Aspose.CAD](../../image/)
* assembly [Aspose.CAD](../../../)

---

## Save(string, ImageOptionsBase) {#save_4}

Saves the object's data to the specified file location in the specified file format according to save options.

```csharp
public virtual void Save(string filePath, ImageOptionsBase options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| filePath | String | The file path. |
| options | ImageOptionsBase | The options. |

## Examples

Exports drawing to BMP with specified size

```csharp
using (var image = Aspose.CAD.Image.Load("fileName.dwg"))
{
    image.Save("targetFile.bmp", new BmpOptions()
    {
        VectorRasterizationOptions = new CadRasterizationOptions()
        {
            PageWidth = 640,
            PageHeight = 480
        }
    });
}
```

### See Also

* class [ImageOptionsBase](../../imageoptionsbase/)
* class [Image](../)
* namespace [Aspose.CAD](../../image/)
* assembly [Aspose.CAD](../../../)

---

## Save(Stream, ImageOptionsBase) {#save_2}

Saves the image's data to the specified stream in the specified file format according to save options.

```csharp
public void Save(Stream stream, ImageOptionsBase optionsBase)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | The stream to save the image's data to. |
| optionsBase | ImageOptionsBase | The save options. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | optionsBase |
| ArgumentException | Cannot save to the specified format as it is not supported at the moment.;optionsBase |
| [ImageSaveException](../../../aspose.cad.cadexceptions/imagesaveexception/) | Image export failed. |

## Examples

Exports drawing to JPEG format and rotate it by 90 degrees then writes to memory stream

```csharp
using (var ms = new MemoryStream())
{
    using (var image = Aspose.CAD.Image.Load("fileName.dwg"))
    {
        image.Save(ms, new JpegOptions()
        {
            Rotation = RotateFlipType.Rotate90FlipNone
        });
    }
}
```

### See Also

* class [ImageOptionsBase](../../imageoptionsbase/)
* class [Image](../)
* namespace [Aspose.CAD](../../image/)
* assembly [Aspose.CAD](../../../)


