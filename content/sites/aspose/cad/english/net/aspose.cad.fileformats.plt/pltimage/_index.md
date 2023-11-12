---
title: Class PltImage
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Plt.PltImage class. PLT image class
type: docs
weight: 34010
url: /net/aspose.cad.fileformats.plt/pltimage/
---
## PltImage class

PLT image class.

```csharp
public class PltImage : Image
```

## Properties

| Name | Description |
| --- | --- |
| virtual [AnnotationService](../../aspose.cad/image/annotationservice/) { get; } | Gets the annotation service. |
| [Bounds](../../aspose.cad/image/bounds/) { get; } | Gets the image bounds. |
| [Container](../../aspose.cad/image/container/) { get; } | Gets the [`Image`](../../aspose.cad/image/) container. |
| virtual [CustomProperties](../../aspose.cad/image/customproperties/) { get; } | Gets or sets the custom properties. |
| [DataStreamContainer](../../aspose.cad/datastreamsupporter/datastreamcontainer/) { get; } | Gets the object's data stream. |
| virtual [Depth](../../aspose.cad/image/depth/) { get; } | Gets the image depth. |
| [Disposed](../../aspose.cad/disposableobject/disposed/) { get; } | Gets a value indicating whether this instance is disposed. |
| override [Height](../../aspose.cad.fileformats.plt/pltimage/height/) { get; } | Gets the image height in points (72 points per inch). |
| override [IsCached](../../aspose.cad.fileformats.plt/pltimage/iscached/) { get; } | Gets a value indicating whether object's data is cached currently and no data reading is required. |
| [MaxPoint](../../aspose.cad.fileformats.plt/pltimage/maxpoint/) { get; } | Gets the maximum point coordinate of drawing elements of all pages in points (72 points per inch). |
| [MinPoint](../../aspose.cad.fileformats.plt/pltimage/minpoint/) { get; } | Gets the minimum point coordinate of drawing elements of all pages in points (72 points per inch). |
| [Pages](../../aspose.cad.fileformats.plt/pltimage/pages/) { get; } | Gets pages |
| [Palette](../../aspose.cad/image/palette/) { get; set; } | Gets or sets the color palette. |
| [Size](../../aspose.cad/image/size/) { get; } | Gets the image size. |
| virtual [UnitlessDefaultUnitType](../../aspose.cad/image/unitlessdefaultunittype/) { get; } | Assumed unit type when UnitType is set to Unitless |
| virtual [UnitType](../../aspose.cad/image/unittype/) { get; } | Gets current unit type. |
| override [Width](../../aspose.cad.fileformats.plt/pltimage/width/) { get; } | Gets the image width in points (72 points per inch). |

## Methods

| Name | Description |
| --- | --- |
| override [CacheData](../../aspose.cad.fileformats.plt/pltimage/cachedata/)() | Caches the data and ensures no additional data loading will be performed from the underlying [`DataStreamContainer`](../../aspose.cad/datastreamsupporter/datastreamcontainer/). |
| [CanSave](../../aspose.cad/image/cansave/)(ImageOptionsBase) | Determines whether image can be saved to the specified file format represented by the passed save options. |
| [Dispose](../../aspose.cad/disposableobject/dispose/)() | Disposes the current instance. |
| override [GetStrings](../../aspose.cad.fileformats.plt/pltimage/getstrings/)() | Gets all string values from image. |
| [GetUnitTranslationCoefficient](../../aspose.cad.fileformats.plt/pltimage/getunittranslationcoefficient/)(UnitType) | Gets unit type convert coefficient |
| [Save](../../aspose.cad/image/save/)() | Saves the image data to the underlying stream. |
| [Save](../../aspose.cad/datastreamsupporter/save/)(Stream) | Saves the object's data to the specified stream. |
| virtual [Save](../../aspose.cad/datastreamsupporter/save/)(string) | Saves the object's data to the specified file location. |
| [Save](../../aspose.cad/image/save/)(Stream, ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |
| virtual [Save](../../aspose.cad/datastreamsupporter/save/)(string, bool) | Saves the object's data to the specified file location. |
| virtual [Save](../../aspose.cad/image/save/)(string, ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. |
| [SaveAsync](../../aspose.cad/image/saveasync/)(Stream, ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |
| virtual [SaveAsync](../../aspose.cad/image/saveasync/)(string, ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. |
| virtual [ThrowIfCantExportToCad](../../aspose.cad/image/throwifcantexporttocad/)(ImageOptionsBase, Exception) | Throw exception if can`t export |

### See Also

* class [Image](../../aspose.cad/image/)
* namespace [Aspose.CAD.FileFormats.Plt](../../aspose.cad.fileformats.plt/)
* assembly [Aspose.CAD](../../)


