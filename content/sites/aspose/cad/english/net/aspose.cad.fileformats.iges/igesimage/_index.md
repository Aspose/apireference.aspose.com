---
title: Class IgesImage
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Iges.IgesImage class. IGES Image class
type: docs
weight: 33320
url: /net/aspose.cad.fileformats.iges/igesimage/
---
## IgesImage class

IGES Image class

```csharp
public class IgesImage : Image
```

## Properties

| Name | Description |
| --- | --- |
| virtual [BackgroundColor](../../aspose.cad/image/backgroundcolor/) { get; set; } | Gets or sets a value for the background color. |
| [Bounds](../../aspose.cad/image/bounds/) { get; } | Gets the image bounds. |
| [Container](../../aspose.cad/image/container/) { get; } | Gets the [`Image`](../../aspose.cad/image/) container. |
| [DataStreamContainer](../../aspose.cad/datastreamsupporter/datastreamcontainer/) { get; } | Gets the object's data stream. |
| [Disposed](../../aspose.cad/disposableobject/disposed/) { get; } | Gets a value indicating whether this instance is disposed. |
| virtual [HasBackgroundColor](../../aspose.cad/image/hasbackgroundcolor/) { get; set; } | Gets or sets a value indicating whether image has background color. |
| override [Height](../../aspose.cad.fileformats.iges/igesimage/height/) { get; } | Gets Image height |
| override [IsCached](../../aspose.cad.fileformats.iges/igesimage/iscached/) { get; } | Gets a value indicating whether object's data is cached currently and no data readig is required. |
| [Palette](../../aspose.cad/image/palette/) { get; set; } | Gets or sets the color palette. |
| [Size](../../aspose.cad/image/size/) { get; } | Gets the image size. |
| virtual [UnitlessDefaultUnitType](../../aspose.cad/image/unitlessdefaultunittype/) { get; } | Assumed unit type when UnitType is set to Unitless |
| [UnitType](../../aspose.cad/image/unittype/) { get; } | Gets current unit type. |
| override [Width](../../aspose.cad.fileformats.iges/igesimage/width/) { get; } | Gets Image width |

## Methods

| Name | Description |
| --- | --- |
| override [CacheData](../../aspose.cad.fileformats.iges/igesimage/cachedata/)() | Caches the data and ensures no additional data loading will be performed from the underlying [`DataStreamContainer`](../../aspose.cad/datastreamsupporter/datastreamcontainer/). |
| [CanSave](../../aspose.cad/image/cansave/)(ImageOptionsBase) | Determines whether image can be saved to the specified file format represented by the passed save options. |
| [Dispose](../../aspose.cad/disposableobject/dispose/)() | Disposes the current instance. |
| [GetDrawables](../../aspose.cad.fileformats.iges/igesimage/getdrawables/)() | Gets geometric representation of the document |
| override [GetStrings](../../aspose.cad.fileformats.iges/igesimage/getstrings/)() | Gets all string values from image. |
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
* namespace [Aspose.CAD.FileFormats.Iges](../../aspose.cad.fileformats.iges/)
* assembly [Aspose.CAD](../../)


