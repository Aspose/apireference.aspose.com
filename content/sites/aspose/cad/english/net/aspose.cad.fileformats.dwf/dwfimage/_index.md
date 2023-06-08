---
title: Class DwfImage
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Dwf.DwfImage class. DWF image class
type: docs
weight: 8940
url: /net/aspose.cad.fileformats.dwf/dwfimage/
---
## DwfImage class

DWF image class

```csharp
public sealed class DwfImage : Image
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
| override [Height](../../aspose.cad.fileformats.dwf/dwfimage/height/) { get; } | Gets the image height. |
| override [IsCached](../../aspose.cad.fileformats.dwf/dwfimage/iscached/) { get; } | Gets is image cached |
| [Layers](../../aspose.cad.fileformats.dwf/dwfimage/layers/) { get; } | Gets layers |
| [Pages](../../aspose.cad.fileformats.dwf/dwfimage/pages/) { get; } | Gets pages |
| [Palette](../../aspose.cad/image/palette/) { get; set; } | Gets or sets the color palette. |
| [Size](../../aspose.cad/image/size/) { get; } | Gets the image size. |
| virtual [UnitlessDefaultUnitType](../../aspose.cad/image/unitlessdefaultunittype/) { get; } | Assumed unit type when UnitType is set to Unitless |
| [UnitType](../../aspose.cad/image/unittype/) { get; } | Gets current unit type. |
| override [Width](../../aspose.cad.fileformats.dwf/dwfimage/width/) { get; } | Gets the image width. |

## Methods

| Name | Description |
| --- | --- |
| [AddElement](../../aspose.cad.fileformats.dwf/dwfimage/addelement/)(int, DwfWhipDrawable) | Adds render able element to specified page |
| override [CacheData](../../aspose.cad.fileformats.dwf/dwfimage/cachedata/)() | Caches data |
| [CanSave](../../aspose.cad/image/cansave/)(ImageOptionsBase) | Determines whether image can be saved to the specified file format represented by the passed save options. |
| [Dispose](../../aspose.cad/disposableobject/dispose/)() | Disposes the current instance. |
| [GetElementCount](../../aspose.cad.fileformats.dwf/dwfimage/getelementcount/)(int) | Gets count of render able elements from specified page |
| override [GetStrings](../../aspose.cad.fileformats.dwf/dwfimage/getstrings/)() | Gets all string values from image. |
| [RemoveElement](../../aspose.cad.fileformats.dwf/dwfimage/removeelement/)(int, int) | Removes element from specified page |
| [Save](../../aspose.cad/image/save/)() | Saves the image data to the underlying stream. |
| [Save](../../aspose.cad/datastreamsupporter/save/)(Stream) | Saves the object's data to the specified stream. |
| virtual [Save](../../aspose.cad/datastreamsupporter/save/)(string) | Saves the object's data to the specified file location. |
| [Save](../../aspose.cad/image/save/)(Stream, ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |
| virtual [Save](../../aspose.cad/datastreamsupporter/save/)(string, bool) | Saves the object's data to the specified file location. |
| virtual [Save](../../aspose.cad/image/save/)(string, ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. |
| [SaveAsync](../../aspose.cad/image/saveasync/)(Stream, ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |
| virtual [SaveAsync](../../aspose.cad/image/saveasync/)(string, ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. |
| [UpdateSize](../../aspose.cad.fileformats.dwf/dwfimage/updatesize/)() | Updates the size. |

### See Also

* class [Image](../../aspose.cad/image/)
* namespace [Aspose.CAD.FileFormats.Dwf](../../aspose.cad.fileformats.dwf/)
* assembly [Aspose.CAD](../../)


