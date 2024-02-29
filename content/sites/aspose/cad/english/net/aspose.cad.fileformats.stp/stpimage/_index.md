---
title: Class StpImage
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Stp.StpImage class. STP image class
type: docs
weight: 34970
url: /net/aspose.cad.fileformats.stp/stpimage/
---
## StpImage class

STP image class.

```csharp
public class StpImage : Image
```

## Constructors

| Name | Description |
| --- | --- |
| [StpImage](stpimage/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| virtual [AnnotationService](../../aspose.cad/image/annotationservice/) { get; } | Gets the annotation service. |
| [Author](../../aspose.cad.fileformats.stp/stpimage/author/) { get; set; } |  |
| [Authorization](../../aspose.cad.fileformats.stp/stpimage/authorization/) { get; set; } |  |
| [Bounds](../../aspose.cad/image/bounds/) { get; } | Gets the image bounds. |
| [Container](../../aspose.cad/image/container/) { get; } | Gets the [`Image`](../../aspose.cad/image/) container. |
| virtual [CustomProperties](../../aspose.cad/image/customproperties/) { get; } | Gets or sets the custom properties. |
| [DataStreamContainer](../../aspose.cad/datastreamsupporter/datastreamcontainer/) { get; } | Gets the object's data stream. |
| virtual [Depth](../../aspose.cad/image/depth/) { get; } | Gets the image depth. |
| [Description](../../aspose.cad.fileformats.stp/stpimage/description/) { get; set; } |  |
| [Disposed](../../aspose.cad/disposableobject/disposed/) { get; } | Gets a value indicating whether this instance is disposed. |
| override [Height](../../aspose.cad.fileformats.stp/stpimage/height/) { get; } | Gets the image height. |
| [ImplementationLevel](../../aspose.cad.fileformats.stp/stpimage/implementationlevel/) { get; set; } |  |
| override [IsCached](../../aspose.cad.fileformats.stp/stpimage/iscached/) { get; } | Gets a value indicating whether object's data is cached currently and no data reading is required. |
| [Items](../../aspose.cad.fileformats.stp/stpimage/items/) { get; } |  |
| [Name](../../aspose.cad.fileformats.stp/stpimage/name/) { get; set; } |  |
| [Organization](../../aspose.cad.fileformats.stp/stpimage/organization/) { get; set; } |  |
| [OriginatingSystem](../../aspose.cad.fileformats.stp/stpimage/originatingsystem/) { get; set; } |  |
| [Palette](../../aspose.cad/image/palette/) { get; set; } | Gets or sets the color palette. |
| [PreprocessorVersion](../../aspose.cad.fileformats.stp/stpimage/preprocessorversion/) { get; set; } |  |
| [Schemas](../../aspose.cad.fileformats.stp/stpimage/schemas/) { get; } |  |
| [Size](../../aspose.cad/image/size/) { get; } | Gets the image size. |
| [Timestamp](../../aspose.cad.fileformats.stp/stpimage/timestamp/) { get; set; } |  |
| virtual [UnitlessDefaultUnitType](../../aspose.cad/image/unitlessdefaultunittype/) { get; } | Assumed unit type when UnitType is set to Unitless |
| virtual [UnitType](../../aspose.cad/image/unittype/) { get; } | Gets current unit type. |
| [UnsupportedSchemas](../../aspose.cad.fileformats.stp/stpimage/unsupportedschemas/) { get; } |  |
| virtual [WatermarkGuardService](../../aspose.cad/image/watermarkguardservice/) { get; } |  |
| override [Width](../../aspose.cad.fileformats.stp/stpimage/width/) { get; } | Gets the image width. |

## Methods

| Name | Description |
| --- | --- |
| override [CacheData](../../aspose.cad.fileformats.stp/stpimage/cachedata/)() | Caches the data and ensures no additional data loading will be performed from the underlying [`DataStreamContainer`](../../aspose.cad/datastreamsupporter/datastreamcontainer/). |
| [CanSave](../../aspose.cad/image/cansave/)(ImageOptionsBase) | Determines whether image can be saved to the specified file format represented by the passed save options. |
| [Dispose](../../aspose.cad/disposableobject/dispose/)() | Disposes the current instance. |
| virtual [GetStrings](../../aspose.cad/image/getstrings/)() | Gets all string values from image. |
| [GetTopLevelItems](../../aspose.cad.fileformats.stp/stpimage/gettoplevelitems/)() | Gets all top-level items (i.e., not referenced by any other item) in the file. |
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
* namespace [Aspose.CAD.FileFormats.Stp](../../aspose.cad.fileformats.stp/)
* assembly [Aspose.CAD](../../)


