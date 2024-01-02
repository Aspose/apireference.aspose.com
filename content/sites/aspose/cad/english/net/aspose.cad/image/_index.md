---
title: Class Image
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.Image class. The image is the base class for all type of drawings
type: docs
weight: 35940
url: /net/aspose.cad/image/
---
## Image class

The image is the base class for all type of drawings.

```csharp
public abstract class Image : DataStreamSupporter, IObjectWithBounds
```

## Properties

| Name | Description |
| --- | --- |
| virtual [AnnotationService](../../aspose.cad/image/annotationservice/) { get; } | Gets the annotation service. |
| [Bounds](../../aspose.cad/image/bounds/) { get; } | Gets the image bounds. |
| [Container](../../aspose.cad/image/container/) { get; } | Gets the `Image` container. |
| virtual [CustomProperties](../../aspose.cad/image/customproperties/) { get; } | Gets or sets the custom properties. |
| [DataStreamContainer](../../aspose.cad/datastreamsupporter/datastreamcontainer/) { get; } | Gets the object's data stream. |
| virtual [Depth](../../aspose.cad/image/depth/) { get; } | Gets the image depth. |
| [Disposed](../../aspose.cad/disposableobject/disposed/) { get; } | Gets a value indicating whether this instance is disposed. |
| abstract [Height](../../aspose.cad/image/height/) { get; } | Gets the image height. |
| abstract [IsCached](../../aspose.cad/datastreamsupporter/iscached/) { get; } | Gets a value indicating whether object's data is cached currently and no data reading is required. |
| [Palette](../../aspose.cad/image/palette/) { get; set; } | Gets or sets the color palette. |
| [Size](../../aspose.cad/image/size/) { get; } | Gets the image size. |
| virtual [UnitlessDefaultUnitType](../../aspose.cad/image/unitlessdefaultunittype/) { get; } | Assumed unit type when UnitType is set to Unitless |
| virtual [UnitType](../../aspose.cad/image/unittype/) { get; } | Gets current unit type. |
| virtual [WatermarkGuardService](../../aspose.cad/image/watermarkguardservice/) { get; } |  |
| abstract [Width](../../aspose.cad/image/width/) { get; } | Gets the image width. |

## Methods

| Name | Description |
| --- | --- |
| static [Load](../../aspose.cad/image/load/#load)(Stream) | Loads a new image from the specified stream. |
| static [Load](../../aspose.cad/image/load/#load_3)(string) | Loads a new image from the specified file. |
| static [Load](../../aspose.cad/image/load/#load_1)(Stream, LoadOptions) | Loads a new image from the specified stream. |
| static [Load](../../aspose.cad/image/load/#load_4)(string, LoadOptions) | Loads a new image from the specified file. |
| static [Load](../../aspose.cad/image/load/#load_2)(Stream, string, LoadOptions) | Loads a new image from the specified stream. |
| abstract [CacheData](../../aspose.cad/datastreamsupporter/cachedata/)() | Caches the data and ensures no additional data loading will be performed from the underlying [`DataStreamContainer`](../datastreamsupporter/datastreamcontainer/). |
| [CanSave](../../aspose.cad/image/cansave/)(ImageOptionsBase) | Determines whether image can be saved to the specified file format represented by the passed save options. |
| [Dispose](../../aspose.cad/disposableobject/dispose/)() | Disposes the current instance. |
| virtual [GetStrings](../../aspose.cad/image/getstrings/)() | Gets all string values from image. |
| [Save](../../aspose.cad/image/save/#save)() | Saves the image data to the underlying stream. |
| [Save](../../aspose.cad/datastreamsupporter/save/)(Stream) | Saves the object's data to the specified stream. |
| virtual [Save](../../aspose.cad/datastreamsupporter/save/)(string) | Saves the object's data to the specified file location. |
| [Save](../../aspose.cad/image/save/#save_2)(Stream, ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |
| virtual [Save](../../aspose.cad/datastreamsupporter/save/)(string, bool) | Saves the object's data to the specified file location. |
| virtual [Save](../../aspose.cad/image/save/#save_4)(string, ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. |
| [SaveAsync](../../aspose.cad/image/saveasync/#saveasync)(Stream, ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |
| virtual [SaveAsync](../../aspose.cad/image/saveasync/#saveasync_1)(string, ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. |
| virtual [ThrowIfCantExportToCad](../../aspose.cad/image/throwifcantexporttocad/)(ImageOptionsBase, Exception) | Throw exception if can`t export |
| static [CanLoad](../../aspose.cad/image/canload/#canload)(Stream) | Determines whether image can be loaded from the specified stream. |
| static [CanLoad](../../aspose.cad/image/canload/#canload_2)(string) | Determines whether image can be loaded from the specified file path. |
| static [CanLoad](../../aspose.cad/image/canload/#canload_1)(Stream, LoadOptions) | Determines whether image can be loaded from the specified stream and optionally using the specified *loadOptions*. |
| static [CanLoad](../../aspose.cad/image/canload/#canload_3)(string, LoadOptions) | Determines whether an image can be loaded from the specified file path and optionally using the specified open options |
| static [GetFileFormat](../../aspose.cad/image/getfileformat/#getfileformat)(Stream) | Gets the file format. |
| static [GetFileFormat](../../aspose.cad/image/getfileformat/#getfileformat_1)(string) | Gets the file format. |

### See Also

* class [DataStreamSupporter](../datastreamsupporter/)
* interface [IObjectWithBounds](../iobjectwithbounds/)
* namespace [Aspose.CAD](../../aspose.cad/)
* assembly [Aspose.CAD](../../)


