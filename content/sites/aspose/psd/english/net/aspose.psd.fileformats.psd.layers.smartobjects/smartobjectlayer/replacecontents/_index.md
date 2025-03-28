---
title: SmartObjectLayer.ReplaceContents
second_title: Aspose.PSD for .NET API Reference
description: SmartObjectLayer method. Replaces the smart object contents embedded in the smart object layer
type: docs
weight: 160
url: /net/aspose.psd.fileformats.psd.layers.smartobjects/smartobjectlayer/replacecontents/
---
{{< psd/tize >}}
## ReplaceContents(Image) {#replacecontents}

Replaces the smart object contents embedded in the smart object layer.

```csharp
public void ReplaceContents(Image image)
```

| Parameter | Type | Description |
| --- | --- | --- |
| image | Image | The image. |

## Examples

The following code demonstrates the support of Embedded Smart objects.

```csharp
[C#]

void AssertAreEqual(object actual, object expected)
{
    if (!object.Equals(actual, expected))
    {
        throw new FormatException(string.Format("Actual value {0} are not equal to expected {1}.", actual, expected));
    }
}

// This example demonstrates how to change the smart object layer in the PSD file and export / update smart object original embedded contents.
const int left = 0;
const int top = 0;
const int right = 0xb;
const int bottom = 0x10;
FileFormat[] formats = new[]
{
    FileFormat.Png, FileFormat.Psd, FileFormat.Bmp, FileFormat.Jpeg, FileFormat.Gif, FileFormat.Tiff, FileFormat.Jpeg2000
};
foreach (FileFormat format in formats)
{
    string formatString = format.ToString().ToLowerInvariant();
    string formatExt = format == FileFormat.Jpeg2000 ? "jpf" : formatString;
    string fileName = "r-embedded-" + formatString;
    string sourceFilePath = fileName + ".psd";
    string pngOutputPath = fileName + "_output.png";
    string psdOutputPath = fileName + "_output.psd";
    string png2OutputPath = fileName + "_updated.png";
    string psd2OutputPath = fileName + "_updated.psd";
    string exportPath = fileName + "_export." + formatExt;
    using (PsdImage image = (PsdImage)Image.Load(sourceFilePath))
    {
        var smartObjectLayer = (SmartObjectLayer)image.Layers[0];

        AssertAreEqual(left, smartObjectLayer.ContentsBounds.Left);
        AssertAreEqual(top, smartObjectLayer.ContentsBounds.Top);
        AssertAreEqual(right, smartObjectLayer.ContentsBounds.Right);
        AssertAreEqual(bottom, smartObjectLayer.ContentsBounds.Bottom);

        // Let's export the embedded smart object image from the PSD smart object layer
        smartObjectLayer.ExportContents(exportPath);

        // Let's check if the original image is saved correctly
        image.Save(psdOutputPath, new PsdOptions(image));
        image.Save(pngOutputPath, new PngOptions() { ColorType = PngColorType.TruecolorWithAlpha });

        using (var innerImage = (RasterImage)smartObjectLayer.LoadContents(null))
        {
            AssertAreEqual(format, innerImage.FileFormat);

            // Let's invert original smart object image
            var pixels = innerImage.LoadArgb32Pixels(innerImage.Bounds);
            for (int i = 0; i < pixels.Length; i++)
            {
                var pixel = pixels[i];
                var alpha = (int)(pixel & 0xff000000);
                pixels[i] = (~(pixel & 0x00ffffff)) | alpha;
            }

            innerImage.SaveArgb32Pixels(innerImage.Bounds, pixels);

            // Let's replace the embedded smart object image in the PSD layer
            smartObjectLayer.ReplaceContents(innerImage);
        }

        // Let's check if the updated image is saved correctly
        image.Save(psd2OutputPath, new PsdOptions(image));
        image.Save(png2OutputPath, new PngOptions() { ColorType = PngColorType.TruecolorWithAlpha });
    }
}
```

### See Also

* class [Image](../../../aspose.psd/image/)
* class [SmartObjectLayer](../)
* namespace [Aspose.PSD.FileFormats.Psd.Layers.SmartObjects](../../../aspose.psd.fileformats.psd.layers.smartobjects/)
* assembly [Aspose.PSD](../../../)

---

## ReplaceContents(Image, ResolutionSetting) {#replacecontents_1}

Replaces the smart object contents embedded in the smart object layer.

```csharp
public void ReplaceContents(Image image, ResolutionSetting resolution)
```

| Parameter | Type | Description |
| --- | --- | --- |
| image | Image | The image. |
| resolution | ResolutionSetting | The resolution settings. If null the image resolution will be used. |

### Exceptions

| exception | condition |
| --- | --- |
| [PsdImageException](../../../aspose.psd.coreexceptions.imageformats/psdimageexception/) | Can only replace embedded smart object. |

## Examples

This example demonstrates that the ReplaceContents method works correctly when the new content file has a different resolution.

```csharp
[C#]

// This example demonstrates that the ReplaceContents method works correctly when the new content file has a different resolution.
string fileName = "CommonPsb.psd";
string filePath = baseFolder + fileName; // original PSD image
string newContentPath = baseFolder + "image.jpg"; // the new content file for the smart object
string outputFilePath = outputFolder + "ChangedPsd";
string pngOutputPath = outputFilePath + ".png"; // the output PNG file
string psdOutputPath = outputFilePath + ".psd"; // the output PSD file
using (PsdImage psd = (PsdImage)Image.Load(filePath))
{
    for (int i = 0; i < psd.Layers.Length; i++)
    {
        var layer = psd.Layers[i];
        SmartObjectLayer smartObjectLayer = layer as SmartObjectLayer;
        if (smartObjectLayer != null)
        {
            smartObjectLayer.ReplaceContents(newContentPath);

            psd.Save(psdOutputPath);
            psd.Save(pngOutputPath, new PngOptions() { ColorType = Aspose.PSD.FileFormats.Png.PngColorType.TruecolorWithAlpha });
        }
    }
}
```

### See Also

* class [Image](../../../aspose.psd/image/)
* class [ResolutionSetting](../../../aspose.psd/resolutionsetting/)
* class [SmartObjectLayer](../)
* namespace [Aspose.PSD.FileFormats.Psd.Layers.SmartObjects](../../../aspose.psd.fileformats.psd.layers.smartobjects/)
* assembly [Aspose.PSD](../../../)

---

## ReplaceContents(string, ResolutionSetting) {#replacecontents_3}

Replaces the contents with a file. There is no need to call UpdateModifiedContent method afterwards.

```csharp
public void ReplaceContents(string linkedPath, ResolutionSetting resolution)
```

| Parameter | Type | Description |
| --- | --- | --- |
| linkedPath | String | The linked path. |
| resolution | ResolutionSetting | The resolution settings. If null the image resolution will be used. |

### See Also

* class [ResolutionSetting](../../../aspose.psd/resolutionsetting/)
* class [SmartObjectLayer](../)
* namespace [Aspose.PSD.FileFormats.Psd.Layers.SmartObjects](../../../aspose.psd.fileformats.psd.layers.smartobjects/)
* assembly [Aspose.PSD](../../../)

---

## ReplaceContents(string, ResolutionSetting, bool) {#replacecontents_4}

Replaces the contents with a file. There is no need to call UpdateModifiedContent method afterwards.

```csharp
public void ReplaceContents(string linkedPath, ResolutionSetting resolution, bool isReplaceOnlyThis)
```

| Parameter | Type | Description |
| --- | --- | --- |
| linkedPath | String | The linked path. |
| resolution | ResolutionSetting | The resolution settings. If null the image resolution will be used. |
| isReplaceOnlyThis | Boolean | The flag shows replace content from this Smart Layer or to all Smart Layers with this content |

## Examples

This example demonstrates that the ReplaceContents method works correctly when the new content file has a different resolution.

```csharp
[C#]

// This example demonstrates that the ReplaceContents method works correctly when the new content file has a different resolution.
string fileName = "CommonPsb.psd";
string filePath = baseFolder + fileName; // original PSD image
string newContentPath = baseFolder + "image.jpg"; // the new content file for the smart object
string outputFilePath = outputFolder + "ChangedPsd";
string pngOutputPath = outputFilePath + ".png"; // the output PNG file
string psdOutputPath = outputFilePath + ".psd"; // the output PSD file
using (PsdImage psd = (PsdImage)Image.Load(filePath))
{
    for (int i = 0; i < psd.Layers.Length; i++)
    {
        var layer = psd.Layers[i];
        SmartObjectLayer smartObjectLayer = layer as SmartObjectLayer;
        if (smartObjectLayer != null)
        {
            smartObjectLayer.ReplaceContents(newContentPath);

            psd.Save(psdOutputPath);
            psd.Save(pngOutputPath, new PngOptions() { ColorType = Aspose.PSD.FileFormats.Png.PngColorType.TruecolorWithAlpha });
        }
    }
}
```

The following code demonstrates the support of replacing content in many smart objects that have the same source reference.

```csharp
[C#]

string srcFile = "Source.psd";
string replaceAll = "replaceAll.jpg";
string replaceOne = "replaceOne.jpg";
string outFileImgAll = "output_All.png";
string outFileImgOne = "output_one.png";

// This will replace the same context in all smart layers with the same link.
using (var image = (PsdImage)Image.Load(srcFile))
{
    var smartObjectLayer = (SmartObjectLayer)image.Layers[1];

    // This will replace the content in all SmartLayers that use the same content.
    smartObjectLayer.ReplaceContents(replaceAll, false);
    smartObjectLayer.UpdateModifiedContent();

    image.Save(outFileImgAll, new PngOptions());
}

//This will replace the context of only the selected layer, leaving all others with the same context alone.
using (var image = (PsdImage)Image.Load(srcFile))
{
    var smartObjectLayer = (SmartObjectLayer)image.Layers[1];

    // It replaces the content in the selected SmartLayer only. 
    smartObjectLayer.ReplaceContents(replaceOne, true);
    smartObjectLayer.UpdateModifiedContent();

    image.Save(outFileImgOne, new PngOptions());
}
```

### See Also

* class [ResolutionSetting](../../../aspose.psd/resolutionsetting/)
* class [SmartObjectLayer](../)
* namespace [Aspose.PSD.FileFormats.Psd.Layers.SmartObjects](../../../aspose.psd.fileformats.psd.layers.smartobjects/)
* assembly [Aspose.PSD](../../../)

---

## ReplaceContents(string) {#replacecontents_2}

Replaces the contents with a file. There is no need to call UpdateModifiedContent method afterwards.

```csharp
public void ReplaceContents(string linkedPath)
```

| Parameter | Type | Description |
| --- | --- | --- |
| linkedPath | String | The linked path. |

### See Also

* class [SmartObjectLayer](../)
* namespace [Aspose.PSD.FileFormats.Psd.Layers.SmartObjects](../../../aspose.psd.fileformats.psd.layers.smartobjects/)
* assembly [Aspose.PSD](../../../)

---

## ReplaceContents(string, bool) {#replacecontents_5}

Replaces the contents with a file. There is no need to call UpdateModifiedContent method afterwards.

```csharp
public void ReplaceContents(string linkedPath, bool isReplaceOnlyThis)
```

| Parameter | Type | Description |
| --- | --- | --- |
| linkedPath | String | The linked path. |
| isReplaceOnlyThis | Boolean | The flag shows replace content from this Smart Layer or to all Smart Layers with this content |

## Examples

The following code demonstrates the support of replacing content in many smart objects that have the same source reference.

```csharp
[C#]

string srcFile = "Source.psd";
string replaceAll = "replaceAll.jpg";
string replaceOne = "replaceOne.jpg";
string outFileImgAll = "output_All.png";
string outFileImgOne = "output_one.png";

// This will replace the same context in all smart layers with the same link.
using (var image = (PsdImage)Image.Load(srcFile))
{
    var smartObjectLayer = (SmartObjectLayer)image.Layers[1];

    // This will replace the content in all SmartLayers that use the same content.
    smartObjectLayer.ReplaceContents(replaceAll, false);
    smartObjectLayer.UpdateModifiedContent();

    image.Save(outFileImgAll, new PngOptions());
}

//This will replace the context of only the selected layer, leaving all others with the same context alone.
using (var image = (PsdImage)Image.Load(srcFile))
{
    var smartObjectLayer = (SmartObjectLayer)image.Layers[1];

    // It replaces the content in the selected SmartLayer only. 
    smartObjectLayer.ReplaceContents(replaceOne, true);
    smartObjectLayer.UpdateModifiedContent();

    image.Save(outFileImgOne, new PngOptions());
}
```

The following code demonstrates the support of updating Linked Smart objects.

```csharp
[C#]

void AssertAreEqual(object actual, object expected)
{
    var areEqual = object.Equals(actual, expected);
    if (!areEqual && actual is Array && expected is Array)
    {
        var actualArray = (Array)actual;
        var expectedArray = (Array)actual;
        if (actualArray.Length == expectedArray.Length)
        {
            for (int i = 0; i < actualArray.Length; i++)
            {
                if (!object.Equals(actualArray.GetValue(i), expectedArray.GetValue(i)))
                {
                    break;
                }
            }

            areEqual = true;
        }
    }

    if (!areEqual)
    {
        throw new FormatException(
            string.Format("Actual value {0} are not equal to expected {1}.", actual, expected));
    }
}

// This example demonstrates how to update the external or embedded smart object layer using these methods:
// RelinkToFile, UpdateModifiedContent, ExportContents
ExampleOfUpdatingSmartObjectLayer("rgb8_2x2_linked2.psd", 0x53, 0, 0, 2, 2, FileFormat.Png);
ExampleOfUpdatingSmartObjectLayer("r-embedded-png.psd", 0x207, 0, 0, 0xb, 0x10, FileFormat.Png);

void ExampleOfUpdatingSmartObjectLayer(
    string filePath,
    int contentsLength,
    int left,
    int top,
    int right,
    int bottom,
    FileFormat format)
{
    // This example demonstrates how to change the smart object layer in the PSD file and export / update its contents.
    string fileName = Path.GetFileNameWithoutExtension(filePath);
    string dataDir = "updating_output" + Path.DirectorySeparatorChar;
    filePath = filePath;
    string pngOutputPath = dataDir + fileName + "_modified.png";
    string png2OutputPath = dataDir + fileName + "_updated_modified.png";
    string psd2OutputPath = dataDir + fileName + "_updated_modified.psd";
    string exportPath = dataDir + fileName + "_exported." + GetFormatExt(format);
    using (PsdImage image = (PsdImage)Image.Load(filePath))
    {
        var smartObjectLayer = (SmartObjectLayer)image.Layers[0];
        var contentType = smartObjectLayer.ContentType;
        AssertAreEqual(contentsLength, smartObjectLayer.Contents.Length);
        AssertAreEqual(left, smartObjectLayer.ContentsBounds.Left);
        AssertAreEqual(top, smartObjectLayer.ContentsBounds.Top);
        AssertAreEqual(right, smartObjectLayer.ContentsBounds.Right);
        AssertAreEqual(bottom, smartObjectLayer.ContentsBounds.Bottom);

        if (contentType == SmartObjectType.AvailableLinked)
        {
            Directory.CreateDirectory(Path.GetDirectoryName(exportPath));
            // Let's export the external smart object image from the PSD smart object layer to a new location
            // because we are going to modify it.
            smartObjectLayer.ExportContents(exportPath);
            smartObjectLayer.RelinkToFile(exportPath);
        }

        // Let's invert the content of the smart object: inner (not cached) image
        using (var innerImage = (RasterImage)smartObjectLayer.LoadContents(new LoadOptions()))
        {
            InvertImage(innerImage);
            using (var stream = new MemoryStream())
            {
                innerImage.Save(stream);
                smartObjectLayer.Contents = stream.ToArray();
            }
        }

        // Let's check whether the modified content does not affect rendering yet.
        image.Save(pngOutputPath, new PngOptions() { ColorType = PngColorType.TruecolorWithAlpha });

        smartObjectLayer.UpdateModifiedContent();

        // Let's check whether the updated content affects rendering and the psd image is saved correctly
        image.Save(psd2OutputPath, new PsdOptions(image));
        image.Save(png2OutputPath, new PngOptions() { ColorType = PngColorType.TruecolorWithAlpha });
    }
}

// This example demonstrates how to convert the embedded smart object to external linked contents using the ConvertToLinked method.
ExampleOfEmbeddedSmartObjectLayerToLinkedConversion("new_panama-papers-4.psd", 0x10caa, 0, 0, 0x280, 0x169, FileFormat.Jpeg);
ExampleOfEmbeddedSmartObjectLayerToLinkedConversion("r3-embedded.psd", 0x207, 0, 0, 0xb, 0x10, FileFormat.Png);
ExampleOfEmbeddedSmartObjectLayerToLinkedConversion("r-embedded-tiff.psd", 0xca94, 0, 0, 0xb, 0x10, FileFormat.Tiff);
ExampleOfEmbeddedSmartObjectLayerToLinkedConversion("r-embedded-bmp.psd", 0x278, 0, 0, 0xb, 0x10, FileFormat.Bmp);
ExampleOfEmbeddedSmartObjectLayerToLinkedConversion("r-embedded-gif.psd", 0x3ec, 0, 0, 0xb, 0x10, FileFormat.Gif);
ExampleOfEmbeddedSmartObjectLayerToLinkedConversion("r-embedded-jpeg.psd", 0x327, 0, 0, 0xb, 0x10, FileFormat.Jpeg);
ExampleOfEmbeddedSmartObjectLayerToLinkedConversion("r-embedded-jpeg2000.psd", 0x519f, 0, 0, 0xb, 0x10, FileFormat.Jpeg2000);
ExampleOfEmbeddedSmartObjectLayerToLinkedConversion("r-embedded-psd.psd", 0xc074, 0, 0, 0xb, 0x10, FileFormat.Psd);
ExampleOfEmbeddedSmartObjectLayerToLinkedConversion("r-embedded-png.psd", 0x207, 0, 0, 0xb, 0x10, FileFormat.Png);

void ExampleOfEmbeddedSmartObjectLayerToLinkedConversion(
    string filePath,
    int contentsLength,
    int left,
    int top,
    int right,
    int bottom,
    FileFormat format)
{
    // This demonstrates how to convert an embedded smart object layer in the PSD file to external one.
    var formatExt = GetFormatExt(format);
    string fileName = Path.GetFileNameWithoutExtension(filePath);
    string dataDir = "to_linked_output" + Path.DirectorySeparatorChar;
    filePath = filePath;
    string pngOutputPath = dataDir + fileName + "_to_external.png";
    string psdOutputPath = dataDir + fileName + "_to_external.psd";
    string externalPath = dataDir + fileName + "_external." + formatExt;
    using (PsdImage image = (PsdImage)Image.Load(filePath))
    {
        Directory.CreateDirectory(Path.GetDirectoryName(externalPath));
        var smartObjectLayer = (SmartObjectLayer)image.Layers[0];
        smartObjectLayer.ConvertToLinked(externalPath);

        AssertAreEqual(contentsLength, smartObjectLayer.Contents.Length);
        AssertAreEqual(left, smartObjectLayer.ContentsBounds.Left);
        AssertAreEqual(top, smartObjectLayer.ContentsBounds.Top);
        AssertAreEqual(right, smartObjectLayer.ContentsBounds.Right);
        AssertAreEqual(bottom, smartObjectLayer.ContentsBounds.Bottom);
        AssertAreEqual(SmartObjectType.AvailableLinked, smartObjectLayer.ContentType);

        // Let's check if the converted image is saved correctly
        image.Save(psdOutputPath, new PsdOptions(image));
        image.Save(pngOutputPath, new PngOptions() { ColorType = PngColorType.TruecolorWithAlpha });
    }

    using (PsdImage image = (PsdImage)Image.Load(psdOutputPath))
    {
        var smartObjectLayer = (SmartObjectLayer)image.Layers[0];
        AssertAreEqual(contentsLength, smartObjectLayer.Contents.Length);
        AssertAreEqual(left, smartObjectLayer.ContentsBounds.Left);
        AssertAreEqual(top, smartObjectLayer.ContentsBounds.Top);
        AssertAreEqual(right, smartObjectLayer.ContentsBounds.Right);
        AssertAreEqual(bottom, smartObjectLayer.ContentsBounds.Bottom);
        AssertAreEqual(SmartObjectType.AvailableLinked, smartObjectLayer.ContentType);
    }
}

// This example demonstrates how to embed one external smart object layer or all linked layers in the PSD file using the EmbedLinked method.
ExampleOfLinkedSmartObjectLayerToEmbeddedConversion("rgb8_2x2_linked.psd", 0x53, 0, 0, 2, 2, FileFormat.Png);
ExampleOfLinkedSmartObjectLayerToEmbeddedConversion("rgb8_2x2_linked2.psd", 0x53, 0, 0, 2, 2, FileFormat.Png);
void ExampleOfLinkedSmartObjectLayerToEmbeddedConversion(
    string filePath,
    int contentsLength,
    int left,
    int top,
    int right,
    int bottom,
    FileFormat format)
{
    string fileName = Path.GetFileNameWithoutExtension(filePath);
    string dataDir = "to_embedded_output" + Path.DirectorySeparatorChar;
    filePath = filePath;
    string pngOutputPath = dataDir + fileName + "_to_embedded.png";
    string psdOutputPath = dataDir + fileName + "_to_embedded.psd";
    using (PsdImage image = (PsdImage)Image.Load(filePath))
    {
        var smartObjectLayer0 = (SmartObjectLayer)image.Layers[0];
        smartObjectLayer0.EmbedLinked();
        AssertAreEqual(contentsLength, smartObjectLayer0.Contents.Length);
        AssertAreEqual(left, smartObjectLayer0.ContentsBounds.Left);
        AssertAreEqual(top, smartObjectLayer0.ContentsBounds.Top);
        AssertAreEqual(right, smartObjectLayer0.ContentsBounds.Right);
        AssertAreEqual(bottom, smartObjectLayer0.ContentsBounds.Bottom);
        if (image.Layers.Length >= 2)
        {
            var smartObjectLayer1 = (SmartObjectLayer)image.Layers[1];
            AssertAreEqual(SmartObjectType.Embedded, smartObjectLayer0.ContentType);
            AssertAreEqual(SmartObjectType.AvailableLinked, smartObjectLayer1.ContentType);

            image.SmartObjectProvider.EmbedAllLinked();
            foreach (Layer layer in image.Layers)
            {
                var smartLayer = layer as SmartObjectLayer;
                if (smartLayer != null)
                {
                    AssertAreEqual(SmartObjectType.Embedded, smartLayer.ContentType);
                }
            }
        }

        Directory.CreateDirectory(Path.GetDirectoryName(psdOutputPath));
        // Let's check if the converted image is saved correctly
        image.Save(psdOutputPath, new PsdOptions(image));
        image.Save(pngOutputPath, new PngOptions() { ColorType = PngColorType.TruecolorWithAlpha });
    }

    using (PsdImage image = (PsdImage)Image.Load(psdOutputPath))
    {
        var smartObjectLayer = (SmartObjectLayer)image.Layers[0];
        AssertAreEqual(contentsLength, smartObjectLayer.Contents.Length);
        AssertAreEqual(left, smartObjectLayer.ContentsBounds.Left);
        AssertAreEqual(top, smartObjectLayer.ContentsBounds.Top);
        AssertAreEqual(right, smartObjectLayer.ContentsBounds.Right);
        AssertAreEqual(bottom, smartObjectLayer.ContentsBounds.Bottom);
        AssertAreEqual(SmartObjectType.Embedded, smartObjectLayer.ContentType);
    }
}

// This example demonstrates how to change the Adobe® Photoshop® external smart object layer and export / update its contents
// using the ExportContents and ReplaceContents methods.
ExampleOfExternalSmartObjectLayerSupport("rgb8_2x2_linked.psd", 0x53, 0, 0, 2, 2, FileFormat.Png);
ExampleOfExternalSmartObjectLayerSupport("rgb8_2x2_linked2.psd", 0x4aea, 0, 0, 10, 10, FileFormat.Psd);
void ExampleOfExternalSmartObjectLayerSupport(string filePath, int contentsLength, int left, int top, int right, int bottom, FileFormat format)
{
    string formatExt = GetFormatExt(format);
    string fileName = Path.GetFileNameWithoutExtension(filePath);
    string dataDir = "external_support_output" + Path.DirectorySeparatorChar;
    filePath = filePath;
    string pngOutputPath = dataDir + fileName + ".png";
    string psdOutputPath = dataDir + fileName + ".psd";
    string linkOutputPath = dataDir + fileName + "_inverted." + formatExt;
    string png2OutputPath = dataDir + fileName + "_updated.png";
    string psd2OutputPath = dataDir + fileName + "_updated.psd";
    string exportPath = dataDir + fileName + "_export." + formatExt;
    using (PsdImage image = (PsdImage)Image.Load(filePath))
    {
        var smartObjectLayer = (SmartObjectLayer)image.Layers[image.Layers.Length - 1];
        AssertAreEqual(left, smartObjectLayer.ContentsBounds.Left);
        AssertAreEqual(top, smartObjectLayer.ContentsBounds.Top);
        AssertAreEqual(right, smartObjectLayer.ContentsBounds.Right);
        AssertAreEqual(bottom, smartObjectLayer.ContentsBounds.Bottom);
        AssertAreEqual(contentsLength, smartObjectLayer.Contents.Length);
        AssertAreEqual(SmartObjectType.AvailableLinked, smartObjectLayer.ContentType);

        Directory.CreateDirectory(Path.GetDirectoryName(exportPath));
        // Let's export the linked smart object image from the PSD smart object layer
        smartObjectLayer.ExportContents(exportPath);

        // Let's check if the original image isz saved correctly
        image.Save(psdOutputPath, new PsdOptions(image));
        image.Save(pngOutputPath, new PngOptions() { ColorType = PngColorType.TruecolorWithAlpha });

        using (var innerImage = (RasterImage)smartObjectLayer.LoadContents(null))
        {
            AssertAreEqual(format, innerImage.FileFormat);

            // Let's invert the linked smart object image
            InvertImage(innerImage);
            innerImage.Save(linkOutputPath);

            // Let's replace the linked smart object image in the PSD layer
            smartObjectLayer.ReplaceContents(linkOutputPath);
        }

        // Let's check if the updated image is saved correctly
        image.Save(psd2OutputPath, new PsdOptions(image));
        image.Save(png2OutputPath, new PngOptions() { ColorType = PngColorType.TruecolorWithAlpha });
    }
}

// Inverts the image.
void InvertImage(RasterImage innerImage)
{
    var innerPsdImage = innerImage as PsdImage;
    if (innerPsdImage != null)
    {
        InvertRasterImage(innerPsdImage.Layers[0]);
    }
    else
    {
        InvertRasterImage(innerImage);
    }
}

// Inverts the raster image.
void InvertRasterImage(RasterImage innerImage)
{
    var pixels = innerImage.LoadArgb32Pixels(innerImage.Bounds);
    for (int i = 0; i < pixels.Length; i++)
    {
        var pixel = pixels[i];
        var alpha = (int)(pixel & 0xff000000);
        pixels[i] = (~(pixel & 0x00ffffff)) | alpha;
    }

    innerImage.SaveArgb32Pixels(innerImage.Bounds, pixels);
}

// Gets the format extension.
string GetFormatExt(FileFormat format)
{
    string formatExt = format == FileFormat.Jpeg2000 ? "jpf" : format.ToString().ToLowerInvariant();
    return formatExt;
}
```

### See Also

* class [SmartObjectLayer](../)
* namespace [Aspose.PSD.FileFormats.Psd.Layers.SmartObjects](../../../aspose.psd.fileformats.psd.layers.smartobjects/)
* assembly [Aspose.PSD](../../../)


