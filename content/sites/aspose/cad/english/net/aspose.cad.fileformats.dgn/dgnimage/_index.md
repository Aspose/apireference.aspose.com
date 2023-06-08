---
title: Class DgnImage
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Dgn.DgnImage class. Dgn image class
type: docs
weight: 8830
url: /net/aspose.cad.fileformats.dgn/dgnimage/
---
## DgnImage class

Dgn image class

```csharp
public class DgnImage : Image
```

## Properties

| Name | Description |
| --- | --- |
| virtual [BackgroundColor](../../aspose.cad/image/backgroundcolor/) { get; set; } | Gets or sets a value for the background color. |
| [Bounds](../../aspose.cad/image/bounds/) { get; } | Gets the image bounds. |
| [Container](../../aspose.cad/image/container/) { get; } | Gets the [`Image`](../../aspose.cad/image/) container. |
| [DataStreamContainer](../../aspose.cad/datastreamsupporter/datastreamcontainer/) { get; } | Gets the object's data stream. |
| [Disposed](../../aspose.cad/disposableobject/disposed/) { get; } | Gets a value indicating whether this instance is disposed. |
| [Elements](../../aspose.cad.fileformats.dgn/dgnimage/elements/) { get; } | Gets elements were read from source file |
| virtual [HasBackgroundColor](../../aspose.cad/image/hasbackgroundcolor/) { get; set; } | Gets or sets a value indicating whether image has background color. |
| override [Height](../../aspose.cad.fileformats.dgn/dgnimage/height/) { get; } | Gets the image height. |
| [Is3DImage](../../aspose.cad.fileformats.dgn/dgnimage/is3dimage/) { get; } | Gets a value indicating whether file is 3D or not |
| [IsCached](../../aspose.cad.fileformats.dgn/dgnimage/iscached/) { get; } | Gets a value indicating whether object's data is cached currently and no data reading is required. |
| [MaxPoint](../../aspose.cad.fileformats.dgn/dgnimage/maxpoint/) { get; } | Gets the max point. |
| [MinPoint](../../aspose.cad.fileformats.dgn/dgnimage/minpoint/) { get; } | Gets the min point. |
| [Palette](../../aspose.cad/image/palette/) { get; set; } | Gets or sets the color palette. |
| [Size](../../aspose.cad/image/size/) { get; } | Gets the image size. |
| [SubUnitType](../../aspose.cad.fileformats.dgn/dgnimage/subunittype/) { get; } | Gets current sub-unit type. |
| [Tags](../../aspose.cad.fileformats.dgn/dgnimage/tags/) { get; } | Gets the tags. |
| virtual [UnitlessDefaultUnitType](../../aspose.cad/image/unitlessdefaultunittype/) { get; } | Assumed unit type when UnitType is set to Unitless |
| [UnitType](../../aspose.cad/image/unittype/) { get; } | Gets current unit type. |
| [Version](../../aspose.cad.fileformats.dgn/dgnimage/version/) { get; } | Gets DGN version of loaded image |
| [Views](../../aspose.cad.fileformats.dgn/dgnimage/views/) { get; } | Gets the views. |
| override [Width](../../aspose.cad.fileformats.dgn/dgnimage/width/) { get; } | Gets the image width. |

## Methods

| Name | Description |
| --- | --- |
| [CacheData](../../aspose.cad.fileformats.dgn/dgnimage/cachedata/)() | Caches the data and ensures no additional data loading will be performed from the underlying [`DataStreamContainer`](../../aspose.cad/datastreamsupporter/datastreamcontainer/). |
| [CanSave](../../aspose.cad/image/cansave/)(ImageOptionsBase) | Determines whether image can be saved to the specified file format represented by the passed save options. |
| [Dispose](../../aspose.cad/disposableobject/dispose/)() | Disposes the current instance. |
| override [GetStrings](../../aspose.cad.fileformats.dgn/dgnimage/getstrings/)() | Gets all string values from image. |
| [Save](../../aspose.cad/image/save/)() | Saves the image data to the underlying stream. |
| [Save](../../aspose.cad/datastreamsupporter/save/)(Stream) | Saves the object's data to the specified stream. |
| virtual [Save](../../aspose.cad/datastreamsupporter/save/)(string) | Saves the object's data to the specified file location. |
| [Save](../../aspose.cad/image/save/)(Stream, ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |
| virtual [Save](../../aspose.cad/datastreamsupporter/save/)(string, bool) | Saves the object's data to the specified file location. |
| virtual [Save](../../aspose.cad/image/save/)(string, ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. |
| [SaveAsync](../../aspose.cad/image/saveasync/)(Stream, ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |
| virtual [SaveAsync](../../aspose.cad/image/saveasync/)(string, ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. |

### See Also

* class [Image](../../aspose.cad/image/)
* namespace [Aspose.CAD.FileFormats.Dgn](../../aspose.cad.fileformats.dgn/)
* assembly [Aspose.CAD](../../)


