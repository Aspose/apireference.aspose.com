---
title: JpegImage.ExifData
second_title: Aspose.Imaging for .NET API Reference
description: JpegImage property. Manage EXIF data with this property allowing you to add or retrieve metadata associated with the image. Whether its extracting information about the camera settings or modifying existing metadata this property offers flexibility in managing the EXIF data container
type: docs
weight: 70
url: /net/aspose.imaging.fileformats.jpeg/jpegimage/exifdata/
---
## JpegImage.ExifData property

Manage EXIF data with this property, allowing you to add or retrieve metadata associated with the image. Whether it's extracting information about the camera settings or modifying existing metadata, this property offers flexibility in managing the EXIF data container.

```csharp
public JpegExifData ExifData { get; set; }
```

## Examples

The following example shows how to extract EXIF tags from a JPEG image.

```csharp
[C#]

string dir = "c:\\temp\\";

using (Aspose.Imaging.FileFormats.Jpeg.JpegImage image = (Aspose.Imaging.FileFormats.Jpeg.JpegImage)Image.Load(dir + "original.jpg"))
{
    Aspose.Imaging.Exif.ExifData exifData = image.ExifData;

    System.Console.WriteLine("The general EXIF data");
    System.Console.WriteLine("------------------------------------------");
    if (exifData != null)
    {
        System.Console.WriteLine("The EXIF version: {0}", exifData.ExifVersion);
        System.Console.WriteLine("The camera serial number: {0}", exifData.BodySerialNumber);
        System.Console.WriteLine("The color space: {0}", exifData.ColorSpace);
        System.Console.WriteLine("The brightness: {0}", exifData.BrightnessValue);
        System.Console.WriteLine("The contrast: {0}", exifData.Contrast);
        System.Console.WriteLine("The gamma: {0}", exifData.Gamma);
        System.Console.WriteLine("The sharpness: {0}", exifData.Sharpness);
        System.Console.WriteLine("The aperture: {0}", exifData.ApertureValue);
        System.Console.WriteLine("The exposure mode: {0}", exifData.ExposureMode);
        System.Console.WriteLine("The exposure bias: {0}", exifData.ExposureBiasValue);
        System.Console.WriteLine("The exposure time: {0}", exifData.ExposureTime);
        System.Console.WriteLine("The focal length: {0}", exifData.FocalLength);
        System.Console.WriteLine("The focal plane resolution unit: {0}", exifData.FocalPlaneResolutionUnit);
        System.Console.WriteLine("The lens model: {0}", exifData.LensModel);
        System.Console.WriteLine("The shutter speed: {0}", exifData.ShutterSpeedValue);
    }

    System.Console.WriteLine("The JPEG EXIF data");
    System.Console.WriteLine("------------------------------------------");
    Aspose.Imaging.Exif.JpegExifData jpegExifData = image.ExifData as Aspose.Imaging.Exif.JpegExifData;
    if (jpegExifData != null)
    {
        System.Console.WriteLine("The camera manufacturer: {0}", jpegExifData.Make);
        System.Console.WriteLine("The camera model: {0}", jpegExifData.Model);
        System.Console.WriteLine("The photometric interpretation: {0}", jpegExifData.PhotometricInterpretation);
        System.Console.WriteLine("The artist: {0}", jpegExifData.Artist);
        System.Console.WriteLine("The copyright: {0}", jpegExifData.Copyright);
        System.Console.WriteLine("The image description: {0}", jpegExifData.ImageDescription);
        System.Console.WriteLine("The orientation: {0}", jpegExifData.Orientation);
        System.Console.WriteLine("The software: {0}", jpegExifData.Software);
    }
}

//The output looks like this:
//The general EXIF data
//------------------------------------------
//The EXIF version: System.Byte[]
//The camera serial number: 7100536
//The color space: SRgb
//The brightness:
//The contrast: Normal
//The gamma:
//The sharpness: 0
//The aperture: 4.64(4643856 / 1000000)
//The exposure mode: Manual
//The exposure bias: 0.67(4 / 6)
//The exposure time: 0.01(1 / 160)
//The focal length: 145.00(1450 / 10)
//The focal plane resolution unit: Cm
//The lens model: 70.0 - 200.0 mm f/ 4.0
//The shutter speed: 7.32(7321928 / 1000000)
//The JPEG EXIF data
//------------------------------------------
//The camera manufacturer: NIKON CORPORATION
//The camera model: NIKON D5
//The photometric interpretation: 0
//The artist: 
//The copyright: 
//The image description:
//The orientation: TopLeft
//The software: Adobe Photoshop Camera Raw 9.9(Macintosh)
```

### See Also

* class [JpegExifData](../../../aspose.imaging.exif/jpegexifdata/)
* class [JpegImage](../)
* namespace [Aspose.Imaging.FileFormats.Jpeg](../../jpegimage/)
* assembly [Aspose.Imaging](../../../)


