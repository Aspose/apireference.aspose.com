---
title: DicomOptions.Compression
second_title: Aspose.Imaging for .NET API Reference
description: DicomOptions property. Gets or sets the compression
type: docs
weight: 30
url: /net/aspose.imaging.imageoptions/dicomoptions/compression/
---
## DicomOptions.Compression property

Gets or sets the compression.

```csharp
public Compression Compression { get; set; }
```

### Property Value

The compression.

## Examples

Change Color Type in DICOM compression.

```csharp
[C#]

using (var inputImage = Image.Load("original.jpg"))
{
    var options = new DicomOptions { ColorType = ColorType.Grayscale8Bit };

    inputImage.Save("original_8Bit.dcm", options);
}
```

Use RLE compression in DICOM image.

```csharp
[C#]

using (var inputImage = Image.Load("original.jpg"))
{
    var options = new DicomOptions
    {
        ColorType = ColorType.Rgb24Bit,
        Compression = new Compression { Type = CompressionType.Rle }
    };

    inputImage.Save("original_RLE.dcm", options);
}
```

Use JPEG 2000 compression in DICOM image.

```csharp
[C#]

using (var inputImage = Image.Load("original.jpg"))
{
    var options = new DicomOptions
    {
        ColorType = ColorType.Rgb24Bit,
        Compression = new Compression
        {
            Type = CompressionType.Jpeg2000,
            Jpeg2000 = new Jpeg2000Options
            {
                Codec = Jpeg2000Codec.Jp2,
                Irreversible = false
            }
        }
    };

    inputImage.Save("original_JPEG2000.dcm", options);
}
```

Use JPEG compression in DICOM image.

```csharp
[C#]

using (var inputImage = Image.Load("original.jpg"))
{
    var options = new DicomOptions
    {
        ColorType = ColorType.Rgb24Bit,
        Compression = new Compression
        {
            Type = CompressionType.Jpeg,
            Jpeg = new JpegOptions
            {
                CompressionType = JpegCompressionMode.Baseline,
                SampleRoundingMode = SampleRoundingMode.Truncate,
                Quality = 50
            }
        }
    };

    inputImage.Save("original_JPEG.dcm", options);
}
```

### See Also

* class [Compression](../../../aspose.imaging.fileformats.dicom/compression/)
* class [DicomOptions](../)
* namespace [Aspose.Imaging.ImageOptions](../../dicomoptions/)
* assembly [Aspose.Imaging](../../../)


