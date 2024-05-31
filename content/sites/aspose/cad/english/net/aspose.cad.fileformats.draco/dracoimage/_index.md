---
title: Class DracoImage
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Draco.DracoImage class. Represents an image in DRACO format. Contains information about bounds of the drawing vertices faces and attributes
type: docs
weight: 9200
url: /net/aspose.cad.fileformats.draco/dracoimage/
---
## DracoImage class

Represents an image in DRACO format. Contains information about bounds of the drawing, vertices, faces and attributes.

```csharp
public class DracoImage : Image
```

## Constructors

| Name | Description |
| --- | --- |
| [DracoImage](dracoimage/)(#=z$HLjnzPz2w8wMXPzGpyOwKsxYsmIcpUzLg==) |  |

## Properties

| Name | Description |
| --- | --- |
| virtual [AnnotationService](../../aspose.cad/image/annotationservice/) { get; } | Gets the annotation service. |
| [Bounds](../../aspose.cad/image/bounds/) { get; } | Gets the image bounds. |
| [Colors](../../aspose.cad.fileformats.draco/dracoimage/colors/) { get; set; } | The array of mesh colors. |
| [Container](../../aspose.cad/image/container/) { get; } | Gets the [`Image`](../../aspose.cad/image/) container. |
| virtual [CustomProperties](../../aspose.cad/image/customproperties/) { get; } | Gets or sets the custom properties. |
| [DataStreamContainer](../../aspose.cad/datastreamsupporter/datastreamcontainer/) { get; } | Gets the object's data stream. |
| override [Depth](../../aspose.cad.fileformats.draco/dracoimage/depth/) { get; } | Gets the depth of the image. Calculated as the difference between maximum and minimum values of the Z coordinate amongst all vertices. Minimal allowed depth is 0. |
| [Disposed](../../aspose.cad/disposableobject/disposed/) { get; } | Gets a value indicating whether this instance is disposed. |
| override [Height](../../aspose.cad.fileformats.draco/dracoimage/height/) { get; } | Gets the height of the image. Calculated as the difference between maximum and minimum values of the Y coordinate amongst all vertices. Minimal allowed height is 1. |
| [Indices](../../aspose.cad.fileformats.draco/dracoimage/indices/) { get; set; } | The array of mesh faces indices. |
| override [IsCached](../../aspose.cad.fileformats.draco/dracoimage/iscached/) { get; } | Gets a value indicating whether object's data is cached currently and no data reading is required. |
| [Palette](../../aspose.cad/image/palette/) { get; set; } | Gets or sets the color palette. |
| [Size](../../aspose.cad/image/size/) { get; } | Gets the image size. |
| virtual [UnitlessDefaultUnitType](../../aspose.cad/image/unitlessdefaultunittype/) { get; } | Assumed unit type when UnitType is set to Unitless |
| virtual [UnitType](../../aspose.cad/image/unittype/) { get; } | Gets current unit type. |
| [Vertices](../../aspose.cad.fileformats.draco/dracoimage/vertices/) { get; set; } | The array of mesh vertices. |
| virtual [WatermarkGuardService](../../aspose.cad/image/watermarkguardservice/) { get; } |  |
| override [Width](../../aspose.cad.fileformats.draco/dracoimage/width/) { get; } | Gets the width of the image. Calculated as the difference between maximum and minimum values of the X coordinate amongst all vertices. Minimal allowed width is 1. |

## Methods

| Name | Description |
| --- | --- |
| override [CacheData](../../aspose.cad.fileformats.draco/dracoimage/cachedata/)() | Caches the data and ensures no additional data loading will be performed from the underlying [`DataStreamContainer`](../../aspose.cad/datastreamsupporter/datastreamcontainer/). Not implemented. |
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

## Examples

Loading of the drawing in DRACO format.

```csharp
using (DracoImage drcImage = (DracoImage)Image.Load(fileName))
{
...
}
```

### See Also

* class [Image](../../aspose.cad/image/)
* namespace [Aspose.CAD.FileFormats.Draco](../../aspose.cad.fileformats.draco/)
* assembly [Aspose.CAD](../../)


