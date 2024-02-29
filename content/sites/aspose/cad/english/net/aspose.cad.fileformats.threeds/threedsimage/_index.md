---
title: Class ThreeDSImage
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.ThreeDS.ThreeDSImage class. 3DS image class. Allows to load 3D models from 3DS files. In example below 3D model loaded from file and exported to PDF. The resulting PDF file will contain projection of 3D model occupying the entire page with margins
type: docs
weight: 35110
url: /net/aspose.cad.fileformats.threeds/threedsimage/
---
## ThreeDSImage class

3DS image class. Allows to load 3D models from 3DS files. In example below 3D model loaded from file and exported to PDF. The resulting PDF file will contain projection of 3D model occupying the entire page with margins.

```csharp
public class ThreeDSImage : Image
```

## Constructors

| Name | Description |
| --- | --- |
| [ThreeDSImage](threedsimage/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [AmbientLight](../../aspose.cad.fileformats.threeds/threedsimage/ambientlight/) { get; set; } | The ambient light color. |
| virtual [AnnotationService](../../aspose.cad/image/annotationservice/) { get; } | Gets the annotation service. |
| [Bounds](../../aspose.cad/image/bounds/) { get; } | Gets the image bounds. |
| [Container](../../aspose.cad/image/container/) { get; } | Gets the [`Image`](../../aspose.cad/image/) container. |
| virtual [CustomProperties](../../aspose.cad/image/customproperties/) { get; } | Gets or sets the custom properties. |
| [DataStreamContainer](../../aspose.cad/datastreamsupporter/datastreamcontainer/) { get; } | Gets the object's data stream. |
| override [Depth](../../aspose.cad.fileformats.threeds/threedsimage/depth/) { get; } | Gets the image depth. |
| [Disposed](../../aspose.cad/disposableobject/disposed/) { get; } | Gets a value indicating whether this instance is disposed. |
| [HasMaterials](../../aspose.cad.fileformats.threeds/threedsimage/hasmaterials/) { get; } | Gets a value indicating whether object has materials. |
| [HasMeshes](../../aspose.cad.fileformats.threeds/threedsimage/hasmeshes/) { get; } | Gets a value indicating whether object has meshes. |
| override [Height](../../aspose.cad.fileformats.threeds/threedsimage/height/) { get; } | Gets the image height. |
| override [IsCached](../../aspose.cad.fileformats.threeds/threedsimage/iscached/) { get; } | Gets a value indicating whether object's data is cached currently and no data readig is required. |
| [Materials](../../aspose.cad.fileformats.threeds/threedsimage/materials/) { get; } | The list of the materials. |
| [Meshes](../../aspose.cad.fileformats.threeds/threedsimage/meshes/) { get; } | The list of the meshes. |
| [Palette](../../aspose.cad/image/palette/) { get; set; } | Gets or sets the color palette. |
| [Size](../../aspose.cad/image/size/) { get; } | Gets the image size. |
| virtual [UnitlessDefaultUnitType](../../aspose.cad/image/unitlessdefaultunittype/) { get; } | Assumed unit type when UnitType is set to Unitless |
| virtual [UnitType](../../aspose.cad/image/unittype/) { get; } | Gets current unit type. |
| virtual [WatermarkGuardService](../../aspose.cad/image/watermarkguardservice/) { get; } |  |
| override [Width](../../aspose.cad.fileformats.threeds/threedsimage/width/) { get; } | Gets the image width. |

## Methods

| Name | Description |
| --- | --- |
| override [CacheData](../../aspose.cad.fileformats.threeds/threedsimage/cachedata/)() | Caches the data and ensures no additional data loading will be performed from the underlying [`DataStreamContainer`](../../aspose.cad/datastreamsupporter/datastreamcontainer/). |
| [CanSave](../../aspose.cad/image/cansave/)(ImageOptionsBase) | Determines whether image can be saved to the specified file format represented by the passed save options. |
| [Dispose](../../aspose.cad/disposableobject/dispose/)() | Disposes the current instance. |
| virtual [GetStrings](../../aspose.cad/image/getstrings/)() | Gets all string values from image. |
| [Save](../../aspose.cad/image/save/)() | Saves the image data to the underlying stream. |
| [Save](../../aspose.cad/datastreamsupporter/save/)(Stream) | Saves the object's data to the specified stream. |
| virtual [Save](../../aspose.cad/datastreamsupporter/save/)(string) | Saves the object's data to the specified file location. |
| [Save](../../aspose.cad/image/save/)(Stream, ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |
| virtual [Save](../../aspose.cad/datastreamsupporter/save/)(string, bool) | Saves the object's data to the specified file location. |
| virtual [Save](../../aspose.cad/image/save/)(string, ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. |
| [SaveAsync](../../aspose.cad/image/saveasync/)(Stream, ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |
| virtual [SaveAsync](../../aspose.cad/image/saveasync/)(string, ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. |
| virtual [ThrowIfCantExportToCad](../../aspose.cad/image/throwifcantexporttocad/)(ImageOptionsBase, Exception) | Throw exception if can`t export |
| [UpdateImage](../../aspose.cad.fileformats.threeds/threedsimage/updateimage/)() |  |

## Examples

Loading of 3DS model and exporting of ThreeDSImage into PDF document of desired size.

```csharp
using (ThreeDSImage image = (ThreeDSImage)Image.Load(inFileName))
{
    PdfOptions pdfOptions = new PdfOptions();
    var rasterizationOptions = new CadRasterizationOptions();
    rasterizationOptions.PageWidth = 1600; 
    rasterizationOptions.PageHeight = 1600; 
    pdfOptions.VectorRasterizationOptions = rasterizationOptions;
    image.Save(outFileName, pdfOptions);
}
```

### See Also

* class [Image](../../aspose.cad/image/)
* namespace [Aspose.CAD.FileFormats.ThreeDS](../../aspose.cad.fileformats.threeds/)
* assembly [Aspose.CAD](../../)


